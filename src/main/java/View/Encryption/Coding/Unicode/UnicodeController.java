package View.Encryption.Coding.Unicode;

import Controller.Encryption.Coding.Unicode.Coding_Unicode;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;

/**
 * @author RyuZU
 */
public class UnicodeController {
    @FXML private JFXButton JBT_enCode;
    @FXML private JFXButton JBT_deCode;
    @FXML private JFXTextArea JTA_src;
    @FXML private JFXTextArea JTA_dst;

    @FXML private void initialize(){

    }

    @FXML
    public void ONClick_JBT_enCode(){
        JTA_dst.setText(Coding_Unicode.encode(JTA_src.getText()));
    }

    @FXML
    public void ONClick_JBT_deCode(){
        JTA_dst.setText(Coding_Unicode.decode(JTA_src.getText()));
    }
}
