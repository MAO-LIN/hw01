package hw01;

class Teacher {
	private String id,name,position,email;

	public Teacher(String id1, String name1, String position1,String email1) {
		name = name1;
		id = id1;
		position = position1;
		email = email1;
	}
	
	public void setId(String id1) {
		id = id1;
	}

	public void setName(String name1) {

		name = name1;
	}

	public void setPosition(String position1) {
		position = position1;
	}

	public void setEmail(String email1) {
		email = email1;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
	
	public String getPosition() {
		return position;
	}

	public String getEmail() {
		return email;
	}

	public void show() {
		System.out.println(id +"\t"+name+"\t"+position+"\t"+email);
//		System.out.println("email:" + email);
	}
}
