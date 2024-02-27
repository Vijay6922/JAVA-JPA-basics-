package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="inheritance.consultingSurgeons")
@Table(name="consultingSurgeons")
@DiscriminatorValue("consultingSurgeons")
public class consultingSurgeons extends consultants{

	private String name;
	
	private int salary;
	
	
	private int noOfSurgerys;
	
	private int chargePerSurgery;
	
	public int getNoOfSurgerys() {
		return noOfSurgerys;
	}

	public void setNoOfSurgerys(int noOfSurgerys) {
		this.noOfSurgerys = noOfSurgerys;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		double s = (noOfVisits*charge)+(noOfSurgerys*chargePerSurgery)+salary;
		return s;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getVisits() {
		return noOfVisits;
	}

	public void setVisits(int visits) {
		this.noOfVisits = visits;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public int getChargePerSurgery() {
		return chargePerSurgery;
	}

	public void setChargePerSurgery(int chargePerSurgery) {
		this.chargePerSurgery = chargePerSurgery;
	}

	@Override
	public String toString() {
		return "consultingSurgeons [name=" + name + ", salary=" + salary + ", visits=" + noOfVisits + ", charge=" + charge
				+ ", noOfSurgerys=" + noOfSurgerys + ", chargePerSurgery=" + chargePerSurgery + "]";
	}
	
	
	
}
