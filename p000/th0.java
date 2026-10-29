package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class th0 extends AbstractC0597e3 {

    /* JADX INFO: renamed from: o */
    public zo0 f31160o;

    /* JADX INFO: renamed from: p */
    public mq1 f31161p;

    /* JADX INFO: renamed from: q */
    public f40 f31162q;

    /* JADX INFO: renamed from: r */
    public t82 f31163r;

    /* JADX INFO: renamed from: s */
    public boolean f31164s;

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: i */
    public final void mo4909i() {
        f40 f40Var = this.f31162q;
        if (f40Var != null) {
            f40Var.m5486f(new CancellationException("onBack cancelled"), true);
        }
        t82 t82Var = this.f31163r;
        if (t82Var != null) {
            t82Var.mo4993a(null);
        }
        this.f31162q = null;
        this.f31163r = null;
        this.f31164s = false;
    }

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: j */
    public final void mo4910j() {
        if (this.f31162q != null && !this.f31164s) {
            mo4909i();
        }
        wm0 wm0Var = null;
        if (this.f31162q == null) {
            this.f31164s = false;
            this.f31162q = ev0.m5333H(-2, y30.f34832a, null, 4);
            this.f31163r = lb5.m7910S(this.f31160o, null, null, new C0594e0((Object) this, wm0Var, (byte) 16), 3);
        }
        f40 f40Var = this.f31162q;
        if (f40Var != null) {
            f40Var.m5485e(null);
        }
        this.f31164s = false;
    }

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: k */
    public final void mo4911k(C1233uv c1233uv) {
        f40 f40Var = this.f31162q;
        if (f40Var != null) {
            o80.m8978a(f40Var.mo5493n(c1233uv));
        }
    }

    @Override // p000.AbstractC0597e3
    /* JADX INFO: renamed from: l */
    public final void mo4912l() {
        mo4909i();
        if (super.m4908f()) {
            this.f31164s = true;
            this.f31162q = ev0.m5333H(-2, y30.f34832a, null, 4);
            this.f31163r = lb5.m7910S(this.f31160o, null, null, new C0594e0((Object) this, (wm0) null, (byte) 16), 3);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11049n(boolean z) {
        t82 t82Var;
        if (!z && super.m4908f() && (t82Var = this.f31163r) != null && !t82Var.mo4995b()) {
            mo4909i();
        }
        ((C1308wv) this.f17656a).setEnabled(z);
        ((C1270vv) this.f17657b).m4818g(z);
    }
}
