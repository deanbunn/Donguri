
class RPGGamer {

	private String firstName;
    private String lastName;
	public String displayName;
    private String emailAddress;
    private int age;

	public RPGGamer() {

	}


	public RPGGamer(String firstname, String lastname, String emailaddress, int age) {
	    this.firstName = firstname;
		this.lastName = lastname;
		this.displayName = firstname + " " + lastname;
		this.emailAddress = emailaddress;
		this.age = age;

	}

}
		
