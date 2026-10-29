package p000;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uq2 {

    /* JADX INFO: renamed from: a */
    public wf2 f32094a;

    /* JADX INFO: renamed from: b */
    public jp0 f32095b;

    /* JADX INFO: renamed from: c */
    public boolean f32096c;

    /* JADX INFO: renamed from: d */
    public boolean f32097d;

    /* JADX INFO: renamed from: e */
    public z32 f32098e;

    /* JADX INFO: renamed from: f */
    public uw2 f32099f;

    /* JADX INFO: renamed from: g */
    public boolean f32100g;

    /* JADX INFO: renamed from: h */
    public uw2 f32101h;

    /* JADX INFO: renamed from: i */
    public kl0 f32102i;

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: b */
    public static boolean m11607b(wf2 wf2Var, kl0 kl0Var) {
        boolean zM13199E0;
        wf2 wf2Var2 = wf2Var.f33319i;
        ag2 ag2Var = wf2Var.f33300H;
        if (wf2Var2 == null) {
            return false;
        }
        if (kl0Var == null) {
            yo2 yo2Var = ag2Var.f14484q;
            kl0 kl0Var2 = yo2Var != null ? yo2Var.f35411n : null;
            if (kl0Var2 == null || wf2Var2 == null) {
                zM13199E0 = false;
            } else {
                zM13199E0 = yo2Var.m13199E0(kl0Var2.f23210a);
            }
        } else if (wf2Var2 != null) {
            zM13199E0 = ag2Var.f14484q.m13199E0(kl0Var.f23210a);
        } else {
            zM13199E0 = false;
        }
        wf2 wf2VarM12295v = wf2Var.m12295v();
        if (zM13199E0 && wf2VarM12295v != null) {
            if (wf2VarM12295v.f33319i == null) {
                wf2.m12245X(wf2VarM12295v, false, 3);
                return zM13199E0;
            }
            if (wf2Var.m12293t() == uf2.f31821a) {
                wf2.m12244V(wf2VarM12295v, false, 3);
                return zM13199E0;
            }
            if (wf2Var.m12293t() == uf2.f31822b) {
                wf2VarM12295v.m12267U(false);
            }
        }
        return zM13199E0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11608c(wf2 wf2Var, kl0 kl0Var) throws Throwable {
        boolean zM12377E0;
        if (kl0Var != null) {
            if (wf2Var.f33296D == uf2.f31823c) {
                wf2Var.m12277f();
            }
            zM12377E0 = wf2Var.f33300H.f14483p.m12377E0(kl0Var.f23210a);
        } else {
            wq2 wq2Var = wf2Var.f33300H.f14483p;
            kl0 kl0VarM7531a = wq2Var.f33625j ? kl0.m7531a(wq2Var.f16902d) : null;
            if (kl0VarM7531a != null) {
                if (wf2Var.f33296D == uf2.f31823c) {
                    wf2Var.m12277f();
                }
                zM12377E0 = wf2Var.f33300H.f14483p.m12377E0(kl0VarM7531a.f23210a);
            } else {
                wf2Var.getClass();
                zM12377E0 = false;
            }
        }
        wf2 wf2VarM12295v = wf2Var.m12295v();
        if (zM12377E0 && wf2VarM12295v != null) {
            if (wf2Var.m12292s() == uf2.f31821a) {
                wf2.m12245X(wf2VarM12295v, false, 3);
                return zM12377E0;
            }
            if (wf2Var.m12292s() == uf2.f31822b) {
                wf2VarM12295v.m12268W(false);
            }
        }
        return zM12377E0;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11609h(wf2 wf2Var) {
        yo2 yo2Var;
        xf2 xf2Var;
        if (wf2Var.f33300H.f14472e) {
            return (wf2Var.m12293t() == uf2.f31823c && ((yo2Var = wf2Var.f33300H.f14484q) == null || (xf2Var = yo2Var.f35416s) == null || !xf2Var.m12690e())) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m11610i(wf2 wf2Var) {
        if (!wf2Var.m12291r()) {
            return false;
        }
        do {
            if (wf2Var.m12292s() == uf2.f31823c && !wf2Var.f33300H.f14483p.f33640y.m12690e()) {
                wf2 wf2VarM12295v = wf2Var.m12295v();
                if ((wf2VarM12295v != null ? wf2VarM12295v.f33300H.f14471d : null) != sf2.f30226a) {
                    return false;
                }
            }
            wf2Var = wf2Var.m12295v();
            if (wf2Var == null) {
                return false;
            }
        } while (!wf2Var.m12257K());
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m11611j(wf2 wf2Var) {
        yo2 yo2Var;
        xf2 xf2Var;
        ag2 ag2Var = wf2Var.f33300H;
        return wf2Var.m12257K() || ag2Var.f14483p.f33636u || m11610i(wf2Var) || z62.m13387o(wf2Var.m12258L(), Boolean.TRUE) || m11609h(wf2Var) || ag2Var.f14483p.f33640y.m12690e() || !((yo2Var = ag2Var.f14484q) == null || (xf2Var = yo2Var.f35416s) == null || !xf2Var.m12690e());
    }

    /* JADX INFO: renamed from: a */
    public final void m11612a(boolean z) {
        z32 z32Var = this.f32098e;
        if (z) {
            wf2 wf2Var = this.f32094a;
            uw2 uw2Var = (uw2) z32Var.f35738b;
            if (wf2Var.f33309Q > 0) {
                uw2Var.m11668g();
                uw2Var.m11663b(wf2Var);
                wf2Var.f33308P = true;
            }
        }
        if (((uw2) z32Var.f35738b).f32213c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                z32Var.m13327v();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11613d() {
        uw2 uw2Var = this.f32101h;
        int i = uw2Var.f32213c;
        if (i != 0) {
            Object[] objArr = uw2Var.f32211a;
            for (int i2 = 0; i2 < i; i2++) {
                tq2 tq2Var = (tq2) objArr[i2];
                if (tq2Var.f31332a.m12256J()) {
                    boolean z = tq2Var.f31333b;
                    wf2 wf2Var = tq2Var.f31332a;
                    boolean z2 = tq2Var.f31334c;
                    if (z) {
                        wf2.m12244V(wf2Var, z2, 2);
                    } else {
                        wf2.m12245X(wf2Var, z2, 2);
                    }
                }
            }
            uw2Var.m11668g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11614e(wf2 wf2Var) {
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            if (z62.m13387o(wf2Var2.m12258L(), Boolean.TRUE) && !wf2Var2.f33310R) {
                if (this.f32095b.m7244o(wf2Var2)) {
                    wf2Var2.m12259M();
                }
                m11614e(wf2Var2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11615f(wf2 wf2Var, boolean z) {
        if (!this.f32096c) {
            q32.m9721c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? wf2Var.f33300H.f14472e : wf2Var.m12291r()) {
            q32.m9719a("node not yet measured");
        }
        m11616g(wf2Var, z);
    }

    /* JADX INFO: renamed from: g */
    public final void m11616g(wf2 wf2Var, boolean z) throws Throwable {
        yo2 yo2Var;
        xf2 xf2Var;
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            if ((!z && (wf2Var2.m12292s() == uf2.f31821a || wf2Var2.f33300H.f14483p.f33640y.m12690e())) || (z && (wf2Var2.m12293t() == uf2.f31821a || ((yo2Var = wf2Var2.f33300H.f14484q) != null && (xf2Var = yo2Var.f35416s) != null && xf2Var.m12690e())))) {
                boolean zM10039w = qq2.m10039w(wf2Var2);
                ag2 ag2Var = wf2Var2.f33300H;
                if (zM10039w && !z) {
                    if (ag2Var.f14472e && this.f32095b.m7244o(wf2Var2)) {
                        m11621o(wf2Var2, true);
                    } else {
                        m11615f(wf2Var2, true);
                    }
                }
                if (z ? ag2Var.f14472e : wf2Var2.m12291r()) {
                    m11621o(wf2Var2, z);
                }
                if (!(z ? ag2Var.f14472e : wf2Var2.m12291r())) {
                    m11616g(wf2Var2, z);
                }
            }
        }
        if (z ? wf2Var.f33300H.f14472e : wf2Var.m12291r()) {
            m11621o(wf2Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [mt2] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [mt2] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [uw2] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [uw2] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX INFO: renamed from: k */
    public final boolean m11617k(wp1 wp1Var) {
        boolean z;
        mt2 mt2Var;
        ?? M10644P;
        boolean z2;
        wf2 wf2Var;
        boolean z3;
        boolean zM11621o;
        jp0 jp0Var = this.f32095b;
        wf2 wf2Var2 = this.f32094a;
        if (!wf2Var2.m12256J()) {
            q32.m9719a("performMeasureAndLayout called with unattached root");
        }
        if (!wf2Var2.m12257K()) {
            q32.m9719a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f32096c) {
            q32.m9719a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.f32102i != null) {
            this.f32096c = true;
            this.f32097d = true;
            try {
                boolean zM7221G = jp0Var.m7221G();
                ar3 ar3Var = (ar3) jp0Var.f22481b;
                if (zM7221G) {
                    z = false;
                    while (true) {
                        ar3 ar3Var2 = (ar3) jp0Var.f22483d;
                        ar3 ar3Var3 = (ar3) jp0Var.f22482c;
                        if (!((ha4) ar3Var.f14813b).isEmpty()) {
                            wf2Var = (wf2) ((ha4) ar3Var.f14813b).first();
                            ar3Var.m3153w(wf2Var);
                            z3 = wf2Var.f33319i != null;
                            z2 = false;
                        } else if (!((ha4) ar3Var3.f14813b).isEmpty()) {
                            wf2Var = (wf2) ((ha4) ar3Var3.f14813b).first();
                            ar3Var3.m3153w(wf2Var);
                            z3 = wf2Var.f33319i != null;
                            z2 = true;
                        } else {
                            if (((ha4) ar3Var2.f14813b).isEmpty()) {
                                break;
                            }
                            wf2 wf2Var3 = (wf2) ((ha4) ar3Var2.f14813b).first();
                            ar3Var2.m3153w(wf2Var3);
                            z2 = true;
                            wf2Var = wf2Var3;
                            z3 = false;
                        }
                        if (z2) {
                            zM11621o = m11620n(wf2Var, z3);
                        } else {
                            zM11621o = m11621o(wf2Var, z3);
                            if (wf2Var.f33300H.f14473f) {
                                jp0Var.m7235c(wf2Var, k72.f22958b);
                            }
                            if (wf2Var.m12290q()) {
                                jp0Var.m7235c(wf2Var, k72.f22960d);
                            }
                        }
                        if (wf2Var == wf2Var2 && zM11621o) {
                            z = true;
                        }
                    }
                    if (wp1Var != null) {
                        wp1Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.f32096c = false;
                this.f32097d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f32096c = false;
                    this.f32097d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        uw2 uw2Var = this.f32099f;
        Object[] objArr = uw2Var.f32211a;
        int i2 = uw2Var.f32213c;
        int i3 = 0;
        while (i3 < i2) {
            C0940nb c0940nb = ((wf2) objArr[i3]).f33299G;
            w32 w32Var = (w32) c0940nb.f25607d;
            boolean zM5457g = f13.m5457g(4194304);
            if (zM5457g) {
                mt2Var = w32Var.f33059e0;
            } else {
                mt2Var = w32Var.f33059e0.f25199e;
                if (mt2Var == null) {
                }
                i3++;
                i = 0;
            }
            kr2 kr2Var = e13.f17595X;
            mt2 mt2VarM4874c1 = w32Var.m4874c1(zM5457g);
            while (mt2VarM4874c1 != null && (mt2VarM4874c1.f25198d & 4194304) != 0) {
                if ((mt2VarM4874c1.f25197c & 4194304) != 0) {
                    ?? r12 = mt2VarM4874c1;
                    ?? uw2Var2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof af2) {
                            ((af2) r12).mo2965v((w32) c0940nb.f25607d);
                        } else {
                            if ((r12.f25197c & 4194304) != 0 && (r12 instanceof qx0)) {
                                mt2 mt2Var2 = ((qx0) r12).f28863p;
                                int i4 = i;
                                while (mt2Var2 != null) {
                                    if ((mt2Var2.f25197c & 4194304) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            M10644P = r12;
                                            uw2Var2 = uw2Var2;
                                            uw2Var2 = uw2Var2;
                                            M10644P = mt2Var2;
                                        } else {
                                            if (uw2Var2 == 0) {
                                                uw2Var2 = new uw2(new mt2[16]);
                                            }
                                            if (M10644P != 0) {
                                                uw2Var2.m11663b(M10644P);
                                                M10644P = 0;
                                            }
                                            uw2Var2.m11663b(mt2Var2);
                                        }
                                    } else {
                                        M10644P = r12;
                                        uw2Var2 = uw2Var2;
                                    }
                                    mt2Var2 = mt2Var2.f25200f;
                                    M10644P = M10644P;
                                    uw2Var2 = uw2Var2;
                                }
                                if (i4 == 1) {
                                    M10644P = r12;
                                    uw2Var2 = uw2Var2;
                                }
                            }
                            i = 0;
                            r12 = M10644P;
                            uw2Var2 = uw2Var2;
                        }
                        M10644P = r12;
                        uw2Var2 = uw2Var2;
                        M10644P = sc6.m10644P(uw2Var2);
                        i = 0;
                        r12 = M10644P;
                        uw2Var2 = uw2Var2;
                    }
                }
                if (mt2VarM4874c1 == mt2Var) {
                    break;
                }
                mt2VarM4874c1 = mt2VarM4874c1.f25200f;
                i = 0;
            }
            i3++;
            i = 0;
        }
        uw2Var.m11668g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [mt2] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX INFO: renamed from: l */
    public final void m11618l(wf2 wf2Var, long j) {
        mt2 mt2Var;
        wf2 wf2Var2 = this.f32094a;
        if (wf2Var.f33310R) {
            return;
        }
        if (wf2Var == wf2Var2) {
            q32.m9719a("measureAndLayout called on root");
        }
        if (!wf2Var2.m12256J()) {
            q32.m9719a("performMeasureAndLayout called with unattached root");
        }
        if (!wf2Var2.m12257K()) {
            q32.m9719a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f32096c) {
            q32.m9719a("performMeasureAndLayout called during measure layout");
        }
        if (this.f32102i != null) {
            this.f32096c = true;
            this.f32097d = false;
            try {
                jp0 jp0Var = this.f32095b;
                ((ar3) jp0Var.f22481b).m3153w(wf2Var);
                ((ar3) jp0Var.f22482c).m3153w(wf2Var);
                ((ar3) jp0Var.f22483d).m3153w(wf2Var);
                if ((m11607b(wf2Var, kl0.m7531a(j)) || wf2Var.f33300H.f14473f) && z62.m13387o(wf2Var.m12258L(), Boolean.TRUE)) {
                    wf2Var.m12259M();
                }
                m11614e(wf2Var);
                m11608c(wf2Var, kl0.m7531a(j));
                if (wf2Var.m12290q() && wf2Var.m12257K()) {
                    wf2Var.m12266T();
                    z32 z32Var = this.f32098e;
                    z32Var.getClass();
                    if (wf2Var.f33309Q > 0) {
                        ((uw2) z32Var.f35738b).m11663b(wf2Var);
                        wf2Var.f33308P = true;
                    }
                }
                m11613d();
                this.f32096c = false;
                this.f32097d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.f32096c = false;
                    this.f32097d = false;
                    throw th2;
                }
            }
        }
        uw2 uw2Var = this.f32099f;
        Object[] objArr = uw2Var.f32211a;
        int i = uw2Var.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            C0940nb c0940nb = ((wf2) objArr[i2]).f33299G;
            w32 w32Var = (w32) c0940nb.f25607d;
            boolean zM5457g = f13.m5457g(4194304);
            if (zM5457g) {
                mt2Var = w32Var.f33059e0;
            } else {
                mt2Var = w32Var.f33059e0.f25199e;
                if (mt2Var == null) {
                }
            }
            kr2 kr2Var = e13.f17595X;
            for (mt2 mt2VarM4874c1 = w32Var.m4874c1(zM5457g); mt2VarM4874c1 != null && (mt2VarM4874c1.f25198d & 4194304) != 0; mt2VarM4874c1 = mt2VarM4874c1.f25200f) {
                if ((mt2VarM4874c1.f25197c & 4194304) != 0) {
                    ?? M10644P = mt2VarM4874c1;
                    ?? uw2Var2 = 0;
                    while (M10644P != 0) {
                        if (M10644P instanceof af2) {
                            ((af2) M10644P).mo2965v((w32) c0940nb.f25607d);
                        } else if ((M10644P.f25197c & 4194304) != 0 && (M10644P instanceof qx0)) {
                            mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                            int i3 = 0;
                            while (mt2Var2 != null) {
                                if ((mt2Var2.f25197c & 4194304) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        M10644P = M10644P;
                                        uw2Var2 = uw2Var2;
                                        uw2Var2 = uw2Var2;
                                        M10644P = mt2Var2;
                                    } else {
                                        if (uw2Var2 == 0) {
                                            uw2Var2 = new uw2(new mt2[16]);
                                        }
                                        if (M10644P != 0) {
                                            uw2Var2.m11663b(M10644P);
                                            M10644P = 0;
                                        }
                                        uw2Var2.m11663b(mt2Var2);
                                    }
                                } else {
                                    M10644P = M10644P;
                                    uw2Var2 = uw2Var2;
                                }
                                mt2Var2 = mt2Var2.f25200f;
                                M10644P = M10644P;
                                uw2Var2 = uw2Var2;
                            }
                            if (i3 == 1) {
                                M10644P = M10644P;
                                uw2Var2 = uw2Var2;
                            } else {
                                M10644P = M10644P;
                                uw2Var2 = uw2Var2;
                            }
                        }
                        M10644P = sc6.m10644P(uw2Var2);
                    }
                }
                if (mt2VarM4874c1 == mt2Var) {
                    break;
                }
            }
        }
        uw2Var.m11668g();
    }

    /* JADX INFO: renamed from: m */
    public final void m11619m() {
        wf2 wf2Var = this.f32094a;
        jp0 jp0Var = this.f32095b;
        if (jp0Var.m7221G()) {
            if (!wf2Var.m12256J()) {
                q32.m9719a("performMeasureAndLayout called with unattached root");
            }
            if (!wf2Var.m12257K()) {
                q32.m9719a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f32096c) {
                q32.m9719a("performMeasureAndLayout called during measure layout");
            }
            if (this.f32102i != null) {
                this.f32096c = true;
                this.f32097d = false;
                try {
                    if ((((ha4) ((ar3) jp0Var.f22483d).f14813b).isEmpty() || ((ha4) ((ar3) jp0Var.f22481b).f14813b).isEmpty()) ? false : true) {
                        if (wf2Var.f33319i != null) {
                            m11623q(wf2Var, true);
                        } else {
                            m11622p(wf2Var);
                        }
                    }
                    m11623q(wf2Var, false);
                    this.f32096c = false;
                    this.f32097d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.f32096c = false;
                        this.f32097d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11620n(wf2 wf2Var, boolean z) {
        cb3 placementScope;
        w32 w32Var;
        wf2 wf2VarM12295v;
        wf2 wf2Var2 = this.f32094a;
        boolean z2 = wf2Var.f33310R;
        ag2 ag2Var = wf2Var.f33300H;
        boolean zM11607b = false;
        if (!z2 && m11611j(wf2Var)) {
            kl0 kl0Var = wf2Var == wf2Var2 ? this.f32102i : null;
            if (z) {
                zM11607b = ag2Var.f14472e ? m11607b(wf2Var, kl0Var) : false;
                if ((zM11607b || ag2Var.f14473f) && z62.m13387o(wf2Var.m12258L(), Boolean.TRUE)) {
                    wf2Var.m12259M();
                }
            } else {
                boolean zM11608c = wf2Var.m12291r() ? m11608c(wf2Var, kl0Var) : false;
                if (wf2Var.m12290q() && (wf2Var == wf2Var2 || ((wf2VarM12295v = wf2Var.m12295v()) != null && wf2VarM12295v.m12257K() && ag2Var.f14483p.f33636u))) {
                    if (wf2Var == wf2Var2) {
                        if (wf2Var.f33296D == uf2.f31823c) {
                            wf2Var.m12279g();
                        }
                        wf2 wf2VarM12295v2 = wf2Var.m12295v();
                        if (wf2VarM12295v2 == null || (w32Var = (w32) wf2VarM12295v2.f33299G.f25607d) == null || (placementScope = w32Var.f30442p) == null) {
                            placementScope = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getPlacementScope();
                        }
                        cb3.m3944n(placementScope, ag2Var.f14483p, 0, 0);
                    } else {
                        wf2Var.m12266T();
                    }
                    z32 z32Var = this.f32098e;
                    z32Var.getClass();
                    if (wf2Var.f33309Q > 0) {
                        ((uw2) z32Var.f35738b).m11663b(wf2Var);
                        wf2Var.f33308P = true;
                    }
                }
                zM11607b = zM11608c;
            }
            m11613d();
        }
        return zM11607b;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11621o(wf2 wf2Var, boolean z) throws Throwable {
        boolean zM11608c = false;
        if (!wf2Var.f33310R && m11611j(wf2Var)) {
            kl0 kl0Var = wf2Var == this.f32094a ? this.f32102i : null;
            if (z) {
                if (wf2Var.f33300H.f14472e) {
                    zM11608c = m11607b(wf2Var, kl0Var);
                }
            } else if (wf2Var.m12291r()) {
                zM11608c = m11608c(wf2Var, kl0Var);
            }
            m11613d();
        }
        return zM11608c;
    }

    /* JADX INFO: renamed from: p */
    public final void m11622p(wf2 wf2Var) throws Throwable {
        uw2 uw2VarM12248A = wf2Var.m12248A();
        Object[] objArr = uw2VarM12248A.f32211a;
        int i = uw2VarM12248A.f32213c;
        for (int i2 = 0; i2 < i; i2++) {
            wf2 wf2Var2 = (wf2) objArr[i2];
            if (wf2Var2.m12292s() == uf2.f31821a || wf2Var2.f33300H.f14483p.f33640y.m12690e()) {
                if (qq2.m10039w(wf2Var2)) {
                    m11623q(wf2Var2, true);
                } else {
                    m11622p(wf2Var2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11623q(wf2 wf2Var, boolean z) throws Throwable {
        if (wf2Var.f33310R) {
            return;
        }
        kl0 kl0Var = wf2Var == this.f32094a ? this.f32102i : null;
        if (z) {
            m11607b(wf2Var, kl0Var);
        } else {
            m11608c(wf2Var, kl0Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11624r(wf2 wf2Var, boolean z) {
        int iOrdinal = wf2Var.f33300H.f14471d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.f32101h.m11663b(new tq2(wf2Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    C0670g.m5864c();
                    return false;
                }
                if (!wf2Var.m12291r() || z) {
                    wf2Var.f33300H.f14483p.f33637v = true;
                    if (!wf2Var.f33310R && (wf2Var.m12257K() || m11610i(wf2Var))) {
                        wf2 wf2VarM12295v = wf2Var.m12295v();
                        if (wf2VarM12295v == null || !wf2VarM12295v.m12291r()) {
                            this.f32095b.m7235c(wf2Var, k72.f22959c);
                        }
                        if (!this.f32097d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m11625s(long j) {
        wf2 wf2Var = this.f32094a;
        kl0 kl0Var = this.f32102i;
        if (kl0Var == null ? false : kl0.m7533c(kl0Var.f23210a, j)) {
            return;
        }
        if (this.f32096c) {
            q32.m9719a("updateRootConstraints called while measuring");
        }
        this.f32102i = kl0.m7531a(j);
        boolean zM12256J = wf2Var.m12256J();
        ag2 ag2Var = wf2Var.f33300H;
        if (zM12256J) {
            wf2 wf2Var2 = wf2Var.f33319i;
            if (wf2Var2 != null) {
                ag2Var.f14472e = true;
            }
            ag2Var.f14483p.f33637v = true;
            this.f32095b.m7235c(wf2Var, wf2Var2 != null ? k72.f22957a : k72.f22959c);
        }
    }
}
