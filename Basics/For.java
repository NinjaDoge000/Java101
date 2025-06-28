import java.util.Arrays;

public class For {
    

    public static void main(String[] args) {
        int[] arr = new int[4];

        int[] brr = {1, 2, 3, 4};
    
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    
        for(int i : brr) {
            System.out.println(i);
        }



        // multi dim array

        int [][] multiDim = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        // fixed size
        int[][] matrix = new int[4][3];

        // jagged arrays
        int[][] jagged = new int[2][];
        jagged[0] = new int[3];  // row 0 → 3 cols
        jagged[1] = new int[2];  // row 1 → 2 cols

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        

        // shallow copy:
        int[] copyShallow = arr;

        // Deep copy:
        int[] copyDeep = Arrays.copyOf(arr, arr.length);




        /*
         * Notes:
         * int[] is an object.
         * Stored in heap, reference held in stack.
         * So arr == null is valid.
         * You can pass arrays to methods.
         * 
         */

    }


}

