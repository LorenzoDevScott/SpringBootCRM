package com.lorenzo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	private String deviceType;
	private String deviceBrand;
	private String repairType;
	private String customerDescription;
	private int customerId;
	
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceBrand() {
		return deviceBrand;
	}
	public void setDeviceBrand(String deviceBrand) {
		this.deviceBrand = deviceBrand;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getRepairType() {
		return repairType;
	}
	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerDescription() {
		return customerDescription;
	}
	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}
	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", deviceType=" + deviceType + ", deviceBrand=" + deviceBrand + ", repairType="
				+ repairType + ", customerDescription=" + customerDescription + ", customerId=" + customerId + "]";
	}
	
	
	
	
	
	
}
