public class Test21_enum {
    enum Day {
        MO, TU, WE, TH, FR, SA, SU
    }

    enum Type {
        SCIENCE, BELLETRE, FANTASY, SCIENCE_FICTION;

    }

    static class Book_e {
        String name;
        String author;
        Type bookType;

        Book_e(String name, String author, Type type) {
            this.name = name;
            this.author = author;
            bookType = type;
        }
    }

    public static void main(String[] args) {
//        Day current = Day.TU;
//        System.out.println(current);

        Book_e b1 = new Book_e("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.println(" Work: " + b1.name + "; Author " + b1.author + "; Type: " + b1.bookType);

        switch (b1.bookType) {
            case BELLETRE:
                System.out.println("BELLETRE");
                break;
            case SCIENCE:
                System.out.println("SCIENCE");
                break;
            case FANTASY:
                System.out.println("FANTASY");
                break;
        }

    }
}
