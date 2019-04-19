package interfaces.interfaceprocessor;


class ExchangeAdapter implements Processor {
    private Exchange e;

    public ExchangeAdapter(Exchange e) {
        this.e = e;
    }

    public String name() {
        return getClass().getSimpleName();
    }

    public String process(Object o) {
        return e.exchange((String) o);
    }
}

public class Exchange {
    public String exchange(String a) {
        return new StringBuilder(a).reverse().toString();
    }

    public static void main(String[] args) {
        String a = "abcdefg";
        Apply.process(new ExchangeAdapter(new Exchange()), a);
    }
}