import java.util.ArrayList;

public class SaverTransaction {

	public ArrayList<ShoppingCart> HistoryTransaction;

	public SaverTransaction() {

		this.setHistoryTransaction(new ArrayList<ShoppingCart>());
	}

	public int CounterTransaction() {
		return this.getHistoryTransaction().size();
	}

	public boolean addSC(ShoppingCart SC) {
		this.getHistoryTransaction().add(SC);
		return true;
	}

	/**
	 * @return the historyTransaction
	 */
	public ArrayList<ShoppingCart> getHistoryTransaction() {
		return HistoryTransaction;
	}

	/**
	 * @param historyTransaction
	 *            the historyTransaction to set
	 */
	public void setHistoryTransaction(ArrayList<ShoppingCart> historyTransaction) {
		HistoryTransaction = historyTransaction;
	}

	public String showHistoricalTransaction() {
		String Description = "";
		for (int i = 0; i < this.getHistoryTransaction().size(); i++) {

			Description += this.getHistoryTransaction().get(i).description() + "\n";
		}
		return Description;

	}

}
