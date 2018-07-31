package com.raohui;

public class _37_GetNumberOfK {
    public int GetNumberOfK(int[] array, int k) {
        int first = GetFirstK(array, k);
        int last = GetLastK(array, k);
        int num = 0;
        if(array.length == 0 ){
            return num;
        }
        if (first != -1 && last != -1) {
            num = last - first + 1;
        }
        return num;

    }


    private int GetFirstK(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] > k) {
                end = mid - 1;
            } else if (array[mid] < k) {
                start = mid + 1;
            } else {
                if (mid > 0 && array[mid - 1] != k || mid == 0) {
                    res = mid;
                    break;
                } else {
                    end = mid - 1;
                }
            }
        }
        return res;
    }

    private int GetLastK(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] > k) {
                end = mid - 1;
            } else if (array[mid] < k) {
                start = mid + 1;
            } else {
                if (mid < array.length - 1 && array[mid + 1] != k || mid == array.length - 1) {
                    res = mid;
                    break;
                } else {
                    start = mid + 1;
                }
            }
        }
        return res;
    }
}
