package practise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "inheritance.joined.ResidentDoctor")
@Table(name = "inh_residentDoctor")
public class ResidentDoctor extends Doctor {

	@Column
	private double monthlySalary;

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return "ResidentDoctor [monthlySalary=" + monthlySalary + "]";
	}

}