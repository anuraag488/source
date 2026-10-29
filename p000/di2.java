package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class di2 extends mt2 implements g14 {

    /* JADX INFO: renamed from: o */
    public wp1 f17075o;

    /* JADX INFO: renamed from: p */
    public yh2 f17076p;

    /* JADX INFO: renamed from: q */
    public d63 f17077q;

    /* JADX INFO: renamed from: r */
    public boolean f17078r;

    /* JADX INFO: renamed from: s */
    public ww3 f17079s;

    /* JADX INFO: renamed from: t */
    public ai2 f17080t;

    /* JADX INFO: renamed from: u */
    public ai2 f17081u;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m4512O0() {
        ai2 ai2Var;
        bi2 bi2Var = new bi2((byte) 0);
        bi2Var.f15312b = this;
        VarHandle.storeStoreFence();
        byte b = 1;
        bi2 bi2Var2 = new bi2((byte) 1);
        bi2Var2.f15312b = this;
        VarHandle.storeStoreFence();
        this.f17079s = new ww3(bi2Var, bi2Var2);
        if (this.f17078r) {
            ai2Var = new ai2(b);
            ai2Var.f14522b = this;
            VarHandle.storeStoreFence();
        } else {
            ai2Var = null;
        }
        this.f17081u = ai2Var;
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        ic2[] ic2VarArr;
        o14.m8925f(q14Var);
        q14Var.mo4898a(m14.f24548O, this.f17080t);
        d63 d63Var = this.f17077q;
        d63 d63Var2 = d63.f16814a;
        ww3 ww3Var = this.f17079s;
        if (d63Var == d63Var2) {
            if (ww3Var == null) {
                z62.m13366Y("scrollAxisRange");
                throw null;
            }
            p14 p14Var = m14.f24574w;
            ic2VarArr = o14.f26289a;
            ic2 ic2Var = ic2VarArr[13];
            p14Var.getClass();
            q14Var.mo4898a(p14Var, ww3Var);
        } else {
            if (ww3Var == null) {
                z62.m13366Y("scrollAxisRange");
                throw null;
            }
            p14 p14Var2 = m14.f24573v;
            ic2VarArr = o14.f26289a;
            ic2 ic2Var2 = ic2VarArr[12];
            p14Var2.getClass();
            q14Var.mo4898a(p14Var2, ww3Var);
        }
        ai2 ai2Var = this.f17081u;
        if (ai2Var != null) {
            q14Var.mo4898a(d14.f16709f, new C1353y2(null, ai2Var));
        }
        bi2 bi2Var = new bi2((byte) 2);
        bi2Var.f15312b = this;
        VarHandle.storeStoreFence();
        p14 p14Var3 = d14.f16703C;
        o04 o04Var = new o04((byte) 2);
        o04Var.f26271b = bi2Var;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(p14Var3, new C1353y2(null, o04Var));
        yh2 yh2Var = this.f17076p;
        boolean z = yh2Var.f35227c;
        wy0 wy0Var = yh2Var.f35225a;
        cb0 cb0Var = z ? new cb0(((Number) wy0Var.getValue()).intValue(), 1) : new cb0(1, ((Number) wy0Var.getValue()).intValue());
        p14 p14Var4 = m14.f24557f;
        ic2 ic2Var3 = ic2VarArr[24];
        p14Var4.getClass();
        q14Var.mo4898a(p14Var4, cb0Var);
    }
}
