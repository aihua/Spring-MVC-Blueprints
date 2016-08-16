package org.packt.academic.student.portal.model.data;
// Generated 03 14, 16 11:36:05 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Tblgpa generated by hbm2java
 */
@Entity
@Table(name = "tblgpa", catalog = "smp")
public class Tblgpa implements java.io.Serializable {

	private int studentId;
	private Tblstudents tblstudents;
	private double gpaCalculated;

	public Tblgpa() {
	}

	public Tblgpa(Tblstudents tblstudents, double gpaCalculated) {
		this.tblstudents = tblstudents;
		this.gpaCalculated = gpaCalculated;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "tblstudents"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "studentID", unique = true, nullable = false)
	public int getStudentId() {
		return this.studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Tblstudents getTblstudents() {
		return this.tblstudents;
	}

	public void setTblstudents(Tblstudents tblstudents) {
		this.tblstudents = tblstudents;
	}

	@Column(name = "gpaCalculated", nullable = false, precision = 22, scale = 0)
	public double getGpaCalculated() {
		return this.gpaCalculated;
	}

	public void setGpaCalculated(double gpaCalculated) {
		this.gpaCalculated = gpaCalculated;
	}

}
