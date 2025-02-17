package dev.ftb.mods.ftbchunks.client.map;

import net.minecraft.resources.ResourceLocation;

/**
 * @author LatvianModder
 */
public enum WaypointType {
	DEFAULT(new ResourceLocation("ftbchunks:textures/waypoint_default.png")),
	DEATH(new ResourceLocation("ftbchunks:textures/waypoint_death.png")),
	DEATH_OLD(new ResourceLocation("ftbchunks:textures/waypoint_death_old.png")),
	SPAWN(new ResourceLocation("ftbchunks:textures/waypoint_spawn.png")),
	HOME(new ResourceLocation("ftbchunks:textures/waypoint_home.png")),
	WAYSTONE(new ResourceLocation("ftbchunks:textures/waystone.png"));

	public static final WaypointType[] VALUES = values();

	public final ResourceLocation texture;

	WaypointType(ResourceLocation t) {
		texture = t;
	}
}