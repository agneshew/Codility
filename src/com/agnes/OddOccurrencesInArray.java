package com.agnes;

import java.util.Arrays;


public class OddOccurrencesInArray {


    public void solution(int[] A) {
        int[] arrTemp = A.clone();
        Arrays.sort(arrTemp);

        System.out.print("\nArray: ");

        for (int i=0; i < A.length ; i++) {
            System.out.print(A[i] + " ");
        }

        int index = 0;
        while(index < (arrTemp.length -1)) {
            if (arrTemp[index] != arrTemp[(index+1)]) {
                System.out.println("\nIndex without pair: " + arrTemp[index]);
            }
            index +=2;
        }
    }
}
//    Write a function:
//
//class Solution { public int solution(int[] A); }
//that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.
//
//        For example, given array A such that:
//
//        A[0] = 9  A[1] = 3  A[2] = 9
//        A[3] = 3  A[4] = 9  A[5] = 7
//        A[6] = 9
//        the function should return 7, as explained in the example above.
