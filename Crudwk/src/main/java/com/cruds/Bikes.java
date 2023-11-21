package com.cruds;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Component
@Scope("prototype")
@Entity
public class Bikes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int bId;
	@Column(name="Name")
	private String bName;
	private String Model;
	private int Milage;
	public Bikes() {
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getMilage() {
		return Milage;
	}
	public void setMilage(int milage) {
		Milage = milage;
	}
	@Override
	public String toString() {
		return "Bikes [bId=" + bId + ", bName=" + bName + ", Model=" + Model + ", Milage=" + Milage + "]";
	}
	

}
