package Lesson1;
/*	 
 * 目標　標準クラスについて理解しよう                             
 * Mathクラスを使おう
*/
public class Sample1 {	
	public static void main(String[] args) {
		
//x = クラス名.メソッド名　（引数）　　という形になっている。 
//注意　APIとは　メソッドの名前　メソッドの引数　戻り値	
		
//平方根について　
		double a = Math.sqrt(2.0); 
		System.out.println("2.0の平方根は" + a);
//四捨五入　小数第一で
		long b = Math.round(3.1415926);
		System.out.println("3.1415926を四捨五入すると" + b);
//冪数
		double c = Math.pow(3.0,4.0);
		System.out.println("3.0の4.0乗は" + c);
//要素の中で一番大きい値を返す
		double d = Math.max(43.21, 300.33);
		System.out.println("43.21と300.33では" + d + "のほうが大きい");
//要素の中で一番小さい値を返す
		double e = Math.min(43.21, 300.33);
		System.out.println("43.21と300.33では" + e + "のほうが小さい");
//乱数1 0.0~1.0のどれか
		double f1 = Math.random();
		double f2 = Math.random();
		System.out.println("乱数f1=" + f1);
		System.out.println("乱数f2=" + f2);
//乱数2 サイコロを作ろう 
		int k1 = 6;
		int n1 = (int)(Math.random()*k1);
		System.out.println(n1+1);  // 1~6 まで出力 理由は kを自然数とすると　k*10  > k*9 > ・・・　> k*1 > k*0
		int n2 = (int)(10*Math.random() % 6);
		System.out.println(n2+1);  // k で割ったあまりは 0,1,・・・,k-1 
	}

}
