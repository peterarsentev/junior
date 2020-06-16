package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index=0; index<data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static void main(String[] args){
        int[] mymassive = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(FindLoop.indexOf(mymassive, 5));
    }
}
