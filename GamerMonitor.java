public class GamerMonitor extends Monitor {
    public GamerMonitor() {
        super(175);
        this.ligarLed();
    }

    private void ligarLed() {
        System.out.println("Ligando LEDS RGB...");
    }
}
