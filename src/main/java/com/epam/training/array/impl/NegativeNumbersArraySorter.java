package com.epam.training.array.impl;

import com.epam.training.array.Array;
import com.epam.training.array.ArraySorter;

public class NegativeNumbersArraySorter implements ArraySorter {
    @Override
    public Array sort(Array array) {
        ArrayLogic arrayLogic = new ArrayLogic();
        Array sortedNegativeArray = new Array(new int[0]);
        for (int element : array.getItems()) {
            if (element < 0) {
                sortedNegativeArray = arrayLogic.append(sortedNegativeArray, element);
            }
        }

        ArraySorter bubbleSort = new BubbleArraySorter();
        return bubbleSort.sort(sortedNegativeArray);
    }
}
