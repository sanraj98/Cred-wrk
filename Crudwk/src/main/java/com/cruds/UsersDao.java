package com.cruds;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

@Component
public class UsersDao implements UsersDaoIn {
	Configuration cd=new Configuration().configure().addAnnotatedClass(Users.class);
	SessionFactory sdf=cd.buildSessionFactory();
	@SuppressWarnings("deprecation")
	public void regis(String usN,String psw,String emil,String sx,Date det) {
		Users usr=new Users();
		usr.setuNames(usN);
		usr.setPass(psw);
		usr.setEmail(emil);
		usr.setSex(sx);
		usr.setDob(det);
		Session sn=sdf.openSession();
		Transaction tx=sn.beginTransaction();
		sn.save(usr);
		tx.commit();
		sn.close();
	}
	@SuppressWarnings({ "deprecation", "unchecked" })
	public boolean logi(String usr,String pse) {
		boolean lg=false;
		List<Users> ue=new ArrayList<Users>();
		Session sn=sdf.openSession();
		Transaction tx=sn.beginTransaction();
		Query<Users> q=sn.createQuery("from Users us where us.uNames=:usr and us.pass=:psw");
		q.setParameter("usr",usr);
		q.setParameter("psw",pse);
		ue=q.list();
		System.out.println(ue);
		tx.commit();
		if((ue!=null)&&(ue.size()>0)) {
			lg=true;
		}
		return lg;
	}
}
