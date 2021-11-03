package com.da.sb.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.da.sb.mvc.controller.PatientsController;

@SpringBootApplication
public class DoctorsAppointmentFormApplication implements CommandLineRunner{
	
	@Autowired
	private PatientsController pc;

	public static void main(String[] args) {
		SpringApplication.run(DoctorsAppointmentFormApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
pc.sendMail("some-email-address@gmail.com", "your appointment booked", "Email sent with demo application");
pc.sendPreConfiguredMail("your appointment booked");
	}

}
