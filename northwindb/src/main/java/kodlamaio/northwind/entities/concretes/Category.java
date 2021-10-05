package kodlamaio.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="categories")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
/*Orm'lerde recursive(tekrarlayan) yapılar olduğunda configure etmek için kullanılır. 
 * getByProductNameOrCategory'i çalıştırdığımızda Product'ın içindeki category'i map ediyor.Category'nin içindeki parametreleri map ediyor.Category içinde
 * Product olduğu için tekrar onun içerisindeki categoryleri map ediyor ve result recursive(tekrarlayan) olarak dönüyor.Bunu configure etmek için
 * JsonIgnoreProperties kullandık*/
public class Category {
	@Id
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy="category") /* Burada categories yazıp hata almıştık. Buradaki mappedBy ile Product classındaki @JoinColumn'da tanımlanan referans ile eşit olmalı*/ 
	private List<Product> products;
	
	/*Categories tablosu ile product tablosu arasında bire çok ilişki olduğunu  belirttik.Bir category birden fazla product'a karşılık geldiği için List olarak yazdık */


}
