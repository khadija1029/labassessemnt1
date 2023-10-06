public class Library {
    LibraryItem library[] = new LibraryItem[10];
    int counter = 0;

    public void addItem(LibraryItem item) {
        library[counter++] = item; //new LibraryItem(item.title, item.author, item.year, item.isborrowed, item.libraryitem);

    }

    public void borrowItem(LibraryItem item) {
        for(int i = 0; i<10; i++){
            if(library[i]!=null) {
                if (library[i].equals(item)) {

                    library[i].setIsborrowed(true);
            }
            }

        }
    }
    public void returnItem(LibraryItem item) {
        for(int x=0;x<10;x++){
            if(library[x]!=null) {
                if (library[x].equals(item)) {
                    library[x].setIsborrowed(false);
                }
            }

        }
    }

    public void displayItems() {
        int y = 0;
        for (int i=0;i<10;i++) {
            if(library[i]!=null) {
                System.out.println(library[i]);
                }

        }

    }
}
