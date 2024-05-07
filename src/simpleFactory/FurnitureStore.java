package simpleFactory;

public class FurnitureStore implements Store {

	@Override
	public void openStore() {
		System.out.println("The furniture store opens at 8 AM.");
	}

	@Override
	public void closestore() {
		System.out.println("The furniture store closes at 9 PM.");
	}

	@Override
	public void productType() {
		System.out.println("The furniture store sells couches, beds, chairs, tables, and other home goods.");
	}
	
	@Override
	public void storeSize() {
		System.out.println("This is a medium-sized store.");
		
	}

}
