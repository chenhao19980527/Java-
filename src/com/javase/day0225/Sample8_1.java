package com.javase.day0225;

public class Sample8_1 {
    public static void main(String[] args) {
        Benzine benzine = new Benzine();
        SaloonCar sc = new SaloonCar();
        sc.startUp(benzine);
    }
}
class SaloonCar {
    public void startUp(Benzine b){
        if (b.isEnough()) {
            System.out.println("启动成功");
        }
        }
}
class Benzine {
    private int cubage = 100;
    public Boolean isEnough() {
        if (cubage > 80 ) {
            return true;
        }else {
            return false;
        }
    }
}

