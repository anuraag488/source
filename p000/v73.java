package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v73 {

    /* JADX INFO: renamed from: a */
    public u50 f32446a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ w73 f32447b;

    /* JADX INFO: renamed from: a */
    public static v73 m11756a(w73 w73Var, u50 u50Var) {
        v73 v73Var = new v73();
        v73Var.f32447b = w73Var;
        v73Var.f32446a = u50Var;
        VarHandle.storeStoreFence();
        return v73Var;
    }
}
