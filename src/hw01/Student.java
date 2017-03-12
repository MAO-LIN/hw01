package hw01;

class Student {
	private String name, id, email;

	public Student(String name1, String id1, String email1) {
		name = name1;
		id = id1;
		email = email1;
	}

	public void setname(String name2) {

		name = name2;
	}

	public void setid(String id2) {
		id = id2;
	}

	public void setemail(String email2) {
		email = email2;
	}

	public String getname() {
		return name;
	}

	public String getid() {
		return id;
	}

	public String getemail() {
		return email;
	}

	public void showAll() {
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("email:" + email);
	}
}
