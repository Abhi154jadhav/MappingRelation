package MainClass;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
		Employee e = new Employee();
		e.setEmp_id(1);
		e.setEmp_name("abhishek");
		ss.persist(e);
		
		Employee e1 = new Employee();
		e1.setEmp_id(2);
		e1.setEmp_name("raj");
		ss.persist(e1);
		
		Employee e2 = new Employee();
		e2.setEmp_id(3);
		e2.setEmp_name("yash");
		ss.persist(e2);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e);
		list.add(e1);
		list.add(e2);
		
		Department d = new Department();
		d.setDep_id(101);
		d.setDep_name("testing");
		
		e.setDept(d);
		e1.setDept(d);
		e2.setDept(d);
		
		d.setEmp(list);
		ss.persist(d);
		
	
		tr.commit();
		ss.close();

	}
}
