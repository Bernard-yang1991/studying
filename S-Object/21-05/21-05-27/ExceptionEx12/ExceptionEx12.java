class ExceptionEx12 {
	public static void main (String[] args)	throws Exception	{
		method1();	// ���� Ŭ�������� static�ɹ��̹Ƿ� ��ü�������� ���� ȣ�� ����.
	}	// main�޼����� ��
	
	static void method1() throws Exception	{
		method2();
	}// method1�� �P
	static void method2()	throws Exception 	{
		throw new Exception	();
	}	//method2�� ��
}