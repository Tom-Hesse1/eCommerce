package com.tts.eComm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tts.eComm.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findAll();

	public Product findProductById(Long id);

	public List<Product> findByBrand(String brand);

	public List<Product> findByCategory(String category);

	public List<Product> findByBrandAndCategory(String brand, String category);

	@Query("SELECT DISTINCT product.brand FROM Product product")
	public List<String> findDistinctBrands();

	@Query("SELECT DISTINCT product.category FROM Product product")
	public List<String> findDistinctCategories();

}
