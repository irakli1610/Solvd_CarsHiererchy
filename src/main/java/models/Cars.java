package models;

import javax.xml.bind.annotation.XmlElement;

public class Cars {

	private long carsListId;
	private String carModel;
	private long relaseYear;
	private long carsSystemsId;
	private long carPartsId;
	private long carShopsId;
	private long carOwnerId;

	public Cars(long carsListId, String carModel, long relaseYear, long carsSystemsId, long carPartsId, long carShopsId,
			long carOwnerId) {
		this.carsListId = carsListId;
		this.carModel = carModel;
		this.relaseYear = relaseYear;
		this.carsSystemsId = carsSystemsId;
		this.carPartsId = carPartsId;
		this.carShopsId = carShopsId;
		this.carOwnerId = carOwnerId;
	}

	public Cars() {
	}

	@XmlElement
	public long getCarsListId() {
		return carsListId;
	}

	public void setCarsListId(long carsListId) {
		this.carsListId = carsListId;
	}

	@XmlElement
	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@XmlElement
	public long getRelaseYear() {
		return relaseYear;
	}

	public void setRelaseYear(long relaseYear) {
		this.relaseYear = relaseYear;
	}

	@XmlElement
	public long getCarsSystemsId() {
		return carsSystemsId;
	}

	public void setCarsSystemsId(long carsSystemsId) {
		this.carsSystemsId = carsSystemsId;
	}

	@XmlElement
	public long getCarPartsId() {
		return carPartsId;
	}

	public void setCarPartsId(long carPartsId) {
		this.carPartsId = carPartsId;
	}

	@XmlElement
	public long getCarShopsId() {
		return carShopsId;
	}

	public void setCarShopsId(long carShopsId) {
		this.carShopsId = carShopsId;
	}

	@XmlElement
	public long getCarOwnerId() {
		return carOwnerId;
	}

	public void setCarOwnerId(long carOwnerId) {
		this.carOwnerId = carOwnerId;
	}

	@Override
	public String toString() {
		return "Cars [carsListId=" + carsListId + ", carModel=" + carModel + ", relaseYear=" + relaseYear
				+ ", carsSystemsId=" + carsSystemsId + ", carPartsId=" + carPartsId + ", carShopsId=" + carShopsId
				+ ", carOwnerId=" + carOwnerId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carModel == null) ? 0 : carModel.hashCode());
		result = prime * result + (int) (carOwnerId ^ (carOwnerId >>> 32));
		result = prime * result + (int) (carPartsId ^ (carPartsId >>> 32));
		result = prime * result + (int) (carShopsId ^ (carShopsId >>> 32));
		result = prime * result + (int) (carsListId ^ (carsListId >>> 32));
		result = prime * result + (int) (carsSystemsId ^ (carsSystemsId >>> 32));
		result = prime * result + (int) (relaseYear ^ (relaseYear >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		if (carModel == null) {
			if (other.carModel != null)
				return false;
		} else if (!carModel.equals(other.carModel))
			return false;
		if (carOwnerId != other.carOwnerId)
			return false;
		if (carPartsId != other.carPartsId)
			return false;
		if (carShopsId != other.carShopsId)
			return false;
		if (carsListId != other.carsListId)
			return false;
		if (carsSystemsId != other.carsSystemsId)
			return false;
		if (relaseYear != other.relaseYear)
			return false;
		return true;
	};

}
