package Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainFormController {

    public TableView<CustomerTm> tblCustomer;

    public TableColumn<CustomerTm,String> colNic;
    public TableColumn<CustomerTm,String> colName;
    public TableColumn<CustomerTm,String> colAddress;
    public TableColumn<CustomerTm,Double> colSalary;
    public TableColumn<CustomerTm, Button> colDelete;

    public void initialize(){

        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("button"));

        ObservableList<CustomerTm> custList = FXCollections.observableArrayList();

        for (Customer c: Database.customersDataList) {

            Button button = new Button("Delete");

            custList.add(new CustomerTm(
                    c.getNic(),
                    c.getName(),
                    c.getAddress(),
                    c.getSalary(),
                    button
            ));

        }

        tblCustomer.setItems(custList);

    }
}
