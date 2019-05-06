package app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller extends ControllerAnimation
{
    @FXML
    public void quitMenuBtnAction (ActionEvent event)
    {
        System.out.println("Quitting");
        System.exit(0);
    }

    @FXML
    public void calculateBtnAction (ActionEvent event)
    {
        calculator cgpa = new calculator(
                theoryBox.getText().strip(),
                labBox.getText().strip(),
                theoryCheckBox.isSelected(),
                labCheckBox.isSelected());
        String result = String.valueOf(cgpa.getCGPA());
        System.out.println(result);
        mainLabel.setText("Your cgpa is: " + result);

    }


}
