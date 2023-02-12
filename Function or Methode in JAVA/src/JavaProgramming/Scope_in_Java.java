package JavaProgramming;

public class Scope_in_Java {
    public static void main(String[] args) {

        //    todo function scope
        System.out.println("main () Function Scope");
        int a = 60;
        String s = "codex coder";
        System.out.println(a);
        System.out.println(s);

        System.out.println();
        System.out.println("Myfunction Scope");
        myname();

//    todo block of Scope
        System.out.println();
    //creat a code of block by using {}
    {
        int r = 50;
        String c = "Code of block";
//      update the main() s value
        System.out.println("block of Scope");
        s = "Hello";
        System.out.println(r);
        System.out.println(c);
        System.out.println();
    }

        //becouse s in main function then call anywhere
        System.out.println("Update the value of s in main() codex coder to Hello");
        System.out.println(s);
        // not excess outside the block scope
//        System.out.println(r);
        System.out.println();

//        todo loops Scope
        System.out.println("loops Scope");
        for(int o = 0;o<5;o++){
            int t = 55;
            System.out.println(o);
            System.out.println(t);
        }

        // not excess outside the loop scope show error
//        System.out.println(o);


    }
    /*todo excess a out side the main() function that is function scope

        System.out.println(a);
    */
//    todo myfunction out side the main()
    static void myname(){
        String name = "Codex Coder my function";
        System.out.println(name);

    }

}
