package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();/*DataResult döneceğiz ve DataResult ile döndüğümüz verinin tipi List<Product> olacak*/
	DataResult<List<Product>> getAll(int pageNo,int pageSize);
	DataResult<List<Product>> getAllSorted();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName); /* jpa repository method adının başında getBy olması nedeniyle otomatik olarak get'e uygun bir select sorgusu yazar*/
	DataResult<Product> getByProductNameAndCategoryId(String productName,int categoryId);
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName,int categoryId);
	
	/*SELECT*FROM products where category_id in(1,2,3,4,5) cat id 1,2,3,4,5 olanları getir*/
	
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> Categories);
	DataResult<List<Product>> getByProductNameContains(String productName);
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
}
