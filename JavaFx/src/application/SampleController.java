import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {

    @FXML
    private Label label;

    @FXML
    private void initialize() {
        label.setText("Initialized using FXML!");
    }
}
