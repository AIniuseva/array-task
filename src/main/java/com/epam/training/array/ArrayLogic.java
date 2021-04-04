package com.epam.training.array;

public class ArrayLogic {

    public boolean exists(Array array, int element) {
        int startIndex = 0;
        int endIndex = array.getItems().length - 1;
        while (startIndex <= endIndex) {
            int middle = startIndex + (endIndex - startIndex) / 2;

            if (array.getItems()[middle] == element) {
                return true;
            } else if (array.getItems()[middle] < element) {
                startIndex = middle + 1;
            } else {
                endIndex = middle - 1;
            }
        }
        return false;
    }

    public Array findPrimeNumbers(Array array) {
        int newArraySize = 0;

        for (int element : array.getItems()) {
            if (isPrime(element)) {
                newArraySize++;
            }
        }

        int[] primeNumbersArray = new int[newArraySize];

        int j = 0;
        for (int element : array.getItems()) {
            if (isPrime(element)) {
                primeNumbersArray[j] = element;
                j++;
            }
        }

        return new Array(primeNumbersArray);
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int findMinValue(Array array) {
        int minValue = array.getItems()[0];

        for (int i = 1; i < array.getItems().length; i++) {
            if (array.getItems()[i] < minValue) {
                minValue = array.getItems()[i];
            }
        }
        return minValue;
    }

    public int findMaxValue(Array array) {
        int maxValue = array.getItems()[0];

        for (int i = 1; i < array.getItems().length; i++) {
            if (array.getItems()[i] > maxValue) {
                maxValue = array.getItems()[i];
            }
        }
        return maxValue;
    }
}