package hibernate;



import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;

import entitys.*;
import hibernate.HibernateUtil;

public class HibernateMain {

public static void main(String[] args) {
    /*Employee emp = new Employee();
    emp.setName("Pankaj");
    emp.setRole("CEO");
    emp.setInsertTime(new Date());*/
     
	
	Meeting meeting = new Meeting();
	ArrayList<Attendees> attendants =new ArrayList<Attendees>();
	meeting.setAttendants(attendants);
	meeting.setRoom(new Room(1,"chill"));
	meeting.setTime(new TimeSlot(1, "09/02/2015", 2));
    //Get Session
    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
    //start transaction
    session.beginTransaction();
    //Save the Model object
    session.save(meeting);
    //Commit transaction
    session.getTransaction().commit();
    System.out.println("meeting ID="+meeting.toString());
     
    //terminate session factory, otherwise program won't end
    HibernateUtil.getSessionFactory().close();
}

}