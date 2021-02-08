
public class User5 {

	public User5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] a=new Animal[3];
		
		a[0]= new Lion();
		a[1]=new Cat();
		a[2]=new Dog();
		
		for(Animal a1:a) {
			
			a1.talk();
			a1.istalk();
		}
		

	}

}
