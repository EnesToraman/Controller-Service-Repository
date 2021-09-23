package repositoryImpl;

import java.util.ArrayList;
import java.util.List;

import model.Product;
import repository.ProductRepository;

public class ProductRepositoryImpl implements ProductRepository{

	private Product product1;
	private Product product2; 
	private Product product3; 
	
	public ProductRepositoryImpl() {
		
	}
	
	public ProductRepositoryImpl(Product product1, Product product2, Product product3) {
		
		product1.setId(1L);
		product1.setName("shirt");
		product1.setPrice(10.0);

		product2.setId(2L);
		product2.setName("pants");
		product2.setPrice(20.0);
		
		product3.setId(3L);
		product3.setName("coat");
		product3.setPrice(30.0);
		
		product3.setId(4L);
		product3.setName("jacket");
		product3.setPrice(40.0);
	}
	
	@Override
	public List<Product> getAllProducts() {
				
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		return productList;
	}

}
