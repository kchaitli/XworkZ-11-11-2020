class PhonePe{
	public static void payment(long Mobilenum){
		System.out.println("your mobile recharge done");
	}
	public static void payment(String DTH){
		System.out.println("your"+DTH+"number bill paid ");
	}
	public static void payment(int meterId, String name, int amount){
		System.out.println("paid electricity bill of"+meterId+" "+"rs"+amount+" "+"of"+" "+name);
	}
	public static void payment(int creditcardnum, int amount){
		System.out.println("credit card bill pain successfully for"+ creditcardnum+"for amount"+amount);
	}
	public static void main(String args[]){
		PhonePe.payment(9999999999l);
		PhonePe.payment("DTH36109870836");
		PhonePe.payment(880123,"arav",20000);
		PhonePe.payment(11995,3000);
	}
}