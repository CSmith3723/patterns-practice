package simpleFactoryMethod;

public class StoreFactory extends BaseStoreFactory {

	//here we are creating an object of type store.
	//the create store method is going to take in the 'type'
	//of store that it is and based on that, it will make that
	//object into a new object of the appropriate 'type'.
	//
	//For example: if the 'type' passed in is clothing, the newly created
	//Store object will become of a new ClothingStore object
	
	@Override
	public Store createStore(String type) {

		Store store = null;
		switch (type.toLowerCase()) {
		
		case "clothing":
			store = new ClothingStore();
			break;
		case "furniture":
			store = new FurnitureStore();
			break;
		case "grocery":
			store = new GroceryStore();
			break;
		}
		store.openStore();
		store.closestore();
		store.productType();
		store.storeSize();
		return store;

	}

}
