package moviestuffs;

public class Movie {
    String name;
    int dateOfRelease;
    boolean isSignedUp;
    double rating;
    double sumOfRating;
    int totalOfReview;
    int timeInMinutes;
    public Movie(){

    }
    public Movie(String name, int dateOfRelease, int timeInMinutes){
        this.name = name;
        this.dateOfRelease = dateOfRelease;
        this.rating = rating;
        this.timeInMinutes = timeInMinutes;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", dateOfRelease=" + dateOfRelease +
                ", inSubscription=" + isSignedUp +
                ", rating=" + sumOfRating +
                ", totalOfReview=" + totalOfReview +
                ", timeInMinutes=" + timeInMinutes +
                '}';
    }
    public void showTechnicalFile(){
        String technicalFile = toString();
        System.out.println(technicalFile);
    }
    public void rate(double rating){
        sumOfRating += rating;
        totalOfReview ++;
    }
    public double returnAverage(){
        return sumOfRating / totalOfReview;
    }
}
