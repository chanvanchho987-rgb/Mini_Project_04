import java.net.URL;
import java.util.ArrayList;
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
        //
        String name = "N/A";
        if (!textfile_name.getText().isEmpty()) {
            name = textfile_name.getText();
        }

        //
        String dob = "N/A";
        if (date_picker.getValue() != null) {
            dob = date_picker.getValue().toString();
        }
        
        //
        String departement = "N/A";
        if (ratiobutton_gtr.isSelected()) {
            departement = "GTR";
        } 
        if (ratiobutton_ams.isSelected()) {
            departement = "AMS";
        }
        if (ratiobutton_gic.isSelected()) {
            departement = "GIC";
        }

        //
        ArrayList<String> courses = new ArrayList<>();
        if (checkbox_oop.isSelected()) {
            courses.add("Networks");
        }
        if (checkbox_operating.isSelected()) {
            courses.add("Operating Systems");
        }
        if (checkboxnetwork.isSelected()) {
            courses.add("OOP");
        }

        // 
        System.out.println(name);
        System.out.println(dob);
        System.out.println(departement);
        System.out.println(courses);
    }

    @FXML
    void initialize() {

    }

}
