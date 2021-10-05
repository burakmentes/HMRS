package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDataResults;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
@Service /*Bu class service (business) görevi görecek diyoruz.*/
public class ProductManager implements ProductService{
	
	private ProductDao productDao;
	/*ProductDao'da extend ettiği jpaRepository'ye verdiğimiz class adı ve veri tipi ile spring bir
	 * repository class'ı oluşturur.(ProductDao'nun örneği olacak bir class üretiyor)
	 *  Bu classı da nereye vereceğini @Autowired anotasyonu ile belirtiyoruz.
	 * */
	@Autowired
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}


	@Override
	public Result add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}


	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResults<List<Product>>
		(productDao.findAll(), "Ürünler getirildi");
	}


	@Override
	public DataResult<Product> getByProductName(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResults<Product>(productDao.getByProductName(productName),"Ürün getirildi");
	}


	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResults<Product>(productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Ürün getirildi");
	}
	
	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResults<List<Product>>(productDao.getByProductNameOrCategory_CategoryId(productName,categoryId),"Ürün getirildi");
	}

	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> Categories) {
		// TODO Auto-generated method stub
		return new SuccessDataResults<List<Product>>(productDao.getByCategoryIn(Categories),"Ürün getirildi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResults<List<Product>>(productDao.getByProductNameContains(productName),"Ürün getirildi");
	}


	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResults<List<Product>>(productDao.getByProductNameStartsWith(productName),"Ürün getirildi");
	}


	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		return new SuccessDataResults<List<Product>>(productDao.findAll(pageable).getContent() ,"Ürün getirildi");
	}


	@Override
	public DataResult<List<Product>> getAllSorted() {
		// TODO Auto-generated method stub
		org.springframework.data.domain.Sort sort= org.springframework.data.domain.Sort.by(org.springframework.data.domain.Sort.Direction.DESC,"productName");
		return new SuccessDataResults<List<Product>>(productDao.findAll(sort));
	}


	
	


	



}
