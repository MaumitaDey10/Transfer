
public class User3 {

	public User3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee [] employee_list = new Employee[4];
		
		employee_list[0]= new Manager(576336,"Asha",10000,5000);
		employee_list[1]= new SalesManager(446670,"Sobha",2500,500);
		employee_list[2]= new Employee(34567,"Momo",9099);
		employee_list[3]= new Manager(94567,"Kokila",9000,800);
		
		for(Employee emp:employee_list) {
			
			emp.showTotSal();
		}

	}

}
