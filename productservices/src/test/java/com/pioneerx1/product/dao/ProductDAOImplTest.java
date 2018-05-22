package com.pioneerx1.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pioneerx1.product.dto.Product;

import junit.framework.Assert;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("Apple smart phone");
		product.setPrice(800);
		
		dao.create(product);
		Product result = dao.read(product.getId());
		
		assertNotNull(result);
		assertEquals("iPhone", result.getName());
	}

}
