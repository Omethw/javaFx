package Table;

import java.util.ArrayList;

public class Database {

    public static ArrayList<Customer> customersDataList = new ArrayList<>();

    static {
        customersDataList.add(new Customer("01","Nimal","Galle",75000));
        customersDataList.add(new Customer("02","Kamal","Colombo",35000));
        customersDataList.add(new Customer("03","Amal","Galle",12000));
        customersDataList.add(new Customer("04","Sunil","Kalutar",50000));
    }

}
