package fr.mycaverne.services.impl;

import java.math.BigInteger;
import java.util.List;

import fr.mycaverne.domain.Order;
import fr.mycaverne.domain.Product;
import fr.mycaverne.services.OrderService;

public class OrderServiceImpl implements OrderService {

	@Override
	public boolean createOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrder(BigInteger orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order findOrder(BigInteger orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findOrders(BigInteger userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigInteger orderValue(BigInteger orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProduct(BigInteger orderId, BigInteger userId, Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProduct(BigInteger orderId, BigInteger userId, BigInteger prodId) {
		// TODO Auto-generated method stub
		return false;
	}

}
