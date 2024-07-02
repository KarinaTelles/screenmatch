package datastructuretuffs.sorting;

public class SelectionSort {
    public int[] sort(int[] list){
    findLowestValueAndSwap(list);
    return list;
    }
    public void findLowestValueAndSwap(int[] list) {
        for (int j = 0; j < list.length -1 ; j++) {
            int min_index = j;
            for (int i = 0; i < list.length; i++) {
                if (list[i] < list[min_index]) {
                    min_index = i;
                }
                if (list[j] > list[min_index]) {
                    int aux = list[j];
                    list[j] = list[min_index];
                    list[min_index]=aux;
                }
            }
        }
    }
}

