package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rf3 {

    /* JADX INFO: renamed from: a */
    public Class f29224a;

    /* JADX INFO: renamed from: b */
    public Class f29225b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sf3 f29226c;

    /* JADX INFO: renamed from: a */
    public static rf3 m10326a(sf3 sf3Var, Class cls, Class cls2) {
        rf3 rf3Var = new rf3();
        rf3Var.f29226c = sf3Var;
        rf3Var.f29224a = cls;
        rf3Var.f29225b = cls2;
        VarHandle.storeStoreFence();
        return rf3Var;
    }
}
