package prs.business;

public class Vendor {
	 ID INT PRIMARY KEY AUTO_INCREMENT,
	    Code VARCHAR(10) NOT NULL UNIQUE,
	    Name VARCHAR(255) NOT NULL,
	    Address VARCHAR(255) NOT NULL,
	    City VARCHAR(255) NOT NULL,
	    State VARCHAR(2) NOT NULL,
	    Zip VARCHAR(5) NOT NULL,
	    PhoneNumber VARCHAR(12) NOT NULL,
	    Email VARCHAR(100) NOT NULL,
	    IsPreApproved TINYINT(1) NOT NULL,
	    IsActive TINYINT(1),

}
