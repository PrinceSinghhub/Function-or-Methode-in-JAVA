package JavaProgramming;

import java.util.Scanner;

public class Pass_by_Value {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter No a: ");
        int a = s.nextInt();
        System.out.print("Enter No b: ");
        int b = s.nextInt();

        int result  = add(a,b);
        System.out.println("the addition: " + result);

    }

    static int add(int a,int b){
        int r = a+b;
        return r;
    }


}
