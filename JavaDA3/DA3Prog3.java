package JavaDA3;
import JavaDA3.vote;
import JavaDA3.count;
import java.util.Vector;
public class DA3Prog3 {
	public static void main(String[] args) {
		System.out.println("Yogeswari Sahu 18BCE0928 06-04-2021");
		Vector votevec = new Vector(50);
		vote a = new vote(1, votevec);
		a.start();
		vote b = new vote(2, votevec);
		b.start();
		vote c = new vote(3, votevec);
		c.start();
		try{
			a.join();
			b.join();
			c.join();
			System.out.println("Voting has ended!");
		}catch(Exception e){
			System.out.println(e);
		}
		count ac = new count(1, votevec);
		count bc = new count(2, votevec);
		count cc = new count(3, votevec);
		ac.start();
		bc.start();
		cc.start();
		try{
			ac.join();
			bc.join();
			cc.join();
			System.out.println("Counting has ended!");
		}catch(Exception e){
			System.out.println(e);
		}
		int av = ac.count;
		int bv = bc.count;
		int cv = cc.count;
		System.out.println("elections.Vote Vector:" + "\n" + votevec);
		System.out.println(av + " votes for A");
		System.out.println(bv + " votes for B");
		System.out.println(cv + " votes for C");
		if(av >= bv && av >= cv){
			if(av == bv || av == cv)
				System.out.println("Tie in elections!");
			else
				System.out.println("A has won the elections!");
		}
		else if(bv >= av && bv >= cv){
			if(av == bv || bv == cv)
				System.out.println("Tie in elections!");
			else
				System.out.println("B has won the elections!");
		}
		else if(cv >= av && cv >= bv){
			if(cv == bv || cv == av)
				System.out.println("Tie in elections!");
			else
				System.out.println("C has won the elections!");
		}
	}

}
