package datastructuretuffs.sorting;

public class BubbleSort {
 int sizeOfTheList=0;
    public int [] sort(int[] list){
        sizeOfTheList = list.length;
        for (int j = 0; j < sizeOfTheList-1; j++) {
            for (int i = 0; i < sizeOfTheList-1 ; i++) {
                if (list[i] > list[i+1]){
                    int aux = 0;
                    aux = list[i];
                    list[i] = list[i+1];
                    list[i+1] = aux;
                }
            }
        }
        return list;
    }
}
