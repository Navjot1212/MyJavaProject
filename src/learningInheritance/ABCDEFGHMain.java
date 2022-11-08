package learningInheritance;

import learningInheritance2.*;

public class ABCDEFGHMain {

	public static void main(String[] args) {
		H h = new H();
		G g = new G();
		F f = new F();
		E e = new E();
		D d = new D();
		C c = new C();
		B b = new B();
		A a = new A();
		System.out.println("Class A can acess only " + a.a);
		System.out.println("Class B can acess " + b.a + " and " + b.b);
		System.out.println("Class C can acess " + c.a + " and " + c.b);
		System.out.println("Class D can acess " + d.a + " , " + d.b + " and " + d.d);
		System.out.println("Class E can acess " + e.b + " and " + e.d);
		System.out.println("Class F can acess " + f.b + " and " +f.d);
		System.out.println("Class G can acess " + g.b + " and " + g.d);
		System.out.println("Class H can acess " + h.b + " , " + h.d+ " and "+h.h );

	}
}
