
public class MyComplex {

	private double real;
	private double imag;
	
	public MyComplex(double real, double imag){
		this.setReal(real);
		this.setImag(imag);
	}
	public void setValue(double real, double img){
		this.setReal(real);
		this.setImag(imag);
	}
	public String toString(){
		return("("+this.getReal()+"+"+this.getImag()+"i)"
				);
	}
	public boolean isReal(){
		if(this.getImag()==0){
			return true;
		}else{
			return false;
		}
	}
	public boolean isImaginary(){
		if(this.getReal()==0){
			return true;
		}else{
			return false;
		}
	}
	public boolean equals(double real, double imag){
		if((Double.compare(real, this.getReal())==0) &&
				(Double.compare(imag, this.getImag())==0)){
			return true;
		}else{
			return false;
		}
		
	} 
	public boolean equals(MyComplex another){
		if((Double.compare(another.getReal(), this.getReal())==0) &&
				(Double.compare(another.getImag(), this.getImag())==0)){
			return true;
		}else{
			return false;
		}
		
	} 
	public double magnitude(){
		return(Math.sqrt( (this.getImag()*this.getImag()) +
				(this.getReal()*this.getReal()) ));
		
	}
	public double argumentInRadians(){
		return(Math.atan2(this.getImag(), this.getReal())    );
	}
	public int argumentDegrees(){
		int degrees= (int)(Math.atan2(this.getImag(), this.getReal())*180/Math.PI);
		return degrees;
	}
	public MyComplex conjugate(){
		MyComplex conjugate=new MyComplex(this.getReal(),
				-this.getImag());
		return(conjugate);
	}
	public MyComplex add(MyComplex another){
		return(  new MyComplex( (another.getReal()+this.getReal()) , 
				                (another.getImag()+this.getImag())  ));
	}
	public MyComplex subtract(MyComplex another){
		return(  new MyComplex( (this.getReal()-another.getReal()) , 
				                (this.getImag()-another.getImag())  ));
	}
	public MyComplex multiplyWith(MyComplex another){
		return(  new MyComplex((this.getReal()*another.getReal() - this.getImag()*another.getImag()) ,
				 (this.getReal()*another.getImag() + this.getImag()* another.getReal())) );
	}
	public MyComplex divideBy(MyComplex another){
		MyComplex a= this.multiplyWith(another.conjugate());
		
		return(new MyComplex( (a.getReal()/(another.magnitude()*another.magnitude()))
				             ,(a.getImag()/(another.magnitude()*another.magnitude()))
				             ) );
	}
	
	
	
	
	
	
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	
}
