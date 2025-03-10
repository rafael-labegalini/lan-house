abstract public class Mouse {
    private int x;
    private int y;

    public Mouse() {
        this.x = 0;
        this.y = 0;
    }

    abstract void mover(int x, int y);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}