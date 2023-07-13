package SigortaYonetimSistemi;

import java.sql.Date;

public class TravelInsurance extends Insurance{

    public TravelInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public void calculate() {
        // calculation logic for travel insurance fee
    }
    
}
