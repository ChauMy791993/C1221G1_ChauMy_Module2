package oop_review.oop_java_1.quan_ly_tai_khoan_ngan_hang;

public class Account {
    private long id;
    private String name;
    private double money;

    public Account() {
    }

    public Account(long id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money + " VND" +
                '}';
    }

    public final double INTEREST = 0.035;
    public double withdrawalFee = 2000;

    public Account(long id, String name) {
        this.id = id;
        this.name = name;
        this.money = 50;
    }

    public double getInputMoney(double inputMoney) {
        this.setMoney(this.money + inputMoney);
        return getMoney();
    }

    public double getWithdawMoney(double withdawMoney) {
        if (this.money >= withdawMoney && withdawMoney > 0) {
            this.setMoney(money - (withdawMoney + withdrawalFee));
            return getMoney();
        } else {
            System.out.println("số tiền trong tài khoản không đủ");
            return -1;
        }
    }

    public double getExpire() {
        this.setMoney(money + money * INTEREST);
        return getMoney();
    }

    public double getTransferMoney(double transferMoney) {
        if (transferMoney <= 0) {
            System.out.println("số tiền không hợp lê");
        } else if (transferMoney > getMoney()) {
            System.out.println("số tền trong tài khoản không đủ");
        } else {
            this.setMoney(this.money - transferMoney);
        }
        return getMoney();
    }
}
