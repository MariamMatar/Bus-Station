package busstation;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Reservation {

	Scene scene;
	Stage stage;
	LoginForm passenger;
	
public Reservation (Stage stage) {
		
		this.stage=stage;
	}
public void preparescene() {
	


 Label Reservation =new Label("Reservation");
 Label Des =new Label("Destination:");
 Label Vehicle=new Label("Vehicle:");
 Label Stops=new Label("Number Of Stops:");
 Label Ticket =new Label("Ticket:");
 Button Book = new Button ("Book Ticket!");
 Label Empty =new Label ();
 
    ChoiceBox<String> Dest=new ChoiceBox<>();
    Dest.getItems().addAll("Internal","External");
    Dest.setValue("Internal");
    ChoiceBox<String> Veh=new ChoiceBox<>();
    Veh.getItems().addAll("Bus","MiniBus","Limousine");
    Veh.setValue("Bus");
    ChoiceBox<String> Stop=new ChoiceBox<>();
    Stop.getItems().addAll("No Stops","One Stop","Two Stops");
    Stop.setValue("No Stops");
    ChoiceBox<String> tick=new ChoiceBox<>();
    tick.getItems().addAll("Round Trip","One Way");
    tick.setValue("Round Trip");
    
    GridPane root= new GridPane();
    root.add(Reservation, 0, 0);
    root.add(Des, 0, 2);
    root.add(Vehicle, 0, 3);
    root.add(Stops, 0, 4);
    root.add(Ticket, 0, 5);
    root.add(Book, 0, 7);
    root.add(Dest, 1, 2);
    root.add(Veh, 1, 3);
    root.add(Stop, 1 , 4);
    root.add(tick, 1, 5);
    
    root.setHgap(12);
 	root.setVgap(10);
 	root.setAlignment(Pos. TOP_CENTER);
 	
     root.setStyle("-fx-background-color:CadetBlue ");
     scene =new Scene(root,600,400);
}

public Scene getScene() {
	return scene;
}
public void setScene(Scene scene) {
	this.scene = scene;
}
public Stage getStage() {
	return stage;
}
public void setStage(Stage stage) {
	this.stage = stage;
}
public void setPassenger(LoginForm passenger) {
	this.passenger = passenger;
}

}




