package Chart.piechart;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;

public class MainFormController {
    public PieChart pChart;

    public void initialize(){

        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();

        data.addAll(
             new PieChart.Data("Java",60),
             new PieChart.Data("Python",25),
             new PieChart.Data("Javascript",15)
        );

        pChart.setData(data);
    }
}
