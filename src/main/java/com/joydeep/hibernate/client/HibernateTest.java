package com.joydeep.hibernate.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.joydeep.hibernate.model.Address;
import com.joydeep.hibernate.model.LoginName;
import com.joydeep.hibernate.model.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		//
		UserDetails uds=new UserDetails();
		Address commonAddress=new Address();
		commonAddress.setCity("Kolkata");
		commonAddress.setPincode("700091");
		commonAddress.setState("West Bengal");
		commonAddress.setStreet("CL Block");
		Address officeAddress1=new Address();
		Address officeAddress2=new Address();
		officeAddress1.setCity("Kolkata");
		officeAddress1.setPincode("700091");
		officeAddress1.setState("West Bengal");
		officeAddress1.setStreet("Unitech Rajarhat");
		officeAddress2.setCity("Kolkata");
		officeAddress2.setPincode("700091");
		officeAddress2.setState("West Bengal");
		officeAddress2.setStreet("Salt Lake Sector 5");
		LoginName login1=new LoginName();
		login1.setPassportId("NPN6738838");
		login1.setSsn("8849937749");
		LoginName login2=new LoginName();
		login2.setPassportId("NPN6738839");
		login2.setSsn("8849937748");
		uds.setUserId(login1);
		uds.setUserName("Joydeep Chowdhury");
		uds.setHomeAddress(commonAddress);
		uds.setJoinedDate(new Date());
		uds.setDescription("Description of the user goes here");
		uds.setOfficeAddress(officeAddress2);
		UserDetails uds2=new UserDetails();
		uds2.setUserId(login2);
		uds2.setUserName("Pramit Karmakar");
		uds2.setHomeAddress(commonAddress);
		uds2.setJoinedDate(new Date());
		uds2.setDescription("Description of the user goes here");
		uds2.setOfficeAddress(officeAddress1);
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        session.save(uds);
        session.save(uds2);
        session.getTransaction().commit();
        session.close();
	}

}
