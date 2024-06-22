package Chart.piechart.AreaChart;

import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class MainFormController {

    NumberAxis axis = new NumberAxis(1,7,1);
    NumberAxis yAxis = new NumberAxis(10,500,20);

    public AreaChart<Number,Number> chart = new AreaChart<>(axis,yAxis);


    public void initialize(){

        XYChart.Series javaStudents = new XYChart.Series();
        javaStudents.setName("Java");

        javaStudents.getData().add(new XYChart.Data(1,20));
        javaStudents.getData().add(new XYChart.Data(2,50));
        javaStudents.getData().add(new XYChart.Data(3,65));
        javaStudents.getData().add(new XYChart.Data(4,150));
        javaStudents.getData().add(new XYChart.Data(5,27));
        javaStudents.getData().add(new XYChart.Data(6,120));
        javaStudents.getData().add(new XYChart.Data(7,95));

        chart.getData().add(javaStudents);


    }
}
