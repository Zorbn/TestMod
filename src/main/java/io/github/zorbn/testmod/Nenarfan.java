package io.github.zorbn.testmod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class Nenarfan extends PathAwareEntity {

    protected Nenarfan(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }
}
