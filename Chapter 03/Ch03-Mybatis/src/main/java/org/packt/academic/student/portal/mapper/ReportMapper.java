package org.packt.academic.student.portal.mapper;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudents;

public interface ReportMapper {
	
	public List<Tblcourses> getCourses();
	public List<Tblfaculty> getFaculty();
	public List<Tbldepartment> getDepartment();
	public Tblstudents getStudentId(String username);
	public Tblfaculty getFacultyId(String username);

}
