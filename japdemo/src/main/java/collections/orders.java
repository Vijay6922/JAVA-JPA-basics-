package collections;

import java.util.HashSet;
import java.util.Set;

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

@Entity(name = "collections.orders")
@Table(name = "orders")
public class orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 10)
	private String name;

	@Column(length = 10)
	private String date;

	@ElementCollection
	@CollectionTable(name = "orders_ProductIds", joinColumns = @JoinColumn(name = "orders_id"))
	@Column(name = "ProductIds")
    @OneToMany
	private Set<products> ProductIds = new HashSet<>();

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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Set<products> getProductIds() {
		return ProductIds;
	}

	public void setProductIds(Set<products> productIds) {
		this.ProductIds = productIds;
	}

}
