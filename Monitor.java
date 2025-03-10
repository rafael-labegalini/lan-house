public abstract class Monitor {
    private int frequencia;

    public Monitor(int frequencia) {
        this.frequencia = frequencia;
    }

    public void display() {
        System.out.println("Exibindo imagem");
    }
}
