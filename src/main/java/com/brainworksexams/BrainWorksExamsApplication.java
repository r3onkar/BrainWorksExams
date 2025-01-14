package com.brainworksexams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.brainworksexams.config.JPAConfig;
import com.brainworksexams.config.MvcConfig;
import com.brainworksexams.config.OpenApiConfig;
import com.brainworksexams.config.SpringConfig;
import com.brainworksexams.config.WebSecurityConfig;
import com.brainworksexams.repository.CustomerRepository;
import com.brainworksexams.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@Import(value = {MvcConfig.class, JPAConfig.class, SpringConfig.class, WebSecurityConfig.class, OpenApiConfig.class})
public class BrainWorksExamsApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private UserRepository userRepository; 

	public static void main(String[] args) {
		SpringApplication.run(BrainWorksExamsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//
//		Customer customer = new Customer();
//		customer.setName("Microsoft");
//		customerRepository.save(customer);
//		
//		customerRepository.findAll(Sort.by("name"));
//		
//		log.debug(" ************************************************************");
//		
//		Optional<User> optionalUser = userRepository.findById(1L);
//		optionalUser.ifPresent( user -> {
//			
//			log.debug(" user exams -");
//			
//			user.getUserExams().stream().forEach( uExm -> {
//				
//				log.debug("Exam registered name - {}", uExm.getExam().getName());
//				
//				uExm.getUserExamAttempts().forEach(uExmAt -> {
//					
//						uExmAt.getUserExamAttemptSummary().forEach( uSum -> {
//							
//							Question que = uSum.getQuestion();
//							Answer selection = uSum.getSelection();
//							
//							log.debug("Que - {}", que.getText());
//							
//							que.getOptions().forEach(op -> {
//								
//								log.debug("Op - {} : {}", op.isCorrectAnswer(), op.getAnswer().getText());
//							});
//							
//							log.debug("User selected =");
//							
//							log.debug("Ans - {}", selection.getText());
//							
//						});
//					
//				});
//				
//			});
//			
//		} );
//		
//		log.debug(" ************************************************************");
//		
	}

}
