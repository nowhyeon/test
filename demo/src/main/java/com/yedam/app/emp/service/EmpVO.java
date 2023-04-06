package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	@DateTimeFormat(pattern="yyyy-MM-dd") //input에서 사용하는 포멧이 - 라서
	Date hireDate;
	String jobId;
	int departmentId;
}
