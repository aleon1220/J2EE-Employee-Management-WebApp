/*Hands On exam for the JSF Module.
 * Andres Leon emp number: 404376
 * date: 27/jul/2011
 *  */


package bean;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import service.EmployeeService;

import entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBean {
	
	private int regId;
	private String name;
	private float exp;
	private String technology;
	private String description;
	private String message;
	private List<EmployeeEntity> empList;
	private List<SelectItem> availableTechList = new ArrayList<SelectItem>();
	
	public EmployeeBean() {
		try{
			EmployeeService employeeService = new EmployeeService();
			List<String> list = employeeService.getAvailableTechs();
			for (int i = 0; i < list.size();i++ ){
				this.availableTechList.add(new SelectItem(list.get(i)));
			}
		}
		catch (Exception e) {
			this.message = e.getMessage();
			}
	}
	
	public String addEmployee(){
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setName(this.getName());
		employeeEntity.setExperience(this.getExp());
		employeeEntity.setTechnology(this.getTechnology());
		employeeEntity.setDescription(this.getDescription());
		int id;
		try{
			EmployeeService emp = new EmployeeService();
			id = emp.addEmployee(employeeEntity);
			this.setMessage("Successfully Registered Employee with Id: " + id);
			return "success";
		}
		catch (Exception e){
			this.setMessage(e.getMessage());
			e.printStackTrace();
			return "failure";
		}	
	}
	
	public void getEmployeesByTechnology(ValueChangeEvent event) {
		technology = (String)event.getNewValue();
		EmployeeService empService = new EmployeeService();
		try {
			this.setEmpList(empService.getEmployeesByTechnology(technology));

		} catch (Exception e) {
			this.setMessage(e.getMessage());
		}
	}

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getExp() {
		return exp;
	}

	public void setExp(float exp) {
		this.exp = exp;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<EmployeeEntity> getEmpList() {
		return empList;
	}

	public void setEmpList(List<EmployeeEntity> empList) {
		this.empList = empList;
	}

	public List<SelectItem> getAvailableTechList() {
		return availableTechList;
	}

	public void setAvailableTechList(List<SelectItem> availableTechList) {
		this.availableTechList = availableTechList;
	}
}
 