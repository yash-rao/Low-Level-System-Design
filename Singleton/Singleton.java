class LazySingleton {
	private static LazySingleton object;

	private LazySingleton() {}

	public static LazySingleton createInstance() {
		if (object == null) {
			object = new LazySingleton();
			return object;
		}
		return object;
	}
}

class Singleton {
	public static void main(String arg[]) {
		LazySingleton s1 = LazySingleton.createInstance();
		LazySingleton s2 = LazySingleton.createInstance();

		if(s1==s2) {
			System.out.println(true);
		}
	}
}