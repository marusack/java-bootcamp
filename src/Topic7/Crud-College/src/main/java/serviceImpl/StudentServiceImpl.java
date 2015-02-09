package serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import model.Student;
import antlr.collections.List;
import service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentdao;

	@Transactional
	public void add(Student student) {
		studentdao.add(student);

	}

	@Transactional
	public void edit(Student student) {
		studentdao.edit(student);

	}

	@Transactional
	public void delete(int studentid) {
		studentdao.delete(studentid);

	}

	@Transactional
	public Student getStudent(int studentid) {
		
		return studentdao.getStudent(studentid);
	}

	@Transactional
	public List getAllStudent() {
		// TODO Auto-generated method stub
		return studentdao.getAllStudent();
	}

}
