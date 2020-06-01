public class Test20_interfaces_and_callback_engine{
    interface EventHandler{
        void execute();
    }

    static class ButtonClickHandler implements EventHandler{
        public void execute(){
            System.out.println("Button is pressed");
        }
    }

    static class Button{
        EventHandler handler;
        Button(EventHandler action){
            this.handler = action;
        }

        public void click(){
            handler.execute();
        }
    }

    public static void main(String[] args){
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
    }
}
//switching to java language level 11

