public class ConversionDem0{
	public static void main(String[] args){
		//�Զ�ת������
		double d = 10;
		System.out.println(d);
		//Сת����Զ�ת��
		byte b = 10;
		short s = b;
		int i = s;
		/*
		char c = b;
		charΪ�ַ����ͣ���СΪ�����ֽڣ�
						����������byte�����ֽڣ���
						short��˫�ֽڣ������ݡ�
						byte��short��һ������λ��������������char��char���ܱ�ʾ������*/
		
		System.out.println(i);
		System.out.println(b);
		/*
			ǿ��ת����
				Ŀ���������� ������ = ��Ŀ���������ͣ�ֵ���߱���;
				�����飬�ᵼ�²������ݶ�ʧ��
		*/
		int k = (int)88.88;
		System.out.println(k);
	}
	
}