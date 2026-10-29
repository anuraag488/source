package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 {

    /* JADX INFO: renamed from: a */
    public Class f18922a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gd2 f18923b;

    /* JADX INFO: renamed from: a */
    public static fd2 m5692a(gd2 gd2Var, Class cls) {
        fd2 fd2Var = new fd2();
        fd2Var.f18923b = gd2Var;
        fd2Var.f18922a = cls;
        VarHandle.storeStoreFence();
        return fd2Var;
    }
}
