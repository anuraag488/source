package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hj0 {

    /* JADX INFO: renamed from: a */
    public static final nc4 f20619a = new nc4(new nh0(6));

    /* JADX INFO: renamed from: b */
    public static final kj0 f20620b;

    static {
        bs4 bs4VarM10362b = rl3.m10362b(i92.class);
        C0598e4 c0598e4 = new C0598e4((byte) 3);
        c0598e4.f17678b = bs4VarM10362b;
        VarHandle.storeStoreFence();
        f20620b = as4.m3263v(c0598e4);
    }

    /* JADX INFO: renamed from: a */
    public static final C1040pn m6413a() {
        ql3 ql3Var = new ql3();
        C1040pn c1040pn = new C1040pn((byte) 2);
        c1040pn.f27754b = ql3Var;
        VarHandle.storeStoreFence();
        return c1040pn;
    }
}
