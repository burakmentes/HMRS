package kodlamaio.northwind.core.utilities.result;

public class ErrorResult extends Result {

	
	public ErrorResult() { /* super kullanarak base classın constructor'ını kullandık*/
		super(false);
		
	}public ErrorResult(String message){
		super(false,message);
	}

}
