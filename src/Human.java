public class Human {
	private String name;
	private String gender;
	private int age;
	private int height;

	Human(String name, String gender, int age, int height) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
	}

	String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}
}
