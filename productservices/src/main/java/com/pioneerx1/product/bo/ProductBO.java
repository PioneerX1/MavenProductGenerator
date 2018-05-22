package com.pioneerx1.product.bo;

import com.pioneerx1.product.dto.Product;

public interface ProductBO {
	
	public void create(Product product);
	
	public Product findProduct(int id);

}
