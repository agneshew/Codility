package com.agnes;

public class CyclicRotation {

    public void solution(int[] A, int K) {

        int[] arr = new int[A.length];
        System.arraycopy(A, 0, arr, 0, A.length);

            for (int i = 0; i < K; i++) {
                int[] arrTemp = new int[arr.length];
                arrTemp[0] = arr[(arr.length - 1)];

                for (int j = 0; j < (arr.length - 1); j++) {
                    arrTemp[j + 1] = arr[(j)];
                }
                System.arraycopy(arrTemp, 0, arr, 0, arr.length);

            }

        for (int i=0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
