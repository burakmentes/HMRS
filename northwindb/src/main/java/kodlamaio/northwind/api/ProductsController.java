package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concretes.Product;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {

	/*
	 * Autowired ProductService'i projede tarar, productService implemente eden
	 * classı buluyor o class olan productmanager i new liyor. ve bu classa
	 * yerleştiriyor. IOC yapılandırması diyebiliriz.
	 */
	private final ProductService productService;

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll() {
		return productService.getAll();

	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) { /*Kullanıcıdan alınan veriyi  json formatına dönüştürür, veriyi bizim classımızda yeni obje oluşturarak  
	objeninin id,yer,zaman,isim özellikleri ile eşleştirir yani map eder.
	Özetle kullanıcıdan aldığı veriyi nesnenin özelliklerine atar. */
		return this.productService.add(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getProductName(@RequestParam String productName){/* RequestParam Webten gelen istek parametresini method parametresi eşleştirir.*/
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	DataResult<Product> getByProductNameAndCategoryId(@RequestParam String productName,@RequestParam int categoryId){
	return this.productService.getByProductNameAndCategoryId(productName, categoryId);
	}
	
	@GetMapping("/GetByProductNameContains")
	DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);		
	}
		
	@GetMapping("/GetAllByPage")
		public DataResult<List<Product>> getAll(int pageNo, int pageSize){
			return this.productService.getAll(pageNo-1, pageSize); /* Sayfalamayı 0'dan başlattığı için pageNo-1 verdik */
		}
	@GetMapping("GetAllBySort")
	public DataResult<List<Product>> getAllBypage(){
		return this.productService.getAllSorted();
	}
	}
	

