public class HelloWorld {
    public static final String HELLO_WORLD = "hello world";

	public static void main(final String[] arg) {
        System.out.println(sayHelloWorld());
    }

	public static String sayHelloWorld() {
		return HELLO_WORLD;
	}
}
