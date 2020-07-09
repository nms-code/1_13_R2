package net.minecraft.server;

import java.util.function.Consumer;

public class DebugReportAdvancementStory implements Consumer<Consumer<Advancement>> {

    public DebugReportAdvancementStory() {}

    public void accept(Consumer<Advancement> consumer) {
        Advancement advancement = Advancement.SerializedAdvancement.a().a(Blocks.GRASS_BLOCK, new ChatMessage("advancements.story.root.title", new Object[0]), new ChatMessage("advancements.story.root.description", new Object[0]), new MinecraftKey("minecraft:textures/gui/advancements/backgrounds/stone.png"), AdvancementFrameType.TASK, false, false, false).a("crafting_table", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Blocks.CRAFTING_TABLE)).a(consumer, "story/root");
        Advancement advancement1 = Advancement.SerializedAdvancement.a().a(advancement).a(Items.WOODEN_PICKAXE, new ChatMessage("advancements.story.mine_stone.title", new Object[0]), new ChatMessage("advancements.story.mine_stone.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("get_stone", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Blocks.COBBLESTONE)).a(consumer, "story/mine_stone");
        Advancement advancement2 = Advancement.SerializedAdvancement.a().a(advancement1).a(Items.STONE_PICKAXE, new ChatMessage("advancements.story.upgrade_tools.title", new Object[0]), new ChatMessage("advancements.story.upgrade_tools.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("stone_pickaxe", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.STONE_PICKAXE)).a(consumer, "story/upgrade_tools");
        Advancement advancement3 = Advancement.SerializedAdvancement.a().a(advancement2).a(Items.IRON_INGOT, new ChatMessage("advancements.story.smelt_iron.title", new Object[0]), new ChatMessage("advancements.story.smelt_iron.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("iron", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.IRON_INGOT)).a(consumer, "story/smelt_iron");
        Advancement advancement4 = Advancement.SerializedAdvancement.a().a(advancement3).a(Items.IRON_PICKAXE, new ChatMessage("advancements.story.iron_tools.title", new Object[0]), new ChatMessage("advancements.story.iron_tools.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("iron_pickaxe", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.IRON_PICKAXE)).a(consumer, "story/iron_tools");
        Advancement advancement5 = Advancement.SerializedAdvancement.a().a(advancement4).a(Items.DIAMOND, new ChatMessage("advancements.story.mine_diamond.title", new Object[0]), new ChatMessage("advancements.story.mine_diamond.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("diamond", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.DIAMOND)).a(consumer, "story/mine_diamond");
        Advancement advancement6 = Advancement.SerializedAdvancement.a().a(advancement3).a(Items.LAVA_BUCKET, new ChatMessage("advancements.story.lava_bucket.title", new Object[0]), new ChatMessage("advancements.story.lava_bucket.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("lava_bucket", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.LAVA_BUCKET)).a(consumer, "story/lava_bucket");
        Advancement advancement7 = Advancement.SerializedAdvancement.a().a(advancement3).a(Items.IRON_CHESTPLATE, new ChatMessage("advancements.story.obtain_armor.title", new Object[0]), new ChatMessage("advancements.story.obtain_armor.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a(AdvancementRequirements.OR).a("iron_helmet", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.IRON_HELMET)).a("iron_chestplate", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.IRON_CHESTPLATE)).a("iron_leggings", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.IRON_LEGGINGS)).a("iron_boots", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.IRON_BOOTS)).a(consumer, "story/obtain_armor");
        Advancement advancement8 = Advancement.SerializedAdvancement.a().a(advancement5).a(Items.ENCHANTED_BOOK, new ChatMessage("advancements.story.enchant_item.title", new Object[0]), new ChatMessage("advancements.story.enchant_item.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("enchanted_item", (CriterionInstance) CriterionTriggerEnchantedItem.b.c()).a(consumer, "story/enchant_item");
        Advancement advancement9 = Advancement.SerializedAdvancement.a().a(advancement6).a(Blocks.OBSIDIAN, new ChatMessage("advancements.story.form_obsidian.title", new Object[0]), new ChatMessage("advancements.story.form_obsidian.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("obsidian", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Blocks.OBSIDIAN)).a(consumer, "story/form_obsidian");
        Advancement advancement10 = Advancement.SerializedAdvancement.a().a(advancement7).a(Items.SHIELD, new ChatMessage("advancements.story.deflect_arrow.title", new Object[0]), new ChatMessage("advancements.story.deflect_arrow.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("deflected_projectile", (CriterionInstance) CriterionTriggerEntityHurtPlayer.b.a(CriterionConditionDamage.a.a().a(CriterionConditionDamageSource.a.a().a(true)).a(true))).a(consumer, "story/deflect_arrow");
        Advancement advancement11 = Advancement.SerializedAdvancement.a().a(advancement5).a(Items.DIAMOND_CHESTPLATE, new ChatMessage("advancements.story.shiny_gear.title", new Object[0]), new ChatMessage("advancements.story.shiny_gear.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a(AdvancementRequirements.OR).a("diamond_helmet", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.DIAMOND_HELMET)).a("diamond_chestplate", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.DIAMOND_CHESTPLATE)).a("diamond_leggings", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.DIAMOND_LEGGINGS)).a("diamond_boots", (CriterionInstance) CriterionTriggerInventoryChanged.b.a(Items.DIAMOND_BOOTS)).a(consumer, "story/shiny_gear");
        Advancement advancement12 = Advancement.SerializedAdvancement.a().a(advancement9).a(Items.FLINT_AND_STEEL, new ChatMessage("advancements.story.enter_the_nether.title", new Object[0]), new ChatMessage("advancements.story.enter_the_nether.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("entered_nether", (CriterionInstance) CriterionTriggerChangedDimension.b.a(DimensionManager.NETHER)).a(consumer, "story/enter_the_nether");
        Advancement advancement13 = Advancement.SerializedAdvancement.a().a(advancement12).a(Items.GOLDEN_APPLE, new ChatMessage("advancements.story.cure_zombie_villager.title", new Object[0]), new ChatMessage("advancements.story.cure_zombie_villager.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.GOAL, true, true, false).a("cured_zombie", (CriterionInstance) CriterionTriggerCuredZombieVillager.b.c()).a(consumer, "story/cure_zombie_villager");
        Advancement advancement14 = Advancement.SerializedAdvancement.a().a(advancement12).a(Items.ENDER_EYE, new ChatMessage("advancements.story.follow_ender_eye.title", new Object[0]), new ChatMessage("advancements.story.follow_ender_eye.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("in_stronghold", (CriterionInstance) CriterionTriggerLocation.b.a(CriterionConditionLocation.a("Stronghold"))).a(consumer, "story/follow_ender_eye");
        Advancement advancement15 = Advancement.SerializedAdvancement.a().a(advancement14).a(Blocks.END_STONE, new ChatMessage("advancements.story.enter_the_end.title", new Object[0]), new ChatMessage("advancements.story.enter_the_end.description", new Object[0]), (MinecraftKey) null, AdvancementFrameType.TASK, true, true, false).a("entered_end", (CriterionInstance) CriterionTriggerChangedDimension.b.a(DimensionManager.THE_END)).a(consumer, "story/enter_the_end");
    }
}