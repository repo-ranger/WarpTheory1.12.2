package shukaro.warptheory.handlers.warpevents;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import shukaro.warptheory.handlers.IWarpEvent;

public class WarpRain implements IWarpEvent
{
    @Override
    public String getName()
    {
        return "rain";
    }

    @Override
    public int getCost()
    {
        return 10;
    }

    @Override
    public boolean doEvent(World world, EntityPlayer player)
    {
        if (!world.getWorldInfo().isThundering())
        {
            world.getWorldInfo().setRaining(true);
            world.getWorldInfo().setThundering(true);
            return true;
        }
        return false;
    }
}
