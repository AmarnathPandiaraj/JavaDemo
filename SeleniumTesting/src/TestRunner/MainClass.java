package TestRunner;

public class MainClass {
public static void main(String[] args) {
	int a=20;
	int b=10; 
	add obj1 = new add();
	obj1.addition(a, b);
	sub obj2 = new sub();
	obj2.substraction(a, b);
	multiply obj3 = new multiply();
	obj3.Multi(a, b);
}
}
