package innerclass;

public class InnerClassMain {
    public static void main(String[] args) {
        // create object of outer class and then use it as a reference for inner class
        Gearbox mcLaren = new Gearbox(6);

        // Not encapsulated
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

        //Error prone
        // Gearbox.Gear second = new Gearbox.Gear(2, 12.3);
        // Gearbox.Gear third = new mcLaren.Gear(2, 12.3);


        // add gear in gear box constructor to be effective
//        mcLaren.addGear(1, 5.3);
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);


        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
