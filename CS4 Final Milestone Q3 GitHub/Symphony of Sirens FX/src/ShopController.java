import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class ShopController implements Initializable {

    @FXML
    private Button homeButton;

    /**
     * Initializes the controller class.
     * This method is automatically called after the FXML file has been loaded.
     * It sets up event handlers for the buttons.
     *
     * @param url The location used to resolve relative paths for the root object, or null if the location is not known.
     * @param rb  The resources used to localize the root object, or null if the root object was not localized.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialize any required components
        homeButton.setOnAction(event -> handleHomeButtonClicked());

    }
    
    /**
     * Event handler for the play button click event.
     * It loads the StartScreen.fxml and switches to the home screen.
     */
    @FXML
    private void handlePlayButtonClicked() {
        try {
            // Load the LevelSelectorScreen.fxml
            Parent startScreenRoot = FXMLLoader.load(getClass().getResource("StartScreen.fxml"));
            Scene startScreenScene = new Scene(startScreenRoot);

            // Get the current stage (the window)
            Stage currentStage = (Stage) playButton.getScene().getWindow();

            // Set the new scene on the stage
            currentStage.setScene(startScreenScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
