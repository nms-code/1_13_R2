package net.minecraft.server;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Supplier;

public class ArgumentSerializerVoid<T extends ArgumentType<?>> implements ArgumentSerializer<T> {

    private final Supplier<T> a;

    public ArgumentSerializerVoid(Supplier<T> supplier) {
        this.a = supplier;
    }

    public void a(T t0, PacketDataSerializer packetdataserializer) {}

    public T b(PacketDataSerializer packetdataserializer) {
        return (ArgumentType) this.a.get();
    }

    public void a(T t0, JsonObject jsonobject) {}
}
