
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> names = Arrays.asList("abc1","kil","abc2","uyb","abc3");
		
		Optional<String> strFirst= names.stream().filter(str->str.contains("a")).map(str->str.toUpperCase()).findFirst();
		
		System.out.println(strFirst);
	}

}
