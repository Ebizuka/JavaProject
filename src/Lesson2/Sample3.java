package Lesson2;
//　メソッドの連携
// 最小値、最大値、範囲、平均値、合計　を表示させよう。小数点第一は切り捨て
//　ただし、要素の個数は3以上とする。
public class Sample3{
	private static int date [] = {10,52,-22};
	public static void main(String[] args) {
	System.out.println("最大値:" + Max());	
	System.out.println("最小値:"+ Min());
	System.out.println("範囲:"+ hani());
	System.out.println("平均:"+ average());
	System.out.println("合計:"+ Sum());
	}
//	最大値メソッド
	public static int Max(){
		int x1 = 0;
		int y1 = 0;
		for(int i = 0; i < date.length - 1; i++){
			if(date[i] == Math.max(date[i],date[i+1])){
				x1 = date[i];
			}else{
				y1 = date[i+1];
			}
			 y1 = Math.max(x1,y1);
		}
		return y1;	
	}
//	最小値メソッド
	public static int Min(){
		int x2 = 0;
		int y2 = 0;
		for(int k = 0; k < date.length -1; k++){
			if(date[k] == Math.min(date[k],date[k+1])){
				x2 = date[k];
			}else{
				y2 = date[k+1];
			}
			 y2 = Math.min(x2,y2);
		}
		return y2;		
	}
//	範囲メソッド
	public static int hani(){
		int x3 = 0;
		x3 = Math.abs(Max()-Min());
		return x3;
	}
//　　合計メソッド
	public static int Sum(){
		int sum1 = 0;
		for(int n = 0; n <= date.length-1;n++){
			sum1 = sum1 + date[n];
		}
		return sum1;
	}
//	平均値メソッド
	public static int average(){
		int average1 = 0;
		average1 = Sum()/date.length;
		return average1;
	}
	
	
}
