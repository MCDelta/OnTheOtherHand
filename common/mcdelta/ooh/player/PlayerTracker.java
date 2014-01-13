package mcdelta.ooh.player;

import mcdelta.core.logging.Logger;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class PlayerTracker implements IPlayerTracker
{
     
     
     @Override
     public void onPlayerLogin (EntityPlayer player)
     {
          if (!(player instanceof OOHPlayer))
          {
               OOHPlayer oohPlayer = new OOHPlayer(player);
               Logger.debug("login",   oohPlayer);
               player.worldObj.spawnEntityInWorld(oohPlayer);
          }
     }
     
     
     
     
     @Override
     public void onPlayerLogout (EntityPlayer player)
     {
          
     }
     
     
     
     
     @Override
     public void onPlayerChangedDimension (EntityPlayer player)
     {
     }
     
     
     
     
     @Override
     public void onPlayerRespawn (EntityPlayer player)
     {
          
     }
}
