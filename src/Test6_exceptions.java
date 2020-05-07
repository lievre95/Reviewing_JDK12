class Test6 {
    public static void main(String args[]) {
        try {
           int[] numbers = new int[3];
//           numbers[4] = 54;
           numbers[5] = Integer.parseInt("sss");

        }
//        catch (IndexOutOfBoundsException ex) {
//            System.out.println("Выход за пределы массива");
//        }
        catch (NumberFormatException ex){
            System.out.println("Ошибка преобразования из строки в число");
        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }
//        finally {
//            System.out.println("jopa");
//        }
    }

}