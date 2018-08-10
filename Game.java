public class Game {
    private Display _display;

    public int width, height;

    public Game(String title, int width, int height) {
        this.width = width;
        this.height = height;

        _display = new Display(title, width, height);
    }
}