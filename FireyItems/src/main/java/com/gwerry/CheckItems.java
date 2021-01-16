package com.gwerry;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class CheckItems extends Thread{
    private boolean finish;
    @Override
    public void run(){
        finish = false;
        task();
    }
    private void task() {
        while(!finish) {
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (p.getInventory().getItemInMainHand().getType() != Material.AIR || p.getInventory().getItemInOffHand().getType() != Material.SHIELD && p.getInventory().getItemInOffHand().getType() != Material.AIR) {
                    p.setFireTicks(20);
                }
            }
            try {
                sleep(5);
            }catch (InterruptedException ignored){ }
        }
    }
    public void finishTask(){
        finish = true;
    }
}
