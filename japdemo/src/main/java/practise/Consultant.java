package practise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "inheritance.joined.Consultant")
@Table(name = "inh_consultant")

public class Consultant extends Doctor {

	@Column
	private int visits;

	@Column
	private double chargePerVisit;

	public int getVisits() {
		return visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public double getChargePerVisit() {
		return chargePerVisit;
	}

	public double getTotalCharge() {
		return visits * chargePerVisit;
	}

	public void setChargePerVisit(double chargePerVisit) {
		this.chargePerVisit = chargePerVisit;
	}

	@Override
	public String toString() {
		return "Consultant [visits=" + visits + ", chargePerVisit=" + chargePerVisit + "]";
	}

}