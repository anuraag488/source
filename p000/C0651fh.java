package p000;

import android.view.ActionMode;
import android.view.View;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: fh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0651fh implements mj4 {

    /* JADX INFO: renamed from: a */
    public View f18971a;

    /* JADX INFO: renamed from: b */
    public yp1 f18972b;

    /* JADX INFO: renamed from: c */
    public wp1 f18973c;

    /* JADX INFO: renamed from: d */
    public dx2 f18974d;

    /* JADX INFO: renamed from: e */
    public aa4 f18975e;

    /* JADX INFO: renamed from: f */
    public C1404zg f18976f;

    /* JADX INFO: renamed from: g */
    public C1404zg f18977g;

    /* JADX INFO: renamed from: h */
    public ActionMode f18978h;

    /* JADX INFO: renamed from: i */
    public RunnableC0612eh f18979i;

    /* JADX INFO: renamed from: j */
    public Runnable f18980j;

    @Override // p000.mj4
    /* JADX INFO: renamed from: a */
    public final Object mo5708a(ej4 ej4Var, of4 of4Var) {
        dx2 dx2Var = this.f18974d;
        C0792jb c0792jb = new C0792jb(this, ej4Var, null, (byte) 1);
        xw2 xw2Var = xw2.f34665a;
        dx2Var.getClass();
        Object objM13685q = zp0.m13685q(new C0667fx(xw2Var, dx2Var, c0792jb, (wm0) null), of4Var);
        return objM13685q == ap0.f14763a ? objM13685q : ju4.f22634a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m5709b(String str, yp1 yp1Var, wp1 wp1Var) {
        ql3 ql3Var = new ql3();
        aa4 aa4Var = this.f18975e;
        C0675g4 c0675g4 = new C0675g4((byte) 3);
        c0675g4.f19600b = ql3Var;
        c0675g4.f19601c = wp1Var;
        VarHandle.storeStoreFence();
        aa4Var.m159e(str, yp1Var, c0675g4);
        Object obj = ql3Var.f28555a;
        if (obj != null) {
            return obj;
        }
        z62.m13366Y("result");
        throw null;
    }
}
