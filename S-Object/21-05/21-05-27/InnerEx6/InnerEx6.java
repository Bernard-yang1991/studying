class InnerEx6 	{
	Object iv = new Object () { void method () {} } ; 	//�͸�Ŭ����
	static Object cv = new Object () { void method () {};	//�͸�Ŭ����
	
	void myMethod() {
		Object lv = new Object () { void method () {} } ; 	//�͸�Ŭ����
	}
	}
}

//�����Ͻ� InnerEx6.class InnerEx6$1.class InnerEx6$2.class InnerEx6$3.class �� �������� Ŭ�������ϸ��� �����ȴ�.