package org.stringtemplate;

public class ErrorTolerance {
	// bit set values telling ST what to care about
	public static final int DETECT_UNKNOWN_PROPERTY = 2;
    public static final int DETECT_UNKNOWN_ATTRIBUTE = 4;
    public static final int DETECT_MALFORMED_TEMPLATE_NAME = 8;
    public static final int DETECT_UNKNOWN_TEMPLATE = 16;

	public static final int DEFAULT_TOLERANCE = 0;

	public int detect = DEFAULT_TOLERANCE;

	public boolean detects(int x) { return (detect & x) != 0; }
	public void detect(int x) { detect |= x; }
	public void ignore(int x) { detect &= ~x; }
}
