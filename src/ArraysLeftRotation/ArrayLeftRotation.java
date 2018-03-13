package ArraysLeftRotation;

import java.util.Scanner;

public class ArrayLeftRotation {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int rem = k % n;
        int[] new_a = new int[n];
        if(rem == 0){
            return a;
        } else {
            // remainder determines which index is now the first
            for(int i = 0; i <= rem; i++){
                new_a[i] = a[rem + i];
            }
            for(int j = rem + 1; j < n; j++){
                // todo fix this
                new_a[j] = a[n-j-rem];
            }
        }
        return new_a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }

}
