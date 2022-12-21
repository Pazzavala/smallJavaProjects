package JavaSwing.FRAME;

public class GUI {
    public static void main(String[] args) {
//        JFrame - a GUI window to add components to.

//        We can either create whole frame here or make a separate class to create a frame.

//        JFrame frame = new JFrame();    // Creates a frame
//        frame.setTitle("JFrame title goes here");
//        // This will actually stop the whole program instead of just hiding our frame.
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Default: JFrame.HIDE_ON_CLOSE Other: DO_NOTHING_ON_CLOSE
//        frame.setResizable(false);  // Prevent from resizing frame
//        frame.setSize(420, 420);    // Sets x dimension and y dimension of frame
//
//        ImageIcon image = new ImageIcon("Adidas_Logo.svg.png"); // This will create an image icon
//        frame.setIconImage(image.getImage());   // Change icon of frame
//
//        frame.getContentPane().setBackground(Color.BLACK);
//        frame.getContentPane().setBackground(new Color(32,10,87));
//        frame.getContentPane().setBackground(new Color(0xFF2842));
//
//        frame.setVisible(true);     // Make frame visible when we run the code

//        Create a frame from our class
        MyFrame myframe = new MyFrame();

//        Another Way if you don't actually need to modify any longer
        new MyFrame();
    }
}
