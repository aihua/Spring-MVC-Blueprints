package org.packt.academic.student.portal.model.data;
// Generated 03 14, 16 11:36:05 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Level generated by hbm2java
 */
@Entity
@Table(name = "level", catalog = "smp")
public class Level implements java.io.Serializable {

	private int level;
	private String label;
	private Set<Tblstudents> tblstudentses = new HashSet<Tblstudents>(0);

	public Level() {
	}

	public Level(int level, String label) {
		this.level = level;
		this.label = label;
	}

	public Level(int level, String label, Set<Tblstudents> tblstudentses) {
		this.level = level;
		this.label = label;
		this.tblstudentses = tblstudentses;
	}

	@Id
	@Column(name = "level", unique = true, nullable = false)
	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Column(name = "label", nullable = false, length = 50)
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "level")
	public Set<Tblstudents> getTblstudentses() {
		return this.tblstudentses;
	}

	public void setTblstudentses(Set<Tblstudents> tblstudentses) {
		this.tblstudentses = tblstudentses;
	}

}
