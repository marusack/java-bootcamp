package dao;


import model.Student;
import model.Teacher;
import antlr.collections.List;

public interface TeacherDao {

	public void add(Teacher teaacher);
	public void edit(Teacher teaacher);
	public void delete(int teacherid);
	public Teacher getTeacher(int teacherid);
	public List getAllTeacher();
}
