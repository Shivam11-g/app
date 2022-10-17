package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Item;

@Repository
public interface ItemDAO extends JpaRepository<Item,Integer> {

	public Item findByPrice(float price);
	public int countByItemName(String itemName);
//	public List<Customer> findByCustomerName(String customerName);
//	public int countByCustomerName(String customerName);
}
