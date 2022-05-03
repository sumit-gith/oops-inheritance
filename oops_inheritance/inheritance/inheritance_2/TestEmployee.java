public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee("Rohan", 123450, 2018, "12481632");
		
		System.out.println(" Employee Details:");
		System.out.println("Name: " + e.getName());
		System.out.println("Year Of Starting: " + e.getYearOfStart());
		System.out.println("Annual Salary: " + e.getAnnualSalary());
		System.out.println("Insurance Number: " + e.getNationalInsuranceNo());
	}

}
