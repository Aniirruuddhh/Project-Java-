import java.util.*;

public class project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // // size is not fixed.
        // int arr [] = {1,2,3,4,5};

        // //printing layer (work on index)

        // for (int i = 0; i < arr.length; i++){
        // System.out.println(arr[i]);
        // }

        // //size fixed.

        // int arr1 [] = new int[5];
        // arr1[0] = 1;
        // arr1[1] = 2;
        // arr1[2] = 3;
        // arr1[4] = 4;
        // arr1[5] = 5;

        // //for each loop
        // for(int ani : arr1){
        // System.out.println(ani);
        // }

        // //user input
        // int nums[] = new int[3];

        // for (int i = 0; i<nums.length; i++){
        // nums[i] = sc.nextInt();
        // }

        int num[] = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {

            sum += num[i];

        }
        System.out.println(sum);
    }

}
