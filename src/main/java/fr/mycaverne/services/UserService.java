/**
 * 
 */
package fr.mycaverne.services;

import java.math.BigInteger;
import java.util.List;

import fr.mycaverne.domain.Product;
import fr.mycaverne.domain.User;

/**
 * @author C17Engineering
 *
 */
public interface UserService {
	public List<Product> getAll();
	public List<User> getProduct(String profile);
	public Product getUserInfos(BigInteger id);
	public Product getUserProducts(BigInteger id);
	public Product getUserOrders(BigInteger id);
}
