package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dao.ItemDAO;
import com.model.Item;

@RestController
public class ItemRestController {
	
	@Autowired
	ItemDAO itemdao;
	
	
	@GetMapping("/homeinfo")
	public String gethomeinfo() {
		
		return "hello from intem rest controller";
	}
	
	@PostMapping("/additem")
	public ResponseEntity addItem(@RequestBody Item item) {
		
		itemdao.save(item);
		
		return new ResponseEntity("item added",HttpStatus.OK);
	}
	
	@GetMapping("/getallitems")
	public List<Item> getAllItems(){
		return itemdao.findAll();
	}
	
	@PatchMapping("/updateitem")
	public ResponseEntity updateitem(@RequestBody Item item) {
		itemdao.save(item);
		return new ResponseEntity("updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteitem")
	public ResponseEntity deleteitem(@RequestBody Item item) {
		itemdao.delete(item);
		return new ResponseEntity("deleted",HttpStatus.OK);
	}
	
	@GetMapping("/findbyid/{id}")
	public Item getItem(@PathVariable int id) {
		
		Item item=itemdao.findById(id).get();
		
		return item;
	}
	
	
}
