package net.minecraft.server;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.util.Iterator;

public class WhiteList extends JsonList<GameProfile, WhiteListEntry> {

    public WhiteList(File file) {
        super(file);
    }

    protected JsonListEntry<GameProfile> a(JsonObject jsonobject) {
        return new WhiteListEntry(jsonobject);
    }

    public boolean isWhitelisted(GameProfile gameprofile) {
        return this.d(gameprofile);
    }

    public String[] getEntries() {
        String[] astring = new String[this.e().size()];
        int i = 0;

        JsonListEntry jsonlistentry;

        for (Iterator iterator = this.e().iterator(); iterator.hasNext(); astring[i++] = ((GameProfile) jsonlistentry.getKey()).getName()) {
            jsonlistentry = (JsonListEntry) iterator.next();
        }

        return astring;
    }

    protected String a(GameProfile gameprofile) {
        return gameprofile.getId().toString();
    }
}
