package basics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "basics.categories")
@Table(name = "categories")
public class categories {
	@Id
	@Column(name = "CatCode")
	private String CatCode;

	@Column(name = "CatDesc")
	private String CatDesc;

	public String getCatCode() {
		return CatCode;
	}

	public void setCatCode(String catCode) {
		CatCode = catCode;
	}

	public String getCatDesc() {
		return CatDesc;
	}

	public void setCatDesc(String catDesc) {
		CatDesc = catDesc;
	}
}
