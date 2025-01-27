import lt.itakademija.exam.*;

public class MyCurrencyConverter implements CurrencyConverter {
    private CurrencyRatesProvider currencyRatesProvider;

    public MyCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        this.currencyRatesProvider = currencyRatesProvider;
    }

    @Override
    public Money convert(Currency currency, Currency currency1, Money money) {
        if (currencyRatesProvider.getRate(currency, currency1) == null) {
            throw new CurrencyConversionException("Cannot convert this currency pair");
        } else
            return money.multiply(currencyRatesProvider.getRate(currency, currency1));
    }
}
