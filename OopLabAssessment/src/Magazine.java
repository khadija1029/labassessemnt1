import java.util.Arrays;

public class Magazine extends LibraryItem {
    int issueNumber;

    public Magazine(String title, String author, int year, Boolean isborrowed, LibraryItemType libraryitem, int issueNumber) {
        super(title, author, year, isborrowed, libraryitem);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

//    @Override
//    public String toString() {
//        return "Magazine{" +
//                "issueNumber=" + issueNumber +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", year=" + year +
//                ", isborrowed=" + isborrowed +
//                ", libraryitem=" + libraryitem +
//                ", library=" + Arrays.toString(library) +
//                ", counter=" + counter +
//                '}';
//    }
}
