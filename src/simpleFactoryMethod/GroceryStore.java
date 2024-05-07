package simpleFactoryMethod;

public class GroceryStore implements Store {

	@Override
	public void openStore() {
		System.out.println("The grocery store opens at 8 AM.");
	}

	@Override
	public void closestore() {
		System.out.println("The grocery store closes at 9 PM.");
	}

	@Override
	public void productType() {
		System.out.println("The grocery store sells pre-packed and fresh food products.");
	}

	@Override
	public void storeSize() {
		System.out.println("This is a medium-sized store.");
		
	}
}
