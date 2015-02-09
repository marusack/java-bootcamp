package impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Student;
import antlr.collections.List;
import dao.StudentDao;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory session;
	
	
	@Override
	public void add(Student student) {
		session.getCurrentSession().save(student);

	}

	@Override
	public void edit(Student student) {
		session.getCurrentSession().update(student);

	}

	@Override
	public void delete(int studentid) {
		session.getCurrentSession().delete(getStudent(studentid));

	}

	@Override
	public List getAllStudent() {
		
		return (List) session.getCurrentSession().createQuery("from students").list();
	}

	@Override
	public Student getStudent(int studentid) {
	return(Student)session.getCurrentSession().get(Student.class, studentid);
		
	}

}
