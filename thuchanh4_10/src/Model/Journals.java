package Model;

public class Journals extends Book {
    private String researchField;
    private boolean isMonthly;

    public Journals(String bookId, String author, String name, double price, String edition, String dateOfPurchase, String rackNo, String researchField, boolean isMonthly) {
        super(bookId, author, name, price, edition, dateOfPurchase, rackNo);
        this.researchField = researchField;
        this.isMonthly = isMonthly;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        if (researchField != null && !researchField.isEmpty()) {
            this.researchField = researchField;
        }
    }

    public boolean isMonthly() {
        return isMonthly;
    }

    public void setMonthly(boolean isMonthly) {
        this.isMonthly = isMonthly;
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Journal [researchField=" + researchField + ", isMonthly=" + isMonthly + "]");
    }
}
