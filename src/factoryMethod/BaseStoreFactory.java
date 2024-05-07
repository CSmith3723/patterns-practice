package factoryMethod;

//This factory will be responsible for creating the 
//objects of type Store

public abstract class BaseStoreFactory {

	public abstract Store createStore(String type);
	
}
