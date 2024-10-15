package utils;

public class DataValidation {

    public static boolean isValidDriverLicense(String driverLicense) {
        // Exemple simple de validation de numéro de permis
        return driverLicense.matches("[A-Z0-9]+");
    }

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
