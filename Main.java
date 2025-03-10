public class Main {
    public static void main(String[] args) {

        PcGamer pcPraFortnite = new PcGamer(
            new MechanicalKeyboard(), 
            new GamerMonitor(),
            new GamerMouse(16000)
        );

        Notebook pcDeTrabalho = new Notebook(
            new IntegratedKeyboard(),
            new IntegratedMonitor(),
            new IntegratedMouse()
        );


        Usuario rafael = new Usuario();
        rafael.usarComputador(pcPraFortnite);
        rafael.usarComputador(pcDeTrabalho);

    }
}
