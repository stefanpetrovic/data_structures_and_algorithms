package algorithms;

import utils.ArrayUtils;

public class InsertElementInAscendingArray {

    private static void insertIntoAscendingArray(int[] array, int value) {
        int newElementIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > value) {
                newElementIndex = i;
                break;
            }
        }

        for (int i = array.length - 1; i > newElementIndex; i--) {
            array[i] = array[i -1];
        }

        array[newElementIndex] = value;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        array[3] = 5;
        int value = 3;
        insertIntoAscendingArray(array, value);

        ArrayUtils.printArray(array);
    }
}
