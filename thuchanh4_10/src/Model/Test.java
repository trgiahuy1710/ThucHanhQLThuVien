package Model;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho StudyBooks
        System.out.println("Enter study book details:");
        System.out.print("Book ID: ");
        String bookId = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng thừa
        System.out.print("Edition: ");
        String edition = scanner.nextLine();
        System.out.print("Date of Purchase: ");
        String dateOfPurchase = scanner.nextLine();
        System.out.print("Rack No: ");
        String rackNo = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Grade Level: ");
        int gradeLevel = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng thừa

        // Tạo đối tượng StudyBooks
        StudyBooks studyBook = new StudyBooks(bookId, author, name, price, edition, dateOfPurchase, rackNo, subject, gradeLevel);
        studyBook.displayBookDetails();

        // Nhập thông tin cập nhật cho Journal
        System.out.println("\nEnter journal details to update:");
        System.out.print("Book ID: ");
        String journalBookId = scanner.nextLine();
        System.out.print("Author: ");
        String journalAuthor = scanner.nextLine();
        System.out.print("Name: ");
        String journalName = scanner.nextLine();
        System.out.print("Price: ");
        double journalPrice = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng thừa
        System.out.print("Edition: ");
        String journalEdition = scanner.nextLine();
        System.out.print("Date of Purchase: ");
        String journalDateOfPurchase = scanner.nextLine();
        System.out.print("Rack No: ");
        String journalRackNo = scanner.nextLine();
        System.out.print("Research Field: ");
        String researchField = scanner.nextLine();
        System.out.print("Is Monthly (true/false): ");
        boolean isMonthly = scanner.nextBoolean();
        scanner.nextLine(); // Đọc bỏ dòng thừa

        // Tạo đối tượng Journal
        Journals journal = new Journals(journalBookId, journalAuthor, journalName, journalPrice, journalEdition, journalDateOfPurchase, journalRackNo, researchField, isMonthly);

        // Cập nhật thông tin studyBook với journal
        studyBook.updateStatus(journal);

        // Hiển thị thông tin studyBook sau khi cập nhật
        System.out.println("\nStudy book details after update:");
        studyBook.displayBookDetails();
    }
}
