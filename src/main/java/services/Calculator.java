package services;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Calculator {

    public int[] quickSort(int[] list) {

        if (list == null || list.length < 2) {
            return list;
        }

        int pivotIndex = new Random().nextInt(list.length);
        int pivot = list[pivotIndex];
        int newSplitPoint = 0;
        list = removeArrayElement(list, pivotIndex);

        for (int index = 0; index < list.length; index++) {
            if (list[index] < pivot) {
                changePlaces(list, index, newSplitPoint);
                newSplitPoint++;
            }
        }

        int[] tmp1 = quickSort(Arrays.copyOfRange(list, 0, newSplitPoint));
        int[] tmp2 = quickSort(Arrays.copyOfRange(list, newSplitPoint, list.length));
        int tmp1L = tmp1.length;
        int tmp2L = tmp2.length;
        int[] result = new int[tmp1L + 1 + tmp2L];

        System.arraycopy(tmp1, 0, result, 0, tmp1L);
        result[newSplitPoint] = pivot;
        System.arraycopy(tmp2, 0, result, tmp1L + 1, tmp2L);
        return result;
    }

    private void changePlaces(int[] list, int indexFirst, int indexSecond) {
        int tmp = list[indexFirst];
        list[indexFirst] = list[indexSecond];
        list[indexSecond] = tmp;
    }


    public int[] removeArrayElement(int[] array, int index) {
        return IntStream.range(0, array.length).filter(i -> i != index).map(i -> array[i]).toArray();
    }
}
