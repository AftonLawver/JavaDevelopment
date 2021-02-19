import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx {

	public static void main(String[] args) {
		String re = "(?i)Afton";
		
		String text = "afton";
		
		Pattern pt = Pattern.compile(re);
		Matcher mt = pt.matcher(text);
		
		boolean result = mt.matches();
		System.out.println(result);
		
		
	}

}