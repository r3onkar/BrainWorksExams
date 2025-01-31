package com.brainworksexams.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Exam {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	
	private short durationInMinutes;
	
	private boolean active;

	@ManyToOne
	private Customer customer;

	@OneToMany(mappedBy = "exam")
	private List<UserExamRegistration> userExams;

	@ManyToMany
	@JoinTable(name = "exam_questions", 	
		joinColumns = @JoinColumn(name = "exam_id"), 
		inverseJoinColumns = @JoinColumn(name = "question_id"))
	private List<Question> questions;
	
	@Column(nullable = false, unique = true)
	private String globalExamCode;

	@CreationTimestamp
	private LocalDateTime createdDatetime;
	
	@UpdateTimestamp
	private LocalDateTime updatedDateTime;

}
