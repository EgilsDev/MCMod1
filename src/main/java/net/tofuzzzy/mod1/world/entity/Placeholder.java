package net.tofuzzzy.mod1.world.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Placeholder extends AbstractArrow {

   // private final Item referenceItem;

    public Placeholder(EntityType<? extends AbstractArrow> type, Level level) {
        super(type, level);
    }

    public Placeholder(EntityType<? extends AbstractArrow> type, LivingEntity shooter, Level level) {
        super(type, shooter, level);
    }

    @Override
    protected ItemStack getPickupItem() {
        return null;
    }
}
