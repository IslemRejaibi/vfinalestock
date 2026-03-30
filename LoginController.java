package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Label errorLabel;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Simple authentication (replace with your actual authentication logic)
        if (authenticate(username, password)) {
            try {
                // Close login window
                ((Stage) loginButton.getScene().getWindow()).close();

                // Load main application window
                FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
                Parent root = loader.load();

                // Get the controller of the main view if needed
                AppController mainController = loader.getController();

                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setFullScreen(false);
                stage.setTitle("Gestion de Stock - Application Principale");
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                showError("Erreur lors du chargement de l'application");
            }
        } else {
            showError("Nom d'utilisateur ou mot de passe incorrect");
        }
    }

    @FXML
    private void handleCancel(ActionEvent event) {
        System.exit(0);
    }

    private boolean authenticate(String username, String password) {
        // Replace with your actual authentication logic
        // This is just a simple example
        return "islem rejaibi".equals(username) && "admin123".equals(password);
    }

    private void showError(String message) {
        errorLabel.setText(message);
        errorLabel.setVisible(true);
    }
}