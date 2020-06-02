public class Test21_enum3 {
    enum Color {
        RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
        private String code;
        Color(String code){
            this.code = code;
        }
        public String getCode(){return code;}
    }
    public static void main(String[] args) {

        System.out.println(Color.RED.getCode());
        System.out.println(Color.GREEN.getCode());
    }
}


