package com.raohui;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _63_GetMedian {
    private int count = 0;
    private PriorityQueue<Integer> maxPriority = new PriorityQueue<>(15, Comparator.reverseOrder());
    private PriorityQueue<Integer> minPriority = new PriorityQueue<>();

    public void Insert(Integer num) {
        count++;
        int temp = num;
        if ((count & 1) == 0) {//偶数放入小顶堆
            if (!maxPriority.isEmpty() && num < maxPriority.peek()) {
                maxPriority.offer(num);
                temp = maxPriority.poll();
            }
            minPriority.offer(temp);
        } else {//奇数放入大顶堆
            if (!minPriority.isEmpty() && num > minPriority.peek()) {
                minPriority.offer(num);
                temp = minPriority.poll();
            }
            maxPriority.offer(temp);
        }
    }

    public Double GetMedian() {
        if (count == 0) {
            return null;
        }
        double result;
        if ((count & 1) == 0) {
            result = (maxPriority.peek() + minPriority.peek()) / 2.0;
        } else {
            result = maxPriority.peek();
        }
        return result;
    }
}
