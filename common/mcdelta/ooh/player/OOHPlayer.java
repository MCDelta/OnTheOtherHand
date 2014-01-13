package mcdelta.ooh.player;

import mcdelta.core.logging.Logger;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.FakePlayer;

public class OOHPlayer extends FakePlayer
{
     private EntityPlayer player;
     
     
     
     
     public OOHPlayer (World world, String name)
     {
          super(world, name);
     }
     
     
     
     
     public OOHPlayer (EntityPlayer p)
     {
          this(p.worldObj, p.username + "_2");
          this.player = p;
     }
     
     
     
     
     @Override
     public void onUpdate ()
     {
          posX = player.posX;
          posY = player.posY;
          posZ = player.posZ;
          
          Logger.debug(player);
     }
     
     
     
     
     public void readEntityFromNBT (NBTTagCompound compound)
     {
          super.readEntityFromNBT(compound);
          player = (EntityPlayer) worldObj.getEntityByID(compound.getInteger("playerID"));
     }
     
     
     
     
     public void writeEntityToNBT (NBTTagCompound compound)
     {
          super.writeEntityToNBT(compound);
          compound.setInteger("playerID", player.entityId);
     }
}
