module info.ata4.bspsrc.decompiler {
	requires java.logging;
	requires java.desktop; // TODO: this is a really heavy dependency just so we can use java.awt.Color

	requires info.ata4.bspsrc.common;
	requires info.ata4.bspsrc.lib;
	requires org.apache.commons.io;
	requires org.apache.commons.compress;
	requires ioutils.b1f26588b5;

	exports info.ata4.bspsrc.decompiler;
	exports info.ata4.bspsrc.decompiler.modules;
	exports info.ata4.bspsrc.decompiler.modules.entity;
	exports info.ata4.bspsrc.decompiler.modules.geom;
	exports info.ata4.bspsrc.decompiler.modules.texture;
	exports info.ata4.bspsrc.decompiler.modules.texture.tooltextures;
	exports info.ata4.bspsrc.decompiler.util;
}