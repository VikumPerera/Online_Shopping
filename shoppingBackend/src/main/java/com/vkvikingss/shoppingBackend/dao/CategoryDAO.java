package com.vkvikingss.shoppingBackend.dao;

import java.util.List;

import com.vkvikingss.shoppingBackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();

	Category getCategory(int id);
}
