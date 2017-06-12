/**
 * 
 */
package fr.mycaverne.services;

import java.math.BigInteger;
import java.util.List;

import fr.mycaverne.domain.Product;

/**
 * @author C17Engineering
 *
 */
public interface ProductService {
	
	public List<Product> getAll();
	public List<Product> getProducts(String type);
	public Product getProductInfos(BigInteger id);
	

} 
