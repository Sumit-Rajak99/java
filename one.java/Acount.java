class Acount {
    int balance;
    int pin;

    void showbal(int pin) {
        if (pin == 1234) {
            balance = 1200;
            System.out.println(balance);
        }
    }

    void add(int amount) {
        balance += amount;
        System.out.println(balance);
    }

    void withdraw(int amount) {
        balance -= amount;
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Acount obj = new Acount();
        obj.showbal(1234);  
        obj.add(500);
        obj.withdraw(200);
    }
}
