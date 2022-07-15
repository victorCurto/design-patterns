package CreationalPatterns.prototype.example2.products;

import java.util.Objects;

public abstract class ShapePrototype {
    public int x;
    public int y;
    public String color;

    public ShapePrototype() {}

    public ShapePrototype(ShapePrototype target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract ShapePrototype clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof ShapePrototype)) return false;
        ShapePrototype shape2 = (ShapePrototype) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
