/*
 * Copyright (c) 2013, Jordin & Herpingdo (energetic@dashie.in)
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met: 
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer. 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package in.dashie.energetic.util;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.PlayerControllerMP;
import net.minecraft.src.RenderGlobal;
import net.minecraft.src.Session;
import net.minecraft.src.WorldClient;

public class Wrapper {
	public static Minecraft mc;
	
	public static PlayerControllerMP getController() {
		return mc.playerController;
	}
	
	public static WorldClient getWorld() {
		return mc.theWorld;
	}
	
	public static RenderGlobal getRenderGlobal() {
		return mc.renderGlobal;
	}
	
	public static EntityClientPlayerMP getPlayer() {
		return mc.thePlayer;
	}
	
	public Session getSession() {
		return mc.session;
	}
	
	public FontRenderer getFont() {
		return mc.fontRenderer;
	}
	
}