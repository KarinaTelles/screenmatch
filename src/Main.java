import datastructuretuffs.sorting.SelectionSort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Movie movie = new Movie();
//        movie.showTechnicalFile();
//        movie.rate(1);
//        movie.rate(2);
//        double returnOfAverangeMethod;
//        returnOfAverangeMethod = movie.returnAverage();
//        System.out.println(returnOfAverangeMethod);
//        movie.showTechnicalFile();
//        Movie thePursuitOfHappiness = new Movie("The Pursuit of Happyness",2006,118);
//        thePursuitOfHappiness.showTechnicalFile();

        SelectionSort selectionSort = new SelectionSort();
        int list[]={7,5,1,8,3};
        int getList[];
        getList = selectionSort.sort(list);

    }
}