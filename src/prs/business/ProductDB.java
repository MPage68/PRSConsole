package prs.business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DB.util.DBUtil;

public class ProductDB {

	public List<Product> getAll() {
		String sql = "SELECT * FROM Product";
		List<Product> products = new ArrayList<>();
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int ID = rs.getInt(1);
				int vendorID = rs.getInt(2);
				String partNumber = rs.getString(3);
				String name = rs.getString(4);
				double price = rs.getDouble(5);
				String unit = rs.getString(6);
				String photoPath = rs.getString(7);

				Product p = new Product();
				p.setID(ID);
				p.setVendorID(vendorID);
				p.setPartNumber(partNumber);
				p.setName(name);
				p.setPrice(price);
				p.setUnit(unit);
				p.setPhotoPath(photoPath);

				products.add(p);
			}
			return products;
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
	}

	public List<Product> get(int ID) {
		String sql = "SELECT * FROM Product Where Id = ?";
		List<Product> products = new ArrayList<>();

		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, ID);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int i = rs.getInt(1);
				int vendorID = rs.getInt(2);
				String partNumber = rs.getString(3);
				String name = rs.getString(4);
				double price = rs.getDouble(5);
				String unit = rs.getString(6);
				String photoPath = rs.getString(7);

				Product p = new Product();
				p.setID(ID);
				p.setVendorID(vendorID);
				p.setPartNumber(partNumber);
				p.setName(name);
				p.setPrice(price);
				p.setUnit(unit);
				p.setPhotoPath(photoPath);

				products.add(p);
			}
			return products;
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
	}

}
