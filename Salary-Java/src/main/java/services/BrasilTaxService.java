package services;

public class BrasilTaxService extends TaxService {

    @Override //indica que eu estou sobreescrendo o metodo do TaxService
    public double tax(double amount) {
        return amount * 0.3;
    }
}
