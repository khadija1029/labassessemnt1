import java.util.Arrays;

public class Book extends LibraryItem {
    int PageCount;

    public int getPageCount() {
        return PageCount;
    }

    public void setPageCount(int pageCount) {
        PageCount = pageCount;
    }

    public Book(String title, String author, int year, Boolean isborrowed, LibraryItemType libraryitem, int pageCount) {
        super(title, author, year, isborrowed, libraryitem);
        PageCount = pageCount;
    }

    //@Override
//    public String toString() {
//        return "Book{" +
//                "PageCount=" + PageCount +
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
