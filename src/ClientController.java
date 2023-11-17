import ServerClient.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static java.awt.SystemColor.text;

public class ClientController {

    @FXML
    private TextArea chatTextArea;

    @FXML
    private TextField messageTextField;

    private Client client;

    public void setClient(Client client) {
        this.client = client;
    }

    @FXML
    public void sendMessageButton() {
        String message = messageTextField.getText();
        if (!message.isEmpty()) {
            client.sendMessage();
            messageTextField.clear();
        }
    }
    public void saveTextToArea(String text) {

    }

    public void writeTextField(ActionEvent event) {
        chatTextArea.appendText(text + "\n");
    }
}
