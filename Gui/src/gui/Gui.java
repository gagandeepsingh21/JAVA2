/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sun.security.util.Password;

/**
 *
 * @author gagan
 */
public class Gui extends Application {
    
    @Override
    public void start(Stage myStage) {
       Text name=new Text("Name: ");
       TextField name_tf=new TextField();
       
       Text tel=new Text("Telephone: ");
       TextField Tel_tf=new TextField();
       
       Text Email=new Text("Email: ");
       TextField Email_tf=new TextField();
       
       Button save_btn =new Button("Save");
       Button Cancel_btn =new Button("Cancel");
       
       Text Password=new Text("Password: ");
       Password pws =new Password();
       PasswordField pws1 =new PasswordField();
       
       ChoiceBox titles= new ChoiceBox();
       titles.getItems().addAll("Miss","Mr","Mrs","Dr");
       
       GridPane grid=new GridPane();
       grid.setMinSize(500, 600);
       grid.setVgap(10);
       grid.setHgap(20);
       grid.setAlignment(Pos.CENTER);
        
       
       grid.add(name, 0, 1);
       grid.add(titles,1,1);
       grid.add(name_tf, 2, 1);
       
       grid.add(tel, 0, 2);
       grid.add(Tel_tf, 1, 2);
       
       grid.add(Email, 0, 3);
       grid.add(Email_tf,1,3);
       
       grid.add(Password,0,4);
       grid.add(pws1,1,4);
       grid.add(save_btn,1,5);
       grid.add(Cancel_btn,2,5);
       
       
       myStage.setTitle("CMS");
       Scene scene = new Scene(grid);
       myStage.setScene(scene);
       myStage.show();
       
       
        
       
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
