package p000;

/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1176tb {

    /* JADX INFO: renamed from: a */
    public static final Class f31045a;

    /* JADX INFO: renamed from: b */
    public static final boolean f31046b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f31045a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f31046b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11018a() {
        return (f31045a == null || f31046b) ? false : true;
    }
}
