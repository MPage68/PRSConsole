package prs.business;

public class Product {
	private int ID;
	private int vendorID;
	private String partNumber;
	private String Name;
	private double Price;
	private String unit;
	private String photoPath;
	private boolean isActive;
	
	public Product(int iD, int vendorID, String partNumber, String name, double price, String unit, String photoPath,
			boolean isActive) {
		super();
		ID = iD;
		this.vendorID = vendorID;
		this.partNumber = partNumber;
		Name = name;
		Price = price;
		this.unit = unit;
		this.photoPath = photoPath;
		this.isActive = isActive;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
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
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
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
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", vendorID=" + vendorID + ", partNumber=" + partNumber + ", Name=" + Name
				+ ", Price=" + Price + ", unit=" + unit + ", photoPath=" + photoPath + ", isActive=" + isActive + "]";
	}

}
