package p000;

import android.view.View;
import android.widget.Magnifier;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 extends mt2 implements ns1, s31, g14, y23 {

    /* JADX INFO: renamed from: A */
    public d83 f23313A;

    /* JADX INFO: renamed from: B */
    public wy0 f23314B;

    /* JADX INFO: renamed from: C */
    public long f23315C;

    /* JADX INFO: renamed from: D */
    public w52 f23316D;

    /* JADX INFO: renamed from: E */
    public f40 f23317E;

    /* JADX INFO: renamed from: o */
    public C0729hl f23318o;

    /* JADX INFO: renamed from: p */
    public sk4 f23319p;

    /* JADX INFO: renamed from: q */
    public float f23320q;

    /* JADX INFO: renamed from: r */
    public boolean f23321r;

    /* JADX INFO: renamed from: s */
    public long f23322s;

    /* JADX INFO: renamed from: t */
    public float f23323t;

    /* JADX INFO: renamed from: u */
    public float f23324u;

    /* JADX INFO: renamed from: v */
    public boolean f23325v;

    /* JADX INFO: renamed from: w */
    public gb5 f23326w;

    /* JADX INFO: renamed from: x */
    public View f23327x;

    /* JADX INFO: renamed from: y */
    public ky0 f23328y;

    /* JADX INFO: renamed from: z */
    public js1 f23329z;

    @Override // p000.ns1
    /* JADX INFO: renamed from: B */
    public final void mo43B(e13 e13Var) {
        this.f23313A.setValue(e13Var);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        mo4194P();
        this.f23317E = ev0.m5333H(0, null, null, 7);
        lb5.m7910S(m8391C0(), null, cp0.f16328d, new C0784j3(this, null, (byte) 3), 1);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        js1 js1Var = this.f23329z;
        if (js1Var != null) {
            ((Magnifier) js1Var.f22555a).dismiss();
        }
        this.f23329z = null;
    }

    /* JADX INFO: renamed from: O0 */
    public final long m7571O0() {
        wy0 wy0VarM10566b = this.f23314B;
        if (wy0VarM10566b == null) {
            jp2 jp2Var = new jp2((byte) 2);
            jp2Var.f22488b = this;
            VarHandle.storeStoreFence();
            wy0VarM10566b = s94.m10566b(jp2Var);
            this.f23314B = wy0VarM10566b;
        }
        return ((b33) wy0VarM10566b.getValue()).f15059a;
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        jp2 jp2Var = new jp2((byte) 0);
        jp2Var.f22488b = this;
        VarHandle.storeStoreFence();
        c20.m3797B(this, jp2Var);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m7572P0() {
        js1 js1Var;
        js1 js1Var2 = this.f23329z;
        if (js1Var2 != null) {
            ((Magnifier) js1Var2.f22555a).dismiss();
        }
        View viewM13511H = this.f23327x;
        if (viewM13511H == null) {
            viewM13511H = zc6.m13511H(this);
        }
        this.f23327x = viewM13511H;
        ky0 ky0Var = this.f23328y;
        if (ky0Var == null) {
            ky0Var = sc6.m10652X(this).f33336z;
        }
        this.f23328y = ky0Var;
        gb5 gb5Var = this.f23326w;
        boolean z = this.f23321r;
        long j = this.f23322s;
        float f = this.f23323t;
        float f2 = this.f23324u;
        boolean z2 = this.f23325v;
        float f3 = this.f23320q;
        gb5Var.getClass();
        if (z) {
            js1Var = new js1(new Magnifier(viewM13511H));
        } else {
            long jMo3581c0 = ky0Var.mo3581c0(j);
            float fMo3575E = ky0Var.mo3575E(f);
            float fMo3575E2 = ky0Var.mo3575E(f2);
            Magnifier.Builder builder = new Magnifier.Builder(viewM13511H);
            if (jMo3581c0 != 9205357640488583168L) {
                builder.setSize(qq2.m10010E(Float.intBitsToFloat((int) (jMo3581c0 >> 32))), qq2.m10010E(Float.intBitsToFloat((int) (jMo3581c0 & 4294967295L))));
            }
            if (!Float.isNaN(fMo3575E)) {
                builder.setCornerRadius(fMo3575E);
            }
            if (!Float.isNaN(fMo3575E2)) {
                builder.setElevation(fMo3575E2);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            js1Var = new js1(builder.build());
        }
        this.f23329z = js1Var;
        m7574R0();
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m7573Q0() {
        ky0 ky0Var = this.f23328y;
        if (ky0Var == null) {
            ky0Var = sc6.m10652X(this).f33336z;
            this.f23328y = ky0Var;
        }
        long j = ((b33) this.f23318o.invoke(ky0Var)).f15059a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (m7571O0() & 9223372034707292159L) == 9205357640488583168L) {
            this.f23315C = 9205357640488583168L;
            js1 js1Var = this.f23329z;
            if (js1Var != null) {
                ((Magnifier) js1Var.f22555a).dismiss();
                return;
            }
            return;
        }
        this.f23315C = b33.m3430h(m7571O0(), j);
        if (this.f23329z == null) {
            m7572P0();
        }
        js1 js1Var2 = this.f23329z;
        if (js1Var2 != null) {
            long j2 = this.f23315C;
            float f = this.f23320q;
            Magnifier magnifier = (Magnifier) js1Var2.f22555a;
            if (!Float.isNaN(f)) {
                magnifier.setZoom(f);
            }
            if ((9205357640488583168L & 9223372034707292159L) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (4294967295L & 9205357640488583168L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
            }
        }
        m7574R0();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m7574R0() {
        ky0 ky0Var;
        js1 js1Var = this.f23329z;
        if (js1Var == null || (ky0Var = this.f23328y) == null || w52.m12107b(js1Var.m7277l(), this.f23316D)) {
            return;
        }
        sk4 sk4Var = this.f23319p;
        if (sk4Var != null) {
            long jMo3574D = ky0Var.mo3574D(z62.m13369a0(js1Var.m7277l()));
            ky0 ky0Var2 = sk4Var.f30355b;
            sk4Var.f30356c.setValue(w52.m12106a((((long) ky0Var2.mo3579U(t11.m10960b(jMo3574D))) << 32) | (((long) ky0Var2.mo3579U(t11.m10959a(jMo3574D))) & 4294967295L)));
        }
        this.f23316D = w52.m12106a(js1Var.m7277l());
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        yf2Var.m13113a();
        f40 f40Var = this.f23317E;
        if (f40Var != null) {
            o80.m8978a(f40Var.mo5493n(ju4.f22634a));
        }
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        p14 p14Var = lp2.f24268a;
        jp2 jp2Var = new jp2((byte) 1);
        jp2Var.f22488b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(p14Var, jp2Var);
    }
}
