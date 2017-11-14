/**
 * 
 */
package mamin;

/**
 * @author miner
 *@package_name:chenchen
*@file_name:十六进制转换十进制.java
*@date-time:2017年11月14日下午1:48:41
*@location:https://github.com/1508010207/miner.git
 */
import java.util.Scanner;
class Exchange{
	String s;
	private int y;
	Exchange(){}
	Exchange(String s){this.s=s;}
	int getY(){return y;}
	void setY(int y){this.y=y;}
	void Change16to10(){
		int y=0;
		int i,k;
		for(i=0;i<s.length();i++){
			k=Change(s.charAt(i));
			y+=k*Math.pow(16,s.length()-(i+1));
		}
		System.out.println(y);
		System.out.println("成功转换");
	}
	int Change(char h){
		int x;
		switch(h){
		case'0':x=0;break;
		case'1':x=1;break;
		case'2':x=2;break;
		case'3':x=3;break;
		case'4':x=4;break;
		case'5':x=5;break;
		case'6':x=6;break;
		case'7':x=7;break;
		case'8':x=8;break;
		case'9':x=9;break;
		case'a':x=10;break;
		case'b':x=11;break;
		case'c':x=12;break;
		case'd':x=13;break;
		case'e':x=14;break;
		case'f':x=15;break;
		default:throw new Exception();
		}
		return x;
	}
}
class Exception extends RuntimeException{
	public Exception(){}
	public Exception(String msg){
		super(msg);
	}
	public void printcount(){
		System.out.println("16 进制数输入不正确！");
	}
}
public class 十六进制转换十进制 {
	public static void main(String[] args){
		System.out.println("请输入一个16进制数：");
		Scanner S=new Scanner(System.in);
		String s=S.next();Exchange E=new Exchange(s);
		try{
			E.Change16to10();
		}
		catch(Exception e){
			e.printcount();
		}
		}
	}