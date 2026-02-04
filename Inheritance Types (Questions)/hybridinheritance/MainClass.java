package hybridinheritance;

public class MainClass {
	public static void main(String args[]) {
		// GandFather--> Father-->Son=Multilevel
		// father-->son(c),daughter(c)=Hierarchical
		Son s1 = new Son();
		s1.land();// grandfather properties
		s1.House();// father properties
		s1.bike();// own properties
		System.out.println("---------");
		Daughter d1 = new Daughter();
		d1.land();// grandfather properties
		d1.House();// father properties
		d1.farmhouse();// own properties
		System.out.println("------------");
		Cousin1 c1 = new Cousin1();
		// GandFather--> Uncle-->Cousin1=Multilevel

		c1.land();// grand father
		c1.bussiness();// uncle
		c1.biCycle();// his own
		System.out.println("--------------");
		Cousin2 c2 = new Cousin2();
		// GandFather--> Aunt-->Cousin1=Multilevel

		c2.land();// granfather
		c2.shop();// aunt
		c2.dress();// her own
		// GrandFather → Father → Son/Daughter → Multilevel + Hierarchical
		// GrandFather → Uncle → Cousin1 → Multilevel
		// GrandFather → Aunt → Cousin2 → Multilevel
	}
}
