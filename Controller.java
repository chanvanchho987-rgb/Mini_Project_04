import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup Group_departement_GTR;

    @FXML
    private CheckBox checkbox_oop;

    @FXML
    private CheckBox checkbox_operating;

    @FXML
    private CheckBox checkboxnetwork;

    @FXML
    private DatePicker date_picker;

    @FXML
    private RadioButton ratiobutton_ams;

    @FXML
    private RadioButton ratiobutton_gic;

    @FXML
    private RadioButton ratiobutton_gtr;

    @FXML
    private Label result;

    @FXML
    private Button submit;

    @FXML
    private TextField textfile_name;

    @FXML
    void on_submit(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert Group_departement_GTR != null : "fx:id=\"Group_departement_GTR\" was not injected: check your FXML file 'View.fxml'.";
        assert checkbox_oop != null : "fx:id=\"checkbox_oop\" was not injected: check your FXML file 'View.fxml'.";
        assert checkbox_operating != null : "fx:id=\"checkbox_operating\" was not injected: check your FXML file 'View.fxml'.";
        assert checkboxnetwork != null : "fx:id=\"checkboxnetwork\" was not injected: check your FXML file 'View.fxml'.";
        assert date_picker != null : "fx:id=\"date_picker\" was not injected: check your FXML file 'View.fxml'.";
        assert ratiobutton_ams != null : "fx:id=\"ratiobutton_ams\" was not injected: check your FXML file 'View.fxml'.";
        assert ratiobutton_gic != null : "fx:id=\"ratiobutton_gic\" was not injected: check your FXML file 'View.fxml'.";
        assert ratiobutton_gtr != null : "fx:id=\"ratiobutton_gtr\" was not injected: check your FXML file 'View.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'View.fxml'.";
        assert submit != null : "fx:id=\"submit\" was not injected: check your FXML file 'View.fxml'.";
        assert textfile_name != null : "fx:id=\"textfile_name\" was not injected: check your FXML file 'View.fxml'.";

    }

}
