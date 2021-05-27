class InnerEx6 	{
	Object iv = new Object () { void method () {} } ; 	//익명클래스
	static Object cv = new Object () { void method () {};	//익명클래스
	
	void myMethod() {
		Object lv = new Object () { void method () {} } ; 	//익명클래스
	}
	}
}

//컴파일시 InnerEx6.class InnerEx6$1.class InnerEx6$2.class InnerEx6$3.class 의 형식으로 클래스파일명이 결정된다.