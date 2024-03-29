package composition;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nimbusds.openid.connect.sdk.claims.Address;

@Entity(name = "composition.customers")
@Table(name = "customers")
public class customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(length = 30)
	private String name;

	// composition
	@Embedded
	private Address home;

	@Embedded
	private officeAddress office;

	@Embedded
	private ContactInfo contact;

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

	public Address getHome() {
		return home;
	}

	public void setHome(Address home) {
		this.home = home;
	}

	public officeAddress getOffice() {
		return office;
	}

	public void setOffice(officeAddress office) {
		this.office = office;
	}

	public ContactInfo getContact() {
		return contact;
	}

	public void setContact(ContactInfo contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "customers [id=" + id + ", name=" + name + ", home=" + home + "]";
	}

}
