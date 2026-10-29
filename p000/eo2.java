package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eo2 {

    /* JADX INFO: renamed from: c */
    public static final eo2 f18330c;

    /* JADX INFO: renamed from: a */
    public long f18331a;

    /* JADX INFO: renamed from: b */
    public long f18332b;

    static {
        eo2 eo2Var = new eo2();
        eo2Var.f18331a = 4611686018427387903L / 10;
        eo2Var.f18332b = 4611686018427387903L % 10;
        VarHandle.storeStoreFence();
        f18330c = eo2Var;
    }
}
