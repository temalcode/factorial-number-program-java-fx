package FactorialNumberProgram;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller
{

    @FXML
    private Button mybtnF;

    @FXML
    private Label mylabelF;

    @FXML
    private TextField mytextF;

    public void find(ActionEvent event)
    {
        Calculate calculate = new Calculate();
        try
        {
            mylabelF.setTextFill(Color.BLACK);
            int input = Integer.parseInt(mytextF.getText());
            mylabelF.setText(calculate.cal(input));
        }
        catch (NumberFormatException e)
        {
            mylabelF.setText("Please enter valid number");
            mylabelF.setTextFill(Color.RED);
        }
        catch (Exception e)
        {
            mylabelF.setText(String.valueOf(e));
        }
    }
}


