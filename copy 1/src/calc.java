
public class calc {
	static String z;
	
	public static String count(String d1, int m){
		if(!d1.equals("0")){
			z = d1;
			z += Integer.toString(m);
		}else{
			z = d1;
			z = Integer.toString(m);
		}
		return z;
	}
}