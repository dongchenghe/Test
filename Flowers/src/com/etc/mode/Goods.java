package com.etc.mode;

public class Goods implements Cloneable {
	private String name;
	private String type;
	private String details;
	private String material;	//材料
	private String packing;		//包装
	private String meaning;		//花语
	private float price;
	private float goods_old_price;
	private int store_amount;
	private int sales;
	private String state;
	private String img1_src;
	private String img2_src;
	private String img3_src;
	private String img4_src;
	private int goods_id;
	public Goods() {
		
	}
	
	@Override
	public Goods clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Goods)super.clone();
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPacking() {
		return packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	
	public float getGoods_old_price() {
		return goods_old_price;
	}

	public void setGoods_old_price(float goods_old_price) {
		this.goods_old_price = goods_old_price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStore_amount() {
		return store_amount;
	}
	public void setStore_amount(int store_amount) {
		this.store_amount = store_amount;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getImg1_src() {
		return img1_src;
	}
	public void setImg1_src(String img1_src) {
		this.img1_src = img1_src;
	}
	public String getImg2_src() {
		return img2_src;
	}
	public void setImg2_src(String img2_src) {
		this.img2_src = img2_src;
	}
	public String getImg3_src() {
		return img3_src;
	}
	public void setImg3_src(String img3_src) {
		this.img3_src = img3_src;
	}
	public String getImg4_src() {
		return img4_src;
	}
	public void setImg4_src(String img4_src) {
		this.img4_src = img4_src;
	}
}
