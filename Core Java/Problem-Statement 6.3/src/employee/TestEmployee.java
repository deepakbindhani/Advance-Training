package employee;
import java.util.Vector;
public class TestEmployee {
	public static void main(String[]args) {
		Vector<Employee> v=addInput();
		display(v);
	}
	public static Vector<Employee> addInput(){
		Employee e1=new Employee(1,"deepak","Odisha");
		Employee e2=new Employee(2,"Rahul","Jamsedpur");
		Employee e3=new Employee(3,"Diksha","varanasi");
		Vector<Employee>v = new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	}
	public static void display(Vector<Employee>v)
	{
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+" "+e.getEname()+" "+e.getAddress());
		}
	}
}