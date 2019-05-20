package pl.dominisz.refactoringvideostore;

public class StatementCreator {

    public static String create(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + customer.getName() + "\n";

        for (Rental rental : customer.getRentals()) {
            double thisAmount = rental.getAmount();
            frequentRenterPoints += rental.getRenterPoints();
            result += "\t" + rental.getMovie().getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        result += "You owed " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points\n";

        return result;
    }

}
