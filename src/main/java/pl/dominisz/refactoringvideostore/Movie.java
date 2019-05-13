package pl.dominisz.refactoringvideostore;

public abstract class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getAmount(int daysRented);

    public abstract int getRenterPoints(int daysRented);
}