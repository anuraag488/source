package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ox5 {

    /* JADX INFO: renamed from: b */
    public static final ox5 f27194b;

    /* JADX INFO: renamed from: a */
    public Throwable f27195a;

    static {
        nx5 nx5Var = new nx5("Failure occurred while trying to finish a future.");
        ox5 ox5Var = new ox5();
        ox5Var.f27195a = nx5Var;
        VarHandle.storeStoreFence();
        f27194b = ox5Var;
    }
}
