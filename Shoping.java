import java.util.Scanner;

class ShopingCard{
	void electronics() {
		System.out.println("Shoping electronics");
	}
	void furniture() {
		System.out.println("Shoping furniture");
	}
	void grosaries() {
		System.out.println("Shoping grosaries");
	}
	
}
class Electronics extends ShopingCard{
	void iphone() {
		System.out.println("my name is Ashok");
		System.out.println("boyaashok73993@gmail.com");
		System.out.println(" ");
		System.out.println("-------ELECTRONICS--------");
		System.out.println("model-1:iphone");
	}
	void vivo() {
		System.out.println("model-2:vivo");
	}
	void samsung() {
		System.out.println("model-3:samsung");
	}
	void sony() {
		System.out.println("model-4:sony");
	}
	void oppo() {
		System.out.println("model-5:oppo");
	}
}
class iphone extends Electronics{
	void iphone9() {
		System.out.println(" ");
		System.out.println("---iphone--");
		System.out.println("model-1:iphone9");
	}
	void iphone10() {
		System.out.println("model-2:iphone10");
	}
	void iphone11() {
		System.out.println("model-3:iphone11");
	}
	void iphone12() {
		System.out.println("model-4:iphone12");
	}
}
class vivo extends Electronics{
	void vivoT1x() {
		System.out.println(" ");
		System.out.println("---vivo----");
		System.out.println("model-1:vivoT1x");
	}
	void vivov25pro() {
		System.out.println("model-2:vivov25pro");
	}
	void vivoy35() {
		System.out.println("model-3:vivoy35");
	}
}
class samsung extends Electronics{
	void samsungGalaxyF13() {
		System.out.println(" ");
		System.out.println("-----samsung----");
		System.out.println("model-1:samsungGalaxyF13");
	}
	void samsungGalaxyF22() {
		System.out.println("model-2:samsungGalaxyF13");
	}
	void samsungGalaxyM33() {

		System.out.println("model-3:samsungGalaxyM33");
	}
}
class oppo extends Electronics{
	void oppoF11() {
		System.out.println(" ");
		System.out.println("----oppo---");
		System.out.println("model-1:oppoF11");
	}
	void oppoF12() {
		System.out.println("model-2:oppoF12");
	}
	void oppoF17() {
		System.out.println("model-3:oppoF17");
	}
}
class sony extends Electronics{
	void sonyXperiaXZ() {
		System.out.println(" ");
		System.out.println("----sony----");
		System.out.println("model-1:sonyXperiaXZ");
	}
	void sonyXperiaTZ() {
		System.out.println("model-2:sonyXperiaTZ");
	}
}
class furniture extends ShopingCard{
void chairs() {
	System.out.println(" ");
	System.out.println("******FURNITURE******");
	System.out.println("model-1:chairs");
}
void doores() {
	System.out.println("model-2:doores");
}
void Tables() {
	System.out.println("model-3:Tables");
}
void cuboards() {
	System.out.println("model-4:cuboards");
}
}
class chaires extends furniture{
	void chair1() {
		System.out.println(" ");
		System.out.println("---chaires----");
		System.out.println("model-1:chair1");
	}
	void chair2() {
		System.out.println("model-2:chair2");
	}
	void chair4() {
		System.out.println("model-3:chair4");
	}
}
class doores extends furniture{
	void door1() {
		System.out.println(" ");
		System.out.println("---doores---");
		System.out.println("model-1:door1");
	}
	void door2() {
		System.out.println("model-2:door2");
	}
	void door3() {
		System.out.println("model-3:door3");
	}

}
class tables extends furniture{
	void table1() {
		System.out.println(" ");
		System.out.println("----Tables--");
		System.out.println("model-1:table1");
	}
	void table2() {
		System.out.println("model-2:table2");
	}
	void table3() {
		System.out.println("model-3:table3");
	}
}
class grasaries extends ShopingCard{
	void dhal() {
		System.out.println(" ");
		System.out.println("*****GRASARIES*****");
		System.out.println("model-1:dhal");
	
	}
	void oil() {
		System.out.println("model-2:oil");
	}
	void grams() {
		System.out.println("model-3:grams");
	}
	void floures() {
		System.out.println("model-4:floures");
	}
}
class dhal extends grasaries{
	void soybean() {
		System.out.println(" ");
		System.out.println("----dhal------");
		System.out.println("model-1:soybean");
	}
	void cowpea() {
		System.out.println("model-2:cowpea");
	}
	
}
class oil extends grasaries{
	void freedomoil() {
		System.out.println(" ");
		System.out.println("-----oil----");
		System.out.println("model-1:freedom oil");
	}
	void sunfloweroil() {
		System.out.println("model-2:sunflower oil ");
	}
	void coconutooil() {
		System.out.println("model-3:coconuto oil");
	}
}
class grams extends grasaries{
	void blackGram() {
		System.out.println(" ");
		System.out.println("----grams-----");
		System.out.println("model-1:blackGram");
	}
	void greenGram() {
		System.out.println("model-2:greeGram");
     }
	void splitgreenGram() {
		System.out.println("model-3:splitgreenGram");
	}
}
class floures extends grasaries{
	void cakeflour() {
		System.out.println(" ");
		System.out.println("----floures----");
		System.out.println("model-1:cakeflour");
	}
	void wheatflour() {
		System.out.println("model-2:wheatflour");
	}
}
public class Shoping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Name");
		
		String name = sc.nextLine();
		System.out.println(" welcome to the shpoing mall");
		
		Electronics e = new Electronics();
		e.iphone();
		e.vivo();
		e.oppo();
		e.sony();
		e.samsung();
		
		iphone i = new iphone();
		i.iphone10();
		i.iphone11();
		i.iphone9();
		i.iphone12();
		
		vivo v = new vivo();
		v.vivoT1x();
		v.vivov25pro();
		v.vivoy35();
		
		oppo o = new oppo();
		o.oppoF11();
		o.oppoF12();
		o.oppoF17();
		
		samsung s = new samsung();
		s.samsungGalaxyF13();
		s.samsungGalaxyF22();
		s.samsungGalaxyM33();
		
		sony S = new sony();
		S.sonyXperiaTZ();
		S.sonyXperiaXZ();
		
		System.out.println("----------------------------------------");
		furniture f = new furniture();
		f.chairs();
		f.cuboards();
		f.doores();
		f.chairs();
		
		chaires c = new chaires();
		c.chair1();
		c.chair2();
		c.chair4();
		 doores n = new  doores();
		 n.door1();
		 n.door2();
		 n.door3();
		 System.out.println("------------------------------------");
		 grasaries g = new grasaries();
		 g.dhal();
		 g.floures();
		 g.oil();
		 g.grams();
		 dhal d = new dhal();
		 d.cowpea();
		 d.soybean();
		 floures fs = new floures();
		 fs.cakeflour();
		 fs.wheatflour();
		 oil ol = new oil();
		 ol.sunfloweroil();
		 ol.freedomoil();
		 ol.coconutooil();
		 grams gs = new grams();
		 gs.blackGram();
		 gs.greenGram();
		 gs.splitgreenGram();
	}


}