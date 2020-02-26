package ccom.evalueserve.customFunctionalInterface;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface1 myInterface1 = () -> {
			System.out.println("****MYINTERFACE 1 method called****");
		};
		
		myInterface1.method1();
		
		MyInterface2 myInterface2 = (String name) -> {
			System.out.println(name);
		};
		
		myInterface2.method2("Anuj");
	}

}
