package p000;

import android.view.ViewParent;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class du1 implements q63 {

    /* JADX INFO: renamed from: a */
    public bu1 f17390a;

    /* JADX INFO: renamed from: b */
    public final au1 f17391b;

    /* JADX INFO: renamed from: c */
    public final ViewTreeObserverOnGlobalLayoutListenerC1140sc f17392c;

    /* JADX INFO: renamed from: d */
    public mq1 f17393d;

    /* JADX INFO: renamed from: e */
    public wp1 f17394e;

    /* JADX INFO: renamed from: g */
    public boolean f17396g;

    /* JADX INFO: renamed from: i */
    public float[] f17398i;

    /* JADX INFO: renamed from: j */
    public boolean f17399j;

    /* JADX INFO: renamed from: n */
    public int f17403n;

    /* JADX INFO: renamed from: p */
    public lb5 f17405p;

    /* JADX INFO: renamed from: q */
    public boolean f17406q;

    /* JADX INFO: renamed from: r */
    public boolean f17407r;

    /* JADX INFO: renamed from: t */
    public boolean f17409t;

    /* JADX INFO: renamed from: u */
    public final b71 f17410u;

    /* JADX INFO: renamed from: f */
    public long f17395f = 9223372034707292159L;

    /* JADX INFO: renamed from: h */
    public final float[] f17397h = rq2.m10392b();

    /* JADX INFO: renamed from: k */
    public ky0 f17400k = oh6.m9098d(1.0f, 1.0f);

    /* JADX INFO: renamed from: l */
    public df2 f17401l = df2.f17011a;

    /* JADX INFO: renamed from: m */
    public final j70 f17402m = new j70();

    /* JADX INFO: renamed from: o */
    public long f17404o = to4.f31292b;

    /* JADX INFO: renamed from: s */
    public boolean f17408s = true;

    public du1(bu1 bu1Var, au1 au1Var, ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc, mq1 mq1Var, wp1 wp1Var) {
        this.f17390a = bu1Var;
        this.f17391b = au1Var;
        this.f17392c = viewTreeObserverOnGlobalLayoutListenerC1140sc;
        this.f17393d = mq1Var;
        this.f17394e = wp1Var;
        b71 b71Var = new b71((byte) 7);
        b71Var.f15141b = this;
        VarHandle.storeStoreFence();
        this.f17410u = b71Var;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m4733a() {
        float[] fArrM10392b = this.f17398i;
        if (fArrM10392b == null) {
            fArrM10392b = rq2.m10392b();
            this.f17398i = fArrM10392b;
        }
        if (this.f17407r) {
            this.f17407r = false;
            float[] fArrM4734b = m4734b();
            if (this.f17408s) {
                return fArrM4734b;
            }
            if (!lb5.m7907P(fArrM4734b, fArrM10392b)) {
                fArrM10392b[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrM10392b[0])) {
            return null;
        }
        return fArrM10392b;
    }

    /* JADX INFO: renamed from: b */
    public final float[] m4734b() {
        boolean z = this.f17406q;
        float[] fArr = this.f17397h;
        if (z) {
            bu1 bu1Var = this.f17390a;
            long jM6597v = bu1Var.f15633z;
            if ((9223372034707292159L & jM6597v) == 9205357640488583168L) {
                jM6597v = i20.m6597v(z62.m13369a0(this.f17395f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM6597v >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM6597v & 4294967295L));
            fu1 fu1Var = bu1Var.f15608a;
            float f = fu1Var.f19306m;
            float f2 = fu1Var.f19307n;
            float f3 = fu1Var.f19311r;
            float f4 = fu1Var.f19304k;
            float f5 = fu1Var.f19305l;
            float fSin = (float) Math.sin(0.0d);
            float fCos = (float) Math.cos(0.0d);
            float f6 = -fSin;
            float f7 = (f2 * fCos) - (0.0f * fSin);
            float f8 = (0.0f * fCos) + (f2 * fSin);
            float fSin2 = (float) Math.sin(0.0d);
            float fCos2 = (float) Math.cos(0.0d);
            float f9 = -fSin2;
            float f10 = fSin * fSin2;
            float f11 = fSin * fCos2;
            float f12 = fCos * fSin2;
            float f13 = fCos * fCos2;
            float f14 = (f8 * fSin2) + (f * fCos2);
            float f15 = (f8 * fCos2) + ((-f) * fSin2);
            double d = ((double) f3) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d);
            float fCos3 = (float) Math.cos(d);
            float f16 = -fSin3;
            float f17 = (fCos3 * f10) + (f16 * fCos2);
            float f18 = (f10 * fSin3) + (fCos2 * fCos3);
            float f19 = fSin3 * fCos;
            float f20 = f18 * f4;
            float f21 = f19 * f4;
            float f22 = ((fSin3 * f11) + (fCos3 * f9)) * f4;
            float f23 = f17 * f5;
            float f24 = fCos * fCos3 * f5;
            float f25 = ((fCos3 * f11) + (f16 * f9)) * f5;
            float f26 = f12 * 1.0f;
            float f27 = f6 * 1.0f;
            float f28 = f13 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f20;
                fArr[1] = f21;
                fArr[2] = f22;
                fArr[3] = 0.0f;
                fArr[4] = f23;
                fArr[5] = f24;
                fArr[6] = f25;
                fArr[7] = 0.0f;
                fArr[8] = f26;
                fArr[9] = f27;
                fArr[10] = f28;
                fArr[11] = 0.0f;
                float f29 = -fIntBitsToFloat;
                fArr[12] = ((f20 * f29) - (fIntBitsToFloat2 * f23)) + f14 + fIntBitsToFloat;
                fArr[13] = ((f21 * f29) - (fIntBitsToFloat2 * f24)) + f7 + fIntBitsToFloat2;
                fArr[14] = ((f29 * f22) - (fIntBitsToFloat2 * f25)) + f15;
                fArr[15] = 1.0f;
            }
            this.f17406q = false;
            this.f17408s = y42.m12871t0(fArr);
        }
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m4735c() {
        if (this.f17399j || this.f17396g) {
            return;
        }
        this.f17392c.invalidate();
        m4738f(true);
    }

    /* JADX INFO: renamed from: d */
    public final void m4736d(long j) {
        boolean zM10594m = ViewTreeObserverOnGlobalLayoutListenerC1140sc.m10594m();
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f17392c;
        if (zM10594m) {
            viewTreeObserverOnGlobalLayoutListenerC1140sc.m10608M(-4.0f);
        }
        bu1 bu1Var = this.f17390a;
        if (!o52.m8956c(bu1Var.f15627t, j)) {
            bu1Var.f15627t = j;
            bu1Var.m3691h(j, bu1Var.f15628u);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC1140sc.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC1140sc, viewTreeObserverOnGlobalLayoutListenerC1140sc);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4737e(long j) {
        if (w52.m12108c(j, this.f17395f)) {
            return;
        }
        if (ViewTreeObserverOnGlobalLayoutListenerC1140sc.m10594m()) {
            this.f17392c.m10608M(-4.0f);
        }
        this.f17395f = j;
        m4735c();
    }

    /* JADX INFO: renamed from: f */
    public final void m4738f(boolean z) {
        if (z != this.f17399j) {
            this.f17399j = z;
            ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = this.f17392c;
            cw2 cw2Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30075A;
            boolean z2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30079C;
            if (!z) {
                if (z2) {
                    return;
                }
                cw2Var.m4210k(this);
                cw2 cw2Var2 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30077B;
                if (cw2Var2 != null) {
                    cw2Var2.m4210k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                cw2Var.m4200a(this);
                return;
            }
            cw2 cw2Var3 = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30077B;
            if (cw2Var3 == null) {
                cw2Var3 = new cw2();
                viewTreeObserverOnGlobalLayoutListenerC1140sc.f30077B = cw2Var3;
            }
            cw2Var3.m4200a(this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4739g() {
        ViewTreeObserverOnGlobalLayoutListenerC1140sc.m10594m();
        if (this.f17399j) {
            if (!to4.m11081b(this.f17404o, to4.f31292b) && !w52.m12108c(this.f17390a.f15628u, this.f17395f)) {
                bu1 bu1Var = this.f17390a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f17404o >> 32)) * ((int) (this.f17395f >> 32));
                bu1Var.m3690g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f17404o & 4294967295L)) * ((int) (this.f17395f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            }
            bu1 bu1Var2 = this.f17390a;
            ky0 ky0Var = this.f17400k;
            df2 df2Var = this.f17401l;
            long j = this.f17395f;
            if (!w52.m12108c(bu1Var2.f15628u, j)) {
                bu1Var2.f15628u = j;
                bu1Var2.m3691h(bu1Var2.f15627t, j);
                if (bu1Var2.f15616i == 9205357640488583168L) {
                    bu1Var2.f15614g = true;
                    bu1Var2.m3684a();
                }
            }
            bu1Var2.f15609b = ky0Var;
            bu1Var2.f15610c = df2Var;
            bu1Var2.f15611d = this.f17410u;
            bu1Var2.m3688e();
            m4738f(false);
        }
    }
}
