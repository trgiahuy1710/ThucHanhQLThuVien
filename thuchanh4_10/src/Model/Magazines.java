package Model;

public class Magazines extends Book {
    private String genre;
    private String frequency; // Có thể là hàng tuần, hàng tháng,...

    public Magazines(String bookId, String author, String name, double price, String edition, String dateOfPurchase, String rackNo, String genre, String frequency) {
        super(bookId, author, name, price, edition, dateOfPurchase, rackNo);
        this.genre = genre;
        this.frequency = frequency;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre != null && !genre.isEmpty()) {
            this.genre = genre;
        }
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        if (frequency != null && !frequency.isEmpty()) {
            this.frequency = frequency;
        }
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Magazines [genre=" + genre + ", frequency=" + frequency + "]");
    }
}
