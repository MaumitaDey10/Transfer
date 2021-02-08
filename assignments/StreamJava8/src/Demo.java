import java.awt.List;
import java.util.Arrays;
import java.util.Collection;

public class Demo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		java.util.List<Integer> intList =  Arrays.asList(2,3,4,5);
		
		intList.stream().forEach((num)->System.out.println(num));
		
		intList.stream().forEach((num)->System.out.println(num*num));
		
		intList.stream().map(i->i*i).filter(x->x%2==0).forEach((num)->System.out.println(num));

	}

}
