package simpleFactory;


public class StoreFactoryMain {

	
	public static void main(String[] args) {
		
		//create a general store factory object that can be used 
		//to create new stores based on the type passed in
		
		//This code creates no concrete Store objects using the new keyword
		//which allows us to update and enhance the Store class later in one place
		//rather than everywhere.
		BaseStoreFactory storeFactory = new StoreFactory();
		
		Store groceryStore = storeFactory.createStore("grocery");
		System.out.println();
		Store furnitureStore = storeFactory.createStore("furniture");
		
		
	}

}
