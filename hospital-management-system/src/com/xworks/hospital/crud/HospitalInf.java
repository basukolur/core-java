package com.xworks.hospital.crud;

import com.xworks.hospital.constant.Gender;
import com.xworks.hospital.dto.PatientDTO;

public interface HospitalInf {
	public boolean createPatient(PatientDTO dto);

	public void getPatientDetails();

	public boolean updatePatientAddressById(int id, String address);

	public boolean updatePatientContactNoByName(String name, long contactNo);

	public boolean deletePatientDetailsByName(String name);

	public boolean deletePatientByContactNo(long contactNo);

	public String getPatientNameById(int id);

	public long getPatientContactNoByName(String name);

	public boolean deletePatientDetailsByGender(Gender gender);

	boolean deletePatientDetailsByGender1(Gender gender);
}
