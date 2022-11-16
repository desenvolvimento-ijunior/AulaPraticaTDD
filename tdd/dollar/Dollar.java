package tdd.dollar;

public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}

public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10,five.amount);
    product = five.times(3);
    assertEquals(new Dollar(15),product);
}
