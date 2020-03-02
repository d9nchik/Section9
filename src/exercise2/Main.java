package exercise2;

public class Main {
    public static void main(String[] args) {
        Stock company = new Stock("ORCL", "Oracle Corporation", 34.5);
        company.setCurrentPrice(34.35);
        System.out.printf("price-change percentage: %.2f%%",company.getChangePercent());
    }
}
