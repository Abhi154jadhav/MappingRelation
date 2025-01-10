package MainClass;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.School;
import com.entity.Student;
public class MainClassOfStudentSchool {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(School.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student s = new Student();
		s.setName("yash");
		s.setLastname("kumthe");
		s.setAge(16);
		s.setCity("latur");
		s.setStd("8th");
		
		ss.persist(s);
		
		List <Student> list = new ArrayList();
		list.add(s);
		
		School sc = new School();
		sc.setCenterCode(1245);
		sc.setName("nutan school");
		sc.setPrname("jadhav principle");
		sc.setAccno(12458785);
		sc.setBoard("maharashtra state board");
		
		s.setSc(sc);
		sc.setList(list);
		
		ss.persist(sc);
		
		tr.commit();
		ss.close();
		

	}

}
