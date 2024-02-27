package manyToOne;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "manytoone.Sales")
@Table(name = "Sales")

public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Invno")
	private int no;

	@Column(name = "Transdate")
	private String date;

	@Column(name = "Qty")
	private int qunatity;

	@Column(name = "Amount")
	private double amount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prodId")
	private Product Product;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getQunatity() {
		return qunatity;
	}

	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return Product;
	}

	public void setProduct(Product product) {
		this.Product = product;
	}

	@Override
	public String toString() {
		return "Sales [no=" + no + ", date=" + date + ", qunatity=" + qunatity + ", amount=" + amount + ", product="
				+ Product + "]";
	}

}