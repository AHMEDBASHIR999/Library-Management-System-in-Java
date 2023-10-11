//Implement this class with these private members
// id, name, gender
public class Member {
	private int id;
	private String name;
	private String Gender;
	public Member(int id, String name, String Gender) {
		super();
		this.id = id;
		this.name = name;
		this.Gender = Gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", Gender=" + Gender + "]";
	}
	
}
