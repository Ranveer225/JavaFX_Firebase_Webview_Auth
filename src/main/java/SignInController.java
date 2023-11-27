// SignInController.java
package com.mycompany.mvvmexample;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignInController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void signIn() {

        // In SignInController.java
        @FXML
        private void signIn() {
            String username = "fetch username from Firebase";
            UserModel.getInstance().setName(username);
        }

// In SignUpController.java
        @FXML
        private void signUp() {
            String username = nameField.getText();
            UserModel.getInstance().setName(username);
        }

    }
}
