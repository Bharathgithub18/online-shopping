package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	
	public Category get(int id); 
		
}
