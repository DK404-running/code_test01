/*
	变量定义格式：
		数据类型 变量名 = 变量值;
		
	基本数据类型
		整数：bety(一个字节)八位
			short(两个字节)
			int(四个字节)
			long(八个字节)
			
		浮点数：
			float(四个字节)
			double(八个字节)六十四位
			
		字符：
			char (两个字节)0~2^16
			
		布尔：
			boolean(一个字节)true，false
*/
public class VariableDemo01{
	public static void main(String[] args){
		//定义变量
		int a=10;
		
		//输出变量
		System.out.println(a);
		System.out.println(----------);
		
		//修改变量
		a=20;
		System.out.println(a);
	}
}