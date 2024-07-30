package com.tsurusaki.TsuruMod.constants.item;

/**
 * アイテムスタック数
 */
public enum StacksTo {

    // インゴット
    INGOT(64);

    private final int stacksTo;

    StacksTo(int stacksTo) {
        this.stacksTo = stacksTo;
    }

    public int toInt() {
        return this.stacksTo;
    }
}
