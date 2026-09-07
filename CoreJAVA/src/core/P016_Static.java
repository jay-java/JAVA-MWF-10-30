package core;

class AA {
	static int i = 1;
	int id = 12;

	public void change() {
		i++;
		System.out.println(i);
	}

	public static void call() {
		System.out.println("call in AA class : ");
	}
}

public class P016_Static {
	public static void main(String[] args) {
		AA a = new AA();
		a.change();
		a.call();

		AA.call();
	}
}
