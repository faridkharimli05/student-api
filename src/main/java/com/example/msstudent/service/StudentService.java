package com.example.msstudent.service;


import com.example.msstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1L, "Farid", 23, "faridkarimli2002@gmail.com"));
        students.add(new Student(2L, "Xeyal", 22, "xeyalgasimov123@mail.ru"));
    }


    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(Long id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(Long id, Student updatedStudent) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                student.setEmail(updatedStudent.getEmail());
            }
        }
    }

    public void deleteStudent(Long id) {
        students.removeIf(s -> s.getId().equals(id));
    }
}



