package composition;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class ContactInfo {

	@Column(length = 30)
	private String email;

	@Column(length = 20)
	private int phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
