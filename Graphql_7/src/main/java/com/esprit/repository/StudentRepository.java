package com.esprit.repository;

import java.util.ArrayList;
import java.util.List;

import com.esprit.entities.Student;

public class StudentRepository {
    private final List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
        students.add(new Student("0123456780", "Test Ben TEST", "test@esprit.tn"));
        students.add(new Student("22551100", "Mohamed ben SALAH", "med.salsah@esprit.tn"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void saveStudent(Student student) {
        students.add(student);
    }
    public Student getStudentById(String cin) {
        for (Student student : students) {
            if (student.getCin().equals(cin)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String cin) {
        Student studentToDelete = getStudentById(cin);
        if (studentToDelete != null) {
            students.remove(studentToDelete);
        }
    }

    public void updateStudent(String cin, String nompre, String email) {
        Student studentToUpdate = getStudentById(cin);
        if (studentToUpdate != null) {
            studentToUpdate.setNompre(nompre);
            studentToUpdate.setEmail(email);
        }
    }

}
