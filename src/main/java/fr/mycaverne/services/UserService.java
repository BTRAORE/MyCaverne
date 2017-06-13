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
	
	public List<Product> findUser(BigInteger id);
	public List<User> findUsers(String profile);
	public boolean deleteUser(BigInteger id);
	public boolean addUser(User user);
}
