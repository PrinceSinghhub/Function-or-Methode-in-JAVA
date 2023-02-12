package JavaProgramming;

public class Function_overloding {
    public static void main(String[] args) {
        myfun("CODEX");
        myfun(30);
        myfun(30,36.5f);
    }

    static void myfun(String s) {
        System.out.println(s);
    }
    static void myfun(int a) {
        System.out.println(a);
    }
    static void myfun(int r,float f) {
        System.out.println(r);
        System.out.println(f);
    }

}

