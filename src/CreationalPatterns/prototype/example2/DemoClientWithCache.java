package CreationalPatterns.prototype.example2;

import CreationalPatterns.prototype.example2.products.ShapePrototype;
import CreationalPatterns.prototype.example2.prototypeRegistry.BundledShapeCache;

public class DemoClientWithCache {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        ShapePrototype shape1 = cache.get("Big green circle");
        ShapePrototype shape2 = cache.get("Medium blue rectangle");
        ShapePrototype shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2))
            System.out.println("Big green circle != Medium blue rectangle (yes)");
        else
            System.out.println("Big green circle == Medium blue rectangle (no)");


        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yes)");
            if (shape2.equals(shape3))
                System.out.println("And they are identical (yes)");
            else
                System.out.println("But they are not identical (no)");
        } else {
            System.out.println("Rectangle objects are the same (no)");
        }
    }
}
