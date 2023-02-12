package JavaProgramming;

public class Shadowing {
    static int r = 40;
    public static void main(String[] args) {
        System.out.println("Before Shadowing");
        System.out.println(r);
        int r = 400;
        System.out.println("After Shadowing");
        System.out.println(r);

//        todo myfun()
        myfun();
    }

    static void myfun() {
        System.out.println("Outside the main() Scope");
        System.out.println(r);
    }


}
