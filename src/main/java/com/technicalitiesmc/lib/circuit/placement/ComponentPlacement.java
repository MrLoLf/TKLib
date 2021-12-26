package com.technicalitiesmc.lib.circuit.placement;

import com.technicalitiesmc.lib.math.VecDirection;
import net.minecraft.core.Vec3i;
import net.minecraft.network.FriendlyByteBuf;

public interface ComponentPlacement {

    Instance begin();

    Instance deserialize(FriendlyByteBuf buf);

    interface Instance {

        boolean tick(PlacementContext.Client context, Vec3i clickedPos, VecDirection clickedFace);

        void stopPlacing(PlacementContext.Client context);

        boolean isValid(PlacementContext.Client context);

        void serialize(FriendlyByteBuf buf);

        void place(PlacementContext.Server context);

    }

}