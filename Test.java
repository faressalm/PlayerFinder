package tests;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Point;
import classes.PlayerFinder;

class Test {
	 private static String[] test1={
			 "33JUBU33",
			 "3U3O4433",
			 "O33P44NB",
			 "PO3NSDP3",
			 "VNDSD333",
			 "OINFD33X"
		   };
   private static String[] test2={ 
			"44444H44S4",
			"K444K4L444",
			"4LJ44T44XH",
			"444O4VIF44", 
			"44C4D4U444",
			"4V4Y4KB4M4",
			"G4W4HP4O4W",
			"4444ZDQ4S4",
			"4BR4Y4A444", 
			"4G4V4T4444"  };
   private static String[] test3={ 
			"8D88888J8L8E888",
			"88NKMG8N8E8JI88", 
			"888NS8EU88HN8EO",
			"LUQ888A8TH8OIH8", 
			"888QJ88R8SG88TY", 
			"88ZQV88B88OUZ8O",
			"FQ88WF8Q8GG88B8", 
			"8S888HGSB8FT8S8", 
			"8MX88D88888T8K8",
			"8S8A88MGVDG8XK8",
			"M88S8B8I8M88J8N",
			"8W88X88ZT8KA8I8",
			"88SQGB8I8J88W88",
			"U88H8NI8CZB88B8",
			"8PK8H8T8888TQR8"
	};
   public static String[] test4={
	   "11111",
	   "1AAA1",
	   "1A1A1",
	   "1AAA1",
	   "11111"
   };
	@org.junit.jupiter.api.Test
	void test1() {
		Point find1[]=new Point[3];
		find1[0]=new Point(4,5);
		find1[1]=new Point(13,9);
		find1[2]=new Point(14,2);
		PlayerFinder opj=new PlayerFinder();
	   Point game[];
	 game=  opj.findPlayers(test1, 3, 16);
	 for(int i=0;i<game.length;i++) {
		 assertEquals(find1[i],game[i] ); 
		 
	 }
	 
		
		
		
	}
	@org.junit.jupiter.api.Test
    void test2() {
		Point find1[]=new Point[6];
		find1[0]=new Point(3,8);
		find1[1]=new Point(4,16);
		find1[2]=new Point(5,4);
		find1[3]=new Point(16,3);
		find1[4]=new Point(16,17);
		find1[5]=new Point(17,9);
		
		PlayerFinder opj=new PlayerFinder();
		   Point game[];
		 game=  opj.findPlayers(test2, 4, 16);
		 for(int i=0;i<game.length;i++) {
			 assertEquals(find1[i],game[i] ); 
			 
		 }
	}
	@org.junit.jupiter.api.Test
    void test3() {
		Point find1[]=new Point[19];
		find1[0]=new Point(1,17);
		find1[1]=new Point(3,3);
		find1[2]=new Point(3,10);
		find1[3]=new Point(3,25);
		find1[4]=new Point(5,21);
		find1[5]=new Point(8,17);
		find1[6]=new Point(9,2);
		find1[7]=new Point(10,9);
		find1[8]=new Point(12,23);
		find1[9]=new Point(17,16);
		find1[10]=new Point(18,3);
		find1[11]=new Point(18,11);
		find1[12]=new Point(18,28);
		find1[13]=new Point(22,20);
		find1[14]=new Point(23,26);
		find1[15]=new Point(24,15);
		find1[16]=new Point(27,2);
		find1[17]=new Point(28,26);
		find1[18]=new Point(29,16);
		PlayerFinder opj=new PlayerFinder();
		   Point game[];
		 game=  opj.findPlayers(test3, 8, 9);
		 for(int i=0;i<game.length;i++) {
			 assertEquals(find1[i],game[i] ); 
			 
		 }
    }
	@org.junit.jupiter.api.Test
    void test4(){
		Point find1[]=new Point[2];
		find1[0]=new Point(5,5);
		find1[1]=new Point(5,5);
		PlayerFinder opj=new PlayerFinder();
	   Point game[];
	 game=  opj.findPlayers(test4, 3, 16);
	 for(int i=0;i<game.length;i++) {
		 assertEquals(find1[i],game[i] ); 
		 
	 }
    }
	private static String[] test5= {};
	@org.junit.jupiter.api.Test
	 void test5(){
		PlayerFinder opj=new PlayerFinder();
		 assertEquals(null, opj.findPlayers(test5, 3, 16) ); 
		
	}
	
	
}
