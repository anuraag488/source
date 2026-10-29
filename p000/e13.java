package p000;

import android.graphics.Paint;
import android.view.ViewParent;
import java.lang.invoke.VarHandle;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class e13 extends so2 implements sq2, cf2 {

    /* JADX INFO: renamed from: X */
    public static final kr2 f17595X = new kr2(17);

    /* JADX INFO: renamed from: Y */
    public static final kr2 f17596Y = new kr2(18);

    /* JADX INFO: renamed from: Z */
    public static final jp3 f17597Z = new jp3();

    /* JADX INFO: renamed from: a0 */
    public static final ze2 f17598a0 = new ze2();

    /* JADX INFO: renamed from: b0 */
    public static final float[] f17599b0 = rq2.m10392b();

    /* JADX INFO: renamed from: c0 */
    public static final c13 f17600c0 = new c13();

    /* JADX INFO: renamed from: d0 */
    public static final f70 f17601d0 = new f70(13);

    /* JADX INFO: renamed from: A */
    public boolean f17602A;

    /* JADX INFO: renamed from: B */
    public yp1 f17603B;

    /* JADX INFO: renamed from: C */
    public ky0 f17604C;

    /* JADX INFO: renamed from: D */
    public df2 f17605D;

    /* JADX INFO: renamed from: F */
    public yq2 f17607F;

    /* JADX INFO: renamed from: G */
    public yv2 f17608G;

    /* JADX INFO: renamed from: I */
    public float f17610I;

    /* JADX INFO: renamed from: J */
    public kw2 f17611J;

    /* JADX INFO: renamed from: K */
    public ze2 f17612K;

    /* JADX INFO: renamed from: M */
    public jl3 f17614M;

    /* JADX INFO: renamed from: N */
    public jl3 f17615N;

    /* JADX INFO: renamed from: O */
    public boolean f17616O;

    /* JADX INFO: renamed from: P */
    public boolean f17617P;

    /* JADX INFO: renamed from: Q */
    public bu1 f17618Q;

    /* JADX INFO: renamed from: R */
    public h70 f17619R;

    /* JADX INFO: renamed from: S */
    public er1 f17620S;

    /* JADX INFO: renamed from: T */
    public final b13 f17621T;

    /* JADX INFO: renamed from: U */
    public boolean f17622U;

    /* JADX INFO: renamed from: V */
    public q63 f17623V;

    /* JADX INFO: renamed from: W */
    public bu1 f17624W;

    /* JADX INFO: renamed from: u */
    public final wf2 f17625u;

    /* JADX INFO: renamed from: v */
    public boolean f17626v;

    /* JADX INFO: renamed from: w */
    public boolean f17627w;

    /* JADX INFO: renamed from: x */
    public e13 f17628x;

    /* JADX INFO: renamed from: y */
    public e13 f17629y;

    /* JADX INFO: renamed from: z */
    public boolean f17630z;

    /* JADX INFO: renamed from: E */
    public float f17606E = 0.8f;

    /* JADX INFO: renamed from: H */
    public long f17609H = 0;

    /* JADX INFO: renamed from: L */
    public p44 f17613L = k43.f22879x;

    public e13(wf2 wf2Var) {
        this.f17625u = wf2Var;
        this.f17604C = wf2Var.f33336z;
        this.f17605D = wf2Var.f33293A;
        jl3 jl3Var = jl3.f22395e;
        this.f17614M = jl3Var;
        this.f17615N = jl3Var;
        b13 b13Var = new b13((byte) 1);
        b13Var.f15023b = this;
        VarHandle.storeStoreFence();
        this.f17621T = b13Var;
    }

    /* JADX INFO: renamed from: v1 */
    public static e13 m4849v1(cf2 cf2Var) {
        e13 e13Var;
        vo2 vo2Var = cf2Var instanceof vo2 ? (vo2) cf2Var : null;
        return (vo2Var == null || (e13Var = vo2Var.f32763a.f32026u) == null) ? (e13) cf2Var : e13Var;
    }

    /* JADX INFO: renamed from: A1 */
    public final void m4850A1(boolean z) {
        long j;
        char c;
        ze2 ze2Var;
        boolean z2;
        boolean z3;
        wf2 wf2Var;
        wp1 wp1Var;
        if (this.f17624W != null) {
            return;
        }
        q63 q63Var = this.f17623V;
        yp1 yp1Var = this.f17603B;
        if (q63Var == null) {
            if (yp1Var == null) {
                return;
            }
            q32.m9721c("null layer with a non-null layerBlock");
            return;
        }
        if (yp1Var == null) {
            throw d55.m4363h("updateLayerParameters requires a non-null layerBlock");
        }
        jp3 jp3Var = f17597Z;
        jp3Var.m7252a();
        wf2 wf2Var2 = this.f17625u;
        jp3Var.f22505q = wf2Var2.f33336z;
        jp3Var.f22506r = wf2Var2.f33293A;
        jp3Var.f22503o = z62.m13369a0(this.f16901c);
        ml3 ml3Var = new ml3();
        u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var2)).getSnapshotObserver();
        C1048pv c1048pv = new C1048pv((byte) 11);
        c1048pv.f28016b = yp1Var;
        c1048pv.f28017c = this;
        c1048pv.f28018d = ml3Var;
        VarHandle.storeStoreFence();
        snapshotObserver.f31675a.m159e(this, f17595X, c1048pv);
        ze2 ze2Var2 = this.f17612K;
        if (ze2Var2 == null) {
            ze2Var2 = new ze2();
            this.f17612K = ze2Var2;
        }
        ze2 ze2Var3 = f17598a0;
        ze2Var3.getClass();
        ze2Var3.f36015a = ze2Var2.f36015a;
        ze2Var3.f36016b = ze2Var2.f36016b;
        ze2Var3.f36017c = ze2Var2.f36017c;
        ze2Var3.f36018d = ze2Var2.f36018d;
        ze2Var3.f36019e = ze2Var2.f36019e;
        ze2Var3.f36020f = ze2Var2.f36020f;
        ze2Var3.f36021g = ze2Var2.f36021g;
        ze2Var2.f36015a = jp3Var.f22490b;
        ze2Var2.f36016b = jp3Var.f22491c;
        ze2Var2.f36017c = jp3Var.f22493e;
        ze2Var2.f36018d = jp3Var.f22494f;
        ze2Var2.f36019e = jp3Var.f22498j;
        ze2Var2.f36020f = jp3Var.f22499k;
        ze2Var2.f36021g = jp3Var.f22500l;
        du1 du1Var = (du1) q63Var;
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = du1Var.f17392c;
        int i = jp3Var.f22489a | du1Var.f17403n;
        du1Var.f17401l = jp3Var.f22506r;
        ky0 ky0Var = jp3Var.f22505q;
        du1Var.f17400k = ky0Var;
        float f = 0.0f;
        if ((1048576 & i) != 0) {
            bu1 bu1Var = du1Var.f17390a;
            jp3Var.f22504p.getClass();
            int iMo3579U = ky0Var.mo3579U(0.0f);
            jp3Var.f22504p.getClass();
            int iMo3579U2 = ky0Var.mo3579U(0.0f);
            jp3Var.f22504p.getClass();
            int iMo3579U3 = ky0Var.mo3579U(0.0f);
            jp3Var.f22504p.getClass();
            int iMo3579U4 = ky0Var.mo3579U(0.0f);
            bu1Var.f15629v = iMo3579U;
            bu1Var.f15630w = iMo3579U2;
            bu1Var.f15631x = iMo3579U3;
            bu1Var.f15632y = iMo3579U4;
            fu1 fu1Var = bu1Var.f15608a;
            if (iMo3579U < 0 || iMo3579U2 < 0 || iMo3579U3 < 0 || iMo3579U4 < 0) {
                StringBuilder sbM13624x = zi4.m13624x("Outsets cannot be negative! Left: ", iMo3579U, ", Top: ", iMo3579U2, ", Right: ");
                sbM13624x.append(iMo3579U3);
                sbM13624x.append(", Bottom: ");
                sbM13624x.append(iMo3579U4);
                p32.m9361a(sbM13624x.toString());
            }
            int i2 = fu1Var.f19314u;
            if (iMo3579U != i2 || iMo3579U2 != fu1Var.f19315v || iMo3579U3 != fu1Var.f19316w || iMo3579U4 != fu1Var.f19317x) {
                boolean z4 = (iMo3579U == i2 && iMo3579U2 == fu1Var.f19315v) ? false : true;
                fu1Var.f19314u = iMo3579U;
                fu1Var.f19315v = iMo3579U2;
                fu1Var.f19316w = iMo3579U3;
                fu1Var.f19317x = iMo3579U4;
                fu1Var.m5809e();
                if (z4) {
                    fu1Var.m5808d();
                }
            }
            du1Var.m4735c();
        } else {
            wf2Var2 = wf2Var2;
            f = 0.0f;
        }
        int i3 = i & 4096;
        if (i3 != 0) {
            du1Var.f17404o = jp3Var.f22500l;
        }
        if ((i & 1) != 0) {
            bu1 bu1Var2 = du1Var.f17390a;
            float f2 = jp3Var.f22490b;
            fu1 fu1Var2 = bu1Var2.f15608a;
            if (fu1Var2.f19304k != f2) {
                fu1Var2.f19304k = f2;
                fu1Var2.f19296c.setScaleX(f2);
            }
        }
        if ((i & 2) != 0) {
            bu1 bu1Var3 = du1Var.f17390a;
            float f3 = jp3Var.f22491c;
            fu1 fu1Var3 = bu1Var3.f15608a;
            if (fu1Var3.f19305l != f3) {
                fu1Var3.f19305l = f3;
                fu1Var3.f19296c.setScaleY(f3);
            }
        }
        if ((i & 4) != 0) {
            du1Var.f17390a.m3689f(jp3Var.f22492d);
        }
        if ((i & 8) != 0) {
            bu1 bu1Var4 = du1Var.f17390a;
            float f4 = jp3Var.f22493e;
            fu1 fu1Var4 = bu1Var4.f15608a;
            if (fu1Var4.f19306m != f4) {
                fu1Var4.f19306m = f4;
                fu1Var4.f19296c.setTranslationX(f4);
            }
        }
        if ((i & 16) != 0) {
            bu1 bu1Var5 = du1Var.f17390a;
            float f5 = jp3Var.f22494f;
            fu1 fu1Var5 = bu1Var5.f15608a;
            if (fu1Var5.f19307n != f5) {
                fu1Var5.f19307n = f5;
                fu1Var5.f19296c.setTranslationY(f5);
            }
        }
        if ((i & 32) != 0) {
            bu1 bu1Var6 = du1Var.f17390a;
            float f6 = jp3Var.f22495g;
            fu1 fu1Var6 = bu1Var6.f15608a;
            if (fu1Var6.f19308o != f6) {
                fu1Var6.f19308o = f6;
                fu1Var6.f19296c.setElevation(f6);
                bu1Var6.f15614g = true;
                bu1Var6.m3684a();
            }
            if (jp3Var.f22495g > f && !du1Var.f17409t && (wp1Var = du1Var.f17394e) != null) {
                wp1Var.invoke();
            }
        }
        if ((i & 64) != 0) {
            bu1 bu1Var7 = du1Var.f17390a;
            long j2 = jp3Var.f22496h;
            fu1 fu1Var7 = bu1Var7.f15608a;
            long j3 = fu1Var7.f19309p;
            int i4 = pb0.f27502i;
            if (!ws4.m12408a(j2, j3)) {
                fu1Var7.f19309p = j2;
                fu1Var7.f19296c.setAmbientShadowColor(zy5.m13858V(j2));
            }
        }
        if ((i & 128) != 0) {
            bu1 bu1Var8 = du1Var.f17390a;
            long j4 = jp3Var.f22497i;
            fu1 fu1Var8 = bu1Var8.f15608a;
            long j5 = fu1Var8.f19310q;
            int i5 = pb0.f27502i;
            if (!ws4.m12408a(j4, j5)) {
                fu1Var8.f19310q = j4;
                fu1Var8.f19296c.setSpotShadowColor(zy5.m13858V(j4));
            }
        }
        if ((i & 1024) != 0) {
            bu1 bu1Var9 = du1Var.f17390a;
            float f7 = jp3Var.f22498j;
            fu1 fu1Var9 = bu1Var9.f15608a;
            if (fu1Var9.f19311r != f7) {
                fu1Var9.f19311r = f7;
                fu1Var9.f19296c.setRotationZ(f7);
            }
        }
        if ((i & 256) != 0) {
            fu1 fu1Var10 = du1Var.f17390a.f15608a;
        }
        if ((i & 512) != 0) {
            fu1 fu1Var11 = du1Var.f17390a.f15608a;
        }
        if ((i & 2048) != 0) {
            bu1 bu1Var10 = du1Var.f17390a;
            float f8 = jp3Var.f22499k;
            fu1 fu1Var12 = bu1Var10.f15608a;
            if (fu1Var12.f19312s != f8) {
                fu1Var12.f19312s = f8;
                fu1Var12.f19296c.setCameraDistance(f8);
            }
        }
        if (i3 != 0) {
            j = 4294967295L;
            boolean zM11081b = to4.m11081b(du1Var.f17404o, to4.f31292b);
            bu1 bu1Var11 = du1Var.f17390a;
            if (zM11081b) {
                bu1Var11.m3690g(9205357640488583168L);
                c = ' ';
            } else {
                c = ' ';
                bu1Var11.m3690g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (du1Var.f17404o & 4294967295L)) * ((int) (du1Var.f17395f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (du1Var.f17404o >> 32)) * ((int) (du1Var.f17395f >> 32)))) << 32));
            }
        } else {
            j = 4294967295L;
            c = ' ';
        }
        if ((i & 16384) != 0) {
            bu1 bu1Var12 = du1Var.f17390a;
            boolean z5 = jp3Var.f22502n;
            if (bu1Var12.f15606A != z5) {
                bu1Var12.f15606A = z5;
                bu1Var12.f15614g = true;
                bu1Var12.m3684a();
            }
        }
        if ((131072 & i) != 0) {
            fu1 fu1Var13 = du1Var.f17390a.f15608a;
        }
        if ((262144 & i) != 0) {
            fu1 fu1Var14 = du1Var.f17390a.f15608a;
        }
        if ((524288 & i) != 0) {
            bu1 bu1Var13 = du1Var.f17390a;
            byte b = jp3Var.f22507s;
            fu1 fu1Var15 = bu1Var13.f15608a;
            if (fu1Var15.f19302i != b) {
                fu1Var15.f19302i = b;
                Paint paint = fu1Var15.f19298e;
                if (paint == null) {
                    paint = new Paint();
                    fu1Var15.f19298e = paint;
                }
                paint.setBlendMode(d24.m4295J(b));
                fu1Var15.m5807c();
            }
        }
        if ((32768 & i) != 0) {
            fu1 fu1Var16 = du1Var.f17390a.f15608a;
            if (fu1Var16.f19293C != 0) {
                fu1Var16.f19293C = 0;
                fu1Var16.m5807c();
            }
        }
        if ((i & 7963) != 0) {
            du1Var.f17406q = true;
            du1Var.f17407r = true;
        }
        if (z62.m13387o(du1Var.f17405p, jp3Var.f22508t)) {
            ze2Var = ze2Var3;
            z2 = false;
            z3 = false;
        } else {
            lb5 lb5Var = jp3Var.f22508t;
            du1Var.f17405p = lb5Var;
            if (lb5Var == null) {
                ze2Var = ze2Var3;
            } else {
                bu1 bu1Var14 = du1Var.f17390a;
                if (lb5Var instanceof h63) {
                    jl3 jl3Var = ((h63) lb5Var).f20408o;
                    float f9 = jl3Var.f22396a;
                    float f10 = jl3Var.f22397b;
                    ze2Var = ze2Var3;
                    bu1Var14.m3692i((((long) Float.floatToRawIntBits(f9)) << c) | (((long) Float.floatToRawIntBits(f10)) & j), (((long) Float.floatToRawIntBits(jl3Var.f22398c - f9)) << c) | (((long) Float.floatToRawIntBits(jl3Var.f22399d - f10)) & j), 0.0f);
                } else {
                    ze2Var = ze2Var3;
                    if (lb5Var instanceof g63) {
                        C0489bf c0489bf = ((g63) lb5Var).f19622o;
                        bu1Var14.f15618k = null;
                        bu1Var14.f15616i = 9205357640488583168L;
                        bu1Var14.f15615h = 0L;
                        bu1Var14.f15617j = f;
                        bu1Var14.f15614g = true;
                        bu1Var14.f15621n = false;
                        bu1Var14.f15619l = c0489bf;
                        bu1Var14.m3684a();
                    } else {
                        if (!(lb5Var instanceof i63)) {
                            C0670g.m5864c();
                            return;
                        }
                        i63 i63Var = (i63) lb5Var;
                        C0489bf c0489bf2 = i63Var.f21140p;
                        if (c0489bf2 != null) {
                            bu1Var14.f15618k = null;
                            bu1Var14.f15616i = 9205357640488583168L;
                            bu1Var14.f15615h = 0L;
                            bu1Var14.f15617j = 0.0f;
                            bu1Var14.f15614g = true;
                            z2 = false;
                            bu1Var14.f15621n = false;
                            bu1Var14.f15619l = c0489bf2;
                            bu1Var14.m3684a();
                        } else {
                            z2 = false;
                            cr3 cr3Var = i63Var.f21139o;
                            bu1Var14.m3692i((((long) Float.floatToRawIntBits(cr3Var.f16391a)) << c) | (((long) Float.floatToRawIntBits(cr3Var.f16392b)) & j), (((long) Float.floatToRawIntBits(cr3Var.m4144b())) << c) | (((long) Float.floatToRawIntBits(cr3Var.m4143a())) & j), Float.intBitsToFloat((int) (cr3Var.f16398h >> c)));
                        }
                    }
                    z3 = true;
                }
            }
            z2 = false;
            z3 = true;
        }
        du1Var.f17403n = jp3Var.f22489a;
        if (i != 0 || z3) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC1140sc.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC1140sc, viewTreeObserverOnGlobalLayoutListenerC1140sc);
            }
            if (ViewTreeObserverOnGlobalLayoutListenerC1140sc.m10594m()) {
                viewTreeObserverOnGlobalLayoutListenerC1140sc.m10608M(0.0f);
            }
        }
        boolean z6 = this.f17602A;
        this.f17602A = jp3Var.f22502n;
        this.f17606E = jp3Var.f22492d;
        ze2 ze2Var4 = ze2Var;
        boolean z7 = (ze2Var4.f36015a == ze2Var2.f36015a && ze2Var4.f36016b == ze2Var2.f36016b && ze2Var4.f36017c == ze2Var2.f36017c && ze2Var4.f36018d == ze2Var2.f36018d && ze2Var4.f36019e == ze2Var2.f36019e && ze2Var4.f36020f == ze2Var2.f36020f && to4.m11081b(ze2Var4.f36021g, ze2Var2.f36021g)) ? true : z2;
        if (!z || (z7 && z6 == this.f17602A && !ml3Var.f25002a)) {
            wf2Var = wf2Var2;
        } else {
            wf2Var = wf2Var2;
            r63 r63Var = wf2Var.f33325o;
            if (r63Var != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).m10623w(wf2Var);
            }
        }
        if (z7) {
            return;
        }
        wf2Var.m12262P(this);
        if (wf2Var.f33309Q > 0) {
            ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc2 = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var);
            z32 z32Var = viewTreeObserverOnGlobalLayoutListenerC1140sc2.f30097P.f32098e;
            z32Var.getClass();
            if (wf2Var.f33309Q > 0) {
                ((uw2) z32Var.f35738b).m11663b(wf2Var);
                wf2Var.f33308P = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC1140sc2.m10601F(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x017c  */
    /* JADX INFO: renamed from: B1 */
    public final boolean m4851B1(long j) {
        boolean z;
        boolean z2;
        boolean zM6100y;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        q63 q63Var = this.f17623V;
        if (q63Var == null || !this.f17602A) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        bu1 bu1Var = ((du1) q63Var).f17390a;
        if (bu1Var.f15606A) {
            lb5 lb5VarM3687d = bu1Var.m3687d();
            if (lb5VarM3687d instanceof h63) {
                jl3 jl3Var = ((h63) lb5VarM3687d).f20408o;
                if (jl3Var.f22396a > fIntBitsToFloat || fIntBitsToFloat >= jl3Var.f22398c || jl3Var.f22397b > fIntBitsToFloat2 || fIntBitsToFloat2 >= jl3Var.f22399d) {
                    z = false;
                    z2 = true;
                }
                z = false;
                z2 = true;
            } else if (lb5VarM3687d instanceof i63) {
                cr3 cr3Var = ((i63) lb5VarM3687d).f21139o;
                float f = cr3Var.f16391a;
                long j2 = cr3Var.f16396f;
                long j3 = cr3Var.f16398h;
                long j4 = cr3Var.f16397g;
                float f2 = cr3Var.f16394d;
                float f3 = cr3Var.f16392b;
                z = false;
                float f4 = cr3Var.f16393c;
                z2 = true;
                long j5 = cr3Var.f16395e;
                if (fIntBitsToFloat >= f && fIntBitsToFloat < f4 && fIntBitsToFloat2 >= f3 && fIntBitsToFloat2 < f2) {
                    int i = (int) (j5 >> 32);
                    int i2 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= cr3Var.m4144b()) {
                        int i3 = (int) (j3 >> 32);
                        int i4 = (int) (j4 >> 32);
                        if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= cr3Var.m4144b()) {
                            int i5 = (int) (j5 & 4294967295L);
                            int i6 = (int) (j3 & 4294967295L);
                            if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= cr3Var.m4143a()) {
                                int i7 = (int) (j2 & 4294967295L);
                                int i8 = (int) (j4 & 4294967295L);
                                if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= cr3Var.m4143a()) {
                                    float fIntBitsToFloat3 = Float.intBitsToFloat(i) + f;
                                    float fIntBitsToFloat4 = Float.intBitsToFloat(i5) + f3;
                                    float fIntBitsToFloat5 = f4 - Float.intBitsToFloat(i2);
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i7) + f3;
                                    float fIntBitsToFloat7 = f4 - Float.intBitsToFloat(i4);
                                    float fIntBitsToFloat8 = f2 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat9 = f2 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat10 = Float.intBitsToFloat(i3) + f;
                                    if (fIntBitsToFloat < fIntBitsToFloat3 && fIntBitsToFloat2 < fIntBitsToFloat4) {
                                        zM6100y = gq6.m6100y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, cr3Var.f16395e);
                                    } else if (fIntBitsToFloat < fIntBitsToFloat10 && fIntBitsToFloat2 > fIntBitsToFloat9) {
                                        zM6100y = gq6.m6100y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat10, fIntBitsToFloat9, cr3Var.f16398h);
                                    } else if (fIntBitsToFloat <= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) {
                                        zM6100y = (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 <= fIntBitsToFloat8) ? z2 : gq6.m6100y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, cr3Var.f16397g);
                                    } else {
                                        zM6100y = gq6.m6100y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, cr3Var.f16396f);
                                    }
                                } else {
                                    C0489bf c0489bfM4495a = AbstractC0573df.m4495a();
                                    C0489bf.m3559b(c0489bfM4495a, cr3Var);
                                    zM6100y = gq6.m6099x(fIntBitsToFloat, fIntBitsToFloat2, c0489bfM4495a);
                                }
                            } else {
                                C0489bf c0489bfM4495a2 = AbstractC0573df.m4495a();
                                C0489bf.m3559b(c0489bfM4495a2, cr3Var);
                                zM6100y = gq6.m6099x(fIntBitsToFloat, fIntBitsToFloat2, c0489bfM4495a2);
                            }
                        } else {
                            C0489bf c0489bfM4495a3 = AbstractC0573df.m4495a();
                            C0489bf.m3559b(c0489bfM4495a3, cr3Var);
                            zM6100y = gq6.m6099x(fIntBitsToFloat, fIntBitsToFloat2, c0489bfM4495a3);
                        }
                    } else {
                        C0489bf c0489bfM4495a4 = AbstractC0573df.m4495a();
                        C0489bf.m3559b(c0489bfM4495a4, cr3Var);
                        zM6100y = gq6.m6099x(fIntBitsToFloat, fIntBitsToFloat2, c0489bfM4495a4);
                    }
                }
            } else {
                z = false;
                z2 = true;
                if (!(lb5VarM3687d instanceof g63)) {
                    C0670g.m5864c();
                    return false;
                }
                zM6100y = gq6.m6099x(fIntBitsToFloat, fIntBitsToFloat2, ((g63) lb5VarM3687d).f19622o);
            }
            zM6100y = z;
        } else {
            z = false;
            z2 = true;
        }
        return zM6100y ? z2 : z;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4853D0() {
        return this.f17607F != null;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: E0 */
    public final wf2 mo4854E0() {
        return this.f17625u;
    }

    @Override // p000.so2, p000.s63
    /* JADX INFO: renamed from: F */
    public final boolean mo3599F() {
        return (this.f17623V == null || this.f17630z || !this.f17625u.m12256J()) ? false : true;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: F0 */
    public final yq2 mo4855F0() {
        yq2 yq2Var = this.f17607F;
        if (yq2Var != null) {
            return yq2Var;
        }
        C1077qn.m9989o("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: G */
    public final long mo3998G(cf2 cf2Var, long j) {
        return mo4006V(cf2Var, j, true);
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: G0 */
    public final so2 mo4856G0() {
        return this.f17629y;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: H0 */
    public final long mo4857H0() {
        return this.f17609H;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: I */
    public final long mo3999I(long j) {
        if (!mo4871Z0().f25208n) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo4006V(y42.m12861j0(this), ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(this.f17625u)).m10602G(j), true);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: K */
    public final boolean mo4000K() {
        return mo4871Z0().f25208n;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: L0 */
    public final void mo4858L0() {
        bu1 bu1Var = this.f17624W;
        long j = this.f17609H;
        if (bu1Var != null) {
            mo4425p0(j, this.f17610I, bu1Var);
        } else {
            mo4424n0(j, this.f17610I, this.f17603B);
        }
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: N */
    public final void mo4001N(float[] fArr) {
        r63 r63VarM13548a = zf2.m13548a(this.f17625u);
        e13 e13VarM4849v1 = m4849v1(y42.m12861j0(this));
        m4895y1(e13VarM4849v1, fArr);
        if (r63VarM13548a instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63VarM13548a).m10617q(fArr);
            return;
        }
        long jMo4007b = e13VarM4849v1.mo4007b(0L);
        if ((9223372034707292159L & jMo4007b) != 9205357640488583168L) {
            rq2.m10399i(fArr, Float.intBitsToFloat((int) (jMo4007b >> 32)), Float.intBitsToFloat((int) (jMo4007b & 4294967295L)));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m4859N0(e13 e13Var, kw2 kw2Var, boolean z) {
        if (e13Var == this) {
            return;
        }
        e13 e13Var2 = this.f17629y;
        if (e13Var2 != null) {
            e13Var2.m4859N0(e13Var, kw2Var, z);
        }
        long j = this.f17609H;
        float f = (int) (j >> 32);
        kw2Var.f23558a -= f;
        kw2Var.f23560c -= f;
        float f2 = (int) (j & 4294967295L);
        kw2Var.f23559b -= f2;
        kw2Var.f23561d -= f2;
        q63 q63Var = this.f17623V;
        if (q63Var != null) {
            du1 du1Var = (du1) q63Var;
            float[] fArrM4733a = du1Var.m4733a();
            if (!du1Var.f17408s) {
                if (fArrM4733a == null) {
                    kw2Var.f23558a = 0.0f;
                    kw2Var.f23559b = 0.0f;
                    kw2Var.f23560c = 0.0f;
                    kw2Var.f23561d = 0.0f;
                } else {
                    rq2.m10394d(fArrM4733a, kw2Var);
                }
            }
            if (this.f17602A && z) {
                long j2 = this.f16901c;
                kw2Var.m7640a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final long m4860O0(e13 e13Var, long j, boolean z) {
        if (e13Var == this) {
            return j;
        }
        e13 e13Var2 = this.f17629y;
        return (e13Var2 == null || z62.m13387o(e13Var, e13Var2)) ? m4867V0(j, z) : m4867V0(e13Var2.m4860O0(e13Var, j, z), z);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: P */
    public final void mo4002P(cf2 cf2Var, float[] fArr) {
        e13 e13VarM4849v1 = m4849v1(cf2Var);
        e13VarM4849v1.m4881j1();
        e13 e13VarM4866U0 = m4866U0(e13VarM4849v1);
        rq2.m10395e(fArr);
        e13VarM4849v1.m4895y1(e13VarM4866U0, fArr);
        m4894x1(e13VarM4866U0, fArr);
    }

    /* JADX INFO: renamed from: P0 */
    public final long m4861P0(long j) {
        float fMo4421j0;
        float fMo4420i0;
        if (m4872a1()) {
            jl3 jl3Var = this.f17614M;
            fMo4421j0 = jl3Var.f22398c - jl3Var.f22396a;
        } else {
            fMo4421j0 = mo4421j0();
        }
        if (m4872a1()) {
            jl3 jl3Var2 = this.f17614M;
            fMo4420i0 = jl3Var2.f22399d - jl3Var2.f22397b;
        } else {
            fMo4420i0 = mo4420i0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fMo4421j0;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fMo4420i0;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: Q */
    public final jl3 mo4003Q(cf2 cf2Var, boolean z) {
        if (!mo4871Z0().f25208n) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!cf2Var.mo4000K()) {
            q32.m9721c("LayoutCoordinates " + cf2Var + " is not attached!");
        }
        e13 e13VarM4849v1 = m4849v1(cf2Var);
        e13VarM4849v1.m4881j1();
        e13 e13VarM4866U0 = m4866U0(e13VarM4849v1);
        kw2 kw2Var = this.f17611J;
        if (kw2Var == null) {
            kw2Var = new kw2();
            this.f17611J = kw2Var;
        }
        kw2Var.f23558a = 0.0f;
        kw2Var.f23559b = 0.0f;
        kw2Var.f23560c = (int) (cf2Var.mo4004R() >> 32);
        kw2Var.f23561d = (int) (cf2Var.mo4004R() & 4294967295L);
        while (e13VarM4849v1 != e13VarM4866U0) {
            e13VarM4849v1.m4889r1(kw2Var, z, false);
            if (kw2Var.m7641b()) {
                return jl3.f22395e;
            }
            e13VarM4849v1 = e13VarM4849v1.f17629y;
        }
        m4859N0(e13VarM4866U0, kw2Var, z);
        return new jl3(kw2Var.f23558a, kw2Var.f23559b, kw2Var.f23560c, kw2Var.f23561d);
    }

    /* JADX INFO: renamed from: Q0 */
    public final float m4862Q0(long j, long j2) {
        if (mo4421j0() >= Float.intBitsToFloat((int) (j2 >> 32)) && mo4420i0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM4861P0 = m4861P0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM4861P0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM4861P0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo4421j0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo4420i0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: R */
    public final long mo4004R() {
        return this.f16901c;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m4863R0(h70 h70Var, bu1 bu1Var) throws Throwable {
        q63 q63Var = this.f17623V;
        if (q63Var == null) {
            long j = this.f17609H;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            h70Var.mo6249e(f, f2);
            m4864S0(h70Var, bu1Var);
            h70Var.mo6249e(-f, -f2);
            return;
        }
        du1 du1Var = (du1) q63Var;
        j70 j70Var = du1Var.f17402m;
        du1Var.m4739g();
        du1Var.f17409t = du1Var.f17390a.f15608a.f19308o > 0.0f;
        jp0 jp0Var = j70Var.f22064b;
        jp0Var.m7226P(h70Var);
        jp0Var.f22482c = bu1Var;
        dt0.m4724z(j70Var, du1Var.f17390a);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: S */
    public final long mo4005S(long j) {
        if (!mo4871Z0().f25208n) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m4881j1();
        while (this != null) {
            wf2 wf2Var = this.f17625u;
            if (this == ((e13) wf2Var.f33299G.f25608e) && !wf2Var.f33313c) {
                long jM8028b = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getRectManager().m8028b(wf2Var);
                if (!o52.m8956c(jM8028b, 9223372034707292159L)) {
                    return y42.m12819A0(j, jM8028b);
                }
            }
            q63 q63Var = this.f17623V;
            if (q63Var != null) {
                du1 du1Var = (du1) q63Var;
                float[] fArrM4734b = du1Var.m4734b();
                if (!du1Var.f17408s) {
                    j = rq2.m10393c(j, fArrM4734b);
                }
            }
            j = y42.m12819A0(j, this.f17609H);
            this = this.f17629y;
        }
        return j;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m4864S0(h70 h70Var, bu1 bu1Var) throws Throwable {
        e13 e13Var;
        h70 h70Var2;
        bu1 bu1Var2;
        mt2 mt2VarM4873b1 = m4873b1(4);
        if (mt2VarM4873b1 == null) {
            mo4887p1(h70Var, bu1Var);
            return;
        }
        wf2 wf2Var = this.f17625u;
        wf2Var.getClass();
        yf2 sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getSharedDrawScope();
        long jM13369a0 = z62.m13369a0(this.f16901c);
        sharedDrawScope.getClass();
        uw2 uw2Var = null;
        while (mt2VarM4873b1 != null) {
            if (mt2VarM4873b1 instanceof s31) {
                e13Var = this;
                h70Var2 = h70Var;
                bu1Var2 = bu1Var;
                sharedDrawScope.m13114b(h70Var2, jM13369a0, e13Var, (s31) mt2VarM4873b1, bu1Var2);
            } else {
                e13Var = this;
                h70Var2 = h70Var;
                bu1Var2 = bu1Var;
                if ((mt2VarM4873b1.f25197c & 4) != 0 && (mt2VarM4873b1 instanceof qx0)) {
                    int i = 0;
                    for (mt2 mt2Var = ((qx0) mt2VarM4873b1).f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
                        if ((mt2Var.f25197c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                mt2VarM4873b1 = mt2Var;
                            } else {
                                if (uw2Var == null) {
                                    uw2Var = new uw2(new mt2[16]);
                                }
                                if (mt2VarM4873b1 != null) {
                                    uw2Var.m11663b(mt2VarM4873b1);
                                    mt2VarM4873b1 = null;
                                }
                                uw2Var.m11663b(mt2Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                h70Var = h70Var2;
                this = e13Var;
                bu1Var = bu1Var2;
            }
            mt2VarM4873b1 = sc6.m10644P(uw2Var);
            h70Var = h70Var2;
            this = e13Var;
            bu1Var = bu1Var2;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public abstract void mo4865T0();

    /* JADX INFO: renamed from: U0 */
    public final e13 m4866U0(e13 e13Var) {
        wf2 wf2VarM12295v = e13Var.f17625u;
        wf2 wf2Var = this.f17625u;
        if (wf2VarM12295v == wf2Var) {
            mt2 mt2VarMo4871Z0 = e13Var.mo4871Z0();
            mt2 mt2VarMo4871Z1 = mo4871Z0();
            if (!mt2VarMo4871Z1.f25195a.f25208n) {
                q32.m9721c("visitLocalAncestors called on an unattached node");
            }
            for (mt2 mt2Var = mt2VarMo4871Z1.f25195a.f25199e; mt2Var != null; mt2Var = mt2Var.f25199e) {
                if ((mt2Var.f25197c & 2) != 0 && mt2Var == mt2VarMo4871Z0) {
                    return e13Var;
                }
            }
            return this;
        }
        while (wf2VarM12295v.f33327q > wf2Var.f33327q) {
            wf2VarM12295v = wf2VarM12295v.m12295v();
        }
        wf2 wf2VarM12295v2 = wf2Var;
        while (wf2VarM12295v2.f33327q > wf2VarM12295v.f33327q) {
            wf2VarM12295v2 = wf2VarM12295v2.m12295v();
        }
        while (wf2VarM12295v != wf2VarM12295v2) {
            wf2VarM12295v = wf2VarM12295v.m12295v();
            wf2VarM12295v2 = wf2VarM12295v2.m12295v();
            if (wf2VarM12295v == null || wf2VarM12295v2 == null) {
                C1077qn.m9987m("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (wf2VarM12295v2 != wf2Var) {
            if (wf2VarM12295v != e13Var.f17625u) {
                return (w32) wf2VarM12295v.f33299G.f25607d;
            }
            return e13Var;
        }
        return this;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: V */
    public final long mo4006V(cf2 cf2Var, long j, boolean z) {
        if (cf2Var instanceof vo2) {
            vo2 vo2Var = (vo2) cf2Var;
            vo2Var.f32763a.f32026u.m4881j1();
            return vo2Var.mo4006V(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        e13 e13VarM4849v1 = m4849v1(cf2Var);
        e13VarM4849v1.m4881j1();
        e13 e13VarM4866U0 = m4866U0(e13VarM4849v1);
        while (e13VarM4849v1 != e13VarM4866U0) {
            q63 q63Var = e13VarM4849v1.f17623V;
            if (q63Var != null) {
                du1 du1Var = (du1) q63Var;
                float[] fArrM4734b = du1Var.m4734b();
                if (!du1Var.f17408s) {
                    j = rq2.m10393c(j, fArrM4734b);
                }
            }
            if (z || !e13VarM4849v1.f30438l) {
                j = y42.m12819A0(j, e13VarM4849v1.f17609H);
            }
            e13VarM4849v1 = e13VarM4849v1.f17629y;
        }
        return m4860O0(e13VarM4866U0, j, z);
    }

    /* JADX INFO: renamed from: V0 */
    public final long m4867V0(long j, boolean z) {
        if (z || !this.f30438l) {
            long j2 = this.f17609H;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        q63 q63Var = this.f17623V;
        if (q63Var != null) {
            du1 du1Var = (du1) q63Var;
            float[] fArrM4733a = du1Var.m4733a();
            if (fArrM4733a == null) {
                return 9187343241974906880L;
            }
            if (!du1Var.f17408s) {
                return rq2.m10393c(j, fArrM4733a);
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: W0 */
    public final mq1 m4868W0() {
        er1 er1Var = this.f17620S;
        if (er1Var != null) {
            return er1Var;
        }
        b13 b13Var = new b13((byte) 0);
        b13Var.f15023b = this;
        VarHandle.storeStoreFence();
        er1 er1Var2 = new er1((byte) 8);
        er1Var2.f18412b = this;
        er1Var2.f18413c = b13Var;
        VarHandle.storeStoreFence();
        this.f17620S = er1Var2;
        return er1Var2;
    }

    /* JADX INFO: renamed from: X0 */
    public abstract uo2 mo4869X0();

    /* JADX INFO: renamed from: Y0 */
    public final long m4870Y0() {
        return this.f17604C.mo3581c0(this.f17625u.f33294B.mo5862g());
    }

    /* JADX INFO: renamed from: Z0 */
    public abstract mt2 mo4871Z0();

    /* JADX INFO: renamed from: a1 */
    public final boolean m4872a1() {
        return this.f17616O && !this.f17614M.m7171g();
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: b */
    public final long mo4007b(long j) {
        if (!mo4871Z0().f25208n) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(this.f17625u)).m10618r(mo4005S(j));
    }

    /* JADX INFO: renamed from: b1 */
    public final mt2 m4873b1(int i) {
        boolean zM5457g = f13.m5457g(i);
        mt2 mt2VarMo4871Z0 = mo4871Z0();
        if (!zM5457g && (mt2VarMo4871Z0 = mt2VarMo4871Z0.f25199e) == null) {
            return null;
        }
        for (mt2 mt2VarM4874c1 = m4874c1(zM5457g); mt2VarM4874c1 != null && (mt2VarM4874c1.f25198d & i) != 0; mt2VarM4874c1 = mt2VarM4874c1.f25200f) {
            if ((mt2VarM4874c1.f25197c & i) != 0) {
                return mt2VarM4874c1;
            }
            if (mt2VarM4874c1 == mt2VarMo4871Z0) {
                return null;
            }
        }
        return null;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f17625u.f33336z.mo3580c();
    }

    /* JADX INFO: renamed from: c1 */
    public final mt2 m4874c1(boolean z) {
        mt2 mt2VarMo4871Z0;
        C0940nb c0940nb = this.f17625u.f33299G;
        if (((e13) c0940nb.f25608e) == this) {
            return (mt2) c0940nb.f25610g;
        }
        e13 e13Var = this.f17629y;
        if (!z) {
            if (e13Var != null) {
                return e13Var.mo4871Z0();
            }
            return null;
        }
        if (e13Var == null || (mt2VarMo4871Z0 = e13Var.mo4871Z0()) == null) {
            return null;
        }
        return mt2VarMo4871Z0.f25200f;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m4875d1(mt2 mt2Var, d13 d13Var, long j, qw1 qw1Var, int i, boolean z) {
        if (mt2Var == null) {
            mo4878g1(d13Var, j, qw1Var, i, z);
            return;
        }
        if (!d13Var.mo4279h(mt2Var)) {
            m4875d1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z);
            return;
        }
        int i2 = qw1Var.f28849c;
        cw2 cw2Var = qw1Var.f28847a;
        qw1Var.m10144b(i2 + 1, cw2Var.f16533b);
        qw1Var.f28849c++;
        cw2Var.m4200a(mt2Var);
        qw1Var.f28848b.m10470a(C0006a5.m63a(-1.0f, z, false));
        m4875d1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z);
        qw1Var.f28849c = i2;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m4876e1(mt2 mt2Var, d13 d13Var, long j, qw1 qw1Var, int i, boolean z, float f) {
        if (mt2Var == null) {
            mo4878g1(d13Var, j, qw1Var, i, z);
            return;
        }
        if (!d13Var.mo4279h(mt2Var)) {
            m4876e1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f);
            return;
        }
        int i2 = qw1Var.f28849c;
        cw2 cw2Var = qw1Var.f28847a;
        qw1Var.m10144b(i2 + 1, cw2Var.f16533b);
        qw1Var.f28849c++;
        cw2Var.m4200a(mt2Var);
        qw1Var.f28848b.m10470a(C0006a5.m63a(f, z, false));
        m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f, true);
        qw1Var.f28849c = i2;
    }

    /* JADX INFO: renamed from: f1 */
    public final void m4877f1(d13 d13Var, long j, qw1 qw1Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        mt2 mt2VarM4873b1 = m4873b1(d13Var.mo3791e());
        if (!m4851B1(j)) {
            if (i == 1) {
                float fM4862Q0 = m4862Q0(j, m4870Y0());
                if ((Float.floatToRawIntBits(fM4862Q0) & Integer.MAX_VALUE) < 2139095040) {
                    if (qw1Var.f28849c != kx5.m7689T(qw1Var)) {
                        if (zp0.m13684p(qw1Var.m10143a(), C0006a5.m63a(fM4862Q0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m4876e1(mt2VarM4873b1, d13Var, j, qw1Var, i, false, fM4862Q0);
                    return;
                }
                return;
            }
            return;
        }
        if (mt2VarM4873b1 == null) {
            mo4878g1(d13Var, j, qw1Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo4421j0() && fIntBitsToFloat2 < mo4420i0()) {
            m4875d1(mt2VarM4873b1, d13Var, j, qw1Var, i, z);
            return;
        }
        float fM4862Q1 = i == 1 ? m4862Q0(j, m4870Y0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM4862Q1) & Integer.MAX_VALUE) < 2139095040) {
            if (qw1Var.f28849c != kx5.m7689T(qw1Var)) {
                z2 = z;
                if (zp0.m13684p(qw1Var.m10143a(), C0006a5.m63a(fM4862Q1, z2, false)) > 0) {
                }
                m4886o1(mt2VarM4873b1, d13Var, j, qw1Var, i, z2, fM4862Q1, z3);
            }
            z2 = z;
            z3 = true;
            m4886o1(mt2VarM4873b1, d13Var, j, qw1Var, i, z2, fM4862Q1, z3);
        }
        z2 = z;
        z3 = false;
        m4886o1(mt2VarM4873b1, d13Var, j, qw1Var, i, z2, fM4862Q1, z3);
    }

    /* JADX INFO: renamed from: g1 */
    public void mo4878g1(d13 d13Var, long j, qw1 qw1Var, int i, boolean z) {
        e13 e13Var = this.f17628x;
        if (e13Var != null) {
            e13Var.m4877f1(d13Var, e13Var.m4867V0(j, true), qw1Var, i, z);
        }
    }

    @Override // p000.s62
    public final df2 getLayoutDirection() {
        return this.f17625u.f33293A;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m4879h1() {
        q63 q63Var = this.f17623V;
        if (q63Var != null) {
            ((du1) q63Var).m4735c();
            return;
        }
        e13 e13Var = this.f17629y;
        if (e13Var != null) {
            e13Var.m4879h1();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final boolean m4880i1() {
        if (this.f17623V != null && this.f17606E <= 0.0f) {
            return true;
        }
        e13 e13Var = this.f17629y;
        if (e13Var != null) {
            return e13Var.m4880i1();
        }
        return false;
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: j */
    public final long mo4008j(long j) {
        if (!mo4871Z0().f25208n) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cf2 cf2VarM12861j0 = y42.m12861j0(this);
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(this.f17625u);
        viewTreeObserverOnGlobalLayoutListenerC1140sc.m10597B();
        return mo4006V(cf2VarM12861j0, b33.m3429g(rq2.m10393c(j, viewTreeObserverOnGlobalLayoutListenerC1140sc.f30103V), cf2VarM12861j0.mo4005S(0L)), true);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m4881j1() {
        this.f17625u.f33300H.m2983b();
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: k */
    public final long mo4009k(long j) {
        long jMo4005S = mo4005S(j);
        ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = (ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(this.f17625u);
        viewTreeObserverOnGlobalLayoutListenerC1140sc.m10597B();
        return rq2.m10393c(jMo4005S, viewTreeObserverOnGlobalLayoutListenerC1140sc.f30102U);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v7, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [uw2] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: k1 */
    public final void m4882k1() {
        mt2 mt2VarMo4871Z0;
        boolean zM5457g = f13.m5457g(128);
        mt2 mt2VarM4874c1 = m4874c1(zM5457g);
        if (mt2VarM4874c1 == null || (mt2VarM4874c1.f25195a.f25198d & 128) == 0) {
            return;
        }
        e94 e94VarM5353c0 = ev0.m5353c0();
        yp1 yp1VarMo3783e = e94VarM5353c0 != null ? e94VarM5353c0.mo3783e() : null;
        e94 e94VarM5361k0 = ev0.m5361k0(e94VarM5353c0);
        try {
            if (!zM5457g) {
                mt2VarMo4871Z0 = mo4871Z0().f25199e;
                if (mt2VarMo4871Z0 == null) {
                }
                ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            }
            mt2VarMo4871Z0 = mo4871Z0();
            for (mt2 mt2VarM4874c2 = m4874c1(zM5457g); mt2VarM4874c2 != null && (mt2VarM4874c2.f25198d & 128) != 0; mt2VarM4874c2 = mt2VarM4874c2.f25200f) {
                if ((mt2VarM4874c2.f25197c & 128) != 0) {
                    ?? M10644P = mt2VarM4874c2;
                    ?? uw2Var = 0;
                    while (M10644P != 0) {
                        if (M10644P instanceof cr2) {
                            ((cr2) M10644P).mo2964b(this.f16901c);
                        } else if ((M10644P.f25197c & 128) != 0 && (M10644P instanceof qx0)) {
                            mt2 mt2Var = ((qx0) M10644P).f28863p;
                            int i = 0;
                            M10644P = M10644P;
                            uw2Var = uw2Var;
                            while (mt2Var != null) {
                                if ((mt2Var.f25197c & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        uw2Var = uw2Var;
                                        M10644P = mt2Var;
                                    } else {
                                        if (uw2Var == 0) {
                                            uw2Var = new uw2(new mt2[16]);
                                        }
                                        if (M10644P != 0) {
                                            uw2Var.m11663b(M10644P);
                                            M10644P = 0;
                                        }
                                        uw2Var.m11663b(mt2Var);
                                    }
                                }
                                mt2Var = mt2Var.f25200f;
                                M10644P = M10644P;
                                uw2Var = uw2Var;
                            }
                            if (i == 1) {
                            }
                        }
                        M10644P = sc6.m10644P(uw2Var);
                    }
                }
                if (mt2VarM4874c2 == mt2VarMo4871Z0) {
                    break;
                }
            }
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
        } catch (Throwable th) {
            ev0.m5370t0(e94VarM5353c0, e94VarM5361k0, yp1VarMo3783e);
            throw th;
        }
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: l */
    public final boolean mo4010l() {
        return this.f30438l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: l1 */
    public final void m4883l1() {
        boolean zM5457g = f13.m5457g(4194304);
        mt2 mt2VarMo4871Z0 = mo4871Z0();
        if (!zM5457g && (mt2VarMo4871Z0 = mt2VarMo4871Z0.f25199e) == null) {
            return;
        }
        for (mt2 mt2VarM4874c1 = m4874c1(zM5457g); mt2VarM4874c1 != null && (mt2VarM4874c1.f25198d & 4194304) != 0; mt2VarM4874c1 = mt2VarM4874c1.f25200f) {
            if ((mt2VarM4874c1.f25197c & 4194304) != 0) {
                ?? M10644P = mt2VarM4874c1;
                ?? uw2Var = 0;
                while (M10644P != 0) {
                    if (M10644P instanceof af2) {
                        ((af2) M10644P).mo2965v(this);
                    } else if ((M10644P.f25197c & 4194304) != 0 && (M10644P instanceof qx0)) {
                        mt2 mt2Var = ((qx0) M10644P).f28863p;
                        int i = 0;
                        M10644P = M10644P;
                        uw2Var = uw2Var;
                        while (mt2Var != null) {
                            if ((mt2Var.f25197c & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    uw2Var = uw2Var;
                                    M10644P = mt2Var;
                                } else {
                                    if (uw2Var == 0) {
                                        uw2Var = new uw2(new mt2[16]);
                                    }
                                    if (M10644P != 0) {
                                        uw2Var.m11663b(M10644P);
                                        M10644P = 0;
                                    }
                                    uw2Var.m11663b(mt2Var);
                                }
                            }
                            mt2Var = mt2Var.f25200f;
                            M10644P = M10644P;
                            uw2Var = uw2Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M10644P = sc6.m10644P(uw2Var);
                }
            }
            if (mt2VarM4874c1 == mt2VarMo4871Z0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // p000.db3, p000.sq2
    /* JADX INFO: renamed from: m */
    public final Object mo4423m() {
        wf2 wf2Var = this.f17625u;
        if (!wf2Var.f33299G.m8671i(64)) {
            return null;
        }
        mo4871Z0();
        Object objMo5931q0 = null;
        for (mt2 mt2Var = (vh4) wf2Var.f33299G.f25609f; mt2Var != null; mt2Var = mt2Var.f25199e) {
            if ((mt2Var.f25197c & 64) != 0) {
                ?? M10644P = mt2Var;
                ?? uw2Var = 0;
                while (M10644P != 0) {
                    if (M10644P instanceof g83) {
                        objMo5931q0 = ((g83) M10644P).mo5931q0(objMo5931q0);
                    } else if ((M10644P.f25197c & 64) != 0 && (M10644P instanceof qx0)) {
                        mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                        int i = 0;
                        M10644P = M10644P;
                        uw2Var = uw2Var;
                        while (mt2Var2 != null) {
                            if ((mt2Var2.f25197c & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    uw2Var = uw2Var;
                                    M10644P = mt2Var2;
                                } else {
                                    if (uw2Var == 0) {
                                        uw2Var = new uw2(new mt2[16]);
                                    }
                                    if (M10644P != 0) {
                                        uw2Var.m11663b(M10644P);
                                        M10644P = 0;
                                    }
                                    uw2Var.m11663b(mt2Var2);
                                }
                            }
                            mt2Var2 = mt2Var2.f25200f;
                            M10644P = M10644P;
                            uw2Var = uw2Var;
                        }
                        if (i == 1) {
                        }
                    }
                    M10644P = sc6.m10644P(uw2Var);
                }
            }
        }
        return objMo5931q0;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m4884m1() {
        this.f17630z = true;
        this.f17621T.invoke();
        m4890s1();
        if (o52.m8956c(this.f17609H, 0L)) {
            return;
        }
        this.f17625u.m12262P(this);
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: n */
    public final cf2 mo4011n() {
        boolean z = mo4871Z0().f25208n;
        wf2 wf2Var = this.f17625u;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (wf2 wf2VarM12295v = wf2Var; wf2VarM12295v != null; wf2VarM12295v = wf2VarM12295v.m12295v()) {
                sb.append("\n|");
                sb.append(wf2VarM12295v);
                sb.append(" isAttached=");
                sb.append(wf2VarM12295v.m12256J());
                sb.append(" modifier=");
                sb.append(wf2VarM12295v.f33304L);
                sb.append(" tail=");
                sb.append(mo4871Z0());
            }
            q32.m9721c(sb.toString());
        }
        m4881j1();
        return ((e13) wf2Var.f33299G.f25608e).f17629y;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m4885n1() {
        boolean zM5457g = f13.m5457g(1048576);
        mt2 mt2VarM4874c1 = m4874c1(zM5457g);
        if (mt2VarM4874c1 == null || (mt2VarM4874c1.f25195a.f25198d & 1048576) == 0) {
            return;
        }
        mt2 mt2VarMo4871Z0 = mo4871Z0();
        if (!zM5457g && (mt2VarMo4871Z0 = mt2VarMo4871Z0.f25199e) == null) {
            return;
        }
        for (mt2 mt2VarM4874c2 = m4874c1(zM5457g); mt2VarM4874c2 != null && (mt2VarM4874c2.f25198d & 1048576) != 0; mt2VarM4874c2 = mt2VarM4874c2.f25200f) {
            if ((mt2VarM4874c2.f25197c & 1048576) != 0) {
                mt2 mt2VarM10644P = mt2VarM4874c2;
                uw2 uw2Var = null;
                while (mt2VarM10644P != null) {
                    if (mt2VarM10644P instanceof sl1) {
                    } else if ((mt2VarM10644P.f25197c & 1048576) != 0 && (mt2VarM10644P instanceof qx0)) {
                        int i = 0;
                        for (mt2 mt2Var = ((qx0) mt2VarM10644P).f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
                            if ((mt2Var.f25197c & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    mt2VarM10644P = mt2Var;
                                } else {
                                    if (uw2Var == null) {
                                        uw2Var = new uw2(new mt2[16]);
                                    }
                                    if (mt2VarM10644P != null) {
                                        uw2Var.m11663b(mt2VarM10644P);
                                        mt2VarM10644P = null;
                                    }
                                    uw2Var.m11663b(mt2Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    mt2VarM10644P = sc6.m10644P(uw2Var);
                }
            }
            if (mt2VarM4874c2 == mt2VarMo4871Z0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01d7 A[PHI: r3
  0x01d7: PHI (r3v27 ??) = (r3v1 ??), (r3v1 ??), (r3v29 ??) binds: [B:59:0x01a1, B:61:0x01a5, B:75:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [mt2] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [mt2] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v27, types: [uw2] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [uw2] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX INFO: renamed from: o1 */
    public final void m4886o1(mt2 mt2Var, d13 d13Var, long j, qw1 qw1Var, int i, boolean z, float f, boolean z2) {
        ?? M10644P;
        if (mt2Var == null) {
            mo4878g1(d13Var, j, qw1Var, i, z);
            return;
        }
        if (!d13Var.mo4279h(mt2Var)) {
            m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (i2 == 3 || i2 == 4) {
            ?? r2 = mt2Var;
            ?? uw2Var = 0;
            while (r2 != 0) {
                if (r2 instanceof oc3) {
                    long jMo8144y = ((oc3) r2).mo8144y();
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3);
                    wf2 wf2Var = this.f17625u;
                    df2 df2Var = wf2Var.f33293A;
                    int i4 = io4.f21608b;
                    long j2 = Long.MIN_VALUE & jMo8144y;
                    if (fIntBitsToFloat < (-(((j2 == 0 || df2Var == df2.f17011a) ? (int) jMo8144y : (int) (jMo8144y >> 30)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i3) >= mo4421j0() + (((j2 == 0 || wf2Var.f33293A == df2.f17011a) ? (int) (jMo8144y >> 30) : (int) jMo8144y) & 32767)) {
                        break;
                    }
                    int i5 = (int) (j & 4294967295L);
                    if (Float.intBitsToFloat(i5) < (-(((int) (jMo8144y >> 15)) & 32767))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i5) >= (((int) (jMo8144y >> 45)) & 32767) + mo4420i0()) {
                        break;
                    }
                    rv2 rv2Var = qw1Var.f28848b;
                    cw2 cw2Var = qw1Var.f28847a;
                    if (qw1Var.f28849c == kx5.m7689T(qw1Var)) {
                        int i6 = qw1Var.f28849c;
                        qw1Var.m10144b(i6 + 1, cw2Var.f16533b);
                        qw1Var.f28849c++;
                        cw2Var.m4200a(mt2Var);
                        rv2Var.m10470a(C0006a5.m63a(0.0f, z, true));
                        m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i2, z, f, z2);
                        qw1Var.f28849c = i6;
                        return;
                    }
                    long jM10143a = qw1Var.m10143a();
                    int i7 = qw1Var.f28849c;
                    if (!zp0.m13654E(jM10143a)) {
                        if (zp0.m13650A(jM10143a) > 0.0f) {
                            int i8 = qw1Var.f28849c;
                            qw1Var.m10144b(i8 + 1, cw2Var.f16533b);
                            qw1Var.f28849c++;
                            cw2Var.m4200a(mt2Var);
                            rv2Var.m10470a(C0006a5.m63a(0.0f, z, true));
                            m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f, z2);
                            qw1Var.f28849c = i8;
                            return;
                        }
                        return;
                    }
                    int iM7689T = kx5.m7689T(qw1Var);
                    qw1Var.f28849c = iM7689T;
                    qw1Var.m10144b(iM7689T + 1, cw2Var.f16533b);
                    qw1Var.f28849c++;
                    cw2Var.m4200a(mt2Var);
                    rv2Var.m10470a(C0006a5.m63a(0.0f, z, true));
                    m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f, z2);
                    qw1Var.f28849c = iM7689T;
                    if (zp0.m13650A(qw1Var.m10143a()) < 0.0f) {
                        qw1Var.m10144b(i7 + 1, qw1Var.f28849c + 1);
                    }
                    qw1Var.f28849c = i7;
                    return;
                }
                if ((r2.f25197c & 16) == 0 || !(r2 instanceof qx0)) {
                    M10644P = r2;
                    uw2Var = uw2Var;
                    M10644P = sc6.m10644P(uw2Var);
                } else {
                    mt2 mt2Var2 = ((qx0) r2).f28863p;
                    int i9 = 0;
                    while (mt2Var2 != null) {
                        if ((mt2Var2.f25197c & 16) != 0) {
                            i9++;
                            if (i9 == 1) {
                                M10644P = r2;
                                uw2Var = uw2Var;
                                uw2Var = uw2Var;
                                M10644P = mt2Var2;
                            } else {
                                if (uw2Var == 0) {
                                    uw2Var = new uw2(new mt2[16]);
                                }
                                if (M10644P != 0) {
                                    uw2Var.m11663b(M10644P);
                                    M10644P = 0;
                                }
                                uw2Var.m11663b(mt2Var2);
                            }
                        } else {
                            M10644P = r2;
                            uw2Var = uw2Var;
                        }
                        mt2Var2 = mt2Var2.f25200f;
                        M10644P = M10644P;
                        uw2Var = uw2Var;
                    }
                    if (i9 == 1) {
                        M10644P = r2;
                        uw2Var = uw2Var;
                    } else {
                        M10644P = r2;
                        uw2Var = uw2Var;
                        M10644P = sc6.m10644P(uw2Var);
                    }
                }
                i2 = i;
                r2 = M10644P;
                uw2Var = uw2Var;
            }
        }
        if (z2) {
            m4876e1(mt2Var, d13Var, j, qw1Var, i, z, f);
        } else {
            m4892u1(mt2Var, d13Var, j, qw1Var, i, z, f);
        }
    }

    @Override // p000.db3
    /* JADX INFO: renamed from: p0 */
    public abstract void mo4425p0(long j, float f, bu1 bu1Var);

    /* JADX INFO: renamed from: p1 */
    public void mo4887p1(h70 h70Var, bu1 bu1Var) throws Throwable {
        wf2 wf2Var = this.f17625u;
        r63 r63VarM13548a = zf2.m13548a(wf2Var);
        uw2 uw2VarM12299z = wf2Var.m12299z();
        Object[] objArr = uw2VarM12299z.f32211a;
        int i = uw2VarM12299z.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            if (wf2Var2.m12257K()) {
                wf2Var2.m12284j(h70Var, bu1Var);
            }
        }
        if (((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63VarM13548a).getShowLayoutBounds()) {
            C1253ve c1253ve = w32.f33058g0;
            long j = this.f16901c;
            h70Var.mo6259p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, c1253ve);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final void m4888q1(long j, float f, yp1 yp1Var, bu1 bu1Var) {
        wf2 wf2Var = this.f17625u;
        if (bu1Var != null) {
            if (yp1Var != null) {
                q32.m9719a("both ways to create layers shouldn't be used together");
            }
            if (this.f17624W != bu1Var) {
                this.f17624W = null;
                m4897z1(null, false);
                this.f17624W = bu1Var;
            }
            if (this.f17623V == null) {
                r63 r63VarM13548a = zf2.m13548a(wf2Var);
                mq1 mq1VarM4868W0 = m4868W0();
                b13 b13Var = this.f17621T;
                q63 q63VarM10611g = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63VarM13548a).m10611g(mq1VarM4868W0, b13Var, bu1Var);
                du1 du1Var = (du1) q63VarM10611g;
                du1Var.m4737e(this.f16901c);
                du1Var.m4736d(j);
                this.f17623V = q63VarM10611g;
                wf2Var.f33303K = true;
                b13Var.invoke();
            }
        } else {
            if (this.f17624W != null) {
                this.f17624W = null;
                m4897z1(null, false);
            }
            m4897z1(yp1Var, false);
        }
        if (!o52.m8956c(this.f17609H, j)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).m10608M(-4.0f);
            this.f17609H = j;
            q63 q63Var = this.f17623V;
            if (q63Var != null) {
                ((du1) q63Var).m4736d(j);
            } else {
                e13 e13Var = this.f17629y;
                if (e13Var != null) {
                    e13Var.m4879h1();
                }
            }
            wf2Var.m12262P(this);
            so2.m10880J0(this);
            r63 r63Var = wf2Var.f33325o;
            if (r63Var != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).m10623w(wf2Var);
            }
        }
        this.f17610I = f;
        if (this == ((e13) wf2Var.f33299G.f25608e) && !this.f30441o) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getRectManager().m8031g(wf2Var);
        }
        if (this.f30441o) {
            return;
        }
        m10886y0(mo4855F0());
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f17625u.f33336z.mo3585r();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX INFO: renamed from: r1 */
    public final void m4889r1(kw2 kw2Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        q63 q63Var = this.f17623V;
        if (q63Var != null) {
            if (this.f17602A) {
                if (z2) {
                    long jM4870Y0 = m4870Y0();
                    float f = kw2Var.f23558a;
                    float f2 = kw2Var.f23559b;
                    if (kw2Var.f23560c >= 0.0f) {
                        long j = this.f16901c;
                        if (f > ((int) (j >> 32)) || kw2Var.f23561d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jM4870Y0 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM4870Y0 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (kw2Var.f23560c - kw2Var.f23558a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (kw2Var.f23561d - kw2Var.f23559b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.f16901c;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jM4870Y0 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jM4870Y0 & 4294967295L);
                    kw2Var.m7640a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.f16901c;
                    kw2Var.m7640a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (kw2Var.m7641b()) {
                    return;
                }
            }
            du1 du1Var = (du1) q63Var;
            float[] fArrM4734b = du1Var.m4734b();
            if (!du1Var.f17408s) {
                if (fArrM4734b == null) {
                    kw2Var.f23558a = 0.0f;
                    kw2Var.f23559b = 0.0f;
                    kw2Var.f23560c = 0.0f;
                    kw2Var.f23561d = 0.0f;
                } else {
                    rq2.m10394d(fArrM4734b, kw2Var);
                }
            }
        }
        long j4 = this.f17609H;
        float f9 = (int) (j4 >> 32);
        kw2Var.f23558a += f9;
        kw2Var.f23560c += f9;
        float f10 = (int) (j4 & 4294967295L);
        kw2Var.f23559b += f10;
        kw2Var.f23561d += f10;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m4890s1() {
        if (this.f17623V != null) {
            if (this.f17624W != null) {
                this.f17624W = null;
            }
            m4897z1(null, false);
            this.f17625u.m12268W(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [mt2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [uw2] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [uw2] */
    /* JADX INFO: renamed from: t1 */
    public final void m4891t1(yq2 yq2Var) {
        e13 e13Var;
        yq2 yq2Var2 = this.f17607F;
        if (yq2Var != yq2Var2) {
            this.f17607F = yq2Var;
            wf2 wf2Var = this.f17625u;
            int i = 0;
            if (yq2Var2 == null || yq2Var.mo4506g() != yq2Var2.mo4506g() || yq2Var.mo4504d() != yq2Var2.mo4504d()) {
                int iMo4506g = yq2Var.mo4506g();
                int iMo4504d = yq2Var.mo4504d();
                q63 q63Var = this.f17623V;
                if (q63Var != null) {
                    ((du1) q63Var).m4737e((((long) iMo4506g) << 32) | (((long) iMo4504d) & 4294967295L));
                } else if (wf2Var.m12257K() && (e13Var = this.f17629y) != null) {
                    e13Var.m4879h1();
                }
                m4426q0((((long) iMo4504d) & 4294967295L) | (((long) iMo4506g) << 32));
                if (this.f17603B != null) {
                    m4850A1(false);
                }
                boolean zM5457g = f13.m5457g(4);
                mt2 mt2VarMo4871Z0 = mo4871Z0();
                if (zM5457g || (mt2VarMo4871Z0 = mt2VarMo4871Z0.f25199e) != null) {
                    for (mt2 mt2VarM4874c1 = m4874c1(zM5457g); mt2VarM4874c1 != null && (mt2VarM4874c1.f25198d & 4) != 0; mt2VarM4874c1 = mt2VarM4874c1.f25200f) {
                        if ((mt2VarM4874c1.f25197c & 4) != 0) {
                            ?? M10644P = mt2VarM4874c1;
                            ?? uw2Var = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof s31) {
                                    ((s31) M10644P).mo10513r0();
                                } else if ((M10644P.f25197c & 4) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var = ((qx0) M10644P).f28863p;
                                    int i2 = 0;
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                    while (mt2Var != null) {
                                        if ((mt2Var.f25197c & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uw2Var = uw2Var;
                                                M10644P = mt2Var;
                                            } else {
                                                if (uw2Var == 0) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var.m11663b(mt2Var);
                                            }
                                        }
                                        mt2Var = mt2Var.f25200f;
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var);
                            }
                        }
                        if (mt2VarM4874c1 == mt2VarMo4871Z0) {
                            break;
                        }
                    }
                }
                r63 r63Var = wf2Var.f33325o;
                if (r63Var != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).m10623w(wf2Var);
                }
                wf2Var.m12262P(this);
            }
            yv2 yv2Var = this.f17608G;
            if ((yv2Var == null || yv2Var.f35551e == 0) && yq2Var.mo4502a().isEmpty()) {
                return;
            }
            yv2 yv2Var2 = this.f17608G;
            Map mapMo4502a = yq2Var.mo4502a();
            if (yv2Var2 != null && yv2Var2.f35551e == mapMo4502a.size()) {
                Object[] objArr = yv2Var2.f35548b;
                int[] iArr = yv2Var2.f35549c;
                long[] jArr = yv2Var2.f35547a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapMo4502a.get((AbstractC0568da) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            wf2Var.f33300H.f14483p.f33640y.m12691f();
            yv2 yv2Var3 = this.f17608G;
            if (yv2Var3 == null) {
                yv2 yv2Var4 = p23.f27324a;
                yv2Var3 = new yv2();
                this.f17608G = yv2Var3;
            }
            yv2Var3.m13257a();
            for (Map.Entry entry : yq2Var.mo4502a().entrySet()) {
                yv2Var3.m13263g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m4892u1(mt2 mt2Var, d13 d13Var, long j, qw1 qw1Var, int i, boolean z, float f) {
        int i2;
        if (mt2Var == null) {
            mo4878g1(d13Var, j, qw1Var, i, z);
            return;
        }
        if (!d13Var.mo4279h(mt2Var)) {
            m4892u1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f);
            return;
        }
        if (!d13Var.mo3790b(mt2Var)) {
            m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f, false);
            return;
        }
        rv2 rv2Var = qw1Var.f28848b;
        cw2 cw2Var = qw1Var.f28847a;
        if (qw1Var.f28849c != kx5.m7689T(qw1Var)) {
            long jM10143a = qw1Var.m10143a();
            int i3 = qw1Var.f28849c;
            int iM7689T = kx5.m7689T(qw1Var);
            qw1Var.f28849c = iM7689T;
            qw1Var.m10144b(iM7689T + 1, cw2Var.f16533b);
            qw1Var.f28849c++;
            cw2Var.m4200a(mt2Var);
            rv2Var.m10470a(C0006a5.m63a(f, z, false));
            m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f, false);
            qw1Var.f28849c = iM7689T;
            long jM10143a2 = qw1Var.m10143a();
            if (qw1Var.f28849c + 1 >= kx5.m7689T(qw1Var) || zp0.m13684p(jM10143a, jM10143a2) <= 0) {
                qw1Var.m10144b(qw1Var.f28849c + 1, cw2Var.f16533b);
            } else {
                int i4 = i3 + 1;
                boolean zM13654E = zp0.m13654E(jM10143a2);
                int i5 = qw1Var.f28849c;
                qw1Var.m10144b(i4, zM13654E ? i5 + 2 : i5 + 1);
            }
            qw1Var.f28849c = i3;
            return;
        }
        int i6 = qw1Var.f28849c;
        int i7 = i6 + 1;
        qw1Var.m10144b(i7, cw2Var.f16533b);
        qw1Var.f28849c++;
        cw2Var.m4200a(mt2Var);
        rv2Var.m10470a(C0006a5.m63a(f, z, false));
        m4886o1(oh6.m9118x(mt2Var, d13Var.mo3791e()), d13Var, j, qw1Var, i, z, f, false);
        qw1Var.f28849c = i6;
        if (i7 == kx5.m7689T(qw1Var) || zp0.m13654E(qw1Var.m10143a())) {
            int i8 = qw1Var.f28849c;
            int i9 = i8 + 1;
            cw2Var.m4211l(i9);
            if (i9 < 0 || i9 >= (i2 = rv2Var.f29665b)) {
                kx5.m7733s0("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = rv2Var.f29664a;
            long j2 = jArr[i9];
            if (i9 != i2 - 1) {
                AbstractC0990oo.m9200U(jArr, jArr, i9, i8 + 2, i2);
            }
            rv2Var.f29665b--;
        }
    }

    @Override // p000.cf2
    /* JADX INFO: renamed from: v */
    public final cf2 mo4012v() {
        if (!mo4871Z0().f25208n) {
            q32.m9721c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m4881j1();
        return this.f17629y;
    }

    /* JADX INFO: renamed from: w1 */
    public final jl3 m4893w1() {
        if (mo4871Z0().f25208n) {
            cf2 cf2VarM12861j0 = y42.m12861j0(this);
            kw2 kw2Var = this.f17611J;
            if (kw2Var == null) {
                kw2Var = new kw2();
                this.f17611J = kw2Var;
            }
            long jM4861P0 = m4861P0(m4870Y0());
            float f = m4872a1() ? this.f17614M.f22396a : 0.0f;
            float f2 = m4872a1() ? this.f17614M.f22397b : 0.0f;
            float fMo4421j0 = m4872a1() ? this.f17614M.f22398c : mo4421j0();
            float fMo4420i0 = m4872a1() ? this.f17614M.f22399d : mo4420i0();
            int i = (int) (jM4861P0 >> 32);
            kw2Var.f23558a = f - Float.intBitsToFloat(i);
            int i2 = (int) (jM4861P0 & 4294967295L);
            kw2Var.f23559b = f2 - Float.intBitsToFloat(i2);
            kw2Var.f23560c = Float.intBitsToFloat(i) + fMo4421j0;
            kw2Var.f23561d = Float.intBitsToFloat(i2) + fMo4420i0;
            while (this != cf2VarM12861j0) {
                this.m4889r1(kw2Var, false, true);
                if (!kw2Var.m7641b()) {
                    this = this.f17629y;
                }
            }
            return new jl3(kw2Var.f23558a, kw2Var.f23559b, kw2Var.f23560c, kw2Var.f23561d);
        }
        return jl3.f22395e;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m4894x1(e13 e13Var, float[] fArr) {
        float[] fArrM4733a;
        if (z62.m13387o(e13Var, this)) {
            return;
        }
        this.f17629y.m4894x1(e13Var, fArr);
        if (!o52.m8956c(this.f17609H, 0L)) {
            float[] fArr2 = f17599b0;
            rq2.m10395e(fArr2);
            long j = this.f17609H;
            rq2.m10399i(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            rq2.m10398h(fArr, fArr2);
        }
        q63 q63Var = this.f17623V;
        if (q63Var == null || (fArrM4733a = ((du1) q63Var).m4733a()) == null) {
            return;
        }
        rq2.m10398h(fArr, fArrM4733a);
    }

    /* JADX INFO: renamed from: y1 */
    public final void m4895y1(e13 e13Var, float[] fArr) {
        while (!this.equals(e13Var)) {
            q63 q63Var = this.f17623V;
            if (q63Var != null) {
                rq2.m10398h(fArr, ((du1) q63Var).m4734b());
            }
            long j = this.f17609H;
            if (!o52.m8956c(j, 0L)) {
                float[] fArr2 = f17599b0;
                rq2.m10395e(fArr2);
                rq2.m10399i(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                rq2.m10398h(fArr, fArr2);
            }
            this = this.f17629y;
        }
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: z0 */
    public final so2 mo4896z0() {
        return this.f17628x;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m4897z1(yp1 yp1Var, boolean z) {
        r63 r63Var;
        uw2 uw2Var;
        Reference referencePoll;
        if (yp1Var != null && this.f17624W != null) {
            q32.m9719a("layerBlock can't be provided when explicitLayer is provided");
        }
        wf2 wf2Var = this.f17625u;
        boolean z2 = (!z && this.f17603B == yp1Var && z62.m13387o(this.f17604C, wf2Var.f33336z) && this.f17605D == wf2Var.f33293A) ? false : true;
        this.f17604C = wf2Var.f33336z;
        this.f17605D = wf2Var.f33293A;
        boolean zM12256J = wf2Var.m12256J();
        b13 b13Var = this.f17621T;
        if (zM12256J && yp1Var != null) {
            this.f17603B = yp1Var;
            if (this.f17623V != null) {
                if (z2) {
                    m4850A1(true);
                    return;
                }
                return;
            }
            q63 q63VarM10611g = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).m10611g(m4868W0(), b13Var, null);
            du1 du1Var = (du1) q63VarM10611g;
            du1Var.m4737e(this.f16901c);
            du1Var.m4736d(this.f17609H);
            this.f17623V = q63VarM10611g;
            m4850A1(true);
            wf2Var.f33303K = true;
            b13Var.invoke();
            return;
        }
        this.f17603B = null;
        q63 q63Var = this.f17623V;
        if (q63Var != null) {
            du1 du1Var2 = (du1) q63Var;
            if (!y42.m12871t0(du1Var2.m4734b())) {
                wf2Var.m12262P(this);
            }
            du1Var2.f17393d = null;
            du1Var2.f17394e = null;
            du1Var2.f17396g = true;
            du1Var2.m4738f(false);
            au1 au1Var = du1Var2.f17391b;
            if (au1Var != null) {
                au1Var.mo3311a(du1Var2.f17390a);
                ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = du1Var2.f17392c;
                pq3 pq3Var = viewTreeObserverOnGlobalLayoutListenerC1140sc.f30134o0;
                do {
                    ReferenceQueue referenceQueue = (ReferenceQueue) pq3Var.f27897c;
                    uw2Var = (uw2) pq3Var.f27896b;
                    referencePoll = referenceQueue.poll();
                    if (referencePoll != null) {
                        uw2Var.m11671k(referencePoll);
                    }
                } while (referencePoll != null);
                uw2Var.m11663b(new WeakReference(du1Var2, (ReferenceQueue) pq3Var.f27897c));
                viewTreeObserverOnGlobalLayoutListenerC1140sc.f30075A.m4210k(du1Var2);
            }
            this.f17623V = null;
            wf2Var.f33303K = true;
            b13Var.invoke();
            if (mo4871Z0().f25208n && wf2Var.m12257K() && (r63Var = wf2Var.f33325o) != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).m10623w(wf2Var);
            }
        }
        this.f17622U = false;
    }

    @Override // p000.so2
    /* JADX INFO: renamed from: C0 */
    public final cf2 mo4852C0() {
        return this;
    }
}
