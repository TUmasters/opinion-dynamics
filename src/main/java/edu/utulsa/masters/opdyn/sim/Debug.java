package edu.utulsa.masters.opdyn.sim;

/**
 * A bad debugger class that should probably be removed.
 */
public class Debug {
    private static final int DEBUG_LEVEL = 0;
    public static void println(int level, String s) {
        if(level <= DEBUG_LEVEL) System.out.println(s);
    }

    public static void print(int level, String s) {
        if(level <= DEBUG_LEVEL) System.out.print(s);
    }

    public static void format(int level, String format, Object ... args) {
        if(level <= DEBUG_LEVEL) System.out.format(format, args);
    }
}
