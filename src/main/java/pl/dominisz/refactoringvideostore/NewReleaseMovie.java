package pl.dominisz.refactoringvideostore;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double getAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getRenterPoints(int daysRented) {
        int renterPoints = 1;

        if (daysRented > 1) {
            renterPoints++;
        }

        return renterPoints;
    }
}
