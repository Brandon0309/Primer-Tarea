import javax.swing.*;
import java.awt.*;

public class Server {

    public static void main(String[] args) {

        ServerWindow window=new ServerWindow();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class ServerWindow extends JFrame{

    public ServerWindow(){

        setBounds(1200,300,280,350);

        JPanel windowLayer=new JPanel();

        windowLayer.setLayout(new BorderLayout());

        textArea=new JTextArea();

        windowLayer.add(textArea,BorderLayout.CENTER);

        add(windowLayer);

        setVisible(true);

    }

    private JTextArea textArea;
}
