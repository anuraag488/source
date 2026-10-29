package p000;

import android.os.Looper;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nt1 {

    /* JADX INFO: renamed from: b */
    public static final nt1 f26079b;

    /* JADX INFO: renamed from: a */
    public ig1 f26080a;

    static {
        ig1 ig1Var = new ig1((byte) 29);
        Looper.getMainLooper();
        nt1 nt1Var = new nt1();
        nt1Var.f26080a = ig1Var;
        VarHandle.storeStoreFence();
        f26079b = nt1Var;
    }
}
