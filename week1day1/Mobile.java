package week1day1;

public class Mobile {
	
	 
	 public static void makecall() {
		 String mobilemodel="Nokia";
		 float mobileweight=1.03f;
		 System.out.println(mobilemodel+""+mobileweight);
		 
	 }
	 
	 public static void sendMsg(){
		boolean fullCharged=true;
		int mobileCost=32000;
		System.out.println(fullCharged+""+mobileCost);
		 
		 
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 Mobile info =new Mobile(); 
		 info.makecall();
		 info.sendMsg();
		 System.out.println("this is my mobile");
		 
	 }
		

}
