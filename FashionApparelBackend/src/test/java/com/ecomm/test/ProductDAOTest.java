package com.ecomm.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.ecomm.dao.ProductDAO;

import com.ecomm.model.Product;

public class ProductDAOTest {
	static ProductDAO productDAO;
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
		
		
		
		
	}
	//For Adding Category
		@Test
		public void addCategoryTest() {
			Product product = new Product();
			product.setProductId(1);
			product.setProductName("M-SHORTS");
			product.setProductDesc("LEE SHORTS");
			product.setCategoryId(4);
			product.setSupplierId(2);
			product.setStock(2);
			product.setPrice(849);
			
			assertTrue("Problem Occured During Adding",productDAO.addProduct(product));
}
}