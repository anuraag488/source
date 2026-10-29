package p000;

import android.view.View;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: hf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0723hf implements zo0 {

    /* JADX INFO: renamed from: a */
    public View f20523a;

    /* JADX INFO: renamed from: b */
    public bl4 f20524b;

    /* JADX INFO: renamed from: c */
    public zo0 f20525c;

    /* JADX INFO: renamed from: d */
    public AtomicReference f20526d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final void m6366a(vj2 vj2Var, ym0 ym0Var) {
        C0649ff c0649ff;
        if (ym0Var instanceof C0649ff) {
            c0649ff = (C0649ff) ym0Var;
            int i = c0649ff.f18939v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0649ff.f18939v = i - Integer.MIN_VALUE;
            } else {
                c0649ff = new C0649ff(this, ym0Var);
            }
        } else {
            c0649ff = new C0649ff(this, ym0Var);
        }
        Object obj = c0649ff.f18937t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c0649ff.f18939v;
        if (i2 == 0) {
            k43.m7376J(obj);
            AtomicReference atomicReference = this.f20526d;
            C0558d0 c0558d0 = new C0558d0((byte) 4);
            c0558d0.f16655b = vj2Var;
            c0558d0.f16656c = this;
            VarHandle.storeStoreFence();
            C0594e0 c0594e0 = new C0594e0((Object) this, (wm0) null, (byte) 2);
            c0649ff.f18939v = 1;
            if (zp0.m13685q(new C1312wz(c0558d0, atomicReference, c0594e0, (wm0) null), c0649ff) == ap0Var) {
                return;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            k43.m7376J(obj);
        }
        xy4.m12794w();
    }

    @Override // p000.zo0
    /* JADX INFO: renamed from: f */
    public final ro0 mo6367f() {
        return this.f20525c.mo6367f();
    }
}
