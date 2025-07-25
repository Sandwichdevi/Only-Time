package com.onlytime;

import net.minecraft.text.Text;

public enum HudColor {
    WHITE(0xFFFFFF, Text.literal("White")),
    RED(0xFF5555, Text.literal("Red")),
    GREEN(0x55FF55, Text.literal("Green")),
    BLUE(0x5555FF, Text.literal("Blue")),
    YELLOW(0xFFFF55, Text.literal("Yellow"));

    private final int rgb;
    private final Text displayName;

    HudColor(int rgb, Text displayName) {
        this.rgb = rgb;
        this.displayName = displayName;
    }

    public int getRgb() {
        return rgb;
    }

    public Text getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName.getString();
    }
}