package com.siletti.contab.app01;

import com.siletti.contab.app01.xmlb.FatturaWriteXML;
//import com.siletti.contab.stax.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.File;
//import java.io.IOException;
import java.util.List;

public class App extends Application {

	private Text actionStatus;
	private Stage savedStage;
	private static final String titleTxt = "SILETTI - Crea fatture XML";

	public static void main(String[] args) {
		Application.launch(args);
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle(titleTxt);

		// Window label
		Label label = new Label("Seleziona ed esporta");
		label.setTextFill(Color.DARKBLUE);
		label.setFont(Font.font("Calibri", FontWeight.BOLD, 28));
		HBox labelHb = new HBox();
		labelHb.setAlignment(Pos.CENTER);
		labelHb.getChildren().add(label);

		// Buttons
		Button btn1 = new Button("Choose a file...");
		btn1.setOnAction(new SingleFcButtonListener());
		HBox buttonHb1 = new HBox(10);
		buttonHb1.setAlignment(Pos.CENTER);
		buttonHb1.getChildren().addAll(btn1);

		Button btn2 = new Button("Choose multiple MDB files...");
		btn2.setOnAction(new MultipleFcButtonListener());
		HBox buttonHb2 = new HBox(10);
		buttonHb2.setAlignment(Pos.CENTER);
		buttonHb2.getChildren().addAll(btn2);

		// Status message text
		actionStatus = new Text();
		actionStatus.setFont(Font.font("Calibri", FontWeight.NORMAL, 20));
		actionStatus.setFill(Color.FIREBRICK);

		// Vbox
		VBox vbox = new VBox(30);
		vbox.setPadding(new Insets(25, 10, 10, 10));
//		we will use only multiple selection
//		vbox.getChildren().addAll(labelHb, buttonHb1, buttonHb2, actionStatus);
		vbox.getChildren().addAll(labelHb, buttonHb2, actionStatus);

		// Scene
		Scene scene = new Scene(vbox, 600, 400); // w x h
		primaryStage.setScene(scene);
		primaryStage.show();

		savedStage = primaryStage;
	}

	private class SingleFcButtonListener implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			showSingleFileChooser();
		}
	}

	private void showSingleFileChooser() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select MDB files");
		File selectedFile = fileChooser.showOpenDialog(null);
		if (selectedFile != null) {
			actionStatus.setText("File selected: " + selectedFile.getName());
		} else {
			actionStatus.setText("File selection cancelled.");
		}
	}

	private class MultipleFcButtonListener implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			showMultipleFileChooser();
		}
	}

	private void showMultipleFileChooser() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Select MDB files");
		File cartella = new File("C:\\gestione\\REPORTS");
		if (cartella.exists()) {
			fileChooser.setInitialDirectory(cartella);
		}
		fileChooser.getExtensionFilters().addAll(new ExtensionFilter("MDB Files", "*.mdb"));
		List<File> selectedFiles = fileChooser.showOpenMultipleDialog(savedStage);

		if (selectedFiles != null) {
			selectedFiles.forEach(fls -> {
				String risultato = FatturaWriteXML.WriteFile(fls);
				actionStatus.setText(risultato);
			});
		} else {
			actionStatus.setText("File selection cancelled.");
		}
	}
}