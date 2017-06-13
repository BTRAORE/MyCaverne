package fr.mycaverne.services;

import java.math.BigInteger;
import java.util.List;

import fr.mycaverne.domain.Order;
import fr.mycaverne.domain.Product;

public interface OrderService {
	
	public boolean createOrder(Order order);
	public boolean deleteOrder(BigInteger orderId);
	public Order findOrder(BigInteger orderId);
	public List<Order> findOrders(BigInteger userId);
	public BigInteger orderValue(BigInteger orderId);
	public boolean addProduct(BigInteger orderId, BigInteger userId, Product product);
	public boolean removeProduct(BigInteger orderId, BigInteger userId, BigInteger prodId);
}
