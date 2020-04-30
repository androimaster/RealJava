package chap16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Test {
	public static void main(String[] args) {
//	    Function<Employee2, String> funcEmpToString= (Employee2 e)-> {return e.getName();};
	    List<Employee2> employeeList=
	        Arrays.asList(new Employee2("Tom Jones", 45), 
	            new Employee2("Harry Major", 25),
	            new Employee2("Ethan Hardy", 65),
	            new Employee2("Nancy Smith", 15),
	            new Employee2("Deborah Sprightly", 29));
	    
	    Function<Employee2, Employee2> funcEmpToEmp = (Employee2) -> Employee2;
	    Function<String, String> fun = (s) -> s;
	    List<Employee2> empNameListInitials=applyIdentityToEmpList(employeeList, funcEmpToEmp);//Function.identity());
//	    List<Employee2> empNameListInitials=applyIdentityToEmpList(employeeList, Function.identity());
	    empNameListInitials.forEach(System.out::println);
	}
	
    public static List<Employee2> applyIdentityToEmpList(List<Employee2> employeeList, Function<Employee2, Employee2> funcEmpToEmp){
	    List<Employee2> empNameList=new ArrayList<Employee2>(); 
	    for(Employee2 emp:employeeList){
	        empNameList.add(funcEmpToEmp.apply(emp));
	    }
	    return empNameList;
	}
}

@Getter
@Setter
@AllArgsConstructor
class Employee2 {
	String name;
	int age;
	
	@Override
	public String toString() {
		return "Employee Name :" + name + ", Age : " + age + "";
	}
	
}