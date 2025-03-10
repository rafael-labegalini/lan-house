public class MechanicalKeyboard extends Keyboard {

    public MechanicalKeyboard() {
        super();
        this.acenderLed();
    }

    public void digitar() {
        this.fazerClick();
        System.out.println("Estou digitando");
    }

    private void fazerClick() {
        System.out.println("click");
    }

    private void acenderLed() {
        System.out.println("Acendendo leds...");
    }
}