package car;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Car {
    String model;
    int year;
    String color;
    public void showTechnicalFile(){
        String technicalFile = toString();
        System.out.println(technicalFile);
    }
    public int ageOfThisCar(int yearOfTheCar){
        Date actualDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(actualDate);
        int actualYear = calendar.get(Calendar.YEAR);
        return actualYear - yearOfTheCar;
    }
    public int ageOfThisCarTwo(int yearOfTheCar){
        LocalDateTime now  = LocalDateTime.now();
        int actualYear = now.getYear();
        return  actualYear - yearOfTheCar;
    }
}
