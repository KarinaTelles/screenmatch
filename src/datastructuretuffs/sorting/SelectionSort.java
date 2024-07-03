package datastructuretuffs.sorting;

public class SelectionSort {

    public int[] sort(int[] list) {
        for (int position= 0; position < list.length -1 ; position++) {
            int lowerIndex = position;
            for (int actualIndex = 0; actualIndex < list.length; actualIndex++) {
                if (list[actualIndex] < list[lowerIndex]) {
                    lowerIndex = actualIndex;
                }//encontra o menor
                if (list[position] > list[lowerIndex]) {
                    int aux = list[position];
                    list[position] = list[lowerIndex];
                    list[lowerIndex]=aux;//manda ele pra primeira posição
                }
            }
        }
    return list;
    }
}

