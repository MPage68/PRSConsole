package prs.business;

public class PurchaseRequestLiineItem {
	private int ID;
	private int purchaseRequestID;
	private int productID;
	private int quantity;
	private boolean isActive;

	public PurchaseRequestLiineItem(int iD, int purchaseRequestID, int productID, int quantity, boolean isActive) {
		super();
		ID = iD;
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
		this.isActive = isActive;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPurchaseRequestID() {
		return purchaseRequestID;
	}

	public void setPurchaseRequestID(int purchaseRequestID) {
		this.purchaseRequestID = purchaseRequestID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "PurchaseRequestLiineItem [ID=" + ID + ", purchaseRequestID=" + purchaseRequestID + ", productID="
				+ productID + ", quantity=" + quantity + "]";
	}

}
