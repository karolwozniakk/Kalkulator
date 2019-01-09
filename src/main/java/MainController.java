
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

    @FXML
    private Label inn;

    @FXML
    private Label outt;

    @FXML
    private Label alert1;

    @FXML
    private Button obliczanie1;

    @FXML
    private Button obliczanie2;

    @FXML
    private TextField wyjscie1;

    @FXML
    private TextField wejscie1;

    @FXML
    private RadioButton kilometr1;

    @FXML
    private RadioButton kilometr2;

    @FXML
    private RadioButton metr1;

    @FXML
    private RadioButton metr2;

    @FXML
    private RadioButton centymetr1;

    @FXML
    private RadioButton centymetr2;

    @FXML
    private RadioButton mila1;

    @FXML
    private RadioButton mila2;

    @FXML
    private RadioButton milam1;

    @FXML
    private RadioButton milam2;

    @FXML
    private RadioButton cal1;

    @FXML
    private RadioButton cal2;

    @FXML
    private RadioButton stopa1;

    @FXML
    private RadioButton stopa2;

    @FXML
    private RadioButton jard1;

    @FXML
    private RadioButton jard2;

    @FXML
    private Button exit;

    public void oblicz1() {
        if (kilometr1.isSelected()) {
            if (metr2.isSelected()) {

                //double x = Double.parseDouble(wejscie1.getText());
                double x = parseAndCheck();

                wyjscie1.setText(String.valueOf(x*1000));
                inn.setText("[km]");
                outt.setText("[m]");
            }
            if (mila2.isSelected()) {
                //double x = Double.parseDouble(wejscie1.getText());

                double x = parseAndCheck();
                wyjscie1.setText(String.valueOf(x/1.6093));
                inn.setText("[km]");
                outt.setText("[mil]");

            }
        }
    }

    public void oblicz2(){
        if (kilometr1.isSelected()) {
            if (metr2.isSelected()) {

                double x = Double.parseDouble(wejscie1.getText());
                //check();
                wyjscie1.setText(String.valueOf(x/1000));
                inn.setText("[m]");
                outt.setText("[km]");
            }
            if (mila2.isSelected()) {
                double x = Double.parseDouble(wejscie1.getText());
                //check();
                wyjscie1.setText(String.valueOf(x * 1.6093));
                inn.setText("[mil]");
                outt.setText("[km]");
            }
        }
    }

    private double parseAndCheck() {
        double x = 0;
        try {
            x = Double.parseDouble(wejscie1.getText());

        } catch (NumberFormatException  | NullPointerException exc){
            alert1.setText("Podaj liczbe!");
            inn.setText("");
            outt.setText("");
        }

        return x;
    }



public void exitt() {
    Platform.exit();
}

}
