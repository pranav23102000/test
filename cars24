public class CarInfo {
	private String carId;
	private String carName;
	private String carType;
	private String city;

	public CarInfo(String carId, String carName, String carType, String city) {
		this.carId = carId;
		this.carName = carName;
		this.carType = carType;
		this.city = city;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String checkAvailability() {
		String carNameLower = carName.toLowerCase();
		String carTypeLower = carType.toLowerCase();
		String cityLower = city.toLowerCase();

		if (!(carNameLower.equals("nissan") || carNameLower.equals("ford"))) {
			return "Not Available";
		}

		if (!(carTypeLower.equals("sedan") || carTypeLower.equals("suv") || carTypeLower.equals("muv"))) {
			return "Not Available";
		}

		if (!(cityLower.equals("newyork") || cityLower.equals("denver") || cityLower.equals("losangels"))) {
			return "Not Available";
		}


		if (carNameLower.equals("nissan")) {
			if (carTypeLower.equals("sedan")) {
				return "Kicks and $8400.0";
			} else if (carTypeLower.equals("suv")) {
				return "Magnite and $10800.0";
			} else {
				return "Terrano and $14400.0";
			}
		} else if (carNameLower.equals("ford")) {
			if (carTypeLower.equals("sedan")) {
				return "Figo and $4802.0";
			} else if (carTypeLower.equals("suv")) {
				return "Eco Sport and $9605.0";
			} else {
				return "Endeavour and $21600.0";
			}
		}

		return "Not Available";
	}
}
