package pl.dominisz.refactoringvideostore;

public class ChildrensMovie extends Movie {
    public ChildrensMovie(String title) {
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
