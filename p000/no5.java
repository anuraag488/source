package p000;

import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class no5 {

    /* JADX INFO: renamed from: a */
    public static volatile no5 f25985a;

    /* JADX INFO: renamed from: b */
    public static final no5 f25986b;

    static {
        no5 no5Var = new no5();
        Map map = Collections.EMPTY_MAP;
        VarHandle.storeStoreFence();
        f25986b = no5Var;
    }

    /* JADX INFO: renamed from: a */
    public static no5 m8806a() {
        no5 no5Var;
        Class cls = o36.f26319a;
        no5 no5Var2 = f25985a;
        if (no5Var2 != null) {
            return no5Var2;
        }
        synchronized (no5.class) {
            no5Var = f25985a;
            if (no5Var == null) {
                Class cls2 = ao5.f14751a;
                no5 no5Var3 = null;
                if (cls2 != null) {
                    try {
                        no5Var3 = (no5) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                no5Var = no5Var3 == null ? f25986b : no5Var3;
                f25985a = no5Var;
            }
        }
        return no5Var;
    }
}
