package PolymarphismExample;
class Player{
	void run() {
		System.out.println("player runs");
	}
	void walk() {
		System.out.println("plyer walks");
	}
	
}
class Cricketer extends Player{
	@Override
	void run() {
		System.out.println("cricketer runs and walk");
	}
	void hitsix() {
		System.out.println("cricketer hitsix");
	}
	
}
class Footballer extends Player{
	@Override
	void run() {
		System.out.println("Footballer runs and walk");
	}
	void hitGoal() {
		System.out.println(" footballer hitGoal");
	}
}
class Golfer extends Player{
	@Override
	void run() {
		System.out.println("Golfer runs and walk");
	}
	void strike() {
		System.out.println("Golfer strike");
	}
}
class Ground{
	void permit(Player p) {
		p.run();
		p.walk();
		
		
	}
}

public class Program {
	public static void main(String[] args) {
		Cricketer c = new Cricketer();
		Footballer f = new Footballer();
		Golfer g= new Golfer();
		
	/*	Player p;//Reference of the parent
		p=c;
		p.run();
		p.walk();
		c.hitsix();
		
		p=f;
		p.run();
		p.walk();
		f.hitGoal();
		
		p=g;
		p.run();
		p.walk();
		g.strike();*/
		Ground gr = new Ground();
		gr.permit(c);
		gr.permit(f);
		gr.permit(g);
		c.hitsix();
		f.hitGoal();
		g.strike();
	}

}
