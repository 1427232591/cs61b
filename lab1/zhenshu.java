import java.util.*;
public class zhenshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Jin=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int x=Jin.nextInt();
		if((x%3==0)&&(x%5==0)){
		System.out.println(x+"能被3和5整除");	
		}
		else
			System.out.println(x+"不能被3和5整除");
		

	}

}
