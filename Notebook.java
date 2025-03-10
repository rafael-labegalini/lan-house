public class Notebook implements ComputadorPadrao {
    private IntegratedKeyboard integratedKeyboard;
    private IntegratedMonitor integratedMonitor;
    private IntegratedMouse integratedMouse;

    public Notebook(IntegratedKeyboard integratedKeyboard, IntegratedMonitor integratedMonitor, IntegratedMouse integratedMouse) {
        this.integratedKeyboard = integratedKeyboard;
        this.integratedMonitor = integratedMonitor;
        this.integratedMouse = integratedMouse;
    }

    public void exibirNoDisplayIntegrado() {
        this.integratedMonitor.display();
    }

    public void digitarNoTecladoIntegrado() {
        this.integratedKeyboard.digitar();
    }

    public void moverTrackpad() {
        this.integratedMouse.mover(300, 600);
    }

    @Override
    public void exibirImagem() {
        this.exibirNoDisplayIntegrado();
    }

    @Override
    public void moverMouse() {
        this.moverTrackpad();
    }

    @Override
    public void digitarNoTeclado() {
        this.digitarNoTecladoIntegrado();
    }
}
