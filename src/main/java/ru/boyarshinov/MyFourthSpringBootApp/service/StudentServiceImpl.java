package ru.boyarshinov.MyFourthSpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.boyarshinov.MyFourthSpringBootApp.dao.StudentDAO;
import ru.boyarshinov.MyFourthSpringBootApp.entity.Student;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student getStudent(int id) { return studentDAO.getStudent(id); }

    @Override
    @Transactional
    public Student saveStudent(Student student){
        return studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) { studentDAO.deleteStudent(id); }
}
