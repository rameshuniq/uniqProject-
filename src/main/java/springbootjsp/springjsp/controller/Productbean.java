package springbootjsp.springjsp.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jspproducts")
public class Productbean {
	@Id
	private String productname;
	private String productsize;
	private String productprice;
	
	public Productbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Productbean(String productname, String productsize, String productprice) {
		super();
		this.productname = productname;
		this.productsize = productsize;
		this.productprice = productprice;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductsize() {
		return productsize;
	}
	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Productbean [productname=" + productname + ", productsize=" + productsize + ", productprice="
				+ productprice + "]";
	}


	
}
