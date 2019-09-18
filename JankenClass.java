package janken2;
import java.util.Scanner;
import java.util.Random;


public class JankenClass {
	
	// 定数の宣言
	final int GU = 0;
    final int CHO = 1;
    final int PA = 2;
	        
    // 変数の宣言
    static String gu = "グー";
    static String cho = "チョキ";
    static String pa = "パー";
    
    // 入力値
    static String nyuRyoku = "";
    
    // 回答値
    static String kaitou = "";
    
     // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
        
        System.out.println("じゃんけん");
        
     // 入力させる
	    System.out.print("入力してください > ");

	    //入力された内容をインスタンスから取得
	    String input_text = scanner.nextLine();
	    nyuRyoku = input_text;
	 
		
		// 範囲を０から２に指定
		Random r = new Random();
		int i = r.nextInt(2);
		if (i == 0) {
			kaitou = gu;
		}else if (i == 1) {
			kaitou = cho;
		}else if (i == 2) {
			kaitou = pa;
		}
		

	    //入力された内容を画面に表示
	    System.out.println("ぽん！！");
	    System.out.println("ワタシハ" + kaitou + "をだしました");
	    
	    if (kaitou.equals(nyuRyoku)) {
	    	System.out.println("ﾋｷﾜｹ");
	    }else if ((kaitou.equals(gu) && nyuRyoku.equals(pa)) || 
	    (kaitou.equals(cho) && nyuRyoku.equals(gu)) ||
	    (kaitou.equals(pa) && nyuRyoku.equals(cho) )) {
	    	System.out.println("ｶﾁ");
	    }else if ((kaitou.equals(gu) && nyuRyoku.equals(cho)) || 
	    	    (kaitou.equals(cho) && nyuRyoku.equals(pa))||
	    	    (kaitou.equals(pa) && nyuRyoku.equals(gu) )){
	    	System.out.println("マケ");
	    }
	}
	
	
	static void nyuRyoku(){
		
		
	}
	
	
}

	