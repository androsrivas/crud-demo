package com.inserta.cruddemo;

import com.inserta.cruddemo.DAO.StudentDAO;
import com.inserta.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

//	DELETE
//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//		return runner -> {
//			studentDAO.delete(3);
//			System.out.println("Estudiante eliminado.");
//		};
//	}

//	UPDATE
//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//		return runner -> {
//			Student foundStudent = studentDAO.findById(5);
//			foundStudent.setFirstName("Shirley");
//			foundStudent.setLastName("Jackson");
//			studentDAO.update(foundStudent);
//			System.out.println("Estudiante actualizado: " + foundStudent.getId());
//		};
//	}

//	GET BY LAST NAME
//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//		return runner -> {
//			List<Student> studentsByLastName = studentDAO.findByLastName("Butler");
//			for(Student student : studentsByLastName) {
//				System.out.println("Estudiante encontrado: " + student.getId());
//			}
//		};
//	}

//	GET BY ID
//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//		return runner -> {
//			Student student = studentDAO.findById(1);
//			System.out.println("Estudiante encontrado: "
//					+ student.getId()
//			);
//		};
//	}

//	READ ALL
//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//		return runner -> {
//			for(Student student : studentDAO.findAll()) {
//				System.out.println(student);
//			}
//		};
//	}


//  CREATE
//	@Bean
//	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
//		return runner -> {
//			Student newStudent =
//					new Student("Octavia E.", "Butler");
//			studentDAO.save(newStudent);
//			System.out.println("Estudiante agregado: "
//								+ newStudent.getId()
//			);
//		};
//	}

}
