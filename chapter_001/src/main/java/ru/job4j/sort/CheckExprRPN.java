package ru.job4j.sort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class CheckExprRPN {
    public static void main(String args[]) {
        CheckExprRPN checkExprRPN = new CheckExprRPN();
        System.out.println(checkExprRPN.canBeEqualTo24(new int[]{3, 3, 7, 7}));
    }
    public boolean canBeEqualTo24(int[] nums) {
        String operators = "+-/*";
        double answer = 24;
        Integer[] input = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++){
            input[i] = nums[i];
        }
        ArrayList<Boolean> results = new ArrayList<>();
        return new Object() {
            boolean checkEqual(Integer[] numbers, int stackHeight, String eq) {
                if (stackHeight >= 2) {
                    for (char op : operators.toCharArray()) {
                        checkEqual(numbers, stackHeight - 1, eq + " " + op);
                    }
                }
                boolean allUsedUp = true;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] != null) {
                        allUsedUp = false;
                        Integer n = numbers[i];
                        numbers[i] = null;
                        checkEqual(numbers, stackHeight + 1, eq + " " + n);
                        numbers[i] = n;
                    }
                }
                if (allUsedUp && stackHeight == 1) {
                    try {
                        if (calculate(opn(translate(eq))) == answer) {
                            results.add(true);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return results.contains(true);
            }

            String translate(String postfix) {
                Stack<String> expr = new Stack<String>();
                Scanner sc = new Scanner(postfix);
                while (sc.hasNext()) {
                    String t = sc.next();
                    if (operators.indexOf(t) == -1) {
                        expr.push(t);
                    } else {
                        expr.push("(" + expr.pop() + t + expr.pop() + ")");
                    }
                }
                return expr.pop();
            }

            String opn(String sIn) throws Exception {
                StringBuilder sbStack = new StringBuilder(""), sbOut = new StringBuilder("");
                char cIn, cTmp;

                for (int i = 0; i < sIn.length(); i++) {
                    cIn = sIn.charAt(i);
                    if (isOp(cIn)) {
                        while (sbStack.length() > 0) {
                            cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                            if (isOp(cTmp) && (opPrior(cIn) <= opPrior(cTmp))) {
                                sbOut.append(" ").append(cTmp).append(" ");
                                sbStack.setLength(sbStack.length() - 1);
                            } else {
                                sbOut.append(" ");
                                break;
                            }
                        }
                        sbOut.append(" ");
                        sbStack.append(cIn);
                    } else if ('(' == cIn) {
                        sbStack.append(cIn);
                    } else if (')' == cIn) {
                        cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                        while ('(' != cTmp) {
                            if (sbStack.length() < 1) {
                                throw new Exception("Ошибка разбора скобок. Проверьте правильность выражения.");
                            }
                            sbOut.append(" ").append(cTmp);
                            sbStack.setLength(sbStack.length() - 1);
                            cTmp = sbStack.substring(sbStack.length() - 1).charAt(0);
                        }
                        sbStack.setLength(sbStack.length() - 1);
                    } else {
                        sbOut.append(cIn);
                    }
                }
                while (sbStack.length() > 0) {
                    sbOut.append(" ").append(sbStack.substring(sbStack.length() - 1));
                    sbStack.setLength(sbStack.length() - 1);
                }
                return sbOut.toString();
            }

            boolean isOp(char c) {
                switch (c) {
                    case '-':
                    case '+':
                    case '*':
                    case '/':
                        return true;
                }
                return false;
            }

            byte opPrior(char op) {
                switch (op) {
                    case '*':
                    case '/':
                        return 2;
                }
                return 1; // Тут остается + и -
            }
            double calculate(String sIn) throws Exception {
                double dA = 0, dB = 0;
                String sTmp;
                Deque<Double> stack = new ArrayDeque<Double>();
                StringTokenizer st = new StringTokenizer(sIn);
                while(st.hasMoreTokens()) {
                    try {
                        sTmp = st.nextToken().trim();
                        if (1 == sTmp.length() && isOp(sTmp.charAt(0))) {
                            if (stack.size() < 2) {
                                throw new Exception("Неверное количество данных в стеке для операции " + sTmp);
                            }
                            dB = stack.pop();
                            dA = stack.pop();
                            switch (sTmp.charAt(0)) {
                                case '+':
                                    dA += dB;
                                    break;
                                case '-':
                                    dA -= dB;
                                    break;
                                case '/':
                                    dA /= dB;
                                    break;
                                case '*':
                                    dA *= dB;
                                    break;
                                default:
                                    throw new Exception("Недопустимая операция " + sTmp);
                            }
                            stack.push(dA);
                        } else {
                            dA = Double.parseDouble(sTmp);
                            stack.push(dA);
                        }
                    } catch (Exception e) {
                        throw new Exception("Недопустимый символ в выражении");
                    }
                }

                if (stack.size() > 1) {
                    throw new Exception("Количество операторов не соответствует количеству операндов");
                }

                return stack.pop();
            }
        }.checkEqual(input, 0, "");
    }
}
