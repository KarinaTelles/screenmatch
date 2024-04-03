package people;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void showTechnicalFile(){
        String technicalFile = toString();
        System.out.println(technicalFile);
    }
}
