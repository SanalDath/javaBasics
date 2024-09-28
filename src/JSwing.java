import javax.swing.*;

public class JSwing {
    public static void main(String[] args){
        JFrame frame = new JFrame("My first GUI");
        frame.setSize(280, 300);

        JLabel label = new JLabel("Click buttons");
        JTextField textField = new JTextField("Enter text here");

        JButton button1 = new JButton("Create");
        JButton button2 = new JButton("Read");
        JButton button3 = new JButton("Update");
        JButton button4 = new JButton("Delete");

        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(textField);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        frame.add(panel);
        frame.show();
    }
}
