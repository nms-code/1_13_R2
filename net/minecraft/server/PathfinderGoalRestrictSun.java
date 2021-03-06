package net.minecraft.server;

public class PathfinderGoalRestrictSun extends PathfinderGoal {

    private final EntityCreature a;

    public PathfinderGoalRestrictSun(EntityCreature entitycreature) {
        this.a = entitycreature;
    }

    public boolean a() {
        return this.a.world.L() && this.a.getEquipment(EnumItemSlot.HEAD).isEmpty();
    }

    public void c() {
        ((Navigation) this.a.getNavigation()).c(true);
    }

    public void d() {
        ((Navigation) this.a.getNavigation()).c(false);
    }
}
