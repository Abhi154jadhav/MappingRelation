package MainClass;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;
import com.entity.Petients;

public class MainClassOfHospital {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		cfg.addAnnotatedClass(Petients.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Petients p = new Petients();
		p.setP_id(101);
		p.setP_name("rajiv gupta");
		p.setP_symptoms("corona");
		ss.persist(p);
		
		Petients p1 = new Petients();
		p1.setP_id(102);
		p1.setP_name("akash varma");
		p1.setP_symptoms("hmpv"); 
		ss.persist(p1);
		
		Petients p2 = new Petients();
		p2.setP_id(103);
		p2.setP_name("rahul jaikar");
		p2.setP_symptoms("Arohi");
		ss.persist(p2);
		
		List<Petients> list = new ArrayList();
		list.add(p);
		list.add(p1);
		list.add(p2);
		
		Hospital h = new Hospital();
		h.setH_id(4070);
		h.setName("D.y.patil");
		h.setDoctorName("yash");
		h.setWardName("gernal");
		
		
		p.setHospital(h);
		h.setPetients(list);
		ss.persist(h);
		
		tr.commit();
		ss.close();
		
		
		
	}

}
