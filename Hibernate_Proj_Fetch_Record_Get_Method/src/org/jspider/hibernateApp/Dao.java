package org.jspider.hibernateApp;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Dao
{
	public static void main(String[] args) 
	{
       Configuration conf = new Configuration();
       conf.configure();
       SessionFactory sef = conf.buildSessionFactory();
       Session ses = sef.openSession();
       student std = (student)ses.get(student.class, 2);
       System.out.println(std);
       ses.close();
	}

}
