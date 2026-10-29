package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ov2 {

    /* JADX INFO: renamed from: b */
    public static final ov2 f27148b;

    /* JADX INFO: renamed from: a */
    public HashMap f27149a;

    static {
        C0518c8 c0518c8 = new C0518c8();
        ov2 ov2Var = new ov2();
        ov2Var.f27149a = new HashMap();
        VarHandle.storeStoreFence();
        try {
            ov2Var.m9312a(c0518c8, sj2.class);
            f27148b = ov2Var;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m9312a(C0518c8 c0518c8, Class cls) {
        try {
            C0518c8 c0518c9 = (C0518c8) this.f27149a.get(cls);
            if (c0518c9 != null && !c0518c9.equals(c0518c8)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f27149a.put(cls, c0518c8);
        } catch (Throwable th) {
            throw th;
        }
    }
}
