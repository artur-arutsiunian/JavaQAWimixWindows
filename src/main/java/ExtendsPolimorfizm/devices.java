package ExtendsPolimorfizm;

public class devices extends ios{
    public static void main(String[] args) {
        devices devices = new devices("Iphone", 14);
        devices devices2 = new devices("Iphone", 14);
        System.out.println(devices.equals(devices2));
    }

    public devices (String MyName, int MyVersion){
        super(MyName, MyVersion);
        System.out.println(MyName+" "+ MyVersion);
    }
}
