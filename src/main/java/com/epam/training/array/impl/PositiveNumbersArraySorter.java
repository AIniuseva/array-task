package com.epam.training.array.impl;

import com.epam.training.array.Array;
import com.epam.training.array.ArraySorter;

public class PositiveNumbersArraySorter implements ArraySorter {
    @Override
    public Array sort(Array array) {
        ArrayLogic arrayLogic = new ArrayLogic();
        Array sortedPositiveArray = new Array(new int[0]);

        for (int element : array.getItems()) {
            if (element > 0) {
                sortedPositiveArray = arrayLogic.append(sortedPositiveArray, element);
            }
        }

        ArraySorter bubbleSort = new BubbleArraySorter();
        return bubbleSort.sort(sortedPositiveArray);
    }
}
