package service;

import model.Student;
import antlr.collections.List;

public interface StudentService {

	
		public void add(Student student);
		public void edit(Student student);
		public void delete(int studentid);
		public Student getStudent(int studentid);
		public List getAllStudent();
}
