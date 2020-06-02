public class Test21_enum2 {
    enum Type {
        SCIENCE, BELLETRE, FANTASY, SCIENCE_FICTION;

    }
    public static void main(String[] args) {

        Type[] types = Type.values();
        for (Type s :types){
            System.out.println(s);

        }
        System.out.println(Type.FANTASY.ordinal());
    }
}


