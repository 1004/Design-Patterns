package bristol.zepp.com.bridge;

/**
 * Created by xubinggui on 2/16/16.
 */
public class Mjollnir extends FlyingMagicWeaponImpl {

    @Override public void wieldImp() {
        System.out.println("wielding Mjollnir");
    }

    @Override public void swingImp() {
        System.out.println("swinging Mjollnir");
    }

    @Override public void unwieldImp() {
        System.out.println("unwielding Mjollnir");
    }

    @Override public void flyImp() {
        System.out.println(
                "Mjollnir hits the enemy in the air and returns back to the owner's hand");
    }
}