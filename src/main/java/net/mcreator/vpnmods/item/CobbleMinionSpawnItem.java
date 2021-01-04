
package net.mcreator.vpnmods.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.vpnmods.itemgroup.VPNItemGroup;
import net.mcreator.vpnmods.VpnModsModElements;

@VpnModsModElements.ModElement.Tag
public class CobbleMinionSpawnItem extends VpnModsModElements.ModElement {
	@ObjectHolder("vpn_mods:cobble_minion_spawn")
	public static final Item block = null;
	public CobbleMinionSpawnItem(VpnModsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(VPNItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("cobble_minion_spawn");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
