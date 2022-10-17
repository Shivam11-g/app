package com.demo.itemrestapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.ItemDAO;
import com.model.Item;

@SpringBootTest
class ItemrestappApplicationTests {

	@Autowired
	ItemDAO idao;
	
	@Test
	void test() {
		Item i=new Item();
		i.setItemName("Coffee");
		i.setPrice(20);
		i.setQuantity(100);
		
		idao.save(i);
		Item i1=idao.findById(i.getItemId()).get();
		
		assertEquals(i.getItemName(), i1.getItemName());
		
	}
	
	@Test
	void testByPrice(){

		Item i=new Item();
		i.setItemName("Tea");
		i.setPrice(10);
		i.setQuantity(200);
		
		idao.save(i);
		Item i1=idao.findByPrice(10);
		
		assertEquals(i1.getItemName(), "Tea");
	}
	
	@Test
	void countByName() {
		int count=idao.countByItemName("Tea");
		assertEquals(count, 1);
	}
	

}
