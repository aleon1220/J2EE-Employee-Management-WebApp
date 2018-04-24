/*Hands On exam for the JSF Module.
 * Andres Leon emp number: 404376
 * date: 27/jul/2011
 *  */

package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ABC_Employee")
public class EmployeeEntity {
	@Id
	@SequenceGenerator(name="regId",sequenceName="employee_seq ",allocationSize=1,initialValue=1002)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="regId")
	private Integer regId;
	private String name;
	private Float experience;
	private String technology;
	private String description;
	
	public Integer getRegId() {
		return regId;
	}
	public void setRegId(Integer regId) {
		this.regId = regId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
