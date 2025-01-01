package com.LSS.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table
public class accommodator {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Accommodator_Sequence")
	@SequenceGenerator(name = "Accommodator_Sequence", sequenceName = "Accommodator_Sequence", allocationSize = 1)
	
	private Long accommodatorID;
	private String accommodatorName;
	private String Gender;
	private String accommodatorFname;
	private String accommodatorMail;
	private String accommodatorProfession;
	private String accommodatorPhoneNumber;

}
