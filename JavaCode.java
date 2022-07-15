public class JavaCode{
	/*结果类型取决与参加运算的最大类型,
	bety short char会被自动提升为int类型*/
	public static void main (String[] args){
	int i = 10 ;
	double k = i + 13.14 ;
		System.out.println(k);
		System.out.println("hello" + k);
		System.out.println("加油" + 8 + 88);
		System.out.println("加油" + 8.8 + 6.6);
		System.out.println(8.8 + 6.6+"hello");

		//+= 把左右相加的结果赋值给左边
		//隐含强制类型转换，强转为左边数值类型
		int n = 20;
		short s = 5 ;
		short f = 6 ;
		n += n + s;
		System.out.println("f:"+f);
		
		//判断：关系运算符，输出为布尔常量，true/false
		//==判断是否相等，!=判断左右是否不相等，类似还有>= <=
		int c = 1 ;
		System.out.println(f==s+c);
		
		/*
			逻辑运算符
			& 逻辑"与"
			| 逻辑"或"
			^ 逻辑"异或"，同为false，不同为true
			! 逻辑"非"
		*/
		System.out.println((i>k) & (f<n));
		System.out.println("-----------");
		
		/*
			短路与 && 左边为真，则继续执行右边，否则右边不执行
			短语或 || 左边为假，则继续执行右边，否则右边不执行
		*/
		System.out.println((i++ > k) && (s++ < k ));
		System.out.println("s:"+s);
		System.out.println((i++ < k) || (s++ < k ));
		System.out.println("i:"+i );
		System.out.println("s:"+s);
		System.out.println((i++ > k) || (s++ < k ));
		System.out.println("i:"+i );
		System.out.println("s:"+s);
		
		
		/*
			三元运算符
			关系表达式 ? 表达式1 ： 表达式2
			运行关系表达式，结果为true则运行表达式1，false则运行表达式2
		*/
		//比较得出三个数值的最大值并输出
		int one = 8 ;
		int two = 6 ;
		int three = 9 ;
		int max = one>two ? one : two ;
		max = max > three ? max : three; 
			System.out.println("max:"+max);
		
	}
}