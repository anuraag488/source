package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class bu5 {
    /* JADX INFO: renamed from: a */
    public static final wt5 m3693a(Object obj, Object obj2) {
        wt5 wt5VarM12420a = (wt5) obj;
        wt5 wt5Var = (wt5) obj2;
        if (!wt5Var.isEmpty()) {
            if (!wt5VarM12420a.f33725a) {
                wt5VarM12420a = wt5VarM12420a.m12420a();
            }
            wt5VarM12420a.m12421b();
            if (!wt5Var.isEmpty()) {
                wt5VarM12420a.putAll(wt5Var);
            }
        }
        return wt5VarM12420a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3694b(byte b) {
        return b > -65;
    }
}
