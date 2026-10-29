package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wv2 {

    /* JADX INFO: renamed from: b */
    public static final wv2 f33785b;

    /* JADX INFO: renamed from: c */
    public static final vv2 f33786c;

    /* JADX INFO: renamed from: a */
    public AtomicReference f33787a;

    static {
        wv2 wv2Var = new wv2();
        wv2Var.f33787a = new AtomicReference();
        VarHandle.storeStoreFence();
        f33785b = wv2Var;
        f33786c = new vv2();
    }

    /* JADX INFO: renamed from: a */
    public final vv2 m12425a() {
        vv2 vv2Var = (vv2) this.f33787a.get();
        return vv2Var == null ? f33786c : vv2Var;
    }
}
