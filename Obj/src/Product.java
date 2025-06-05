
public class Product {
	String name;
	int price;
	static final String STORE_NAME="速水PC販売店";
	static int instanceCnt=0;
	static final int CHANGE_AMT=1000;
	
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
		instanceCnt++;
	}
	
	public Product(String name) {
		this.name=name;
		this.price=0;
	}
	
	static void displayStorename() {
		System.out.println("■店舗名：" + STORE_NAME);
	}
	
	int up(int amt) {
		this.price+=amt;
		return this.price;
	}
	
	int up() {
		return up(this.CHANGE_AMT);
	}
	
	int down(int amt) {
		this.price-=amt;
		return this.price;
	}
	
	int down() {
		return down(this.CHANGE_AMT);
	}
	
	void display() {
		System.out.println(name+":"+price+"円");
	}
}
