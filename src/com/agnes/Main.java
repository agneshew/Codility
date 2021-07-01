package com.agnes;

public class Main {

    public static void main(String[] args) {

        BinaryGaps binaryGaps = new BinaryGaps();
        binaryGaps.solution(1041);

        int K = 3;
        int[] arr = new int[]{2, 3, 5, 6, 8, 9};
        for (int i=0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("K= " + K);

        CyclicRotation cyclicRotation = new CyclicRotation();
        cyclicRotation.solution(arr, K);


    }
}
