package com.da.sb.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.da.sb.mvc.model.Patients;

@Repository
public interface PatientRepository extends JpaRepository<Patients, Integer> {

}
