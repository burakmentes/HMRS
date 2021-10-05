package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="products")

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="product_id")
	private int id;
//	@Column(name="category_id")
//	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unitPrice")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="category_id") /* join yaptık */
	Category category;	
	
	
	/*category tablosu ile product'ın ilişkisi yoktu. category id column ile product'ı joinledik.product nesnesinin category'sini tutuyoruz 
	 * bu yüzden category_id tanımı silinebiir.*/



}
