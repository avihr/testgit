package assignment4_201047016;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A(10,20);
		ob1.show();
		B ob2=new B(40,50,60);
		ob2.show();
	}
}

class A{
	int i,j;
	A(int a, int b)
	{
		i=a;
		j=b;
	}
	void show(){
		System.out.println("i and j:"+i+" "+j);
	}
}

class B extends A{
	int k;
	B(int a, int b, int c){
		
		super(a,b);
		k=c;
	}
	
	void show(){
		System.out.println("This is B");
		super.show();
		System.out.println("k:"+k);
	}
}
