package kodlamaio.northwind.core.utilities.result;

public class SuccessResult extends Result{
	/* SuccesResult ve ErrorResult classları geliştiriciye kolaylık sağlasın,karışıklık olmasın diye ayrı ayrı yazıldı*/
	
	public SuccessResult() { /* super kullanarak base classın constructor'ını kullandık*/
		super(true);
		
	}
	
	public SuccessResult(String message){
		super(true,message);
	}
	

}
