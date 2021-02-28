import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		String re = "(?i)Afton";
		
		String text = "afton. ";
		
		Pattern pt = Pattern.compile(re);
		Matcher mt = pt.matcher(text);
		
		boolean result = mt.matches();
		System.out.println(result);
		
		
		String title1 = "Random Title";
		String title2 = "Sample Title";
		
		int answer = title1.compareTo(title2);
		
		if (answer < 0) {
			System.out.println(title1);
			System.out.println(title2);
			}
		else if (answer > 0) {
			System.out.println(title2);
			System.out.println(title1);
		}
		else {
			System.out.println("They are the same name");
		}
		
		
		
		
		

		
		
		
	}

}
