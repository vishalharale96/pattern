package CreateSingleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {

	private static Singleton singletoneObject;
	
	private Singleton() {

	}

	public static Singleton getSingletonObject() {

		synchronized (Singleton.class) {
			if (singletoneObject == null) {

				singletoneObject = new Singleton();

			} else {
				return singletoneObject;
		}
			return singletoneObject;
	}

}

	protected Object readResolve() {
		return singletoneObject;
	}

	
	//by clone method
	/*public static void main(String[] args) throws CloneNotSupportedException {

		Singleton obj1 = Singleton.getSingletonObject();
		// by clone method
		Singleton obj2 = (Singleton) obj1.clone();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}*/

}
