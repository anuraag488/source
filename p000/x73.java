package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x73 {

    /* JADX INFO: renamed from: a */
    public Class f34042a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ y73 f34043b;

    /* JADX INFO: renamed from: a */
    public static x73 m12526a(y73 y73Var, Class cls) {
        x73 x73Var = new x73();
        x73Var.f34043b = y73Var;
        x73Var.f34042a = cls;
        VarHandle.storeStoreFence();
        return x73Var;
    }
}
