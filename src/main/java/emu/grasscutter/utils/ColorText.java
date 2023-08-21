package emu.grasscutter.utils;

import emu.grasscutter.Grasscutter;
import lombok.val;

import java.util.Map;

import static java.util.Map.entry;

public class ColorText {
	private final String strContent;
	
	private static final Map<String, String> colors = Map.ofEntries(
		entry("RESET", "\033[0m"),
		entry("BLACK", "\033[0;30m"),
		entry("DARK_RED", "\033[0;31m"),
		entry("DARK_GREEN", "\033[0;32m"),
		entry("DARK_YELLOW", "\033[0;33m"),
		entry("DARK_BLUE", "\033[0;34m"),
		entry("DARK_MAGENTA", "\033[0;35m"),
		entry("DARK_CYAN", "\033[0;36m"),
		entry("DARK_WHITE", "\033[0;37m"),
		entry("BRIGHT_BLACK", "\033[0;90m"),
		entry("BRIGHT_RED", "\033[0;91m"),
		entry("BRIGHT_GREEN", "\033[0;92m"),
		entry("BRIGHT_YELLOW", "\033[0;93m"),
		entry("BRIGHT_BLUE", "\033[0;94m"),
		entry("BRIGHT_MAGENTA", "\033[0;95m"),
		entry("BRIGHT_CYAN", "\033[0;96m"),
		entry("WHITE", "\033[0;97m")
	);
	
	public ColorText(String content) {
		this(content, colors.get("WHITE"));
	}
	
	public ColorText(String content, String color) {
		this.strContent = colors.getOrDefault(color, colors.get("WHITE")) + content + colors.get("RESET");	//reset console color back when str end
	}
	
	public String toString() {
		return this.strContent;
	}
}