package com.da.sb.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "patient_mvc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patients {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private int age;
	private String dob;
	private String bloodGroup;
	private String adress;
	private String mobileNumber;
	private String eMail;
	private String   dateOfAppointment;
	private String fileName;
	@Lob
	private byte[] report;

}
