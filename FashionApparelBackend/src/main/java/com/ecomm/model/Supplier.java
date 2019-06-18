package com.ecomm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int supplierID;
	String supplierName;
	String supplierAddr;
	public int getSupplierID() 
	{
		return supplierID;
	}
	public void setSupplierID(int supplierID) 
	{
		this.supplierID = supplierID;
	}
	public String getSupplierName()
	{
		return supplierName;
	}
	public void setSupplierName(String supplierName) 
	{
		this.supplierName = supplierName;
	}
	public String getSupplierAddr()
	{
		return supplierAddr;
	}
	public void setSupplierAddr(String supplierAddr) 
	{
		this.supplierAddr = supplierAddr;
	}
}
