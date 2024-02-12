package OOP_7;

public class ComplexCalculatorFactoryImpl implements ComplexCalculatorFactory {
    @Override
    public ComplexCalculator createCalculator() {
        return new ComplexCalculatorImpl();
    }
}
