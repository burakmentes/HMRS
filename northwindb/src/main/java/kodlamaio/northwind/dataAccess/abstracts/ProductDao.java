package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product getByProductName(String productName); /* jpa repository method adının başında getBy olması nedeniyle otomatik olarak get'e uygun bir select sorgusu yazar*/
	Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName,int categoryId);
	/*Method isminde CategoryId kullandığımız için hata aldık CategoryId'nin product'ta karşılığı yok methodda Category kullanmalıyız.  */
	
	List<Product> getByCategoryIn(List<Integer> Categories); /*SELECT*FROM products where category_id in(1,2,3,4,5) cat id 1,2,3,4,5 olanları getir*/
	List<Product> getByProductNameContains(String productName);
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName=:productName and categoryId=:categoryId")
	List<Product> getByNameAndcategory(String productName,String categoryId);


}
