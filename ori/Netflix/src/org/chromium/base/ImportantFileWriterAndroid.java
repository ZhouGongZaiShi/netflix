// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 

package org.chromium.base;


public class ImportantFileWriterAndroid
{

	public ImportantFileWriterAndroid()
	{
	}

	private static native boolean nativeWriteFileAtomically(String s, byte abyte0[]);

	public static boolean writeFileAtomically(String s, byte abyte0[])
	{
		return nativeWriteFileAtomically(s, abyte0);
	}
}
