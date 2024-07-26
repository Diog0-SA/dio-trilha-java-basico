package one.digitalinnovation.gof.Singleton;

/*
 * Singleton "Lazy Holder",
 * 
 * 
 * @author Diog0-SA
 */

public class SingletonLazyHolder {

	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {	
		return InstanceHolder.instancia;
	}
}
