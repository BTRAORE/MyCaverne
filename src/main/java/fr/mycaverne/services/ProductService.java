/**
 * 
 */
package fr.mycaverne.services;

import java.math.BigInteger;
import java.util.List;

import fr.mycaverne.domain.Product;

/**
 * @author TRAORE
 *
 */
public interface ProductService {
	
	public Product findProduct(BigInteger prodId);
	
	public List<Product> findProducts(String category);
	
	public List<Product> findProducts(BigInteger userId);
	

} 
