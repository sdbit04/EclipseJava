package Pkg1;

public class First_class   {

	int a, b;
	public First_class(int i, int j) {
		a=i;
		b=j;
	}

public boolean IfTrue(First_class f)
{
	if (!(f instanceof First_class) )
		throw new ClassCastException  ("input object is not a First_class") ; 
	return (f.a == a && f.b == b);
	 
}

public static void main (String[] args) 
{
	First_class obj1 = new First_class(200,300);
	First_class obj2 = new First_class(200, 300);
	First_class obj3 = new First_class(20, 30);

	System.out.println(obj1.IfTrue(obj2));
	System.out.println(obj1.IfTrue(obj3));

}

//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	if (!(o instanceof First_class) )
//		throw new ClassCastException  ("o is not a First_class") ; 
//	 if(a == ((First_class) o).a) return 0;
//	return 1;
//}
//
//public int getA() {
//	return a;
//}


}