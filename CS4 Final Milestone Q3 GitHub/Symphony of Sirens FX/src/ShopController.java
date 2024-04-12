import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShopController implements Initializable {

    @FXML
    private Rectangle weaponsRectangle;
    
    @FXML
    private Rectangle armorRectangle;
    
    @FXML
    private Rectangle potionsRectangle;
    
    @FXML
    private Rectangle heroesRectangle;

    @FXML
    private Text weaponsText;
    
    @FXML
    private Text armorText;
    
    @FXML
    private Text potionsText;
    
    @FXML
    private Text heroesText;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setClickHandlers();
    }

    private void setClickHandlers() {
        weaponsRectangle.setOnMouseClicked(e -> updateStyle(weaponsRectangle, weaponsText));
        armorRectangle.setOnMouseClicked(e -> updateStyle(armorRectangle, armorText));
        potionsRectangle.setOnMouseClicked(e -> updateStyle(potionsRectangle, potionsText));
        heroesRectangle.setOnMouseClicked(e -> updateStyle(heroesRectangle, heroesText));
    }

    private void updateStyle(Rectangle rectangle, Text text) {
        rectangle.setStrokeWidth(2);  // Bolden the rectangle
        text.setFont(javafx.scene.text.Font.font("System Bold"));  // Bolden the text
    }

    @FXML
    private void handleHomeButtonClicked(ActionEvent event) throws IOException {
        loadScene("StartScreen.fxml", event);
    }

    private void loadScene(String fxmlFile, ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
