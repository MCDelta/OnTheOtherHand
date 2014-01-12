package mcdelta.ooh;

import mcdelta.core.IContent;
import mcdelta.core.ModDelta;
import mcdelta.ooh.config.OOHConfig;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

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
     
     
     
     
     @Override
     public IContent content ()
     {
          return content;
     }
}
