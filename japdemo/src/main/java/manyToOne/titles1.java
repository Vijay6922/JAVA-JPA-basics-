package manyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "manyToOne.Title1")
@Table(name = "titles")

public class titles1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "title_id")
	private String id;

	@Column(name = "title")
	private String title;

	@Column(name = "type")
	private String type;

	@Column(name = "pub_id")
	private int pubId;

	@Column(name = "price")
	private double price;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "titles1")
	private List<titleAuthor> titleauthor = new ArrayList<titleAuthor>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<titleAuthor> getTitleauthor() {
		return titleauthor;
	}

	public void setTitleauthor(List<titleAuthor> titleauthor) {
		this.titleauthor = titleauthor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) { // Corrected the parameter type to double
		this.price = price;
	}

	@Override
	public String toString() {
		return "Title [title_id=" + id + ",title=" + title + ", type=" + type + ", pubId=" + pubId + ", price=" + price
				+ "]";
	}

}