public class Test20_EventHandler {

    public static void main(String[] args) {


        abstract class EventHandler2 {
            void execute() {
                System.out.println("I'm here");
            }
        }

        class Button {
            final EventHandler2 handler;

            Button(EventHandler2 action) {
                this.handler = action;
            }

            public void click() {
                handler.execute();
            }
        }
        Button tvButton = new Button(new EventHandler2() {
            private boolean on = false;

            public void execute() {

                if (on) {
                    System.out.println("TV is on");
                    on = false;
                } else {
                    System.out.println("TV is off");
                    on = true;
                }
            }

        });


        Button printButton = new Button(new EventHandler2() {
            @Override
            void execute() {
                System.out.println("Printing is proceeding");
            }
        });


        tvButton.click();
        printButton.click();
        tvButton.click();

    }
}