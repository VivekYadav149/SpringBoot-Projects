package com.project.springweb;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;

import com.project.springweb.entities.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductrestapiApplicationTests {

	@Value("${productrestapi.services.url}")
	private String baseURL;
	
	@Test
	public void testGetProduct() {
		System.out.println(baseURL);
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL +"1", Product.class);
		assertNotNull(product);
		assertEquals("IPhone", product.getName());
	}

	@Test
	public void testCreateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Samsung Mobile");
		product.setDescription("Its new Samsung Phone");
		product.setPrice(1299);
		Product newProduct = restTemplate.postForObject(baseURL, product, Product.class);
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		assertEquals("Samsung Mobile", newProduct.getName());
	}
	
	@Test
	public void testUpdateProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL + "1", Product.class);
		product.setPrice(1978);
		product.setName("Samsung Galaxy S22");
		product.setDescription("S22 series launched");
		restTemplate.put(baseURL, product);
	}
}
