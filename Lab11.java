package A21072024;

public class Lab11 {
    public static void main(String[] args) {
        //lab136
        function1();
        System.out.println("first");

        String name=function2();
        System.out.println(name);
    }
    static void function1(){
        System.out.println("1");
    }
    static String function2(){
        System.out.println("2");
        return "pramod";
    }
}
