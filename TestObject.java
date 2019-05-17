
public class TestObject {

	
	private Double lat;

    private Double lon;
    private Integer hub_height;
    private Boolean exact_cords;

    @Override
	public String toString() {
		return "TestObject [latitude=" + lat + ", longitude=" + lon + ", hubHeight=" + hub_height
				+ ", exactCoords=" + exact_cords + "]";
	}

	public Double getLat() {
		return lat;
	}

	public TestObject() {
		
		this.lat = 35.609;
		this.lon = -101.466;
		this.hub_height = 100;
		this.exact_cords = true;
	}

	public void setLat(Double latitude) {
		this.lat = latitude;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double longitude) {
		this.lon = longitude;
	}

	public Integer getHub_height() {
		return hub_height;
	}

	public void setHub_height(Integer hubHeight) {
		this.hub_height = hubHeight;
	}

	public Boolean getExact_cords() {
		return exact_cords;
	}

	public void setExact_cords(Boolean exactCoords) {
		this.exact_cords = exactCoords;
	}

	
}
