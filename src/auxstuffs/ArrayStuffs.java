package auxstuffs;

import java.util.Arrays;
import java.util.List;

public class ArrayStuffs {
    int[] anyArray;
    Integer[] anyArrayWithSize = {1,2,3,4,5,6,7,8,9,10};
    int arraySize = anyArrayWithSize.length;
    List<Integer> itens = Arrays.asList(anyArrayWithSize);
    public void printArray(){
        itens.forEach(System.out::println);
    }
}
