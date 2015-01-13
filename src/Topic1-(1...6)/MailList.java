import java.util.ArrayList;

public class MailList {
	private String emailManager;
	private ArrayList<Notification> Msjs;

	public MailList(String emailManager) {
		this.setMsjs(new ArrayList<Notification>());
		this.setEmailManager(emailManager);
	}

	public void SendEmail(String title, String body) {
		Notification n1 = new Notification(title, body);
		this.getMsjs().add(n1);

	}

	public String showNotification() {
		String head = " - Notifications -\n";
		String body = "";
		for (int i = 0; i < this.getMsjs().size(); i++) {

			body += this.getMsjs().get(i).show() + "\n";
		}
		return head + body;

	}

	/**
	 * @return the emailManager
	 */
	public String getEmailManager() {
		return emailManager;
	}

	/**
	 * @param emailManager
	 *            the emailManager to set
	 */
	public void setEmailManager(String emailManager) {
		this.emailManager = emailManager;
	}

	/**
	 * @return the msjs
	 */
	public ArrayList<Notification> getMsjs() {
		return Msjs;
	}

	/**
	 * @param msjs
	 *            the msjs to set
	 */
	public void setMsjs(ArrayList<Notification> msjs) {
		Msjs = msjs;
	}

}
