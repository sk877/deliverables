package janken2;
import java.util.Scanner;
import java.util.Random;


public class JankenClass {
	
	// �萔�̐錾
	final int GU = 0;
    final int CHO = 1;
    final int PA = 2;
	        
    // �ϐ��̐錾
    static String gu = "�O�[";
    static String cho = "�`���L";
    static String pa = "�p�[";
    
    // ���͒l
    static String nyuRyoku = "";
    
    // �񓚒l
    static String kaitou = "";
    
     // Scanner�N���X�̃C���X�^���X���쐬
    // �����ŕW������System.in���w�肷��
    static Scanner scanner = new Scanner(System.in);
	
	public static void main(String args[]) {
		
        
        System.out.println("����񂯂�");
        
     // ���͂�����
	    System.out.print("���͂��Ă������� > ");

	    //���͂��ꂽ���e���C���X�^���X����擾
	    String input_text = scanner.nextLine();
	    nyuRyoku = input_text;
	 
		
		// �͈͂��O����Q�Ɏw��
		Random r = new Random();
		int i = r.nextInt(2);
		if (i == 0) {
			kaitou = gu;
		}else if (i == 1) {
			kaitou = cho;
		}else if (i == 2) {
			kaitou = pa;
		}
		

	    //���͂��ꂽ���e����ʂɕ\��
	    System.out.println("�ۂ�I�I");
	    System.out.println("���^�V�n" + kaitou + "�������܂���");
	    
	    if (kaitou.equals(nyuRyoku)) {
	    	System.out.println("˷ܹ");
	    }else if ((kaitou.equals(gu) && nyuRyoku.equals(pa)) || 
	    (kaitou.equals(cho) && nyuRyoku.equals(gu)) ||
	    (kaitou.equals(pa) && nyuRyoku.equals(cho) )) {
	    	System.out.println("��");
	    }else if ((kaitou.equals(gu) && nyuRyoku.equals(cho)) || 
	    	    (kaitou.equals(cho) && nyuRyoku.equals(pa))||
	    	    (kaitou.equals(pa) && nyuRyoku.equals(gu) )){
	    	System.out.println("�}�P");
	    }
	}
	
	
	static void nyuRyoku(){
		
		
	}
	
	
}

	