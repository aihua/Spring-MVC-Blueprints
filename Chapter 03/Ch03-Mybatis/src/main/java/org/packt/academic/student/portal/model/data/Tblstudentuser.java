package org.packt.academic.student.portal.model.data;

// Generated 03 8, 16 11:29:40 PM by Hibernate Tools 3.4.0.CR1

/**
 * Tblstudentuser generated by hbm2java
 */
public class Tblstudentuser implements java.io.Serializable {

	private String username;
	private String password;
	private int studentId;

	public Tblstudentuser() {
	}

	
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}
