package pl.dominisz.refactoringvideostore;

// This file is the original program.  It has been left here so you can compare it with the refactored version.
import java.util.Dictionary;
import java.util.Vector;
import java.util.Enumeration;

public class Customer 
{
	public Customer (String name) {
		this.name = name;
	}
	
	public void addRental (Rental rental) {
		rentals.addElement (rental);
	}
	
	public String getName () {
		return name;
	}

	private String name;
	private Vector rentals = new Vector ();

	public Vector getRentals() {
		return rentals;
	}
}
