package lesson_21;

import java.security.SecureRandom;

public class BusDriver {
    private String licenseNumber;

    private Autobus autobus;


    public BusDriver(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Autobus getAutobus() {
        return autobus;
    }

}

