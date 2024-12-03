package com.spring.project.jpa.yaml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class BootRunner implements CommandLineRunner {
@Autowired BookRepository bookRepository; 
	@Override
	public void run(String... args) throws Exception {
		Books book1= new Books();
		book1.setName("Anji");
		book1.setAuthor("Ravi");
		book1.setStatus(false);
		
		Books book2= new Books();
		book2.setName("Peri");
		book2.setAuthor("Venki");
		book2.setStatus(true);
		
		Books book3= new Books();
		book3.setName("Siva");
		book3.setAuthor("Lokesh");
		book3.setStatus(true);
		List<Books> bb= List.of(book1,book2,book3); 
		bookRepository.saveAll(bb);
		bookRepository.getAll().forEach(System.out::println);
		bookRepository.getBookByName("Anji").forEach(System.out::println);
	}

}
