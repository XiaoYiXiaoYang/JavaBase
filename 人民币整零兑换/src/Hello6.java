import java.util.Scanner;

/**
 * 
 * @����	��������Ǯ���һ�����Ǯ
 * @����
 * @ʱ�� 1.27
 *
 */
public class Hello6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("������Ǯ��");
	double money = input.nextDouble();
	
	//Բ
	int yuan = (int)money;
	int numOfshiyuan = yuan / 10; //10Ԫֽ�ҵ�����
	int numOfwuyuan = yuan % 10 / 5; //5Ԫֽ�ҵ�����
	int numOfyiyuan = yuan % 10 -5;  //һԪֽ�ҵ�����
	
	//��
	int jiao = ((int)(money * 10)) % 10;
	int numOfwujiao = jiao / 5;	//	���ֽ�ҵ�����
	int numOfyijiao = jiao - 5;	//һ��ֽ�ҵ�����
	System.out.println("ʮԪֽ�ҵ�����" + numOfshiyuan);
	System.out.println("��Ԫֽ�ҵ�����" + numOfwuyuan);
	System.out.println("һԪֽ�ҵ�����" + numOfyiyuan);
	System.out.println("���ֽ�ҵ�����" + numOfwujiao);
	System.out.println("һ��ֽ�ҵ�����" + numOfyijiao);
	}

}
