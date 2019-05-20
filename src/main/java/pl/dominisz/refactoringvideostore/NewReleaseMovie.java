package pl.dominisz.refactoringvideostore;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        return 0;
    }

    @Override
    public int getRenterPoints(int daysRented) {
        return 0;
    }
}
