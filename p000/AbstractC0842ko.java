package p000;

/* JADX INFO: renamed from: ko */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0842ko {

    /* JADX INFO: renamed from: a */
    public static final int f23268a;

    static {
        Object objM7389n;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM7389n = property != null ? od4.m9044Y(property) : null;
        } catch (Throwable th) {
            objM7389n = k43.m7389n(th);
        }
        Integer num = (Integer) (objM7389n instanceof cp3 ? null : objM7389n);
        f23268a = num != null ? num.intValue() : 2097152;
    }
}
