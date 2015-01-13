import java.util.Calendar;

public class Notification {

	private String title;
	private Calendar date;
	private String body;

	public Notification(String title, String body) {

		this.setTitle(title);
		this.setDate(Calendar.getInstance());
		this.setBody(body);
	}

	public String show() {
		return (this.getTitle() + "\n" + this.getDate().getTime() + "\n" + this.getBody() + "\n");

	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

}
