public class TradingItem {
    String name;
    String overdue;

    public TradingItem(String category, String itemName) {
        this.name = category;
        overdue = itemName;
    }

    public void accept(NodeVisitor visitor) {
        visitor.visitTrading(this);
    }
}
