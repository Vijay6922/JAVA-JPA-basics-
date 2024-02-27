package inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "inheritance.residentalDoctors")
@DiscriminatorValue("R")
public class residentalDoctors extends Doctors {

	@Column(length = 30)
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "residentalDoctors [name=" + name + ", salary=" + salary + "]";
	}

}
