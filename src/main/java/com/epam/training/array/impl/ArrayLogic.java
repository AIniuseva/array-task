package com.epam.training.array.impl;

import com.epam.training.array.Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayLogic {
    private static final ArrayLogic arrayLogic = new ArrayLogic();

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
        Array primeNumbersArray = new Array(new int[0]);

        for (int element : array.getItems()) {
            if (isPrime(element)) {
                primeNumbersArray = arrayLogic.append(primeNumbersArray, element);
            }
        }
        return primeNumbersArray;
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

    public Array getAllNoIdenticalThreeDigitNumbers(Array array) {
        Array noIdenticalThreeDigitNumbersArray = new Array(new int[0]);

        for (int i = 0; i < array.getItems().length; i++) {
            String temp = String.valueOf(array.getItems()[i]);
            if (temp.length() == 3
                    && temp.charAt(0) != temp.charAt(1)
                    && temp.charAt(1) != temp.charAt(2)
                    && temp.charAt(0) != temp.charAt(2)) {
                noIdenticalThreeDigitNumbersArray = arrayLogic.append(noIdenticalThreeDigitNumbersArray, array.getItems()[i]);
            }
        }
        return noIdenticalThreeDigitNumbersArray;
    }

    public Array append(Array array, int value) {
        int[] newArray = Arrays.copyOf(array.getItems(), array.getItems().length + 1);

        newArray[newArray.length - 1] = value;

        return new Array(newArray);
    }

    public int[] generateRandomArray(int quantityOfElements, int minValue, int maxValue) {
        Random random = new Random();
        int[] arrayWithRandomValues = new int[quantityOfElements];
        for (int i = 0; i < quantityOfElements; i++) {
            arrayWithRandomValues[i] = random.nextInt(maxValue - minValue) + minValue;
        }
        return arrayWithRandomValues;
    }

    public int[] readArrayFromFile(File file) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Array arrayFromFile = new Array(new int[0]);

        try (Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNext()) {
                arrayFromFile = arrayLogic.append(arrayFromFile, scanner.nextInt());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arrayFromFile.getItems();
    }

    private boolean isPrime(int element) {
        if (element <= 1) {
            return false;
        } else {
            for (int i = 2; i < element; i++) {
                if (element % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}