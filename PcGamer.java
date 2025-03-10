public class PcGamer implements ComputadorPadrao {
    private MechanicalKeyboard mechanicalKeyboard;
    private GamerMonitor gamerMonitor;
    private GamerMouse gamerMouse;

    public PcGamer(MechanicalKeyboard mechanicalKeyboard, GamerMonitor gamerMonitor, GamerMouse gamerMouse) {
        this.mechanicalKeyboard = mechanicalKeyboard;
        this.gamerMonitor = gamerMonitor;
        this.gamerMouse = gamerMouse;
    }

    public void usarTeclado() {
        this.mechanicalKeyboard.digitar();
    }

    public void arrastarMouse() {
        this.gamerMouse.mover(200, 500);
    }

    public void exibirImagemComFPSVariavel() {
        this.gamerMonitor.display();
    }

    @Override
    public void exibirImagem() {
        this.exibirImagemComFPSVariavel();
    }

    @Override
    public void moverMouse() {
        this.arrastarMouse();
    }

    @Override
    public void digitarNoTeclado() {
        this.digitarNoTeclado();
    }
}
