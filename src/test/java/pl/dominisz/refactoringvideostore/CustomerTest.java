package pl.dominisz.refactoringvideostore;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void shouldCreateEmptyStatementForNewCustomer() {
        Customer customer = new Customer("Adam Nowak");

        String expectedStatement = "Rental Record for Adam Nowak\n"
                                   + "You owed 0.0\n"
                                   + "You earned 0 frequent renter points\n";
        String actualStatement = StatementCreator.create(customer);

        Assert.assertEquals(expectedStatement, actualStatement);
    }
}
