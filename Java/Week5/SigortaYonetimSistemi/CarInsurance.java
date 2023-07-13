package SigortaYonetimSistemi;

import java.sql.Date;

public class CarInsurance extends Insurance {

    public CarInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public void calculate() {
        //calculation logic for car insurance fee 
    }

}
