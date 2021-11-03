package com.da.sb.mvc.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.da.sb.mvc.model.Patients;
import com.da.sb.mvc.repository.PatientRepository;

@Controller
public class PatientsController {

	@Autowired
	private PatientRepository pr;
	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private SimpleMailMessage preConfiguredMessage;
	
	@RequestMapping(value = "/displayPatientRegistration")
	public String displayPatientRegistration() {
		System.out.println("Patient Registration");
		return "patientRegister";
	}
	
	@RequestMapping(value="/patientRegistration",method=RequestMethod.POST)
	public String patientDetails(@RequestParam("report") MultipartFile multipartFile,
			@RequestParam("id") Integer id,
			@RequestParam("name") String name,
			@RequestParam("age") int age,
			@RequestParam("dob") String dob,
			@RequestParam("bloodGroup") String bloodGroup,
			@RequestParam("adress") String adress,
			@RequestParam("mobileNumber") String mobileNumber,
			@RequestParam("eMail") String eMail,
			@RequestParam("dateOfAppointment") String dateOfAppointment,
			ModelMap modelMap) {
		Patients p=new Patients();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		p.setDob(dob);
		p.setBloodGroup(bloodGroup);
		p.setAdress(adress);
		p.setMobileNumber(mobileNumber);
		p.setEMail(eMail);
	    p.setDateOfAppointment(dateOfAppointment);
		p.setFileName(multipartFile.getOriginalFilename());
		try {
			p.setReport(multipartFile.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		pr.save(p);
		modelMap.addAttribute("patients", p);
		return "patientRegister";
	}
	
	 public void sendMail(String to, String subject, String body)
	    {
	        SimpleMailMessage message = new SimpleMailMessage();
	        message.setTo(to);
	        message.setSubject(subject);
	        message.setText(body);
	        mailSender.send(message);
	    }
	 public void sendPreConfiguredMail(String message)
	    {
	        SimpleMailMessage mailMessage = new SimpleMailMessage(preConfiguredMessage);
	        mailMessage.setText(message);
	        mailSender.send(mailMessage);
	    }
	
	}


