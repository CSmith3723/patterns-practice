package simpleFactoryMethod;

public class ClothingStore implements Store {

	@Override
	public void openStore() {
		System.out.println("The clothing store opens at 9 AM.");
	}

	@Override
	public void closestore() {
		System.out.println("The clothing store closes at 9 PM.");

	}

	@Override
	public void productType() {
		System.out.println("The clothing store sells clothing for all people, body types, and interest groups.");
	}

	@Override
	public void storeSize() {
		System.out.println("This is a large store.");
		
	}

}
