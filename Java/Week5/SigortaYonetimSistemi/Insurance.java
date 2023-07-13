package SigortaYonetimSistemi;

import java.sql.Date;

public abstract class Insurance {
    private String name;
    private double fee;
    private Date startDate;
    private Date endDate;

    public Insurance(String name, double fee, Date startDate, Date endDate) {
        this.name = name;
        this.fee = fee;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public abstract void calculate();
}
