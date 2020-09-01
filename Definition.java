abstract class Person
{

	 String fname,lname;
	 String bdate;
	 
	 Person()
	 {
		 fname=lname=bdate=null;
	 }
	
	public Person(String firstname,String lastname,String bd)
	{
		this.fname=firstname;
		this.lname=lastname;
		this.bdate=bd;
	}
	void setFname(String firstname)
	{
		fname=firstname;
	}
	String getFname()
	{
		return fname;
	}
	void setLname(String lastname)
	{
		lname=lastname;
	}
	String getLname()
	{
		return lname;
	}
	void setBdate(String bd)
	{
		bdate=bd;
	}
	String getBdate()
	{
		return bdate;
	}
	public String toString()
	{
		return "\n Person Name is:"+fname + "lasstname is : " +lname + "birthdate is : " +bdate; 
	}

	abstract void display();

}	
class Employee extends Person 
{	
	String doj;
	double bas_salary,da,hra,netsal;
	
	Employee()
	{
		super();
		doj=null;
		bas_salary=da=hra=netsal=0.0;
	}
	
	public Employee(String firstname,String lasstname,String bd,String d_join,double basicsalary,double d_a,double h_r_a) 
	{
		super(firstname,lasstname,bd);
		this.doj=d_join;
		this.bas_salary=basicsalary;
		this.da=d_a;
		this.hra=h_r_a;
	}
	void setDoj(String d_join)
	{
		doj=d_join;
	}
	String getDoj()
	{
		return doj;
	}
	void setBas_salary(double basicsalary )
	{
		bas_salary=basicsalary;
	}
	double getBas_salary()
	{
		return bas_salary;
	}
	void setDa(double d_a)
	{
		da=d_a;
	}
	double getDa()
	{
		return da;
	}
	void setHra(double h_r_a)
	{
		hra=h_r_a;
	}
	double getHra()
	{
		return hra;
	}
	
	void display() 
	{
		System.out.println(":-------------------- this data is from Employee ---------------------: ");
		System.out.println("emp firstname is:" + fname);
		System.out.println("emp lastname is:" + lname);
		System.out.println("emp birthdate is:" + bdate);
		System.out.println("emp date of join is:" + doj);
		System.out.println("emp da is:" + da);
		System.out.println("emp hra is:" + hra);
		System.out.println("emp netsalary is:" + netsal);
	}
	public String toString()
	{
		return "\n fname:"+fname+"\nlastname"+lname + "\nbirthdate" +bdate +"\ndate of join:"+doj
		+"\nda is:"+da +"\nhra is:"+hra +"\nnetsalary is:"+netsal;
	}
}
class Permenent extends Employee
{
	double commission;
	Permenent()
	{
		super();
		commission=0.0;
	}
	Permenent(String firstname,String lastname,String bdate,String d_join,double basicsalary,double d_a,double h_r_a,double cm)
	{
		super(firstname,lastname,bdate,d_join,basicsalary,d_a,h_r_a);
		this.commission=cm;
	}
	void setCommission(double cm)
	{
		commission=cm;
	}
	double getCommission()
	{
		return commission;
	}
	double CalNetSal()
	{
		return netsal=bas_salary+da+hra+commission;
	}
	void display()
	{
		System.out.println("\nemp firstnmae :"+fname);
		System.out.println("\nemp lastnmae :"+lname);
		System.out.println("\nemp birthdate :"+bdate);
		System.out.println("\nemp date of join :"+doj);
		System.out.println("\nemp basicsalary :"+bas_salary);
		System.out.println("\nemp da :"+da);
		System.out.println("\nemp hra :"+hra);
		System.out.println("\nemp commission :"+commission);
		System.out.println("\nemp netsalary :"+CalNetSal());
	}
	public String toString()
	{
		return "\n perent emp name:"+fname + "\nlastname:"+lname + "\nbirthdate:"+bdate + "\ndoj:"+doj +
		"\nbassalary:"+bas_salary + "\nda:"+da + "\nhra:"+hra + "\ncommission:"+commission + "\nnetsal:"+netsal;
	}
}
class Contract extends Employee
{
	double fixsal;
	
	Contract()
	{
		super();
		fixsal=0.0;
	}
	Contract(String fname,String lname,String bdate,String doj,double da,double hra,double bas_salary,double fix_s)
	{
		super(fname,lname,bdate,doj,da,hra,bas_salary);
		this.fixsal=fix_s;
	}
	void setFixsal(double fix_s)
	{
		fixsal=fix_s;
	}
	double getFixsal()
	{
		return fixsal;
	}
	void display()
	{
		System.out.println("\nemp firstnmae :"+fname);
		System.out.println("\nemp lastnmae :"+lname);
		System.out.println("\nemp birthdate :"+bdate);
		System.out.println("\nemp date of join :"+doj);
		System.out.println("\nemp fixsalary :"+fixsal);
	}
	public String toString()
	{
		return "\nfirstname:"+fname + "\nlastname:"+lname + "\nbirthdate:"+bdate + "\ndoj:"+doj + "\nfixsalary:"+fixsal; 
	}
	
}
public class Definition
{
	public static void main(String args[])
	{
		Person p1=new Employee("jenil","patel","02/5/1999","1/08/2019",20000.0,1500.0,2000.0);
		
		Employee e1 = new Employee("parth","gohel","1/04/1999","1/08/2019",20000.0,1500.0,2000.0);
		e1.display();
		System.out.println(e1.toString());
		
		Permenent per = new Permenent("vivek","mandaliya","23/02/1999","1/07/2019",25000.0,1000.0,1800.0,2000.0);
		per.display();
		System.out.println(per.toString());
		
		Contract con = new Contract("viral","chauhan","7/08/1999","1/04/1999",2000.0,1100.0,30000.0,10000);
		con.display();
		System.out.println(con.toString());
		
	}

}