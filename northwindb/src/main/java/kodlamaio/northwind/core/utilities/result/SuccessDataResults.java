package kodlamaio.northwind.core.utilities.result;

public class SuccessDataResults<T> extends DataResult<T> {

	public SuccessDataResults(T data, String message) {
		super(data, true, message);
		// TODO Auto-generated constructor stub
	}
	public SuccessDataResults(T data) {
		super(data, true);
		// TODO Auto-generated constructor stub
	}
	public SuccessDataResults() {
		super(null, true);
		// TODO Auto-generated constructor stub
	}
	public SuccessDataResults(String message) {
		super(null, true,message);
		// TODO Auto-generated constructor stub
	}


}
