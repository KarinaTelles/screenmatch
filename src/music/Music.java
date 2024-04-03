package music;

public class Music {
    String title;
    String artist;
    int yearOfRelease;
    double rating;
    double sumOfRating;
    int totalOfReview;

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", rate=" + rating +
                ", sumOfRating=" + sumOfRating +
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
