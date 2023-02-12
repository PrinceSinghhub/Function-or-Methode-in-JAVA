package JavaProgramming;
import java.util.Arrays;
public class chabge_value_by_reference {
    public static void main(String[] args) {
        int[] arr = {1,2,6,5,9,70};
        change(arr);
//        todo print the hole array
        System.out.println(Arrays.toString(arr));
    }


    static void change(int[] nums) {
        /*change the arr[o] value by using nums reference variale
        point at the same object
         */
        nums[0] = 99;
    }
}
