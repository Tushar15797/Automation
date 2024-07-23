package A212024;
import java.util.Scanner;
public class Lab8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A No of factorial");
        int n=sc.nextInt();
//lab130
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
