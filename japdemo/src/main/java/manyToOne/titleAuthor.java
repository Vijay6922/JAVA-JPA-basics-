package manyToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "manyToOne.TitleAuthor")
@Table(name = "titleauthor")

public class titleAuthor {
	@Id
	@Column(name = "au_id")
	private String au_id;

	@Column(name = "au_ord")
	private int order;

	@Column(name = "royaltyper")
	private int royaltyper;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "title_id", insertable = false, updatable = false)
	private titleAuthor title_author;

	public String getAu_id() {
		return au_id;
	}

	public void setAu_id(String au_id) {
		this.au_id = au_id;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getRoyaltyper() {
		return royaltyper;
	}

	public void setRoyaltyper(int royaltyper) {
		this.royaltyper = royaltyper;
	}

	public titleAuthor getTitle_author() {
		return title_author;
	}

	public void setTitle_author(titleAuthor title_author) {
		this.title_author = title_author;
	}

	@Override
	public String toString() {
		return "TitleAuthor [au_id=" + au_id + ", order=" + order + ", royaltyper=" + royaltyper + ", title_author="
				+ title_author + "]";
	}

}