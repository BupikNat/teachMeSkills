package HomeWork_8_2;

public enum Scale {
    CELSIUS("C"), FAHRENHEIT("F"), KELVIN("K");

    private String symbol;

    Scale(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Scale fromSymbol(String symbol) {
        switch (symbol.toUpperCase()) {
            case "C":
                return CELSIUS;
            case "F":
                return FAHRENHEIT;
            case "K":
                return KELVIN;
            default:
                return null;
        }
    }
}



