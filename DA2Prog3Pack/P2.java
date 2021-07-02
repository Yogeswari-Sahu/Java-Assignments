package DA2Prog3Pack;

class bill2{
	public int shopbill,spabill;
	bill2(int sh, int sp){
		this.shopbill=sh;
		this.spabill=sp;
	}
	bill2(int sh){
		this.shopbill=sh;
		
	}
    public void shopping(){
        System.out.println("Shopping Bill:"+shopbill);
    }
    public void spa(){
        System.out.println("Spa Bill: "+spabill);
    }
    
}
public class P2 extends bill2{
    public P2(int sh, int sp) {
		super(sh, sp);
	}

	public P2(int sh) {
		super(sh);
	}

	public static void main(String[] args) {

    }
    
}
