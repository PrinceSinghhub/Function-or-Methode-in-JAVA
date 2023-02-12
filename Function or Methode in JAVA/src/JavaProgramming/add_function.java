package JavaProgramming;

import java.util.Scanner;

public class add_function {
    public static void main(String[] args) {

        add();

    }
    static void add(){
        Scanner p = new Scanner(System.in);

        int a,b,c;
        a=p.nextInt();
        b=p.nextInt();
        c = a+b;
        System.out.println("addittion is: " + c);

    }
}
