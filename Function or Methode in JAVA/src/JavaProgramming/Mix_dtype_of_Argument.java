package JavaProgramming;

import java.util.Arrays;

public class Mix_dtype_of_Argument {
    public static void main(String[] args) {

//        todo mix datatyoe pass
        mixdtype(10,20,"codex","coder","codex coder");

    }
    static void mixdtype(int a,int b,String ...s) {
        System.out.printf("%d\n%d\n",a,b);
        System.out.println(Arrays.toString(s));
    }

}
