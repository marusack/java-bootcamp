package dao;

import model.Course;
import model.Student;
import antlr.collections.List;

public interface CourseDao {

		public void add(Course course);
		public void edit(Course course);
		public void delete(int courseid);
		public List getAllCourses();
		public Course getCourse(int courseid);
}
