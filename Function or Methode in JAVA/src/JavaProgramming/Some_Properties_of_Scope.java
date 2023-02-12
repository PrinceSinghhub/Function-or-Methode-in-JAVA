package JavaProgramming;

public class Some_Properties_of_Scope {
    public static void main(String[] args) {
//        todo 1 Properties
        System.out.println("1 Properties");
        /*inilisation outside the block
        use or update inside the bloack
         */
        int a = 400;
//        todo cread a block
        {
            a = 40;
            int b = 20;
            System.out.println(a+b);
        }

//        todo 2 Properties
        System.out.println("2 Properties");

        /*anything inilisation inside the block
        can not be use outside the bloack
         */
//        todo cread a block
        {
            String name = "CODER";
            System.out.println(name);
        }

/*        name = "coder";
        not like that according to 2 properties
        */


//        todo 3 Properties
        System.out.println("3 Properties");

        /*anything inilisation outside the block
        can not be reinilisation inside the bloack
         */
        int r = 800;
//        todo cread a block
        {
//            int r = 400;
            /* not do like that according to
            3 properties
             */
            System.out.println("not do like that according to 3 properties");
        }

//        todo 4 Properties
        System.out.println("4 Properties");

        /*anything inilisation inside the block
        can definetily  reinilisation again outside the bloack
         */
        {
            String t = "LAST";
            System.out.println("Before reinilisation " + t);
        }
        String t = "FIRST";
        System.out.println("After reinilisation " + t);





    }
}
