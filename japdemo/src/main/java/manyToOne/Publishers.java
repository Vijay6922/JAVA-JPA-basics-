package manyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="manyToOne")
@Table(name="Publishers")
public class Publishers {

	@Id
	@Column(name="pub_id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "Publishers" )
	private List<Title> title  = new ArrayList<Title>();

	@Override
	public String toString() {
		return "Publishers [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Title> getTitle() {
		return title;
	}

	public void setTitle(List<Title> title) {
		this.title = title;
	}
	
	
	
	
	
	
}
