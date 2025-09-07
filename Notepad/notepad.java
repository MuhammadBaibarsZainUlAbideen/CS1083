import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Container;
public class notepad{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Blank window");
        JButton myButton = new JButton("Save");
        JFileChooser fileChooser = new JFileChooser();

        frame.setSize(400,300);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea(10,30);
        textArea.setLineWrap(true); 
        textArea.setWrapStyleWord(true); 
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane, BorderLayout.CENTER);
        myButton.setPreferredSize(new Dimension(150,50));
        frame.add(myButton,BorderLayout.NORTH);
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                fileChooser.setDialogTitle("Specify the file");
                int userSelection = fileChooser.showSaveDialog(null);
                File fileToSave = fileChooser.getSelectedFile();
                if (userSelection == JFileChooser.APPROVE_OPTION){
 
                    System.out.println("Save as file : " + fileToSave.getAbsolutePath());


                }
                try (FileWriter fileWrit = new FileWriter(fileToSave)){
                    fileWrit.write(textArea.getText());
                } catch (IOException ex){
                    ex.printStackTrace();
                }
                

                
            }
        });



        frame.setVisible(true);
    }
}