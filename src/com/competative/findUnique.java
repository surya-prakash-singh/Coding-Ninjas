package com.competative;

public class findUnique {
    public static int findUnique(int[] arr) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (key == arr[j]) {
                    flag++;
                }
            }

            if (flag != 2) {
                return key;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
       int out = findUnique(new int[]{217, 354, 449, 169, 325, 164, 85, 305, 286, 458, 474, 46, 474, 217, 86, 345, 279, 123, 289, 195, 169, 123, 413, 225, 494, 276, 10});
        System.out.println(out);
    }
}

