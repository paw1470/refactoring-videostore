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

    @Test
    public void shouldCreateStatementWithThreeMovies() {
        Customer customer = new Customer("customer");
        customer.addRental(new Rental(new Movie("movie1", Movie.REGULAR), 10));
        customer.addRental(new Rental(new Movie("movie2", Movie.NEW_RELEASE), 20));
        customer.addRental(new Rental(new Movie("movie3", Movie.CHILDRENS), 30));

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
