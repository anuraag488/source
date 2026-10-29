package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xr6 {

    /* JADX INFO: renamed from: a */
    public static final rt5 f34568a;

    static {
        dz5 dz5Var = dz5.f17537c;
        dz5 dz5Var2 = dz5.f17539e;
        or6 or6VarM9244m = or6.m9244m();
        rt5 rt5Var = new rt5();
        tt2 tt2Var = new tt2((byte) 22, false);
        tt2Var.f31428b = dz5Var;
        tt2Var.f31429c = dz5Var2;
        tt2Var.f31430d = or6VarM9244m;
        VarHandle.storeStoreFence();
        rt5Var.f29618a = tt2Var;
        VarHandle.storeStoreFence();
        f34568a = rt5Var;
    }
}
