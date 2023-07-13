package SigortaYonetimSistemi;

import java.sql.Date;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String name, double fee, Date startDate, Date endDate) {
        super(name, fee, startDate, endDate);
    }

    @Override
    public void calculate() {
        // calculation logic for residence insurance fee
    }
    
}
