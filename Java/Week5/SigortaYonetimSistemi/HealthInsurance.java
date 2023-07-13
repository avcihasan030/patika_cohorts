package SigortaYonetimSistemi;

import java.sql.Date;

public class HealthInsurance extends Insurance {

    public HealthInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public void calculate() {
        //calculation logic for health insurance fee
    }

}
