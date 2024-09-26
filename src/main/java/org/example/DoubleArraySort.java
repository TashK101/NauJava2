package org.example;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DoubleArraySort {

    private ArrayList<Double> numbers;

    public DoubleArraySort(int n) {
        numbers = getArrayWithRandomDoubleNumbers(n);
    }

    public ArrayList<Double> getArrayWithRandomDoubleNumbers(int n) {
        Random random = new Random();
        var newArr = new ArrayList<Double>(n);
        for (int i = 0; i < n; i++) {
            newArr.add(random.nextDouble()); // Random double between 0 and 100
        }
        return newArr;
    }

    public void insertionSort(ArrayList<Double> arrayToSort) {
        for (int i = 1; i < arrayToSort.size(); i++) {
            double current = arrayToSort.get(i);
            int j = i - 1;

            while (j >= 0 && arrayToSort.get(j) > current) {
                arrayToSort.set(j + 1, arrayToSort.get(j));
                j--;
            }
            arrayToSort.set(j + 1, current);
        }
    }

    public void printOriginalAndSortedArray() {
        System.out.println("Original List: " + numbers);

        ArrayList<Double> sortedNumbers = new ArrayList<>(numbers);
        insertionSort(sortedNumbers);
        System.out.println("Sorted List: " + sortedNumbers);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        DoubleArraySort randomArraySorter = new DoubleArraySort(n);
        randomArraySorter.printOriginalAndSortedArray();
    }
}