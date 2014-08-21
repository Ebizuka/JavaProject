package Lesson3;
// オブジェクト指向１
public class Sample4{
	public static void main(String[] args) {
		Function1 point = new Function1();
		Function2 point2 = new Function2(4.0,5.0);
		point.x = 5.0;
		point.y = 6.0;
//		point2.x = 3.0;
//		point2.y = 4.0;
		System.out.println("Function1は" + point.x +"と" + point.y);
		System.out.println("Function2は" + point2.x +"と" + point2.y);
		point2.show();
		
	}

}
