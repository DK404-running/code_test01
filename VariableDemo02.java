/*
	变量使用的注意事项：
		变量名不能重复
		long类型的变量定义的时候，为了防止整数过大，后面要加L
		float类型的变量定义的时候，为了防止类型不兼容，后面要加F
*/
public class VariableDemo02{
public static void main (String[] args){
	//定义byte类型的变量
	byte b = 10;
	System.out.println(b);
	System.out.println(--------------);
	
	//定义short类型的变量
	short s = 32767;
	System.out.println(s);
	System.out.println(--------------);
	
	//定义int类型的变量
	int i= 2147483647;
	System.out.println(i);
	System.out.println(--------------);
	
	//定义long类型的变量
	long l= 1000100000000L;
	System.out.println(l);
	System.out.println(--------------);
	
	//定义float类型的变量
	float f= 520.1314F;
	System.out.println(f);
	System.out.println(--------------);
}
}