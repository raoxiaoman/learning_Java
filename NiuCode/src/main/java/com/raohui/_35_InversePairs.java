package com.raohui;

public class _35_InversePairs {
    public int InversePairs(int[] array) {
        if (array.length <= 1) {
            return 0;
        }
        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, array.length);
        long count = _InversePairs(array, copy, 0, array.length - 1);
        return (int) (count % 1000000007);

    }

    private long _InversePairs(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = array[start];
            return 0;
        }
        int length = (end - start) / 2;
        long left = _InversePairs(copy, array, start, start + length);
        long right = _InversePairs(copy, array, start + length + 1, end);
        int i = start + length;
        int j = end;
        int indexCopy = end;
        long count = 0;
        while (i >= start && j >= (start + length + 1)) {
            if (array[i] > array[j]) {
                copy[indexCopy--] = array[i--];
                count += (j - start - length - 1 + 1);
            } else {
                copy[indexCopy--] = array[j--];
            }
        }
        for(;i>=start;i--){
            copy[indexCopy--] = array[i];
        }
        for(;j>=(start+length+1);j--){
            copy[indexCopy--] = array[j];
        }
        return (count+left+right);
    }
}
