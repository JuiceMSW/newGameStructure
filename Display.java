import javax.swing.JFrame;

public class Display {
    private JFrame _frame;
    private String _title;
    private int _width, _height;

    public Display(String title, int width, int height) {
        _title = title;
        _width = width;
        _height = height;

        _createDisplay();
    }

    private void _createDisplay() {
        _frame = new JFrame(_title);
        _frame.setSize(_width, _height);
        //Necessary to properly handle and display the window
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setVisible(true);
        //Optional variables that limit user control over the window size and centers the screen
        _frame.setResizable(false);
        _frame.setLocationRelativeTo(null);
    }
}