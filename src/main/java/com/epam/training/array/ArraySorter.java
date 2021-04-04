package com.epam.training.array;

public class ArraySorter {

    private static final ArraySorter arraySorter = new ArraySorter();

    public Array sort(Array array) {
        int newArraySize = 0;
        for (int value : array.getItems()) {
            if (value > 0) {
                newArraySize++;
            }
        }

        int[] arrayWithoutNegativeNumbers = new int[newArraySize];
        int j = 0;

        for (int k : array.getItems()) {
            if (k > 0) {
                arrayWithoutNegativeNumbers[j] = k;
                j++;
            }
        }
        return arraySorter.bubbleSort(new Array(arrayWithoutNegativeNumbers));
    }

    public Array sortNegative(Array array) {
        int newArraySize = 0;
        for (int element : array.getItems()) {
            if (element < 0) {
                newArraySize++;
            }
        }

        int[] sortedNegativeArray = new int[newArraySize];
        int j = 0;

        for (int k : array.getItems()) {
            if (k < 0) {
                sortedNegativeArray[j] = k;
                j++;
            }
        }
        return arraySorter.bubbleSort(new Array(sortedNegativeArray));
    }

    public Array bubbleSort(Array array) {
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
