package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pj1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f27653a = 0;

    static {
        i20.m6569D("kotlinx.coroutines.flow.defaultConcurrency", 16L, 1L, 2147483647L);
    }

    /* JADX INFO: renamed from: a */
    public static final e80 m9537a(si1... si1VarArr) {
        Object obj;
        if (si1VarArr.length == 0) {
            obj = v71.f32439a;
        } else {
            C1041po c1041po = new C1041po((byte) 0);
            c1041po.f27850b = si1VarArr;
            VarHandle.storeStoreFence();
            obj = c1041po;
        }
        return new e80(obj, r71.f29063a, -2, y30.f34832a, (byte) 1);
    }
}
