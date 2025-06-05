
public class Driver {

	public static void main(String[] args) {
		Product.displayStorename();
		Product[] productList= {
				new Product("マウス",2000),
				new Product("キーボード",3600),
				new Product("Webカメラ",3900),
				new Product("ディスプレイ",15000),
				new Product("LEDクラス",4200)
		};
		
		for(int i=0; i<productList.length; i++) {
			productList[i].display();
		}
		
		System.out.println("---一斉値下げ---");
		
		for(int i=0; i<productList.length; i++) {
			productList[i].down();
			productList[i].display();
		}
	}

}
