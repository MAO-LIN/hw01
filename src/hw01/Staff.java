package hw01;

public class Staff {
	private String name, position, sex, id;

	public Staff(String id1,String name1,String sex1,String position1){
			id=id1;
			name=name1;
			sex=sex1;
			position=position1;
	}

	public void setName(String name1) {
		name = name1;
	}

	public void setPosition(String position1) {
		position = position1;
	}

	public void setSex(String sex1) {
		sex = sex1;
	}
	public void setId(String id1) {
		id = id1;
	}
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String getSex() {
		return sex;
	}

	public void showInfo() {
		System.out.println(getId()+"\t"+getName()+"\t"+getSex()+"\t"+getPosition());
	}

}
