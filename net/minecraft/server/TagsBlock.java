package net.minecraft.server;

import java.util.Collection;

public class TagsBlock {

    private static Tags<Block> M = new Tags<>((minecraftkey) -> {
        return false;
    }, (minecraftkey) -> {
        return null;
    }, "", false, "");
    private static int N;
    public static final Tag<Block> WOOL = a("wool");
    public static final Tag<Block> PLANKS = a("planks");
    public static final Tag<Block> STONE_BRICKS = a("stone_bricks");
    public static final Tag<Block> WOODEN_BUTTONS = a("wooden_buttons");
    public static final Tag<Block> BUTTONS = a("buttons");
    public static final Tag<Block> CARPETS = a("carpets");
    public static final Tag<Block> WOODEN_DOORS = a("wooden_doors");
    public static final Tag<Block> WOODEN_STAIRS = a("wooden_stairs");
    public static final Tag<Block> WOODEN_SLABS = a("wooden_slabs");
    public static final Tag<Block> WOODEN_PRESSURE_PLATES = a("wooden_pressure_plates");
    public static final Tag<Block> WOODEN_TRAPDOORS = a("wooden_trapdoors");
    public static final Tag<Block> DOORS = a("doors");
    public static final Tag<Block> SAPLINGS = a("saplings");
    public static final Tag<Block> LOGS = a("logs");
    public static final Tag<Block> DARK_OAK_LOGS = a("dark_oak_logs");
    public static final Tag<Block> OAK_LOGS = a("oak_logs");
    public static final Tag<Block> BIRCH_LOGS = a("birch_logs");
    public static final Tag<Block> ACACIA_LOGS = a("acacia_logs");
    public static final Tag<Block> JUNGLE_LOGS = a("jungle_logs");
    public static final Tag<Block> SPRUCE_LOGS = a("spruce_logs");
    public static final Tag<Block> BANNERS = a("banners");
    public static final Tag<Block> SAND = a("sand");
    public static final Tag<Block> STAIRS = a("stairs");
    public static final Tag<Block> SLABS = a("slabs");
    public static final Tag<Block> ANVIL = a("anvil");
    public static final Tag<Block> RAILS = a("rails");
    public static final Tag<Block> LEAVES = a("leaves");
    public static final Tag<Block> TRAPDOORS = a("trapdoors");
    public static final Tag<Block> FLOWER_POTS = a("flower_pots");
    public static final Tag<Block> ENDERMAN_HOLDABLE = a("enderman_holdable");
    public static final Tag<Block> ICE = a("ice");
    public static final Tag<Block> VALID_SPAWN = a("valid_spawn");
    public static final Tag<Block> IMPERMEABLE = a("impermeable");
    public static final Tag<Block> UNDERWATER_BONEMEALS = a("underwater_bonemeals");
    public static final Tag<Block> CORAL_BLOCKS = a("coral_blocks");
    public static final Tag<Block> WALL_CORALS = a("wall_corals");
    public static final Tag<Block> CORAL_PLANTS = a("coral_plants");
    public static final Tag<Block> CORALS = a("corals");

    public static void a(Tags<Block> tags) {
        TagsBlock.M = tags;
        ++TagsBlock.N;
    }

    public static Tags<Block> a() {
        return TagsBlock.M;
    }

    private static Tag<Block> a(String s) {
        return new TagsBlock.a(new MinecraftKey(s));
    }

    static class a extends Tag<Block> {

        private int a = -1;
        private Tag<Block> b;

        public a(MinecraftKey minecraftkey) {
            super(minecraftkey);
        }

        public boolean a(Block block) {
            if (this.a != TagsBlock.N) {
                this.b = TagsBlock.M.b(this.c());
                this.a = TagsBlock.N;
            }

            return this.b.isTagged(block);
        }

        public Collection<Block> a() {
            if (this.a != TagsBlock.N) {
                this.b = TagsBlock.M.b(this.c());
                this.a = TagsBlock.N;
            }

            return this.b.a();
        }

        public Collection<Tag.b<Block>> b() {
            if (this.a != TagsBlock.N) {
                this.b = TagsBlock.M.b(this.c());
                this.a = TagsBlock.N;
            }

            return this.b.b();
        }
    }
}
