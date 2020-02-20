package Classes;
import java.util.*;
class Employees
{
	long e_id;
	String e_name;
	String e_addr;
	long e_phone;
	double basicSalary;
	double specialAlloance=250.80;
	double hra=1000.50;
	Employees(){}
	Employees(long id,String name,String  addr,long phone)
	{
		e_id=id;
		e_name=name;
		e_addr=addr;
		e_phone=phone;
		
	}
	public void calculateSalary()
	{	
		double salary;
		salary=basicSalary + ( basicSalary*specialAlloance /100) + ( basicSalary * hra/100); 
		System.out.println(salary);
	}
	public void calculateTransportAllowance()
	{
		double tas;
		tas=( basicSalary * 10/100); 
		System.out.println(tas);
	}
}
class Manager extends Employees
{	
	 Manager(long id,String name,String addr,long phone, double salary)
	{
		super( id, name,addr,phone);
		basicSalary=salary;
	}
	public void calculateTransportAllowance()
	{
		double tas;
		tas=( basicSalary * 15/100); 
		System.out.println(tas);
	}
}
class Trainee extends Employees
{
	int ta=10;
	 Trainee(long emp_id,String e_name,String addr,long phone,double salary)
	{
		super( emp_id, e_name,addr,phone);
		basicSalary=salary;
	}
	
} 
class InheritanceActivity
{
	public static void main(String args[])
	{
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000.00);
		m.calculateSalary() ;
		m.calculateTransportAllowance();
		
		Trainee t=new Trainee(29846,"Jack","Mumbay India",442085,45000.00);
		t.calculateSalary();
		t.calculateTransportAllowance();
	}
}
