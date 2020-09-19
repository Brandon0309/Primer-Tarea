import javax.swing.*;

public class Client {

    public static void main(String[] args) {

        ClientWindow window=new ClientWindow();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class ClientWindow extends JFrame{

    public ClientWindow(){

        setBounds(600,300,280,350);

        ClientWindowLayer windowLayer=new ClientWindowLayer();

        add(windowLayer);

        setVisible(true);
    }
}

class ClientWindowLayer extends JPanel{

    public ClientWindowLayer(){

        JLabel text=new JLabel("Client");

        add(text);

        textField=new JTextField(20);

        add(textField);

        button=new JButton("Send");

        add(button);

    }

    private JTextField textField;

    private JButton button;
}

