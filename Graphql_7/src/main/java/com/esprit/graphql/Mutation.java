package com.esprit.graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.esprit.entities.Student;
import com.esprit.repository.StudentRepository;

public class Mutation implements GraphQLRootResolver {
	  private final StudentRepository studentRepository;

	  public Mutation(StudentRepository studentRepository) {
	    this.studentRepository = studentRepository;
	  }

	  public Student createStudent(String cin, String nompre, String email) {
		    Student student = new Student(cin, nompre, email);
		    studentRepository.saveStudent(student);
		    return student;
		}

		public Student updateStudent(String cin, String nompre, String email) {
		    studentRepository.updateStudent(cin, nompre, email);
		    return studentRepository.getStudentById(cin);
		}

		public boolean deleteStudent(String cin) {
		    Student studentToDelete = studentRepository.getStudentById(cin);
		    if (studentToDelete != null) {
		        studentRepository.deleteStudent(cin);
		        return true;
		    }
		    return false;
		}

	}