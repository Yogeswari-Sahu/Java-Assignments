package DA2Prog3Pack;

class bill1{
	public int b,l,d;
	bill1(int b,int l,int d){
		this.b=b;
		this.d=d;
		this.l=l;
	}
	bill1(int b,int l){
		this.b=b;
		this.l=l;
	}
	bill1(int b){
		this.b=b;
		
	}
    public void breakfast(){
        System.out.println("Bill for Breakfast:"+b);
    }
    public void lunch(){
        System.out.println("Bill for Lunch: "+l);
    }
    public void dinner(){
        System.out.println("Bill for Dinner: "+d);
    }
}
public class P1 extends bill1{
    public P1(int b, int l, int d) {
		super(b, l, d);
	}

	public P1(int b, int l) {
		super(b, l);
	}

	public P1(int b) {
		super(b);
	}

	public static void main(String[] args) {

    }
    
}

