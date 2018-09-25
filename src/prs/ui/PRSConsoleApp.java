package prs.ui;

import java.util.ArrayList;
import java.util.List;

import DB.util.Console;
import prs.business.Product;
import prs.business.ProductDB;

public class PRSConsoleApp {
	ProductDB pdb = new ProductDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App - JDBC");
		ProductDB pdb = new ProductDB();
		String command = "";
		while (!command.equals("9")) {
			displayMenu();
			command = Console.getString("Enter command: ");
			if (command.equals("1")) {
				List<Product> products = pdb.getAll();

				for (Product product : products) {
					printReportDetail(product);
				}

			} else if (command.equals("2")) {
				displayProductID(pdb);

			}
		}
	}

	public static void displayProductID(ProductDB pdb) {
		List<Product> products;
		int id = Console.getInt("Search products by ID: ");
		products = new ArrayList<>();

		products = pdb.get(id);

		for (Product product : products) {
			printReportDetail(product);
		}
	}

	// System.out.println("bye");
	private static void printReportDetail(Product product) {
		System.out.println(product);

	}

	private static void displayMenu() {
		StringBuilder sb = new StringBuilder("Command Menu:\n");
		sb.append("1 - List all Products\n");
		sb.append("2 - Get a product\n");
		sb.append("3 - Add a product\n");
		sb.append("4 - Update a product\n");
		sb.append("5 - Remove a product\n");
		sb.append("9 - Exit\n");
		System.out.println(sb.toString());
	}
}