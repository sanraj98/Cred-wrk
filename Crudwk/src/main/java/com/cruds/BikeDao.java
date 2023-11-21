package com.cruds;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class BikeDao implements BikeDaoIn {
	Configuration cf=new Configuration().configure().addAnnotatedClass(Bikes.class);
	SessionFactory sf=cf.buildSessionFactory();
	@SuppressWarnings("deprecation")
	public void addbik(Bikes bi) {
		Session sei=sf.openSession();
		Transaction tri=sei.beginTransaction();
		sei.save(bi);
		tri.commit();
		sei.close();
	}
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Bikes> getlist(){
		Session sei1=sf.openSession();
		Transaction tr2=sei1.beginTransaction();
		Query<Bikes> q=sei1.createQuery("from Bikes");
		List<Bikes> bi=q.list();
		tr2.commit();
		sei1.close();
		return bi;
	}
	@SuppressWarnings("deprecation")
	public void delt(int dId) {
		Session ses=sf.openSession();
		Transaction tre=ses.beginTransaction();
		Bikes b2=ses.get(Bikes.class, dId);
		ses.delete(b2);
		tre.commit();
		ses.close();
	}
	public Bikes getbik(int uId) {
		Session ses2=sf.openSession();
		Transaction tr=ses2.beginTransaction();
		Bikes b3=ses2.get(Bikes.class, uId);
		tr.commit();
		ses2.close();
		return b3;
	}
	@SuppressWarnings("deprecation")
	public void updat(Bikes b6) {
		Session ses4=sf.openSession();
		Transaction tr4=ses4.beginTransaction();
		/*List<Bikes> bl=new ArrayList<Bikes>();
		Query qr=ses4.createQuery("UPDATE Bikes bi set bi.bName=:nem where bi.bId=:uid");
		qr.setParameter("nem", b6.getbName());
		qr.setParameter("uid", b6.getbId());
		bl=qr.list();
		System.out.println(bl);*/
		ses4.update(b6);
		tr4.commit();
		ses4.close();
	}

}
