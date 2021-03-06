
package Vista;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;


public class Principal extends Application {
    private Stage primaryStage;
    private AnchorPane Login;

    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("");

        login();
      
    }

    public void login() {
                
        try {
            
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Principal.class.getResource("Login.fxml"));
            Login = (AnchorPane) loader.load();
            
            Scene scene = new Scene(Login);
            primaryStage.setScene(scene);
            primaryStage.show();
         } catch (IOException e) {
            e.printStackTrace();
       }
        
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    
    public static void main(String[] args) {
        launch(args);
    }

}