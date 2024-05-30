import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuBarExample extends JFrame {
    public MenuBarExample() {
        super("Java Menu Bar Example");
        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");
        // Create items for the "File" menu
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenu recentMenu = new JMenu("Recent");
        // Create sub-items for the "Recent" menu
        JMenuItem file1Item = new JMenuItem("File 1");
        JMenuItem file2Item = new JMenuItem("File 2");
        // Add sub-items to the "Recent" menu
        recentMenu.add(file1Item);
        recentMenu.add(file2Item);
        // Add items and submenu to the "File" menu
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(recentMenu);
        // Add the "File" menu to the menu bar
        menuBar.add(fileMenu);
        // Set the menu bar to the frame
        setJMenuBar(menuBar);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuBarExample());
    }
}
