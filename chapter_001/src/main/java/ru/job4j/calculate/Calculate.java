package ru.job4j.calculate;

public class Calculate {

    public static void main(String[] args) {
        Calculate calc = new Calculate();
        String result = calc.echo("petr");
        System.out.println(result);
    }

    public String echo(String name) {
        return "Hello, echo, echo : " + name;
    }
}
