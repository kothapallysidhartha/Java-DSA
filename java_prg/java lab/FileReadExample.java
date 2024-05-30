import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileReadExample extends JFrame implements ActionListener {

    private JTextArea textArea;

    public FileReadExample() {
        super("Java File Read Example");
        setLayout(new BorderLayout());

        textArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JButton openButton = new JButton("Open");
        openButton.addActionListener(this);
        add(openButton, BorderLayout.SOUTH);

        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Open")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Open File");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                readFileContent(selectedFile);
            }
        }
    }

    private void readFileContent(File file) {
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            textArea.setText(""); // Clear the text area before displaying new content

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                textArea.append(line + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FileReadExample();
    }
}
