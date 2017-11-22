package by.it.sc04_evening_tue_thu.zhyravski.lesson14;

public class Mercedes extends Car {
    Mercedes(int speed){
        super(speed<=200?speed:200);
    }

    @Override
    void beep() {
        System.out.println(this+" сигналит: Фа-фа!");;
    }

    @Override
    public String toString() {
        return "Mercedes";
    }
}
