package com.book.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.book.dao.ProductDAO;
import com.book.dao.ProductDAOImpl;
import com.book.model.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired(required=true)
	private ProductDAO productDao;
	
	@Transactional
	public void save(Product product){
		productDao.save(product);
	}
	
	@Transactional
	public void update(Product product){
		productDao.update(product);
	}
	
	
	@Transactional
	public void delete( String productId){
		productDao.delete(productId);
		}
	
	
	@Transactional
	public Product getproduct(String productId) {
		return productDao.getProduct(productId);
	}
	
	@Transactional
	public List getAllproduct() {
		return productDao.getAllproduct();
	}

	
	}
