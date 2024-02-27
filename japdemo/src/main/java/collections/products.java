package collections;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "products")
@Entity(name = "jpademo.Products")

public class products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProdId")
	private int id;

	@Column(name = "ProdName")
	private String productname;

	@Column(name = "Price")
	private double price;

	@Column(name = "Qoh")
	private String quantity;

	@Column(name = "Remarks")
	private String remarks;

	@Column(name = "CatCode")
	private String categorycode;
	
	@ManyToOne
	private orders orders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCategorycode() {
		return categorycode;
	}

	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}

	@Override
	public String toString() {
		return "Products [prodId=" + id + ",prodName=" + productname + ",price=" + price + ",Qoh=" + quantity
				+ ",Remarks=" + remarks + ",Catcode=" + categorycode + "]";
	}

}