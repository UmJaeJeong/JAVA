package sec1_verify01;

public class MyMathMethod {
	long a;
	long b;
	
	 long add() {
		return this.a+this.b;
	}
	
	 long subtract(){
			return this.a-this.b;

	}
	
	 long multiply(){
			return this.a*this.b;

	}

	 long divide(){
			return this.a/this.b;

	}
	
	
	 static long add(long a, long b) {
		return a+b;
	}
	
	static long subtract(long a, long b){
		return a-b;
	}
	
	static long multiply(long a, long b){
		return a*b;
	}

	static long divide(long a, long b){
		return a/b;
	}
	
}
