package net.launcher.theme;

import java.awt.Color;
import javax.swing.border.EmptyBorder;

import net.launcher.components.Align;
import net.launcher.components.ButtonStyle;
import net.launcher.components.CheckboxStyle;
import net.launcher.components.ComponentStyle;
import net.launcher.components.TextfieldStyle;

public class OptionsTheme {	
	
	public static ComponentStyle    panelOpt	= new ComponentStyle(53, 128, 400, 350, "font", 16F, Color.decode("0xA67A53"), true);
	
	public static CheckboxStyle		loadnews	= new CheckboxStyle(600, 150, 300, 23, "font", "checkbox", 16F, Color.decode("0xFFFFFF"), true);
	public static CheckboxStyle		updatepr	= new CheckboxStyle(147, 207, 300, 23, "font", "checkbox", 16F, Color.decode("0xFFFFFF"), true);
	public static CheckboxStyle		cleandir	= new CheckboxStyle(147, 232, 300, 23, "font", "checkbox", 16F, Color.decode("0xFFFFFF"), true);
	public static CheckboxStyle		fullscrn	= new CheckboxStyle(147, 257, 300, 23, "font", "checkbox", 16F, Color.decode("0xFFFFFF"), true);
	public static CheckboxStyle		offline		= new CheckboxStyle(147, 282, 300, 23, "font", "checkbox", 16F, Color.decode("0xFFFFFF"), true);
	public static TextfieldStyle	memory		= new TextfieldStyle(98, 307, 322, 38, "textfield", "font", 16F, Color.GRAY, Color.GRAY, new EmptyBorder(0, 10, 0, 10));
	
	public static ButtonStyle		mcdir		= new ButtonStyle(322, 370, 100, 47, "font", "button", 16F, Color.decode("0xFFFFFF"), true, Align.CENTER);
	public static TextfieldStyle	textdir		= new TextfieldStyle(98, 370, 215, 38, "textfield", "font", 16F, Color.GRAY, Color.GRAY, new EmptyBorder(0, 10, 0, 10));
	
	public static ButtonStyle		close		= new ButtonStyle(178, 425, 150, 47, "font", "button", 16F, Color.decode("0xFFFFFF"), true, Align.CENTER);
	
	public static FontBundle		memoryDesc	= new FontBundle("font", 16F, Color.DARK_GRAY);
	
	public static int titleX 		= 212;
	public static int titleY 		= 165;
}