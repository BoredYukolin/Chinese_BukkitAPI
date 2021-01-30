package org.bukkit.inventory.meta;

import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 代表头颅.
 */
public interface SkullMeta extends ItemMeta {

    /**
     * 获取这个头颅的主人.
     * <p>
     * 原文:
     * Gets the owner of the skull.
     *
     * @return 头颅的主人
     * @deprecated 另请参阅 {@link #getOwningPlayer()}..
     */
    @Deprecated
    @Nullable
    String getOwner();

    /**
     * 检测这个头颅是否有主人.
     * <p>
     * 原文:
     * Checks to see if the skull has an owner.
     *
     * @return true 表示头颅有主人
     */
    boolean hasOwner();

    /**
     * 设置这个头颅的主人.
     * <p>
     * 原文:
     * Sets the owner of the skull.
     *
     * @param owner 头颅的新主人
     * @return 如果头颅主人成功被设置则为 true
     * @deprecated 另请参阅 {@link #setOwningPlayer(org.bukkit.OfflinePlayer)}.
     */
    @Deprecated
    boolean setOwner(@Nullable String owner);

    /**
     * 获取这个头颅的主人.
     * <p>
     * 原文:
     * Gets the owner of the skull.
     *
     * @return 头颅的主人
     */
    @Nullable
    OfflinePlayer getOwningPlayer();

    /**
     * 设置这个头颅的主人.
     * <p>
     * 插件应该在调用这个方法之前检查 hasOwner() 是否返回true.
     * <p>
     * 原文:
     * Sets the owner of the skull.
     * <p>
     * Plugins should check that hasOwner() returns true before calling this
     * plugin.
     *
     * @param owner 头颅的新主人
     * @return 如果头颅主人成功被设置则为 true
     */
    boolean setOwningPlayer(@Nullable OfflinePlayer owner);

    @Override
    @NotNull
    SkullMeta clone();
}