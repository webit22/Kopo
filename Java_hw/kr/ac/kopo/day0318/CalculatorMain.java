package kr.ac.kopo.day0318;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int n2 = sc.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + Addition(n1, n2));
        System.out.println(n1 + " - " + n2 + " = " + Subtraction(n1, n2));
        System.out.println(n1 + " * " + n2 + " = " + Multiplication(n1, n2));
        System.out.println(n1 + " / " + n2 + " = " + Division(n1, n2));

        System.out.println(n1 + " 소수체크 : " + isPrimeNumber(n1));
        System.out.println(n2 + " 소수체크 : " + isPrimeNumber(n2));

    }

    static int Addition(int num1, int num2){
        return num1 + num2;
    }
    static int Subtraction(int num1, int num2){
        return num1 - num2;
    }
    static int Multiplication(int num1, int num2){
        return num1 * num2;
    }
    static double Division(int num1, int num2){
        return num1 / num2;
    }
    static boolean isPrimeNumber(int num){
        // 2, 5, 7, 11, 13, 17, 19, ...
        // 약수 : 1, 자기자신 <=> 자신보다 작은 수로 나눴을 때 0이 아님
        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
            if(i == (num-1) && isPrime){
                return true;
            }
        }
        return isPrime;
    }
}
