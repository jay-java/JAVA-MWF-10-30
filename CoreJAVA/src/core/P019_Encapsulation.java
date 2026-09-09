package core;

//Object -> is a super class of java
class Users {

	private int id;
	private String name;
	private long contact;

	public Users() {
		System.out.println("def cons");
	}

	public Users(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id : " + id + " name : " + name + " contact : " + contact;
	}

}

public class P019_Encapsulation {
	public static void main(String[] args) {
		Users u1 = new Users();
		u1.setId(1);
		u1.setContact(9876543621l);
		u1.setName("java");
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		System.out.println(u1.getContact());
		System.out.println(u1);

		Users u2 = new Users(2, "python", 789456321);
		System.out.println(u2);

	}
}
