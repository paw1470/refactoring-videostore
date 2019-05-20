package pl.dominisz.refactoringvideostore;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public String getTitle() {
        return movie.getTitle();
    }

    public double getAmount() {
        return movie.getAmount(daysRented);
    }

    public int getRenterPoints() {
        return movie.getRenterPoints(daysRented);
    }

}