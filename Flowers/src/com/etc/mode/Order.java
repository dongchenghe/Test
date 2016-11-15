package com.etc.mode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private int order_id;
	private int user_id;
	private String order_date;
	private String pay_date;
	private String order_state;
	private String deliver_date;
	private String receive_name;
	private String receive_addr;
	private String receive_phone;
	private String order_message;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		if(order_date!=null){
			SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd");
			this.order_date = smp.format(order_date);
		}
	}
	public String getPay_date() {
		return pay_date;
	}
	public void setPay_date(Date pay_date) {
		if(pay_date!=null){
			SimpleDateFormat smp = new SimpleDateFormat("yyyy-mm-dd");
		this.pay_date = smp.format(pay_date);
		}
	}
	public String getOrder_state() {
		return order_state;
	}
	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}
	public String getDeliver_date() {
		return deliver_date;
	}
	public void setDeliver_date(Date deliver_date) {
		if(deliver_date!=null){
			SimpleDateFormat smp = new SimpleDateFormat("yyyy-mm-dd");
			this.deliver_date = smp.format(deliver_date);
		}
	}
	public String getReceive_name() {
		return receive_name;
	}
	public void setReceive_name(String receive_name) {
		this.receive_name = receive_name;
	}
	public String getReceive_addr() {
		return receive_addr;
	}
	public void setReceive_addr(String receive_addr) {
		this.receive_addr = receive_addr;
	}
	public String getReceive_phone() {
		return receive_phone;
	}
	public void setReceive_phone(String receive_phone) {
		this.receive_phone = receive_phone;
	}
	public String getOrder_message() {
		return order_message;
	}
	public void setOrder_message(String order_message) {
		this.order_message = order_message;
	}
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", user_id=" + user_id
				+ ", order_date=" + order_date + ", pay_date=" + pay_date
				+ ", order_state=" + order_state + ", deliver_date="
				+ deliver_date + ", receive_name=" + receive_name
				+ ", receive_addr=" + receive_addr + ", receive_phone="
				+ receive_phone + ", order_message=" + order_message + "]";
	}
	
}
