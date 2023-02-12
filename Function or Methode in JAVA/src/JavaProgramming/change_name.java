package JavaProgramming;

public class change_name {
    public static void main(String[] args) {

        String name = "CODER";
        changename(name);
        /* not change the name becouse pass the copy of
        data its means pass by value not pass by reference
        if update the object
        its not mean to update the object its mean you creat a new object */

        System.out.println(name);
    }

    private static void changename(String naam) {
        naam = "codex coder";
//        todo creat a new object
       /*
          name -------------------------"codex coder"
        */
    }
}
