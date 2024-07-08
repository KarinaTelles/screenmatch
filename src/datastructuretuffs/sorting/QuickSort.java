package datastructuretuffs.sorting;

public class QuickSort {
    int[]list;
    int inicio;
    Integer fim;
    public QuickSort(int[] list, int inicio, int fim){
        inicio = 0;
        fim = list.length;
    }
    public int [] sort(int[]list, int inicio, Integer fim){
        this.list = list;
        this.inicio = inicio;
        this. fim = fim;
        inicio = 0;
        if(fim.equals(null)){
            fim = list.length -1;
        }
        if(inicio < fim ){
            int pivo = 0;
            pivo = partition(list,inicio,fim);
            sort(list, inicio, pivo-1);
            sort(list, pivo+1, fim);
        }
        return list;
    }
    public int partition(int[]list, int inicio, Integer fim){
        int retorno = 0;
        int pivot = list[fim];
        int indexAmerelo = inicio;
        for (int indexRoxo = 0; indexRoxo > inicio && indexRoxo < fim ; indexRoxo++) {
            if (list[indexRoxo] <=pivot){
                list[indexRoxo] = list[indexAmerelo];
                list[indexAmerelo]=list[indexRoxo];
                indexAmerelo = indexAmerelo +1;
            }
        list[indexAmerelo] = list[fim];
        list[fim] = list[indexAmerelo];
        }
        return retorno;
    }
}
