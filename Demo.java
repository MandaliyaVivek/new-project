import java.util.*;
import java.time.*;
abstract class Person
{
	String fname,lname,bdate;
	Person()
	{
		fname = lname = bdate = null;
	}
	Person(String fn,String mn,String dt)
	{
		fname = fn;
		lname = mn;
		bdate = dt;
	}
	Person(Person ob)
	{
		fname = ob.fname;
		lname = ob.lname;
		bdate = ob.bdate;
	}
	void setFname(String fn)
	{
		fname = fn;
	}
	String getFname()
	{
		return fname;
	}
	void setLname(String ln)
	{
		lname = ln;
	}
	String getLname()
	{
		return lname;
	}
	void setbdate(String dt)
	{
		bdate = dt;
	}
	String getBdate()
	{
		return bdate;
	}
	public String toString()
	{
		return "\nPerson Name :"+fname +" " + lname + " Birth date :"+bdate;
	}
	abstract void display();
}

class Employee extends Person
{
	String doj;
	Double Bas_sal, da, hra, netSal;
	Employee()
	{
		super();
		doj = null;
		Bas_sal = da = hra = 0.0;
	}
                 
	Employee(String fn,String ln,String bdt,String dj,double bs,double d,double hr)
	{
		super(fn,ln,bdt);
		doj = dj;
		Bas_sal = bs;
		da = d;
		hra = hr;
	}
	Employee(Employee ob)
	{
		super(ob);
		doj = ob.doj;
		Bas_sal =ob.Bas_sal;
		da = ob.da;
		hra = ob.hra;
	}
	void setDoj(String dt)
	{
		doj = dt;
	}
	String getDoj()
	{
		return doj;
	}
	void setBas_Sal(double bs)
	{
		Bas_sal = bs;
	}
	double getBas_Sal()
	{
		return Bas_sal;
	}
	void setDa(double d)
	{
		da= d;
	}
	double getDa()
	{
		return da;
	}
	void setHra(double hr)
	{
		hra = hr;
	}
	double getHra()
	{
		return hra;
	}
	double CalNetSal()
	{
		return netSal = Bas_sal + da + hra;
	}
	void display()
	{
		System.out.println("Employee name :"+fname + " " + lname);
		System.out.println("Employee birth date :"+bdate);
		System.out.println("Employee Date of joining :"+doj);
		System.out.println("Employee Basic salary :"+Bas_sal);
		System.out.println("Employee Da :"+da);
		System.out.println("Employee hra :"+hra);
		System.out.println("Employee Net salary :"+CalNetSal()+"\n");
	}
	public String toString()
	{
		return "\nEmployee Name :"+fname +" " + lname + " Birth date :"+bdate + " Date of Joining :"+doj+" Basic Salary :"+Bas_sal+
		"Da :"+da+ " Hra :"+hra+" Net Salary :"+netSal;
	}
}

class Permenent extends Employee
{
	double commission;
	Permenent()
	{
		super();
		commission = 0.0;
	}
	Permenent(String fn,String ln,String bdt,String dj,double bs,double d,double hr,double cm)
	{
		super(fn,ln,bdt,dj,bs,d,hr);
		commission = cm;
	}
	Permenent(Permenent ob)
	{
		super(ob);
		commission = ob.commission;
	}
	void setCommission(double cm)
	{
		commission = cm;
	}
	double getCommission()
	{
		return commission;
	}
	double CalNetSal()
	{
		return netSal = Bas_sal + da + hra + commission;
	}
	void display()
	{
		System.out.println("Permenent Employee name :"+fname + " " + lname);
		System.out.println("Permenent Employee birth date :"+bdate);
		System.out.println("Permenent Employee Date of joining :"+doj);
		System.out.println("Permenent Employee Basic salary :"+Bas_sal);
		System.out.println("Permenent Employee Da :"+da);
		System.out.println("Permenent Employee hra :"+hra);
		System.out.println("Permenent Employee hra :"+commission);
		System.out.println("Permenent Employee Net salary :"+CalNetSal()+"\n");
	}
	public String toString()
	{
		return "\nPermenent Employee Name :"+fname +" " + lname + " Birth date :"+bdate + " Date of Joining :"+doj+" Basic Salary :"+Bas_sal+
		"Da :"+da+ " Hra :"+hra+" Commission :"+commission +" Net Salary :"+netSal;
	}
}

class Contract extends Employee
{
	double fixSal;
	Contract()
	{
		super();
		fixSal = 0.0;
	}
	Contract(String fn,String ln,String bdt,String dj,double bs,double d,double hr,double fix)
	{
		super(fn,ln,bdt,dj,bs,d,hr);
		fixSal = fix;
	}
	Contract(Contract ob)
	{
		super(ob);
		fixSal = ob.fixSal;
	}
	void setFixSal(double fix)
	{
		fixSal = fix;
	}
	double getFixSal()
	{
		return fixSal;
	}
	void display()
	{
		System.out.println("Contract Employee name :"+fname + " " + lname);
		System.out.println("Contract Employee birth date :"+bdate);
		System.out.println("Contract Employee Date of joining :"+doj);
		System.out.println("Contract Employee Fix salary :"+fixSal);
	}
	public String toString()
	{
		return "\nContract Employee Name :"+fname +" " + lname + " Birth date :"+bdate + " Date of Joining :"+doj+
		" Fix Salary :"+fixSal;
	}
}

public class Demo
{
	public static void main(String args[])
	{
		Employee e1 = new Employee("abc","xyz","23/2/99","20/3/2017",20000.0,1500.0,2500.0);
		e1.display();
		
		System.out.println("\n"+e1.toString()+"\n");
		/*Employee e2 = new Employee(e1);
		e1.setFname("Mandaliya");
		e1.setLname("Vivek");
		e1.display();
		c
		
		System.out.println("Employee birth date :"+e1.getBdate());*/
		Permenent p1 = new Permenent("Parth","Gohel","1/4/99","2/5/2017",30000.0,2500.0,3500.0,5000.0);
		p1.display();
		
		System.out.println("Permenent Employee commission :"+p1.getCommission()+"\n");
		
		System.out.println("\n"+p1.toString()+"\n");
		
		Contract c1 = new Contract("Viral","Chauhan","7/5/99","16/8/2017",40000.0,2000.0,3000.0,50000.0);
		c1.display();
		
		System.out.println("Contract Employee fix salary :"+c1.getFixSal()+"\n");
		
		//System.out.println("\n"+c1.toString()+"\n");
		System.out.println("\n"+c1+"\n");
		Permenent p;
		p = p1;
		p.display();
		
		/*p = c1;
		p.display();*/
	}
}