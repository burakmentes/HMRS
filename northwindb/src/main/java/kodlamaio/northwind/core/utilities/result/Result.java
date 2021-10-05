package kodlamaio.northwind.core.utilities.result;

import lombok.Getter;
import lombok.Setter;


public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}
	public Result(boolean success, String message) {
		this(success); /*Solid prensibi olan "do not repeat yourself" gereği  bu satırda tekrardan success=success yapmadık
		bir üstteki success constructor'ı çağırdık.*/
		this.message = message;
	}
	public boolean getSuccess() { /*Mesaj ve success bilgisini ön yüz get methodlarından okuyor. */
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
//	public boolean isSucces() {/*memoliye sorulacak hata isSucces ve getMessage'de this kullanmadığım için gerçekleşti. 
//	2. bir anlamadığım durum iste getMessage methodunu GetMessage şeklinde yazınca mesajı dönmüyor */
//		return success;	
//	}

	
	

}
