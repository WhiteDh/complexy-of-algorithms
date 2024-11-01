package goit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        long fibRecurs = fib.fibonacciRecursive(5);
        long fibIterat = fib.fibonacciIterative(5);
        long fibDP = fib.fibonacciDP(45);


        System.out.println(fibRecurs);
        System.out.println(fibIterat);
        System.out.println(fibDP);
    }
}