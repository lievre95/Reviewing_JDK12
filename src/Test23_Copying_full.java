class Book_full_Clone implements Cloneable {
    private String name;
    private Author_copy author;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String a) {
        author.setName(a);
    }

    public String getAuthor() {
        return author.getName();
    }

    Book_full_Clone(String name, String author) {
        this.name = name;
        this.author = new Author_copy(author);
    }

    public String toString() {
        return "Book '" + name + "' (author " + author + ")";
    }
    public Book_full_Clone clone() throws CloneNotSupportedException{
        Book_full_Clone newBook = (Book_full_Clone)super.clone();
        newBook.author = (Author_copy) author.clone();
        return newBook;
    }
}

class Author_copy implements Cloneable {
    private String name;
    public Author_copy(String name) {
        this.name = name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }


    public Author_copy clone() throws CloneNotSupportedException{
        return (Author_copy) super.clone();
    }

}

class myMainClass17 {
    public static void main(String[] args) {
        try {
            Book_full_Clone book = new Book_full_Clone("War and Peace", "Lev Tolstoy");
            Book_full_Clone book2 = book.clone();
            book2.setAuthor("Ivan Turgenev");
            System.out.println(book.getAuthor());
            System.out.println(book2.getAuthor());
        } catch (CloneNotSupportedException ex) {
            System.out.println("Cloneable is not implemented");
        }
    }
}
