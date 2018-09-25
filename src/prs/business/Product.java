package prs.business;

public class Product {
	private int id;
	private int vendorID;
	private String partNumber;
	private String name;
	private double price;
	private String unit;
	private String photoPath;

	
	public Product() {}
	
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public int getVendorID() {
		return vendorID;
	}
	public void setVendorID(int vendorID) {
		this.vendorID = vendorID;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	@Override
	public String toString() {
		return "Product [ID=" + id + ", vendorID=" + vendorID + ", partNumber=" + partNumber + ", Name=" + name
				+ ", Price=" + price + ", unit=" + unit + ", photoPath=" + photoPath + ", isActive=" + "]";
	}

}
