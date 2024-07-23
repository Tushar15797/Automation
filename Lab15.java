package A212024;

import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {

        function_type1();
        System.out.println("--------------");

        String name = function_type2();
        System.out.println(name);
        System.out.println("------------");

        function_type3("Amit");
        function_type3("123");
        System.out.println("------------");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum_result = function_type4(8, 5);
        System.out.println("o/p -> " + sum_result);
    }

    static void function_type1() {
        System.out.println("1.Without Parameters & Without Return Type");
    }

    static String function_type2() {
        System.out.println("2.Without Parameter but Return Type");
        return "Tushar";
    }

    static void function_type3(String name) {
        System.out.println("3.With Parameter & Without return Type");
        System.out.println("You have Shared Name :" + name);
    }

    static int function_type4(int a, int b) {
        System.out.println("4.With Parameter & With Return Type");
        return  a+b;
    }
}
