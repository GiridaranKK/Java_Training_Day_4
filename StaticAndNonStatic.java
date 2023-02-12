public class StaticAndNonStatic {

	public static void main(String[] args) {
		Company.companyName = "Clayfin";
		Company emp1 = new Company();
		Company emp2 = new Company();
		//emp1.companyName = "Clayfin";
		emp1.employeeId = 1234;
		emp1.employeeName = "Abc";
		emp1.position = "Trainee";
		emp1.age = 25;
		emp2.employeeId = 1235;
		emp2.employeeName = "Xyz";
		emp2.position = "Manager";
		emp2.age = 45;
		System.out.println(Company.companyName);
		System.out.println(emp1.employeeId);
		System.out.println(emp1.employeeName);
		System.out.println(emp1.position);
		System.out.println(emp1.age);
		System.out.println("");
		System.out.println(Company.companyName);
		System.out.println(emp2.employeeId);
		System.out.println(emp2.employeeName);
		System.out.println(emp2.position);
		System.out.println(emp2.age);
		System.out.println("");
		
		
	}

}
class Company{
	static String companyName;
	int employeeId;
	String employeeName;
	String position;
	int age;
}

//Output:
/*
	Clayfin
	1234
	Abc
	Trainee
	25

	Clayfin
	1235
	Xyz
	Manager
	45
*/

