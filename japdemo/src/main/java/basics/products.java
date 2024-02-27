package basics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "products")
@Entity(name = "basics.products")
public class products {

	@Id
	@Column(name = "ProdId")
	private int prodid;

	@Column(name = "ProdName")
	private String name;

	@Column(name = "Price")
	private int Price;

	@Column(name = "Qoh")
	private int qty;

	@Column(name = "Remarks")
	private String Remarks;

	@Column(name = "CatCode")
	private String CatCode;

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getRemarks() {
		return Remarks;
	}

	public void setRemarks(String remarks) {
		Remarks = remarks;
	}

	public String getCatCode() {
		return CatCode;
	}

	public void setCatCode(String catCode) {
		CatCode = catCode;
	}

	@Override
	public String toString() {
		return "products [prodid=" + prodid + ", name=" + name + ", Price=" + Price + ", qty=" + qty + ", Remarks="
				+ Remarks + ", CatCode=" + CatCode + "]";
	}

}
