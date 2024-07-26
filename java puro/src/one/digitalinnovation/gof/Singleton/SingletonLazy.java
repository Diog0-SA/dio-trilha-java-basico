package one.digitalinnovation.gof.Singleton;

/*
 * Singleton "preguiçoso",
 * @author Diog0-SA
 */

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
