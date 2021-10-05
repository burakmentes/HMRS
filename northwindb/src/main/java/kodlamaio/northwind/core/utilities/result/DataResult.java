package kodlamaio.northwind.core.utilities.result;

public class DataResult<T> extends Result {
	/* Her tipten data dönülebileceği için bu classı Generic yazdık */
	private T data;

	public DataResult(T data,boolean success, String message) {
		super(success, message);
		// TODO Auto-generated constructor stub
		this.data=data;
		
	}
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
	}
	
	public T getData() {/* getmessage ve ve getsucces methodları base class olan Resultta olduğu için onları tekrar yazmadık*/
		return this.data;
	}
		

}
