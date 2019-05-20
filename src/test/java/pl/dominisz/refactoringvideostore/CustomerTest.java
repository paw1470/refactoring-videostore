package pl.dominisz.refactoringvideostore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldCreateEmptyStatementForNewCustomer() {
        Customer customer = new Customer("customer");

        String expectedStatement = "Rental Record for customer\n"
                                   + "You owed 0.0\n"
                                   + "You earned 0 frequent renter points\n";
        String actualStatement = StatementCreator.create(customer);

        assertEquals(expectedStatement, actualStatement);
    }

    //TODO create parametrized tests instead of three following tests:
    //TODO shouldCreateStatementWithRegularMovie
    //TODO shouldCreateStatementWithNewReleaseMovie
    //TODO shouldCreateStatementWithChildrensMovie

    @Test
    public void shouldCreateStatementWithRegularMovie() {
        Customer customer = new Customer("customer");
        customer.addRental(new Rental(new RegularMovie("movie1"), 10));

        String expectedStatement = "Rental Record for customer\n"
                                   + "\tmovie1\t14.0\n"
                                   + "You owed 14.0\n"
                                   + "You earned 1 frequent renter points\n";
        String actualStatement = StatementCreator.create(customer);

        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    public void shouldCreateStatementWithNewReleaseMovie() {
        Customer customer = new Customer("customer");
        customer.addRental(new Rental(new NewReleaseMovie("movie2"), 20));

        String expectedStatement = "Rental Record for customer\n"
                                   + "\tmovie2\t60.0\n"
                                   + "You owed 60.0\n"
                                   + "You earned 2 frequent renter points\n";
        String actualStatement = StatementCreator.create(customer);

        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    public void shouldCreateStatementWithChildrensMovie() {
        Customer customer = new Customer("customer");
        customer.addRental(new Rental(new ChildrensMovie("movie3"), 30));

        String expectedStatement = "Rental Record for customer\n"
                                   + "\tmovie3\t42.0\n"
                                   + "You owed 42.0\n"
                                   + "You earned 1 frequent renter points\n";
        String actualStatement = StatementCreator.create(customer);

        assertEquals(expectedStatement, actualStatement);
    }

    @Test
    public void shouldCreateStatementWithThreeMovies() {
        Customer customer = new Customer("customer");
        customer.addRental(new Rental(new RegularMovie("movie1"), 10));
        customer.addRental(new Rental(new NewReleaseMovie("movie2"), 20));
        customer.addRental(new Rental(new ChildrensMovie("movie3"), 30));

        String expectedStatement = "Rental Record for customer\n"
                                   + "\tmovie1\t14.0\n"
                                   + "\tmovie2\t60.0\n"
                                   + "\tmovie3\t42.0\n"
                                   + "You owed 116.0\n"
                                   + "You earned 4 frequent renter points\n";
        String actualStatement = StatementCreator.create(customer);

        assertEquals(expectedStatement, actualStatement);
    }
}
