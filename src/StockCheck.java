
public class StockCheck {
	boolean milkAvailable = false;

	void SetMilkStock(boolean milkStock) {
		this.milkAvailable = milkStock;
	}

	boolean isMilkAvailable() {
		if (milkAvailable == true) {
			return true;
		}
		return false;
	}

}
