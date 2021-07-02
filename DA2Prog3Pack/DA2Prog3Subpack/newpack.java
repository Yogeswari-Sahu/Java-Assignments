package DA2Prog3Pack.DA2Prog3Subpack;

import DA2Prog3Pack.*;


class bill3{
	int total,b,l,d,shopbill,spabill;
	bill3(P1 b1,P2 b2){
		this.b=b1.b;
		this.l=b1.l;
		this.d=b1.d;
		this.shopbill=b2.shopbill;
		this.spabill=b2.spabill;
	}
	 public int price() {
		 int totalprice=b+l+d+shopbill+spabill;
		 
		 return totalprice;
	 }
    public int taxes(){
    	int tax=(int) (price()*0.18);
    	System.out.println("Total price:"+price());
        System.out.println("Taxes:"+tax);
        return tax;
    }
  
   

}
public class newpack extends bill3{
	public void finalize(){System.out.println("object is garbage collected");}  
	public newpack(P1 b1, P2 b2) {
		super(b1, b2);
		
	}
    public static void main(String[] args) {
    	
        P1 b1= new P1(124,333,452);
        b1.breakfast();
        b1.lunch();
        b1.dinner();
        P2 b2=new P2(1240,1393);
        b2.shopping();
        b2.spa();
        newpack obj=new newpack(b1,b2);
        int np=obj.price();
        int nt=obj.taxes();
        int tot=np+nt;
        System.out.println("Total Bill:  "+ tot);
        obj=null;
        System.gc();  
    }
	
    
}
