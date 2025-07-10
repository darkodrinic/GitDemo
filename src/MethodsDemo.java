
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();

	}
	
	public static String getData() {
		System.out.println("hello world");
		return "rahul shetty";
	}

}
