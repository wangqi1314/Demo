import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	
	
	public static void main(String[] args) {
		String str = "1112223333";
//		String regEx = "^(\\d)\\1{3}$";
		String regEx="^.*\\d{4}.*$"; 
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(str);
		boolean rs = matcher.matches();
		System.out.println(rs);
		
	}
}
