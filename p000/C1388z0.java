package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: z0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1388z0 {

    /* JADX INFO: renamed from: b */
    public static final C1388z0 f35663b;

    /* JADX INFO: renamed from: a */
    public Throwable f35664a;

    static {
        C1351y0 c1351y0 = new C1351y0("Failure occurred while trying to finish a future.", (byte) 0);
        C1388z0 c1388z0 = new C1388z0();
        c1388z0.f35664a = c1351y0;
        VarHandle.storeStoreFence();
        f35663b = c1388z0;
    }
}
