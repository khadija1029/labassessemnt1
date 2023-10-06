import java.util.Arrays;

public class LibraryItem extends Library {
    String title;
    String author;
    int year;
    Boolean isborrowed;
    LibraryItemType libraryitem;

    public LibraryItem(String title, String author, int year, Boolean isborrowed, LibraryItemType libraryitem) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isborrowed = isborrowed;
        this.libraryitem = libraryitem;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Boolean Isborrowed() {
        return isborrowed;
    }

    public void setIsborrowed(Boolean isborrowed) {
        this.isborrowed = isborrowed;
    }

    public LibraryItemType getLibraryitem() {
        return libraryitem;
    }

    public void setLibraryitem(LibraryItemType libraryitem) {
        this.libraryitem = libraryitem;
    }
    public boolean equals(Object o){
        LibraryItem item = (LibraryItem) o;
        if(item.title.equals(this.title)){
            return true;
        }else
            return false;

    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", libraryitem=" + libraryitem +
                '}';
    }
}
