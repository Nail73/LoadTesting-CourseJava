import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIForm {

  private JPanel rootPanel;
  private JTextField filePath;
  private JButton selectButton;
  private JButton actionButton;
  private File selectedFile;

  private final boolean encrypterFileSelected = false;

  private final String decryptAction = "Расшифровать";
  private final String encryptAction = "Зашифровать";

  public GUIForm() {
    selectButton.addActionListener(new Action() {
      @Override
      public Object getValue(String key) {
        return null;
      }

      @Override
      public void putValue(String key, Object value) {
      }

      @Override
      public void setEnabled(boolean b) {
      }

      @Override
      public boolean isEnabled() {
        return false;
      }

      @Override
      public void addPropertyChangeListener(PropertyChangeListener listener) {
      }

      @Override
      public void removePropertyChangeListener(PropertyChangeListener listener) {
      }

      @Override
      public void actionPerformed(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.showOpenDialog(rootPanel);
        selectedFile = chooser.getSelectedFile();
        if (selectedFile == null) {
          filePath.setText("");
          actionButton.setVisible(false);
          return;
        }
        filePath.setText(selectedFile.getAbsolutePath());
        actionButton.setText(decryptAction);
        actionButton.setVisible(true);
      }
    });
  }

  public JPanel getRootPanel() {
    return rootPanel;
  }
}
