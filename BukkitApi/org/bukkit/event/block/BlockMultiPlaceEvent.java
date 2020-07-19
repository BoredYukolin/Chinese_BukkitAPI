package org.bukkit.event.block;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * 当玩家放一个方块, 而连锁放置了第二个方块时(例如玩家放置一个床)触发本事件.
 * <p>
 * 通过 {@link #getBlockPlaced()} 和它的相关方法 返回的方块是:若该位置仅影响一个方块,
 * 则放置的方块将存在的方块.
 */
public class BlockMultiPlaceEvent extends BlockPlaceEvent {
    private final List<BlockState> states;

    public BlockMultiPlaceEvent(@NotNull List<BlockState> states, @NotNull Block clicked, @NotNull ItemStack itemInHand, @NotNull Player thePlayer, boolean canBuild) {
        super(states.get(0).getBlock(), states.get(0), clicked, itemInHand, thePlayer, canBuild);
        this.states = ImmutableList.copyOf(states);
    }

    /**
     * 获取所有被替换的旧方块的方块状态列表.
     * <p>
     * 这些方块中的大多数方块状态都是空气.
     * <p>
     * 原文：Gets a list of blockstates for all blocks which were replaced by the
     * placement of the new blocks. Most of these blocks will just have a
     * Material type of AIR.
     *
     * @return 一个不能改变的BlockStates列表
     */
    @NotNull
    public List<BlockState> getReplacedBlockStates() {
        return states;
    }
}