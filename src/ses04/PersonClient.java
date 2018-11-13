package ses04;

public class PersonClient {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.cnp = "123456";
		p1.name = "Vlad";
		System.out.println(p1.name);
		System.out.println(p2.name);

		Person p3 = null;
		System.out.println(p3name);
		p3 = p1;
		System.out.println(p3.name);
		p3.name = "Ion";
		System.out.println(p1.name);
	}
}
