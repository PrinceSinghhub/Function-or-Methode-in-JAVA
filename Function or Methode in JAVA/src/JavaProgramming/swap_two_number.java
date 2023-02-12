package JavaProgramming;

public class swap_two_number {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        swap(a,b);
        System.out.println(a +" "+b);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    //todo this function not swap the value
    /* not swap the no becouse pass the copy of
        data its means pass by value not pass by reference
        if update the object
        its not mean to update the object its mean you creat a new object */


//    todo creat a new object
       /*
          temp --------------------- 30
          a -------------------------- 40
          b -----------------------------30
        */
}
