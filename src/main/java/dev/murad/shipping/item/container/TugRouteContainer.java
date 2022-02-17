package dev.murad.shipping.item.container;

import dev.murad.shipping.entity.accessor.TugRouteScreenDataAccessor;
import dev.murad.shipping.setup.ModContainerTypes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.world.level.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TugRouteContainer extends AbstractContainerMenu {
    private static final Logger LOGGER = LogManager.getLogger(TugRouteContainer.class);

    private boolean isOffHand;
    private ItemStack itemStack;

    public TugRouteContainer(int windowId, Level level, TugRouteScreenDataAccessor data, Inventory playerInventory, Player player) {
        super(ModContainerTypes.TUG_ROUTE_CONTAINER.get(), windowId);

        this.isOffHand = data.isOffHand();
        this.itemStack = player.getItemInHand(isOffHand ? Hand.OFF_HAND : Hand.MAIN_HAND);
        LOGGER.debug("Got item stack {} in {}hand", itemStack.toString(), isOffHand ? "off" : "main");
    }

    public boolean isOffHand() {
        return isOffHand;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return true;
    }
}
