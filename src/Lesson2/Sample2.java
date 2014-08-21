package Lesson2;
//メソッドを使ってみよう
public class Sample2 {
	public static void main(String[] args){
		dice();
		System.out.println("原価1000円の税込み価格は" + price(1000) + "です。");
		System.out.println("４と９の足し算は" + Max(4,9) + "です。");
		System.out.println("5は" + Ten(5));
	} 
	
	//サイコロのメソッド
	//値を返してないのでvoidを指定
	public static void dice(){ 
	int x =	 (int)(Math.random()*6);
	System.out.println("サイコロの目:" + x+1);
	}
	//税込み価格　小数点第一切り捨て
	// 値を返しているので 戻り値の型を指定
	public static int price(int y){
		int z = (int)(y * 0.08);
		return z;
	}
	//仮引数が２つあるとき
	public static int Max (int a , int b){
		int c = a + b;
		return c;
	}
	//型がboolean型のとき
	public static boolean Ten(int x){
		if(x < 10){
			return false;
		}else{
			return true;
		}
	}
	
	
}
