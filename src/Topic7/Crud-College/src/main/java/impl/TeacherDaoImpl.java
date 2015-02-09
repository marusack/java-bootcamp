package impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import model.Teacher;
import antlr.collections.List;
import dao.TeacherDao;
@Repository
public class TeacherDaoImpl implements TeacherDao {
 private SessionFactory session;
	@Override
	public void add(Teacher teaacher) {
		session.getCurrentSession().save(teaacher);

	}

	@Override
	public void edit(Teacher teaacher) {
		session.getCurrentSession().update(teaacher);

	}

	@Override
	public void delete(int teacherid) {
		session.getCurrentSession().delete(getTeacher(teacherid));

	}

	@Override
	public List getAllTeacher() {
		
		return  (List) session.getCurrentSession().createQuery("from teacher").list();
	}

	@Override
	public Teacher getTeacher(int teacherid) {
		
		return (Teacher)session.getCurrentSession().get(Teacher.class, teacherid);
	}

}
