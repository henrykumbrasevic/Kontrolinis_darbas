import lt.itakademija.exam.*;
import java.util.ArrayList;
import java.util.List;


public class MyBank implements Bank {
    private CurrencyConverter currencyConverter;
    SequenceGenerator customerSequenceGenerator = new SequenceGenerator();
    SequenceGenerator accountSequenceGenerator = new SequenceGenerator();
    List<Account> accounts = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (personCode == null || personName == null) {
            throw new NullPointerException();
        }
        if (customers.stream().noneMatch(customer -> customer.getPersonCode().equals(personCode))) {
            Customer customer = new Customer(customerSequenceGenerator.getNext(), personCode, personName);
            customers.add(customer);
            return customer;
        } else {
            throw new CustomerCreateException("personCode already exists");
        }
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {

        if (customer == null || currency == null) {
            throw new NullPointerException();
        }
        if (!customers.contains(customer)) {
            throw new AccountCreateException("Can't create account without customer details");
        }
        Account account = new Account(accountSequenceGenerator.getNext(), customer, currency, new Money(0));
        customer.addAccount(account);
        accounts.add(account);
        return account;
    }

    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {
        return null;
    }

    @Override
    public Money getBalance(Currency currency) {
        return null;
    }
}
