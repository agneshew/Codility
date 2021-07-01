package com.agnes;

public class CyclicRotation {

    public void solution(int[] A, int K) {

        int[] arr = new int[A.length];

        for (int i = 0; i < K; i++) {
            arr[0] = A[(A.length - 1)];
            for (int j = 0; j < (A.length - 1); j++) {
                arr[j+1] = A[(j)];
            }
        }
        for (int i=0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
