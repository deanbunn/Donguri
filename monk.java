
class Monk {

	private String firstName;
        private String lastName;
        public String displayName;
	private int age;

	public Monk() {

	}

	public Monk(String firstname, String lastname, int age) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.displayName = firstname + " " + lastname;
                this.age = age;

	}
}
