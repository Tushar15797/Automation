package A212024;

import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        //lab133
        Scanner sc=new Scanner(System.in);
        System.out.println("Max No");
        int n=sc.nextInt();

        for(int i=14; i<n;i++){
            if(i % 3==0 && i % 5==0){
                System.out.println("FizzBuzz");
            }
            if(i % 5==0 && i % 5==0){
                System.out.println("Fizz");
            }
            if(i % 3==0 && i % 3==0){
                System.out.println("Buzz");
            }
        }
    }
}
