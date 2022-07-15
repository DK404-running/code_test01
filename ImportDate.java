/*
	数据输入：	
		导包：
		import java.util.Scanner;
		创建对象：
		Scanner sc = new Scanner (System.in);
		接受数据：
		int x = sc.nextint();
*/
//util 多功能工具包
//Scanner 扫描仪

import java.util.Scanner;

public class ImportDate{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	//创建对象
	
	System.out.println("请输入x的值");
	
	int x = sc.nextInt();
	//接收数据
	//小驼峰命名：变量、方法；标识符为多个单词时第一个首字母小写，其余首字母大写i；
	
	System.out.println("请输入y的值");
	int y = sc.nextInt();
	
	System.out.println("请输入z的值");
	int z=sc.nextInt();
	
	int max = x > y ? x : y ;
	max = max > z ? max : z;
	System.out.println("max:"+ max);
	}
}