import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainLayout {
    private JTextField selectYourOptionsTextField;
    private JButton sendEncryptedMessageButton;
    private JButton decryptMessageButton;
    private JButton keyManagementButton;
    private JPanel mainView;

    public mainLayout() {
        sendEncryptedMessageButton.addActionListener(new encryptMessageLayout());

    }
    // TODO: add encrypted message layout to the mainLayout GUI
    private class encryptMessageLayout implements ActionListener {
        //TODO: implement crypto here


    }

    //TODO: similar layout above. But needs to be implemented
    private class decryptMessageLayout implements ActionListener {
        //TODO: implement crypto here too

    }

    private class keyManager implements  ActionListener {
        //TODO: implement crypto here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainLayout");
        frame.setContentPane(new mainLayout().mainView);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}


