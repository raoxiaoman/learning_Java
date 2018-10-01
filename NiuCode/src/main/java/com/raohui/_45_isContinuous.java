package com.raohui;

import java.util.Arrays;

public class _45_isContinuous {
    public boolean isContinuous(int[] numbers) {
        if(numbers.length == 0){
            return false;
        }
        Arrays.sort(numbers);
        int numberOfZero = 0;
        for (int i : numbers) {
            if (i == 0) {
                numberOfZero++;
            }
        }
        if(numberOfZero >= numbers.length-1){
            return true;
        }
        int small = numberOfZero;
        int big = small + 1;
        int numberOfGap = 0;
        while (big < numbers.length) {
            if (numbers[small] == numbers[big]) {
                return false;
            }
            numberOfGap += numbers[big] - numbers[small] - 1;
            small = big;
            big++;

        }
        return numberOfGap == numberOfZero;

    }
}
