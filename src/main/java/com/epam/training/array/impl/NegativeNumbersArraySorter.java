package com.epam.training.array.impl;

import com.epam.training.array.Array;
import com.epam.training.array.ArraySorterI;

public class NegativeNumbersArraySorter implements ArraySorterI {
    @Override
    public Array sort(Array array) {
        int newArraySize = 0;
        for (int element : array.getItems()) {
            if (element < 0) {
                newArraySize++;
            }
        }

        int[] sortedNegativeArray = new int[newArraySize];
        int i = 0;

        for (int element : array.getItems()) {
            if (element < 0) {
                sortedNegativeArray[i] = element;
                i++;
            }
        }
        ArraySorterI bubbleSort = new BubbleArraySorter();
        return bubbleSort.sort(new Array(sortedNegativeArray));
    }
}
