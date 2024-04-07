import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class StartScreenController implements Initializable {

    @FXML
    private Button playButton;
    @FXML
    private Button shopButton;
    @FXML
    private Button stageSelectorButton;
    @FXML
    private Button quitButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // perform any initialization tasks here.
    }

    @FXML
    private void handlePlayButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GameScreen.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) playButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleShopButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Shop.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) shopButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleStageSelectorButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StageSelector.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) stageSelectorButton.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleQuitButtonClicked(ActionEvent event) {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }
}
