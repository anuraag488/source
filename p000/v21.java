package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class v21 extends qx0 implements oc3, a32, bj0, c31 {

    /* JADX INFO: renamed from: A */
    public bs1 f32326A;

    /* JADX INFO: renamed from: B */
    public bs1 f32327B;

    /* JADX INFO: renamed from: C */
    public c21 f32328C;

    /* JADX INFO: renamed from: D */
    public b21 f32329D;

    /* JADX INFO: renamed from: E */
    public a21 f32330E;

    /* JADX INFO: renamed from: F */
    public y62 f32331F;

    /* JADX INFO: renamed from: G */
    public mx4 f32332G;

    /* JADX INFO: renamed from: H */
    public vv1 f32333H;

    /* JADX INFO: renamed from: I */
    public z22 f32334I;

    /* JADX INFO: renamed from: q */
    public d63 f32335q;

    /* JADX INFO: renamed from: r */
    public yp1 f32336r;

    /* JADX INFO: renamed from: s */
    public boolean f32337s;

    /* JADX INFO: renamed from: t */
    public nv2 f32338t;

    /* JADX INFO: renamed from: u */
    public f40 f32339u;

    /* JADX INFO: renamed from: v */
    public x21 f32340v;

    /* JADX INFO: renamed from: w */
    public boolean f32341w;

    /* JADX INFO: renamed from: x */
    public boolean f32342x;

    /* JADX INFO: renamed from: y */
    public z11 f32343y;

    /* JADX INFO: renamed from: z */
    public long f32344z = 0;

    public v21(yp1 yp1Var, boolean z, nv2 nv2Var, d63 d63Var) {
        this.f32335q = d63Var;
        this.f32336r = yp1Var;
        this.f32337s = z;
        this.f32338t = nv2Var;
    }

    /* JADX INFO: renamed from: V0 */
    public static void m11695V0(v21 v21Var, lc3 lc3Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        b21 b21Var = v21Var.f32329D;
        if (b21Var == null) {
            b21Var = new b21();
            b21Var.f15034C = null;
            b21Var.f15035D = Long.MAX_VALUE;
            b21Var.f15036E = false;
            v21Var.f32329D = b21Var;
        }
        b21Var.f15034C = lc3Var;
        b21Var.f15035D = j;
        vv1 vv1Var = v21Var.f32333H;
        d63 d63Var = v21Var.f32335q;
        if (vv1Var == null) {
            v21Var.f32333H = new vv1(d63Var);
        } else {
            vv1Var.f32887b = d63Var;
            vv1Var.f32886a = j2;
        }
        b21Var.f15036E = false;
        v21Var.f32331F = b21Var;
    }

    @Override // p000.a32
    /* JADX INFO: renamed from: G */
    public final void mo29G() {
        z22 z22Var = this.f32334I;
        if (z22Var != null) {
            z22Var.m13292a();
            v21 v21Var = z22Var.f35711a;
            if (v21Var.f32341w) {
                v21Var.m11699W0(d21.f16741a);
            }
            z22Var.f35717g = null;
            hf0 hf0Var = z22Var.f35720j;
            hf0Var.f20528b = 0;
            ((rv2) hf0Var.f20529c).f29665b = 0;
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        this.f32341w = false;
        m11696R0();
        bs1 bs1Var = this.f32327B;
        if (bs1Var != null) {
            m10155P0(bs1Var);
        }
        bs1 bs1Var2 = this.f32326A;
        if (bs1Var2 != null) {
            m10155P0(bs1Var2);
        }
        this.f32327B = null;
        this.f32326A = null;
    }

    @Override // p000.a32
    /* JADX INFO: renamed from: K */
    public final void mo30K(C0795je c0795je, fc3 fc3Var) {
        Object obj;
        Object obj2;
        float f;
        Object obj3;
        char c;
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        Object obj4;
        Object obj5;
        Object obj6;
        u22 u22Var;
        int i = c0795je.f22193b;
        ArrayList arrayList = (ArrayList) c0795je.f22194c;
        if (this.f32337s) {
            z22 z22Var = this.f32334I;
            if (z22Var == null) {
                z22Var = new z22();
                z22Var.f35711a = this;
                hf0 hf0Var = new hf0((byte) 2);
                hf0Var.f20529c = new cw2();
                z22Var.f35719i = hf0Var;
                hf0 hf0Var2 = new hf0((byte) 3);
                hf0Var2.f20529c = new rv2();
                z22Var.f35720j = hf0Var2;
                VarHandle.storeStoreFence();
                this.f32334I = z22Var;
            }
            if (this.f32327B == null) {
                bs1 bs1Var = new bs1();
                bs1Var.f15546o = z22Var;
                VarHandle.storeStoreFence();
                m10154O0(bs1Var);
                this.f32327B = bs1Var;
            }
            z22 z22Var2 = this.f32334I;
            if (z22Var2 != null) {
                v21 v21Var = z22Var2.f35711a;
                oh6 oh6Var = z22Var2.f35716f;
                if (oh6Var == null) {
                    u22 u22Var2 = z22Var2.f35712b;
                    if (u22Var2 == null) {
                        obj = oh6Var;
                        u22Var = u22Var2;
                        t22 t22Var = t22.f30733c;
                        u22 u22Var3 = new u22();
                        u22Var3.f31621U = t22Var;
                        u22Var3.f31622V = false;
                        u22Var3.f31623W = false;
                        z22Var2.f35712b = u22Var3;
                        u22Var = u22Var3;
                    }
                    obj = oh6Var;
                    u22Var = u22Var2;
                    z22Var2.f35716f = u22Var;
                    obj = u22Var;
                }
                obj = oh6Var;
                boolean z = true;
                if (obj instanceof u22) {
                    u22 u22Var4 = (u22) obj;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!gq6.m6085j((s22) arrayList.get(i2))) {
                            return;
                        }
                    }
                    s22 s22Var = (s22) hb0.m6299K0(arrayList);
                    t22 t22Var2 = y22.f34821a[u22Var4.f31621U.ordinal()] == 1 ? !v21Var.mo6291g1() ? t22.f30731a : t22.f30732b : u22Var4.f31621U;
                    u22Var4.f31621U = t22Var2;
                    if (fc3Var == fc3.f18903a) {
                        if (t22Var2 == t22.f30732b) {
                            s22Var.f29839i = true;
                            u22Var4.f31622V = true;
                        }
                        u22Var4.f31623W = true;
                    }
                    if (fc3Var == fc3.f18904b) {
                        if (t22Var2 == t22.f30731a) {
                            z22.m13291c(z22Var2, s22Var, s22Var.f29831a, 0L, 12);
                            return;
                        }
                        if (u22Var4.f31622V) {
                            z22Var2.m13296f(s22Var, s22Var, r22.m10181a(i), 0L);
                            z22Var2.m13295e(s22Var, r22.m10181a(i), 0L);
                            long j = s22Var.f29831a;
                            x22 x22Var = z22Var2.f35713c;
                            if (x22Var == null) {
                                x22Var = new x22();
                                x22Var.f33942U = Long.MAX_VALUE;
                                z22Var2.f35713c = x22Var;
                            }
                            x22Var.f33942U = j;
                            z22Var2.f35716f = x22Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (obj instanceof w22) {
                    w22 w22Var = (w22) obj;
                    if (fc3Var == fc3.f18903a) {
                        return;
                    }
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i3);
                        if (c20.m3818m(((s22) obj4).f29831a, w22Var.f33038V)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    s22 s22Var2 = (s22) obj4;
                    if (s22Var2 == null) {
                        int size3 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                obj6 = null;
                                break;
                            }
                            obj6 = arrayList.get(i4);
                            if (((s22) obj6).f29834d) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        s22Var2 = (s22) obj6;
                        if (s22Var2 == null) {
                            z22Var2.m13292a();
                            return;
                        }
                        w22Var.f33038V = s22Var2.f29831a;
                    }
                    s22 s22Var3 = s22Var2;
                    if (fc3Var == fc3.f18904b) {
                        if (s22Var3.f29839i) {
                            s22 s22Var4 = w22Var.f33037U;
                            if (s22Var4 == null) {
                                C1077qn.m9987m("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            long j2 = w22Var.f33038V;
                            vv1 vv1Var = z22Var2.f35718h;
                            if (vv1Var == null) {
                                C1077qn.m9987m("AwaitTouchSlop.touchSlopDetector was not initialized");
                                return;
                            }
                            z22Var2.m13293b(s22Var4, j2, vv1Var);
                        } else if (gq6.m6086k(s22Var3)) {
                            int size4 = arrayList.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size4) {
                                    obj5 = null;
                                    break;
                                }
                                Object obj7 = arrayList.get(i5);
                                if (((s22) obj7).f29834d) {
                                    obj5 = obj7;
                                    break;
                                }
                                i5++;
                            }
                            s22 s22Var5 = (s22) obj5;
                            if (s22Var5 == null) {
                                z22Var2.m13292a();
                            } else {
                                w22Var.f33038V = s22Var5.f29831a;
                            }
                        } else {
                            fy4 fy4Var = (fy4) sj3.m10825u(v21Var, ij0.f21485t);
                            float f2 = q21.f28157a;
                            float fMo5859d = fy4Var.mo5859d();
                            vv1 vv1Var2 = z22Var2.f35718h;
                            if (vv1Var2 == null) {
                                C1077qn.m9987m("Touch slop detector not initialized.");
                                return;
                            }
                            long jM11990a = vv1.m11990a(vv1Var2, gq6.m6063A(s22Var3, v21Var.f32335q, r22.m10181a(i), true), fMo5859d);
                            if ((9223372034707292159L & jM11990a) != 9205357640488583168L) {
                                s22Var3.f29839i = true;
                                z22Var2.m13296f(w22Var.f33037U, s22Var3, r22.m10181a(i), jM11990a);
                                z22Var2.m13295e(s22Var3, r22.m10181a(i), jM11990a);
                                long j3 = s22Var3.f29831a;
                                x22 x22Var2 = z22Var2.f35713c;
                                if (x22Var2 == null) {
                                    z22Var2 = z22Var2;
                                    x22Var2 = new x22();
                                    x22Var2.f33942U = Long.MAX_VALUE;
                                    z22Var2.f35713c = x22Var2;
                                }
                                z22Var2 = z22Var2;
                                x22Var2.f33942U = j3;
                                z22Var2.f35716f = x22Var2;
                            } else {
                                z22Var2 = z22Var2;
                                w22Var.f33039W = true;
                            }
                        }
                    }
                    if (fc3Var == fc3.f18905c && w22Var.f33039W) {
                        if (!s22Var3.f29839i) {
                            w22Var.f33039W = false;
                            return;
                        }
                        s22 s22Var6 = w22Var.f33037U;
                        if (s22Var6 == null) {
                            C1077qn.m9987m("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j4 = w22Var.f33038V;
                        vv1 vv1Var3 = z22Var2.f35718h;
                        if (vv1Var3 != null) {
                            z22Var2.m13293b(s22Var6, j4, vv1Var3);
                            return;
                        } else {
                            C1077qn.m9987m("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof v22) {
                    v22 v22Var = (v22) obj;
                    if (fc3Var != fc3.f18905c) {
                        return;
                    }
                    int size5 = arrayList.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        if (((s22) arrayList.get(i6)).f29839i) {
                            z = false;
                            break;
                        }
                    }
                    int size6 = arrayList.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        if (((s22) arrayList.get(i7)).f29834d) {
                            if (arrayList.isEmpty()) {
                                break;
                            }
                            if (z) {
                                long jM3429g = b33.m3429g(gq6.m6064B((s22) hb0.m6299K0(arrayList), v21Var.f32335q, r22.m10181a(i)), gq6.m6064B(v22Var.f32345U, v21Var.f32335q, r22.m10181a(i)));
                                s22 s22Var7 = v22Var.f32345U;
                                if (s22Var7 != null) {
                                    z22.m13291c(z22Var2, s22Var7, v22Var.f32346V, jM3429g, 8);
                                    return;
                                } else {
                                    C1077qn.m9987m("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    z22Var2.m13292a();
                    return;
                }
                if (!(obj instanceof x22)) {
                    C0670g.m5864c();
                    return;
                }
                x22 x22Var3 = (x22) obj;
                if (fc3Var != fc3.f18904b) {
                    return;
                }
                long j5 = x22Var3.f33942U;
                int size7 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i8);
                    if (c20.m3818m(((s22) obj2).f29831a, j5)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                s22 s22Var8 = (s22) obj2;
                if (s22Var8 == null) {
                    return;
                }
                long j6 = s22Var8.f29833c;
                boolean zM6086k = gq6.m6086k(s22Var8);
                d21 d21Var = d21.f16741a;
                if (!zM6086k) {
                    if (s22Var8.f29839i) {
                        v21Var.m11699W0(d21Var);
                        return;
                    } else {
                        if (b33.m3426d(gq6.m6063A(s22Var8, v21Var.f32335q, r22.m10181a(i), true)) == 0.0f) {
                            return;
                        }
                        z22Var2.m13295e(s22Var8, r22.m10181a(i), gq6.m6063A(s22Var8, v21Var.f32335q, r22.m10181a(i), false));
                        s22Var8.f29839i = true;
                        return;
                    }
                }
                int size8 = arrayList.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        f = 0.0f;
                        obj3 = null;
                        break;
                    } else {
                        obj3 = arrayList.get(i9);
                        f = 0.0f;
                        if (((s22) obj3).f29834d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                s22 s22Var9 = (s22) obj3;
                if (s22Var9 != null) {
                    x22Var3.f33942U = s22Var9.f29831a;
                    return;
                }
                if (s22Var8.f29839i || !gq6.m6086k(s22Var8)) {
                    v21Var.m11699W0(d21Var);
                } else {
                    r22 r22VarM10181a = r22.m10181a(i);
                    mx4 mx4VarM13294d = z22Var2.m13294d();
                    d63 d63Var = v21Var.f32335q;
                    hf0 hf0Var3 = z22Var2.f35719i;
                    cw2 cw2Var = (cw2) hf0Var3.f20529c;
                    char c2 = ' ';
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 >> 32));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    if (gq6.m6085j(s22Var8)) {
                        hf0Var3.f20528b = 0;
                        cw2Var.m4203d();
                    }
                    if (gq6.m6086k(s22Var8) || gq6.m6085j(s22Var8)) {
                        c = ' ';
                    } else {
                        if (cw2Var.f16533b == 3) {
                            int i10 = hf0Var3.f20528b;
                            hf0Var3.f20528b = i10 + 1;
                            cw2Var.m4214o(i10, s22Var8);
                        } else {
                            cw2Var.m4200a(s22Var8);
                        }
                        if (hf0Var3.f20528b == 3) {
                            hf0Var3.f20528b = 0;
                        }
                        Object[] objArr = cw2Var.f16532a;
                        int i11 = cw2Var.f16533b;
                        float fIntBitsToFloat4 = f;
                        for (int i12 = 0; i12 < i11; i12++) {
                            fIntBitsToFloat4 += Float.intBitsToFloat((int) (((s22) objArr[i12]).f29833c >> 32));
                        }
                        int i13 = cw2Var.f16533b;
                        fIntBitsToFloat2 = fIntBitsToFloat4 / i13;
                        Object[] objArr2 = cw2Var.f16532a;
                        float fIntBitsToFloat5 = f;
                        int i14 = 0;
                        while (i14 < i13) {
                            fIntBitsToFloat5 += Float.intBitsToFloat((int) (((s22) objArr2[i14]).f29833c & 4294967295L));
                            i14++;
                            c2 = c2;
                            fIntBitsToFloat2 = fIntBitsToFloat2;
                        }
                        c = c2;
                        fIntBitsToFloat3 = fIntBitsToFloat5 / cw2Var.f16533b;
                    }
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                    if (d63Var != null) {
                        int i15 = r22VarM10181a.f28967a;
                        if (i15 == 1) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c));
                        } else if (i15 == 2) {
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
                        }
                        if (d63Var == d63.f16815b) {
                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                            iFloatToRawIntBits = Float.floatToRawIntBits(f);
                        } else {
                            jFloatToRawIntBits = Float.floatToRawIntBits(f);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                        }
                        jFloatToRawIntBits2 = (jFloatToRawIntBits << c) | (((long) iFloatToRawIntBits) & 4294967295L);
                    }
                    mx4VarM13294d.f25284a.m4635a(s22Var8.f29832b, jFloatToRawIntBits2);
                    float fMo5856a = ((fy4) sj3.m10825u(v21Var, ij0.f21485t)).mo5856a();
                    long jM8426a = z22Var2.m13294d().m8426a(qs5.m10097b(fMo5856a, fMo5856a));
                    dp2 dp2Var = z22Var2.m13294d().f25284a;
                    lx4 lx4Var = (lx4) dp2Var.f17255b;
                    AbstractC0990oo.m9206a0(null, lx4Var.f24448d);
                    lx4Var.f24449e = 0;
                    lx4 lx4Var2 = (lx4) dp2Var.f17256c;
                    AbstractC0990oo.m9206a0(null, lx4Var2.f24448d);
                    lx4Var2.f24449e = 0;
                    dp2Var.f17254a = 0L;
                    v21Var.m11699W0(new g21(j31.m6997b(jM8426a), true));
                }
                z22Var2.m13292a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01b1  */
    /* JADX INFO: renamed from: N */
    public void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        Object obj5;
        z11 z11Var;
        boolean z2 = true;
        this.f32342x = true;
        if (this.f32337s) {
            if (this.f32326A == null) {
                bs1 bs1Var = new bs1();
                bs1Var.f15546o = this;
                VarHandle.storeStoreFence();
                m10154O0(bs1Var);
                this.f32326A = bs1Var;
            }
            y62 y62Var = this.f32331F;
            Object obj6 = y62Var;
            if (y62Var == null) {
                z11 z11Var2 = this.f32343y;
                if (z11Var2 == null) {
                    z11Var = z11Var2;
                    y11 y11Var = y11.f34812c;
                    z11 z11Var3 = new z11();
                    z11Var3.f35696C = y11Var;
                    z11Var3.f35697D = false;
                    z11Var3.f35698E = false;
                    this.f32343y = z11Var3;
                    z11Var = z11Var3;
                }
                z11Var = z11Var2;
                this.f32331F = z11Var;
                obj6 = z11Var;
            }
            if (obj6 instanceof z11) {
                z11 z11Var4 = (z11) obj6;
                if (!ec3Var.f18000a.isEmpty() && fi4.m5721e(ec3Var, false)) {
                    lc3 lc3Var = (lc3) hb0.m6299K0(ec3Var.f18000a);
                    y11 y11Var2 = r21.f28966a[z11Var4.f35696C.ordinal()] == 1 ? !mo6291g1() ? y11.f34810a : y11.f34811b : z11Var4.f35696C;
                    z11Var4.f35696C = y11Var2;
                    if (fc3Var == fc3.f18903a) {
                        if (y11Var2 == y11.f34811b) {
                            lc3Var.m7952a();
                            z11Var4.f35697D = true;
                        }
                        z11Var4.f35698E = true;
                    }
                    if (fc3Var == fc3.f18904b) {
                        if (y11Var2 == y11.f34810a) {
                            m11695V0(this, lc3Var, lc3Var.f23935a, 0L, 12);
                            return;
                        }
                        if (z11Var4.f35697D) {
                            m11706f1(lc3Var, lc3Var, 0L);
                            m11705e1(0L, lc3Var);
                            long j2 = lc3Var.f23935a;
                            c21 c21Var = this.f32328C;
                            if (c21Var == null) {
                                c21Var = new c21();
                                c21Var.f15773C = Long.MAX_VALUE;
                                this.f32328C = c21Var;
                            }
                            c21Var.f15773C = j2;
                            this.f32331F = c21Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!(obj6 instanceof b21)) {
                if (obj6 instanceof a21) {
                    a21 a21Var = (a21) obj6;
                    if (fc3Var != fc3.f18905c) {
                        return;
                    }
                    List list = ec3Var.f18000a;
                    List list2 = list;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        if (((lc3) list.get(i)).m7954c()) {
                            z2 = false;
                            break;
                        }
                    }
                    int size2 = list2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (((lc3) list.get(i2)).f23938d) {
                            if (list.isEmpty()) {
                                break;
                            }
                            if (z2) {
                                long jM3429g = b33.m3429g(((lc3) hb0.m6299K0(list)).f23937c, a21Var.f61C.f23937c);
                                lc3 lc3Var2 = a21Var.f61C;
                                if (lc3Var2 != null) {
                                    m11695V0(this, lc3Var2, a21Var.f62D, jM3429g, 8);
                                    return;
                                } else {
                                    C1077qn.m9987m("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    m11697T0();
                    return;
                }
                if (!(obj6 instanceof c21)) {
                    C0670g.m5864c();
                    return;
                }
                c21 c21Var2 = (c21) obj6;
                if (fc3Var != fc3.f18904b) {
                    return;
                }
                long j3 = c21Var2.f15773C;
                List list3 = ec3Var.f18000a;
                int size3 = list3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = list3.get(i3);
                    if (c20.m3818m(((lc3) obj).f23935a, j3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                lc3 lc3Var3 = (lc3) obj;
                if (lc3Var3 == null) {
                    return;
                }
                boolean zM12923q = AbstractC1356y5.m12923q(lc3Var3);
                Object obj7 = d21.f16741a;
                if (!zM12923q) {
                    if (lc3Var3.m7954c()) {
                        m11703c1().mo5493n(obj7);
                        return;
                    } else {
                        if (b33.m3426d(AbstractC1356y5.m12898G(lc3Var3, true)) == 0.0f) {
                            return;
                        }
                        m11705e1(AbstractC1356y5.m12898G(lc3Var3, false), lc3Var3);
                        lc3Var3.m7952a();
                        return;
                    }
                }
                List list4 = ec3Var.f18000a;
                int size4 = list4.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list4.get(i4);
                    if (((lc3) obj2).f23938d) {
                        break;
                    } else {
                        i4++;
                    }
                }
                lc3 lc3Var4 = (lc3) obj2;
                if (lc3Var4 != null) {
                    c21Var2.f15773C = lc3Var4.f23935a;
                    return;
                }
                if (lc3Var3.m7954c() || !AbstractC1356y5.m12923q(lc3Var3)) {
                    m11703c1().mo5493n(obj7);
                } else {
                    float fMo5856a = ((fy4) sj3.m10825u(this, ij0.f21485t)).mo5856a();
                    AbstractC1356y5.m12915i(m11704d1(), lc3Var3);
                    long jM8426a = m11704d1().m8426a(qs5.m10097b(fMo5856a, fMo5856a));
                    dp2 dp2Var = m11704d1().f25284a;
                    lx4 lx4Var = (lx4) dp2Var.f17255b;
                    AbstractC0990oo.m9206a0(null, lx4Var.f24448d);
                    lx4Var.f24449e = 0;
                    lx4 lx4Var2 = (lx4) dp2Var.f17256c;
                    AbstractC0990oo.m9206a0(null, lx4Var2.f24448d);
                    lx4Var2.f24449e = 0;
                    dp2Var.f17254a = 0L;
                    m11703c1().mo5493n(new g21(j31.m6997b(jM8426a), false));
                    this.f32342x = false;
                }
                m11697T0();
                return;
            }
            b21 b21Var = (b21) obj6;
            if (fc3Var == fc3.f18903a) {
                return;
            }
            List list5 = ec3Var.f18000a;
            List list6 = list5;
            int size5 = list6.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    obj3 = null;
                    break;
                }
                Object obj8 = list5.get(i5);
                if (c20.m3818m(((lc3) obj8).f23935a, b21Var.f15035D)) {
                    obj3 = obj8;
                    break;
                }
                i5++;
            }
            lc3 lc3Var5 = (lc3) obj3;
            if (lc3Var5 == null) {
                int size6 = list6.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list5.get(i6);
                    if (((lc3) obj5).f23938d) {
                        break;
                    } else {
                        i6++;
                    }
                }
                lc3Var5 = (lc3) obj5;
                if (lc3Var5 == null) {
                    m11697T0();
                    return;
                }
                b21Var.f15035D = lc3Var5.f23935a;
            }
            if (fc3Var == fc3.f18904b) {
                if (lc3Var5.m7954c()) {
                    lc3 lc3Var6 = b21Var.f15034C;
                    if (lc3Var6 == null) {
                        C1077qn.m9987m("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j4 = b21Var.f15035D;
                    vv1 vv1Var = this.f32333H;
                    if (vv1Var == null) {
                        C1077qn.m9987m("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    m11698U0(lc3Var6, j4, vv1Var);
                } else if (AbstractC1356y5.m12923q(lc3Var5)) {
                    int size7 = list6.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size7) {
                            obj4 = null;
                            break;
                        }
                        obj4 = list5.get(i7);
                        if (((lc3) obj4).f23938d) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    lc3 lc3Var7 = (lc3) obj4;
                    if (lc3Var7 == null) {
                        m11697T0();
                    } else {
                        b21Var.f15035D = lc3Var7.f23935a;
                    }
                } else {
                    float fM9712g = q21.m9712g((fy4) sj3.m10825u(this, ij0.f21485t), lc3Var5.f23943i);
                    vv1 vv1Var2 = this.f32333H;
                    if (vv1Var2 == null) {
                        C1077qn.m9987m("Touch slop detector not initialized.");
                        return;
                    }
                    long jM11990a = vv1.m11990a(vv1Var2, AbstractC1356y5.m12898G(lc3Var5, true), fM9712g);
                    if ((9223372034707292159L & jM11990a) != 9205357640488583168L) {
                        long jM3430h = b33.m3430h(this.f32344z, AbstractC1356y5.m12898G(lc3Var5, false));
                        this.f32344z = jM3430h;
                        float fAtan2 = ((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (this.f32344z & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM3430h >> 32))))) * 57.29578f;
                        d63 d63Var = this.f32335q;
                        if (d63Var == null) {
                            z = true;
                        } else {
                            d31 d31Var = j31.f21983a;
                            if (d63Var != d63.f16815b ? fAtan2 <= 30.0f || fAtan2 > 90.0f : fAtan2 > 30.0f) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ml3 ml3Var = new ml3();
                        m10 m10Var = new m10((byte) 2);
                        m10Var.f24530b = fAtan2;
                        m10Var.f24531c = ml3Var;
                        VarHandle.storeStoreFence();
                        d31 d31Var2 = j31.f21983a;
                        C1127s c1127s = new C1127s((byte) 29);
                        c1127s.f29778b = m10Var;
                        VarHandle.storeStoreFence();
                        C0797jg c0797jg = new C0797jg((byte) 6);
                        c0797jg.f22228b = c1127s;
                        VarHandle.storeStoreFence();
                        dt0.m4695X(this, bs1.f15545p, c0797jg);
                        if (z || !ml3Var.f25002a) {
                            lc3Var5.m7952a();
                            m11706f1(b21Var.f15034C, lc3Var5, jM11990a);
                            m11705e1(jM11990a, lc3Var5);
                            long j5 = lc3Var5.f23935a;
                            c21 c21Var3 = this.f32328C;
                            if (c21Var3 == null) {
                                c21Var3 = new c21();
                                c21Var3.f15773C = Long.MAX_VALUE;
                                this.f32328C = c21Var3;
                            }
                            c21Var3.f15773C = j5;
                            this.f32331F = c21Var3;
                        } else {
                            b21Var.f15036E = true;
                        }
                    } else {
                        b21Var.f15036E = true;
                        this.f32344z = b33.m3430h(this.f32344z, AbstractC1356y5.m12898G(lc3Var5, true));
                    }
                }
            }
            if (fc3Var == fc3.f18905c && b21Var.f15036E) {
                if (!lc3Var5.m7954c()) {
                    b21Var.f15036E = false;
                    return;
                }
                lc3 lc3Var8 = b21Var.f15034C;
                if (lc3Var8 == null) {
                    C1077qn.m9987m("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j6 = b21Var.f15035D;
                vv1 vv1Var3 = this.f32333H;
                if (vv1Var3 != null) {
                    m11698U0(lc3Var8, j6, vv1Var3);
                } else {
                    C1077qn.m9987m("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m11696R0() {
        x21 x21Var = this.f32340v;
        if (x21Var != null) {
            nv2 nv2Var = this.f32338t;
            if (nv2Var != null) {
                nv2Var.m8861b(new w21(x21Var));
            }
            this.f32340v = null;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public abstract Object mo6290S0(C1031pe c1031pe, C1312wz c1312wz);

    /* JADX INFO: renamed from: T0 */
    public final void m11697T0() {
        this.f32344z = 0L;
        z11 z11Var = this.f32343y;
        if (z11Var == null) {
            y11 y11Var = y11.f34812c;
            z11Var = new z11();
            z11Var.f35696C = y11Var;
            z11Var.f35697D = false;
            z11Var.f35698E = false;
            this.f32343y = z11Var;
        }
        z11Var.f35696C = y11.f34812c;
        z11Var.f35697D = false;
        z11Var.f35698E = false;
        this.f32331F = z11Var;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m11698U0(lc3 lc3Var, long j, vv1 vv1Var) {
        a21 a21Var = this.f32330E;
        if (a21Var == null) {
            a21Var = new a21();
            a21Var.f61C = null;
            a21Var.f62D = Long.MAX_VALUE;
            this.f32330E = a21Var;
        }
        a21Var.f61C = lc3Var;
        a21Var.f62D = j;
        vv1Var.f32886a = 0L;
        this.f32331F = a21Var;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m11699W0(h21 h21Var) {
        if ((h21Var instanceof f21) && !this.f32341w) {
            this.f32341w = true;
            m11707h1();
        }
        m11703c1().mo5493n(h21Var);
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo6967Y0(g21 g21Var) {
        if (this.f25208n) {
            lb5.m7910S(m8391C0(), null, null, new C0682gb(this, g21Var, null, (byte) 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Z0 */
    public final Object m11700Z0(ym0 ym0Var) {
        s21 s21Var;
        if (ym0Var instanceof s21) {
            s21Var = (s21) ym0Var;
            int i = s21Var.f29830v;
            if ((i & Integer.MIN_VALUE) != 0) {
                s21Var.f29830v = i - Integer.MIN_VALUE;
            } else {
                s21Var = new s21(this, ym0Var);
            }
        } else {
            s21Var = new s21(this, ym0Var);
        }
        Object obj = s21Var.f29828t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = s21Var.f29830v;
        if (i2 == 0) {
            k43.m7376J(obj);
            x21 x21Var = this.f32340v;
            if (x21Var != null) {
                nv2 nv2Var = this.f32338t;
                if (nv2Var != null) {
                    w21 w21Var = new w21(x21Var);
                    s21Var.f29830v = 1;
                    if (nv2Var.m8860a(w21Var, s21Var) == ap0Var) {
                        return ap0Var;
                    }
                }
            }
            mo6967Y0(new g21(0L, false));
            return ju4.f22634a;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        this.f32340v = null;
        mo6967Y0(new g21(0L, false));
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a1 */
    public final Object m11701a1(f21 f21Var, ym0 ym0Var) {
        t21 t21Var;
        nv2 nv2Var;
        x21 x21Var;
        f21 f21Var2;
        x21 x21Var2;
        if (ym0Var instanceof t21) {
            t21Var = (t21) ym0Var;
            int i = t21Var.f30730x;
            if ((i & Integer.MIN_VALUE) != 0) {
                t21Var.f30730x = i - Integer.MIN_VALUE;
            } else {
                t21Var = new t21(this, ym0Var);
            }
        } else {
            t21Var = new t21(this, ym0Var);
        }
        Object obj = t21Var.f30728v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = t21Var.f30730x;
        if (i2 == 0) {
            k43.m7376J(obj);
            x21 x21Var3 = this.f32340v;
            if (x21Var3 != null && (nv2Var = this.f32338t) != null) {
                w21 w21Var = new w21(x21Var3);
                t21Var.f30726t = f21Var;
                t21Var.f30730x = 1;
                if (nv2Var.m8860a(w21Var, t21Var) != ap0Var) {
                }
                return ap0Var;
            }
            this.f32340v = x21Var;
            mo6966X0(f21Var.f18671a);
            return ju4.f22634a;
        }
        if (i2 == 1) {
            f21Var = t21Var.f30726t;
            k43.m7376J(obj);
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x21Var2 = t21Var.f30727u;
            f21Var2 = t21Var.f30726t;
            k43.m7376J(obj);
        }
        x21Var = x21Var2;
        f21Var = f21Var2;
        this.f32340v = x21Var;
        mo6966X0(f21Var.f18671a);
        return ju4.f22634a;
        x21Var = new x21();
        nv2 nv2Var2 = this.f32338t;
        if (nv2Var2 != null) {
            t21Var.f30726t = f21Var;
            t21Var.f30727u = x21Var;
            t21Var.f30730x = 2;
            if (nv2Var2.m8860a(x21Var, t21Var) != ap0Var) {
                f21Var2 = f21Var;
                x21Var2 = x21Var;
                x21Var = x21Var2;
                f21Var = f21Var2;
            }
            return ap0Var;
        }
        this.f32340v = x21Var;
        mo6966X0(f21Var.f18671a);
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b1 */
    public final Object m11702b1(g21 g21Var, ym0 ym0Var) {
        u21 u21Var;
        if (ym0Var instanceof u21) {
            u21Var = (u21) ym0Var;
            int i = u21Var.f31620w;
            if ((i & Integer.MIN_VALUE) != 0) {
                u21Var.f31620w = i - Integer.MIN_VALUE;
            } else {
                u21Var = new u21(this, ym0Var);
            }
        } else {
            u21Var = new u21(this, ym0Var);
        }
        Object obj = u21Var.f31618u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = u21Var.f31620w;
        if (i2 == 0) {
            k43.m7376J(obj);
            x21 x21Var = this.f32340v;
            if (x21Var != null) {
                nv2 nv2Var = this.f32338t;
                if (nv2Var != null) {
                    y21 y21Var = new y21();
                    y21Var.f34820a = x21Var;
                    VarHandle.storeStoreFence();
                    u21Var.f31617t = g21Var;
                    u21Var.f31620w = 1;
                    if (nv2Var.m8860a(y21Var, u21Var) == ap0Var) {
                        return ap0Var;
                    }
                }
            }
            mo6967Y0(g21Var);
            return ju4.f22634a;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        g21Var = u21Var.f31617t;
        k43.m7376J(obj);
        this.f32340v = null;
        mo6967Y0(g21Var);
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: c1 */
    public final b80 m11703c1() {
        f40 f40Var = this.f32339u;
        if (f40Var != null) {
            return f40Var;
        }
        C1077qn.m9987m("Events channel not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: d1 */
    public final mx4 m11704d1() {
        mx4 mx4Var = this.f32332G;
        if (mx4Var != null) {
            return mx4Var;
        }
        C1077qn.m9987m("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: e1 */
    public final void m11705e1(long j, lc3 lc3Var) {
        this.f32344z = b33.m3430h(this.f32344z, j);
        AbstractC1356y5.m12915i(m11704d1(), lc3Var);
        m11703c1().mo5493n(new e21(j, false));
    }

    /* JADX INFO: renamed from: f1 */
    public final void m11706f1(lc3 lc3Var, lc3 lc3Var2, long j) {
        if (this.f32332G == null) {
            this.f32332G = new mx4();
        }
        AbstractC1356y5.m12915i(m11704d1(), lc3Var);
        long jM3429g = b33.m3429g(lc3Var2.f23937c, j);
        yp1 yp1Var = this.f32336r;
        int i = lc3Var.f23943i;
        tc3 tc3Var = new tc3();
        tc3Var.f31073a = i;
        VarHandle.storeStoreFence();
        if (((Boolean) yp1Var.invoke(tc3Var)).booleanValue()) {
            if (!this.f32341w) {
                if (this.f32339u == null) {
                    this.f32339u = ev0.m5333H(Integer.MAX_VALUE, null, null, 6);
                }
                m11707h1();
            }
            m11703c1().mo5493n(new f21(jM3429g));
        }
    }

    /* JADX INFO: renamed from: g1 */
    public boolean mo6291g1() {
        vy3 vy3Var = ((iy3) this).f21891R;
        if (vy3Var.f32958a.mo6019b()) {
            return true;
        }
        C1289wd c1289wd = vy3Var.f32959b;
        return c1289wd != null ? c1289wd.m12218e() : false;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m11707h1() {
        byte b = 1;
        this.f32341w = true;
        wm0 wm0Var = null;
        if (this.f32339u == null) {
            this.f32339u = ev0.m5333H(Integer.MAX_VALUE, null, null, 6);
        }
        lb5.m7910S(m8391C0(), null, null, new C1312wz(this, wm0Var, b), 3);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m11708i1(yp1 yp1Var, boolean z, nv2 nv2Var, d63 d63Var, boolean z2) {
        this.f32336r = yp1Var;
        boolean z3 = true;
        if (this.f32337s != z) {
            this.f32337s = z;
            if (!z) {
                bs1 bs1Var = this.f32327B;
                if (bs1Var != null) {
                    m10155P0(bs1Var);
                }
                bs1 bs1Var2 = this.f32326A;
                if (bs1Var2 != null) {
                    m10155P0(bs1Var2);
                }
                this.f32327B = null;
                this.f32326A = null;
                m11696R0();
                this.f32334I = null;
            }
            z2 = true;
        }
        if (!z62.m13387o(this.f32338t, nv2Var)) {
            m11696R0();
            this.f32338t = nv2Var;
        }
        if (this.f32335q != d63Var) {
            this.f32335q = d63Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.f32342x;
            d21 d21Var = d21.f16741a;
            if (z4) {
                m11697T0();
                if (this.f32341w) {
                    m11703c1().mo5493n(d21Var);
                }
                this.f32332G = null;
            }
            z22 z22Var = this.f32334I;
            if (z22Var != null) {
                z22Var.m13292a();
                v21 v21Var = z22Var.f35711a;
                if (v21Var.f32341w) {
                    v21Var.m11699W0(d21Var);
                }
                z22Var.f35717g = null;
                hf0 hf0Var = z22Var.f35720j;
                hf0Var.f20528b = 0;
                ((rv2) hf0Var.f20529c).f29665b = 0;
            }
        }
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: j0 */
    public final void mo8143j0() {
        if (this.f32342x) {
            m11697T0();
            if (this.f32341w) {
                m11703c1().mo5493n(d21.f16741a);
            }
            this.f32332G = null;
        }
        this.f32342x = false;
    }

    @Override // p000.c31
    /* JADX INFO: renamed from: m */
    public final d63 mo3839m() {
        return this.f32335q;
    }

    @Override // p000.as1
    /* JADX INFO: renamed from: v0 */
    public final String mo3221v0() {
        if (!this.f32337s) {
            return "idle";
        }
        y62 y62Var = this.f32331F;
        if (y62Var instanceof z11) {
            return ((z11) y62Var).f35698E ? "waiting" : "idle";
        }
        if ((y62Var instanceof b21) || (y62Var instanceof a21)) {
            return "waiting";
        }
        return y62Var instanceof c21 ? "recognized" : "idle";
    }

    /* JADX INFO: renamed from: X0 */
    public void mo6966X0(long j) {
    }
}
