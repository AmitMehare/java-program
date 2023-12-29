package testQuestion;


class user
{
int id=1;
String name="Amit";

public void employeeid(int id)
{
	this.id=id;
}
public void employeename(String name)
{
	this.name=name; //Creating the constructor
}

}
class Employee extends user //creating sub class
{
  double Salary=14000;
  public void setsalary(double Salary)
  {
  	this.Salary=Salary; //creating constructor
  }
  
}
public class EmployeeAnnualSalary 
{
public static void main(String args[])
{
  Employee a1=new Employee(); //create object of enployee class
  int id=a1.id;
  String Name=a1.name;
  double Calculateannualsalary =a1.Salary*12;
  System.out.println("id: "+id);
  System.out.println("Name of Employee: "+Name);
  System.out.println("total salary is: "+Calculateannualsalary);
}
}
