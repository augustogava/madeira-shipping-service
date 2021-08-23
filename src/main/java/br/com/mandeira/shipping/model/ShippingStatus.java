package br.com.mandeira.shipping.model;

import java.io.Serializable;

public class ShippingStatus implements Serializable {

	private static final long serialVersionUID = -2997563715018404664L;

	private double value;

	private Integer deliveryTime;

	private Boolean manufactured;
	
	public ShippingStatus() {
		super();
	}
			
	public ShippingStatus(double value, Integer deliveryTime, Boolean manufactured) {
		super();
		this.value = value;
		this.deliveryTime = deliveryTime;
		this.manufactured = manufactured;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Integer getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Integer deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Boolean getManufactured() {
		return manufactured;
	}

	public void setManufactured(Boolean manufactured) {
		this.manufactured = manufactured;
	}
	
}