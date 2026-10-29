package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class km0 {

    /* JADX INFO: renamed from: a */
    public final p91 f23228a;

    /* JADX INFO: renamed from: b */
    public final mc1 f23229b;

    /* JADX INFO: renamed from: c */
    public final z73 f23230c;

    /* JADX INFO: renamed from: d */
    public q74 f23231d;

    public km0(p91 p91Var, mc1 mc1Var, float f, q74 q74Var) {
        this.f23228a = p91Var;
        this.f23229b = mc1Var;
        this.f23230c = new z73(f);
        this.f23231d = q74Var;
    }

    public km0(p91 p91Var, mc1 mc1Var) {
        C0984oi c0984oi = C0984oi.f26755l;
        q74 q74Var = new q74();
        q74Var.f28264a = c0984oi;
        VarHandle.storeStoreFence();
        this(p91Var, mc1Var, 0.0f, q74Var);
    }
}
