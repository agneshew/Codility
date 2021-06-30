package com.agnes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGaps {

    public void solution(int N) {

        String binary = Integer.toBinaryString(N);

        System.out.println(binary);

        String gapStart = "1";
        String gapEnd = "1";
        String gapMiddle = "";
        List<Integer> gaps = new ArrayList<>();

        for (int i = 0; i < binary.length(); i++) {
            gapMiddle = gapMiddle + "0";
            if (binary.contains(gapStart + gapMiddle + gapEnd)) {
                gaps.add(i + 1);
            } else {
                gaps.add(0);
            }
        }
        System.out.println("Maximum gap is " + Collections.max(gaps));
    }
}

