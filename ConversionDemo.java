public class ConversionDem0{
	public static void main(String[] args){
		//自动转换类型
		double d = 10;
		System.out.println(d);
		//小转大可自动转换
		byte b = 10;
		short s = b;
		int i = s;
		/*
		char c = b;
		char为字符类型，大小为两个字节，
						与数符类型byte（单字节）、
						short（双字节）不兼容。
						byte、short有一个符号位，正数部分少于char，char不能表示负数。*/
		
		System.out.println(i);
		System.out.println(b);
		/*
			强制转换：
				目标数据类型 变量名 = （目标数据类型）值或者变量;
				不建议，会导致部分数据丢失。
		*/
		int k = (int)88.88;
		System.out.println(k);
	}
	
}