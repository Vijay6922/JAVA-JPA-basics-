package inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "inheritance.consultants")
@DiscriminatorValue("C")
public class consultants extends Doctors {

	protected int noOfVisits;

	protected int charge;

	public int getNoOfVisits() {
		return noOfVisits;
	}

	public void setNoOfVisits(int noOfVisits) {
		this.noOfVisits = noOfVisits;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "consultants [name=" + name + ", noOfVisits=" + noOfVisits + ", charge=" + charge + "]";
	}

}
