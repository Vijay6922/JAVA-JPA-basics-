package manyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "manyToOne.Title")
@Table(name = "titles")

public class Title {
	@Id

	@Column(name = "title")
	private String title;

	@Column(name = "type")
	private String type;

	@Column(name = "pub_id")
	private int pubId;

	@Column(name = "price")
	private double price;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pub_id", insertable = false, updatable = false)
	private Publishers publish;

	public Publishers getPublish() {
		return publish;
	}

	public void setPublish(Publishers publish) {
		this.publish = publish;
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
		return "Title [title=" + title + ", type=" + type + ", pubId=" + pubId + ", price=" + price + ", publish="
				+ publish + "]";
	}

}