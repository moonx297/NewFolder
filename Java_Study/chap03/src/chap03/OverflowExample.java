package chap03;

public class OverflowExample {

	public static void main(String[] args) {
	//	int x = 1000000;
	//	int y = 1000000;
	//	int z = x*y;
	//	System.out.println(z);
		
		long x = 1000000L; 			//왜 책에는 L을 붙혀야 한다고 설명이 나와있었는데 여기 예시에서는 L을 뺐나요?
		long y = 1000000L;
		long z = x * y;
		System.out.println(z);
		
				

	}

}
