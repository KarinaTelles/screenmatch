package datastructuretuffs.sorting;

public class InsertionSort {
    int sizeOfTheList=0;
    public int[] sort(int[] list){
        sizeOfTheList = list.length;
        for (int i = 0; i < sizeOfTheList; i++) {
            int key = 0;
            key = list[i];
            int k = 0;
            k = i-1;
            while (k >= 0 && list[k]>key){
                list[k+i] = list[k];
                 k = k - 1;
            }
            list[k+1] = key;
        }
        return list;
    }
}
