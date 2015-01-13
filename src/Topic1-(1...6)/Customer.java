public class Customer {

	private String name;
	private String email;
	private String pass;
	private int creditNumber;

	public Customer(String name, String email, String pass, int creditNumber) {

		this.setName(name);
		this.setCreditNumber(creditNumber);
		this.setEmail(email);
		this.setPass(pass);
	}

	public String getInfo() {
		return "Customer information: \n -Name :" + this.getName() + "\n -Email:" + this.getEmail();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @return the creditNumber
	 */
	public int getCreditNumber() {
		return creditNumber;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param pass
	 *            the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @param creditNumber
	 *            the creditNumber to set
	 */
	public void setCreditNumber(int creditNumber) {
		this.creditNumber = creditNumber;
	}

}
