import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;

public class CurrencyTest extends BaseTest {

    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {
        return new MyBank();
    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return new MyCurrencyConverter(currencyRatesProvider);
    }
}

