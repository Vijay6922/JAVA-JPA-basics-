package composition;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class parking {

	@Column(length = 20)
	private int parkingCode;

	@Column(length = 10)
	private int Length;

	@Column(length = 5)
	private int width;

	public int getParkingCode() {
		return parkingCode;
	}

	public void setParkingCode(int parkingCode) {
		this.parkingCode = parkingCode;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}