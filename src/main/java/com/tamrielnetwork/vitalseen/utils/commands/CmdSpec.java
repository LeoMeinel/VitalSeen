/*
 * VitalSeen is a Spigot Plugin that gives players the ability to see when other players were last seen.
 * Copyright © 2022 Leopold Meinel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see https://github.com/TamrielNetwork/VitalSeen/blob/main/LICENSE
 */

package com.tamrielnetwork.vitalseen.utils.commands;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CmdSpec {
	public static boolean isInvalidCmd(@NotNull CommandSender sender, OfflinePlayer player, @NotNull String perm) {
		if (Cmd.isNotPermitted(sender, perm)) {
			return true;
		}
		return Cmd.isInvalidPlayer(sender, player);
	}

}