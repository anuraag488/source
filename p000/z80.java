package p000;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class z80 {

    /* JADX INFO: renamed from: a */
    public static final Charset f35863a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static volatile Charset f35864b;

    /* JADX INFO: renamed from: c */
    public static volatile Charset f35865c;

    static {
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
    }
}
