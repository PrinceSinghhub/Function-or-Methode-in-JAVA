package JavaProgramming;

import java.util.Scanner;

public class return_add_data {
    public static void main(String[] args) {

        int r  = add();
        System.out.println("addition is: " + r);
    }

    static int add(){
        Scanner p = new Scanner(System.in);

        int a,b,c;
        a=p.nextInt();
        b=p.nextInt();
        c = a+b;
        return c;
    }
}
