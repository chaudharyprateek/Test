package com.ecomm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.model.Category;

public class CategoryDAOTest {
	static CategoryDAO categoryDAO;
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
		
		
		
	}
	//For Adding Category
	@Test
	public void addCategoryTest() {
		Category category = new Category();
		category.setCategoryName("SHORTS");
		category.setCategoryDesc("SHORTS FOR ALL");
		assertTrue("Problem Occured During Adding",categoryDAO.addCategory(category));
		
	}
	@Test
	public void listCategoriesTest()
	{
		List<Category> categoryList=categoryDAO.listCategories();
		assertTrue("Problem",categoryList.size()>0);

		for(Category category:categoryList)
		{

		System.out.println(category.getCategoryId()+":::");
		System.out.println(category.getCategoryName()+":::");
		System.out.println(category.getCategoryDesc()+":::");
		}

}
	@Test
	public void updateCategoryTest()
	{
		Category category = categoryDAO.getCategory(2);
		category.setCategoryDesc("FORMAL SHIRTS");
		assertTrue("Problem while UPDATING",categoryDAO.updateCategory(category));
		
		
		
	}
}
