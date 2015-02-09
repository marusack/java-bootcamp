package impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import model.Course;
import model.Teacher;
import antlr.collections.List;
import dao.CourseDao;
@Repository
public class CourseDaoImpl implements CourseDao {
	private SessionFactory session;
	

	@Override
	public void add(Course course) {
		session.getCurrentSession().save(course);

	}

	@Override
	public void edit(Course course) {
		session.getCurrentSession().update(course);

	}

	@Override
	public void delete(int courseid) {
		session.getCurrentSession().delete(getCourse(courseid));

	}

	@Override
	public List getAllCourses() {
		
		return  (List) session.getCurrentSession().createQuery("from course").list();
	}

	@Override
	public Course getCourse(int courseid) {
		
		return (Course)session.getCurrentSession().get(Course.class, courseid);
	}

}
