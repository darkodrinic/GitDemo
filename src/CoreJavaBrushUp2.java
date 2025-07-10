import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList<String> arg = new ArrayList<String>();
		arg.add("Darko");
		arg.add("Drinic");
		arg.add("Udemy");
		arg.add("Selenium");
		arg.add("Tanja");
		arg.add("UBS");
		arg.add("Suisse");
		System.out.println(arg.get(2));
		
		for(int i = 0; i<arg.size(); i++) {
			System.out.println(arg.get(i));
		}
		
		for(String val : arg) {
			System.out.println(val);
		
		}
		
			System.out.println(arg.contains("Darko1"));
		}

}
	


