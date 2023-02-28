package moose.moosecraft.Item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems implements ModInitializer {
    public static final Item MOOSITE =
            Registry.register(Registries.ITEM, new Identifier("moosecraft", "moosite"),
            new Item(new FabricItemSettings()));

    @Override
    public void onInitialize() {
    }
}