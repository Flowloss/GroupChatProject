import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class groupchat extends Application {

    public static void main(String[] args) throws IOException {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("groupchat.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 600, 400);
        String css = Objects.requireNonNull(this.getClass().getResource("StyleSheet.css")).toExternalForm();



        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

}
