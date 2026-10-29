package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 {

    /* JADX INFO: renamed from: a */
    public static volatile rc1 f29148a;

    /* JADX INFO: renamed from: b */
    public static final rc1 f29149b;

    static {
        rc1 rc1Var = new rc1();
        Map map = Collections.EMPTY_MAP;
        VarHandle.storeStoreFence();
        f29149b = rc1Var;
    }

    /* JADX INFO: renamed from: a */
    public static rc1 m10284a() {
        rc1 rc1Var;
        Class cls = AbstractC1176tb.f31045a;
        rc1 rc1Var2 = f29148a;
        if (rc1Var2 != null) {
            return rc1Var2;
        }
        synchronized (rc1.class) {
            try {
                rc1Var = f29148a;
                if (rc1Var == null) {
                    Class cls2 = pc1.f27521a;
                    rc1 rc1Var3 = null;
                    if (cls2 != null) {
                        try {
                            rc1Var3 = (rc1) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    rc1Var = rc1Var3 != null ? rc1Var3 : f29149b;
                    f29148a = rc1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rc1Var;
    }
}
