package com.pioneerx1.product.bo;

import com.pioneerx1.product.dao.ProductDAO;
import com.pioneerx1.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private ProductDAO dao;

	@Override
	public void create(Product product) {
		dao.create(product);		
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}
	
	public ProductDAO getDao() {
		return dao;
	}

	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

}
