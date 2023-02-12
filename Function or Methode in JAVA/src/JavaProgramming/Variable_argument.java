package JavaProgramming;

import java.util.Arrays;

public class Variable_argument {
    public static void main(String[] args) {
//        todo tacke a multiple argument
        myfun(1,2,3,4,5,6,7,9,10);
        myname("codex","coder","codex coder","CODER");
    }


    static void myfun(int ...a) {
//        a[0] = 50*2;
        System.out.println(Arrays.toString(a));
    }
    static void myname(String ...n) {
//        n[0] = n[0]+2;
        System.out.println(Arrays.toString(n));
    }
}
