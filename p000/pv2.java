package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pv2 {

    /* JADX INFO: renamed from: b */
    public static final pv2 f28028b;

    /* JADX INFO: renamed from: a */
    public HashMap f28029a;

    static {
        pv2 pv2Var = new pv2();
        pv2Var.f28029a = new HashMap();
        VarHandle.storeStoreFence();
        f28028b = pv2Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9682a(C0482b8 c0482b8, Class cls) {
        try {
            C0482b8 c0482b9 = (C0482b8) this.f28029a.get(cls);
            if (c0482b9 != null && !c0482b9.equals(c0482b8)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f28029a.put(cls, c0482b8);
        } catch (Throwable th) {
            throw th;
        }
    }
}
