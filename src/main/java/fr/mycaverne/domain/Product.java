/**
 * 
 */
package fr.mycaverne.domain;

import java.math.BigInteger;
import java.util.List;

/**
 * @author TRAORE
 *
 */
public class Product {
	
	private BigInteger id;
	
	private String type;
	
	private String name;
	
	private BigInteger normalPrice;
	
	private BigInteger discountPrice;
	
	private boolean isDiscount;
	
	public BigInteger getNormalPrice() {
		return normalPrice;
	}

	public void setNormalPrice(BigInteger normalPrice) {
		this.normalPrice = normalPrice;
	}

	public BigInteger getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(BigInteger discountPrice) {
		this.discountPrice = discountPrice;
	}

	public boolean isDiscount() {
		return isDiscount;
	}

	public void setDiscount(boolean isDiscount) {
		this.isDiscount = isDiscount;
	}

	private List<String> images;
	
	private String description;
	
	private BigInteger quantity;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public BigInteger getQuantity() {
		return quantity;
	}

	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
