package mcdelta.ooh;

import mcdelta.core.IContent;
import mcdelta.core.ModDelta;
import mcdelta.ooh.config.OOHConfig;
import mcdelta.ooh.player.PlayerTracker;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = OOH.MOD_ID, useMetadata = true)
@NetworkMod (clientSideRequired = true, serverSideRequired = false)
public class OOH extends ModDelta
{
     public static final String MOD_ID  = "ooh";
     
     @Instance (MOD_ID)
     public static OOH          instance;
     
     private final IContent     content = new OOHContent();
     
     
     
     
     @Override
     public void deltaInit (FMLPreInitializationEvent event)
     {
          this.init(event, new OOHConfig());
     }
     
     
     
     
     @EventHandler
     public void preInit (final FMLPreInitializationEvent event)
     {
          
     }
     
     
     
     
     @EventHandler
     public void load (final FMLInitializationEvent event)
     {
          GameRegistry.registerPlayerTracker(new PlayerTracker());
     }
     
     
     
     
     @EventHandler
     public void postInit (final FMLPostInitializationEvent event)
     {
          
     }
     
     
     
     
     @Override
     public IContent content ()
     {
          return content;
     }
}
