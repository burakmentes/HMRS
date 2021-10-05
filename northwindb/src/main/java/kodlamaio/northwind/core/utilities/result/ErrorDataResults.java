package kodlamaio.northwind.core.utilities.result;

public class ErrorDataResults<T> extends DataResult<T> {
	public ErrorDataResults(T data, String message) {
		super(data, false, message);
		// TODO Auto-generated constructor stub
	}
	public ErrorDataResults(T data) {
		super(data, false);
		// TODO Auto-generated constructor stub
	}
	public ErrorDataResults() {
		super(null, false);
		// TODO Auto-generated constructor stub
	}
	public ErrorDataResults(String message) {
		super(null, false,message);
		// TODO Auto-generated constructor stub
	}

}
