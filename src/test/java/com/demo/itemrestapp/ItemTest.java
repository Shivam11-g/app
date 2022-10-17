package com.demo.itemrestapp;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

public class ItemTest {

    int port=9092;

	@Test
    void test1() throws URISyntaxException, JsonProcessingException {
		
	    RestTemplate template=new RestTemplate();
	    final String url="http://localhost:" + port + "/findbyid/1";
	    URI uri=new URI(url);
	      
	    ResponseEntity<String> res=template.getForEntity(uri,String.class);
	    Assertions.assertEquals(HttpStatus.OK,res.getStatusCode());
      
    }

	@Test
    void test2() throws URISyntaxException, JsonProcessingException {
		
	    RestTemplate template=new RestTemplate();
	    final String url="http://localhost:" + port + "/getallitem";
	    URI uri=new URI(url);
	      
	    ResponseEntity<String> res=template.getForEntity(uri,String.class);
	    Assertions.assertEquals(HttpStatus.OK,res.getStatusCode());
      
    }
	
}
