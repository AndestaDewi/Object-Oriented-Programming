import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label lblNama = new Label("Nama");
        TextField txtNama = new TextField();

        Label lblNim = new Label("NIM");
        TextField txtNim = new TextField();

        Label lblProdi = new Label("Prodi");
        TextField txtProdi = new TextField();

        Button btn = new Button("Tampilkan");

        Label hasil = new Label();

        btn.setOnAction(e -> {
            hasil.setText(
                    "Nama: " + txtNama.getText() +
                            "\nNIM: " + txtNim.getText() +
                            "\nProdi: " + txtProdi.getText());
        });

        VBox root = new VBox(10);

        root.getChildren().addAll(
                lblNama,
                txtNama,
                lblNim,
                txtNim,
                lblProdi,
                txtProdi,
                btn,
                hasil);

        Scene scene = new Scene(root, 350, 300);

        stage.setTitle("Data Mahasiswa");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
