package com.epam.training.array.impl;

import com.epam.training.array.Array;
import com.epam.training.array.ArraySorter;

public class BubbleArraySorter implements ArraySorter {
    @Override
    public Array sort(Array array) {
        int[] sortedArray = array.getItems();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < sortedArray.length; i++) {
                if (sortedArray[i] < sortedArray[i - 1]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i - 1];
                    sortedArray[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return new Array(sortedArray);
    }
}

