import javax.swing.*;
import java.awt.*;

public class addsub {

    addsub()
    {
        JFrame jframe = new JFrame();
        JTextField textField1 = new JTextField(15);
        JTextField textField2 = new JTextField(15);
        JButton button1 = new JButton("Add");
        JButton button2 = new JButton("Sub");
        jframe.setLayout(new GridBagLayout());
        jframe.setSize(200,200);

    }
}
