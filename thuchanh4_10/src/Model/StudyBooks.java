package Model;

public class StudyBooks extends Book {
    private String subject;
    private int gradeLevel;

    public StudyBooks(String bookId, String author, String name, double price, String edition, String dateOfPurchase, String rackNo, String subject, int gradeLevel) {
        super(bookId, author, name, price, edition, dateOfPurchase, rackNo);
        this.subject = subject;
        this.gradeLevel = gradeLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject != null && !subject.isEmpty()) {
            this.subject = subject;
        }
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        if (gradeLevel > 0) {
            this.gradeLevel = gradeLevel;
        }
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("StudyBooks [subject=" + subject + ", gradeLevel=" + gradeLevel + "]");
    }
}
