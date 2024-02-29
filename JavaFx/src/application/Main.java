package application;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
//import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.TableView;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.Label;
//import javafx.scene.layout.VBox;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.ToggleGroup;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.scene.control.ChoiceBox;
//import javafx.beans.property.SimpleIntegerProperty;
//import javafx.beans.property.SimpleStringProperty;
//
//import javafx.stage.Stage;
//
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        Button button = new Button("Click Me!");
//        Label label = new Label("Halo, Guten Tag!");
//        TextField textField = new TextField();
//        TextArea textArea = new TextArea();
//        
//        ToggleGroup group = new ToggleGroup();
//        RadioButton radioButton1 = new RadioButton("kalashnikov");
//        radioButton1.setToggleGroup(group);
//        RadioButton radioButton2 = new RadioButton("gorbachev");
//        radioButton2.setToggleGroup(group);
//        
//        ObservableList<String> choices = FXCollections.observableArrayList("te tar bateyr", "chakor", "kabootar");
//        ChoiceBox<String> choiceBox = new ChoiceBox<>(choices);
//        
//        ComboBox<String> comboBox = new ComboBox<>();
//        comboBox.getItems().addAll("Kaffee", "Tee", "Drinkin");
//        
//        // 	Create TableView
//        TableView<Person> tableView = new TableView<>();
//
//        // Create columns
//        TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
//        TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");
//
//        // Add columns to the TableView
//        tableView.getColumns().addAll(nameColumn, ageColumn);
//        
//        // Set cell value factories
//        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
//        ageColumn.setCellValueFactory(cellData -> cellData.getValue().ageProperty().asObject());
//
//
//        // Create data for the table
//        ObservableList<Person> data = FXCollections.observableArrayList(
//                new Person("John Doe", 25),
//                new Person("Jane Doe", 30),
//                new Person("Bob Smith", 22)
//        );
//
//        // Set data to the TableView
//        tableView.setItems(data);
//
//
//
//
//        Button button1 = new Button("Wanna Listen halal song?");
//        button.setOnAction(event -> {
//            System.out.println("You clicked the button!");
//        });
//        
//        button1.setOnAction(event -> {
//        	System.out.println("I'm a hijabi girl\nIn a harami world\nLife islamic \nit's fantastic\nYou can't see my hair\nor touch my anywhere\nImagination\n Jannah destination");
//        });
//
//        VBox root = new VBox();
//        root.setSpacing(20);
//        root.setAlignment(Pos.CENTER);
//        root.getChildren().add(button);
//        root.getChildren().add(button1);
//        root.getChildren().add(label);
//        root.getChildren().add(textField);
//        root.getChildren().add(textArea);
//        root.getChildren().add(radioButton1);
//        root.getChildren().add(radioButton2);
////        root.getChildren().add(choices);
//        root.getChildren().add(choiceBox);
//        root.getChildren().add(comboBox);
//        root.getChildren().add(tableView);
//
//        Scene scene = new Scene(root, 350, 600);
//
//        stage.setTitle("My JavaFX Application");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//    
//    public class Person {
//        private final SimpleStringProperty name;
//        private final SimpleIntegerProperty age;
//
//        public Person(String name, int age) {
//            this.name = new SimpleStringProperty(name);
//            this.age = new SimpleIntegerProperty(age);
//        }
//
//        public String getName() {
//            return name.get();
//        }
//
//        public SimpleStringProperty nameProperty() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name.set(name);
//        }
//
//        public int getAge() {
//            return age.get();
//        }
//
//        public SimpleIntegerProperty ageProperty() {
//            return age;
//        }
//
//        public void setAge(int age) {
//            this.age.set(age);
//        }
//    }
//}


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
        Scene scene = new Scene(loader.load(), 400, 600);

        stage.setTitle("JavaFX FXML Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
