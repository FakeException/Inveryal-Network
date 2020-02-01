/*
    Class created by NotStxnks_
    Project: InveryalAB
    Date: 01/02/2020
    Time: 15:33
*/

package me.darkboy.inveryalab;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().setMaxHealth(100);
    }
}
