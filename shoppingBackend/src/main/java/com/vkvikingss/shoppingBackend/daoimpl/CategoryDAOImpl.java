package com.vkvikingss.shoppingBackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vkvikingss.shoppingBackend.dao.CategoryDAO;
import com.vkvikingss.shoppingBackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories=new ArrayList<Category>();
	
	static{
		Category category=new Category();
		category.setId(1);
		category.setName("Telivision");
		category.setDescription("Description about telivision");
		category.setImageURL("telivision.png");
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description about mobile");
		category.setImageURL("mobile.png");
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("Radio");
		category.setDescription("Description about radio");
		category.setImageURL("radio.png");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category getCategory(int id) {
		for(Category category:categories){
			if(category.getId()==id){
				return category;
			}
		}
		return null;
	}

}
