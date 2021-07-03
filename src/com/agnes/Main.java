package com.agnes;

public class Main {

    public static void main(String[] args) {

        BinaryGaps binaryGaps = new BinaryGaps();
        binaryGaps.solution(1041);

        CyclicRotation cyclicRotation = new CyclicRotation();
        cyclicRotation.solution(new int[]{2, 3, 5, 6, 8, 9}, 3);

        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        oddOccurrencesInArray.solution(new int[]{9, 3, 9, 3, 9, 7, 9});
    }
}
