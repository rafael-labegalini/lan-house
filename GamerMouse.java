public class GamerMouse extends Mouse {
    private int dpi;

    public GamerMouse(int dpi) {
        super();
        this.dpi = dpi;
    }

    @Override
    void mover(int x, int y) {
        this.setX(x * this.dpi);
        this.setY(y * dpi);
    }
    
}
