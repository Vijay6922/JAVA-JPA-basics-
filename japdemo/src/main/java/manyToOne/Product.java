package manyToOne;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "manytoone.Product")
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prodid")
	private int id;

	@Column(name = "prodname")
	private String name;

	@Column(name = "price")
	private double price;

	@Column(name = "qoh")
	private int qoh;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "Product")
	@ElementCollection
	@CollectionTable(name="Product_Sales",joinColumns= @JoinColumn (name="Product_id"))
	@Column(name="sales")
	private List<Sales> sales = new ArrayList<Sales>();

	public List<Sales> getSales() {
		return sales;
	}

	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}

	@Column(name = "catcode")
	private String catCode;

	public String getCatCode() {
		return catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", qoh=" + qoh + ", catCode=" + catCode
				+ "]";
	}

}