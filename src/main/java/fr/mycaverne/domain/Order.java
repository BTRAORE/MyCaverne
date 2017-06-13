package fr.mycaverne.domain;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public class Order {
	
	private BigInteger id;
	
	private User owner;
	
	private String deliveryMode;
	
	private Date creationDate;
	
	private List<Product> products;
	
	private String status;
	
	private String specialNote;
}
