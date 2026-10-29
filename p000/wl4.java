package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wl4 extends mt2 implements lf2, s31, g14 {

    /* JADX INFO: renamed from: o */
    public String f33470o;

    /* JADX INFO: renamed from: p */
    public xl4 f33471p;

    /* JADX INFO: renamed from: q */
    public am1 f33472q;

    /* JADX INFO: renamed from: r */
    public int f33473r;

    /* JADX INFO: renamed from: s */
    public boolean f33474s;

    /* JADX INFO: renamed from: t */
    public int f33475t;

    /* JADX INFO: renamed from: u */
    public int f33476u;

    /* JADX INFO: renamed from: v */
    public HashMap f33477v;

    /* JADX INFO: renamed from: w */
    public q73 f33478w;

    /* JADX INFO: renamed from: x */
    public ul4 f33479x;

    /* JADX INFO: renamed from: y */
    public vl4 f33480y;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        q73 q73VarM12325O0;
        vl4 vl4Var = this.f33480y;
        if (vl4Var == null) {
            q73VarM12325O0 = m12325O0();
        } else {
            if (!vl4Var.f32726c) {
                vl4Var = null;
            }
            if (vl4Var == null || (q73VarM12325O0 = vl4Var.f32727d) == null) {
                q73VarM12325O0 = m12325O0();
            }
        }
        q73VarM12325O0.m9757d(so2Var);
        return q73VarM12325O0.m9754a(i, so2Var.getLayoutDirection());
    }

    /* JADX INFO: renamed from: O0 */
    public final q73 m12325O0() {
        xl4 xl4Var = this.f33471p;
        q73 q73Var = this.f33478w;
        if (q73Var != null) {
            return q73Var;
        }
        q73 q73Var2 = new q73(this.f33470o, xl4Var, this.f33472q, this.f33473r, this.f33474s, this.f33475t, this.f33476u);
        this.f33478w = q73Var2;
        return q73Var2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        q73 q73VarM12325O0;
        if (this.f25208n) {
            vl4 vl4Var = this.f33480y;
            if (vl4Var == null) {
                q73VarM12325O0 = m12325O0();
            } else {
                if (!vl4Var.f32726c) {
                    vl4Var = null;
                }
                if (vl4Var == null || (q73VarM12325O0 = vl4Var.f32727d) == null) {
                    q73VarM12325O0 = m12325O0();
                }
            }
            C1328xe c1328xe = q73VarM12325O0.f28254j;
            if (c1328xe == null) {
                t32.m10969b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.f33478w + ", textSubstitution=" + this.f33480y + ")");
                xy4.m12794w();
                return;
            }
            h70 h70VarM7248w = yf2Var.f35194a.f22064b.m7248w();
            boolean z = q73VarM12325O0.f28255k;
            if (z) {
                long j = q73VarM12325O0.f28256l;
                h70VarM7248w.mo6253j();
                h70VarM7248w.mo6248d(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                xl4 xl4Var = this.f33471p;
                pa4 pa4Var = xl4Var.f34389a;
                uj4 uj4Var = pa4Var.f27490m;
                if (uj4Var == null) {
                    uj4Var = uj4.f31938b;
                }
                uj4 uj4Var2 = uj4Var;
                m44 m44Var = pa4Var.f27491n;
                if (m44Var == null) {
                    m44Var = m44.f24642d;
                }
                m44 m44Var2 = m44Var;
                qq2 qq2Var = pa4Var.f27492o;
                if (qq2Var == null) {
                    qq2Var = uf1.f31820j;
                }
                qq2 qq2Var2 = qq2Var;
                t30 t30VarMo5690f = pa4Var.f27478a.mo5690f();
                if (t30VarMo5690f != null) {
                    c1328xe.m12678f(h70VarM7248w, t30VarMo5690f, xl4Var.f34389a.f27478a.mo5691h(), m44Var2, uj4Var2, qq2Var2);
                } else {
                    long jM12710b = pb0.f27501h;
                    if (jM12710b == 16) {
                        jM12710b = xl4Var.m12710b() != 16 ? xl4Var.m12710b() : pb0.f27495b;
                    }
                    c1328xe.m12677e(h70VarM7248w, jM12710b, m44Var2, uj4Var2, qq2Var2);
                }
            } finally {
                if (z) {
                    h70VarM7248w.mo6251g();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        q73 q73VarM12325O0;
        vl4 vl4Var = this.f33480y;
        if (vl4Var == null) {
            q73VarM12325O0 = m12325O0();
        } else {
            if (!vl4Var.f32726c) {
                vl4Var = null;
            }
            if (vl4Var == null || (q73VarM12325O0 = vl4Var.f32727d) == null) {
                q73VarM12325O0 = m12325O0();
            }
        }
        q73VarM12325O0.m9757d(so2Var);
        return as4.m3261t(q73VarM12325O0.m9758e(so2Var.getLayoutDirection()).mo2950a());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0033, B:20:0x003f, B:21:0x0046, B:22:0x0070, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        q73 q73VarM12325O0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            vl4 vl4Var = this.f33480y;
            if (vl4Var == null) {
                q73VarM12325O0 = m12325O0();
            } else {
                if (!vl4Var.f32726c) {
                    vl4Var = null;
                }
                if (vl4Var == null || (q73VarM12325O0 = vl4Var.f32727d) == null) {
                    q73VarM12325O0 = m12325O0();
                }
            }
            q73VarM12325O0.m9757d(zq2Var);
            boolean zM9755b = q73VarM12325O0.m9755b(j, zq2Var.getLayoutDirection());
            p73 p73Var = q73VarM12325O0.f28258n;
            if (p73Var != null) {
                p73Var.mo2951b();
            }
            hl4 hl4Var = q73VarM12325O0.f28254j.f34185c;
            long j2 = q73VarM12325O0.f28256l;
            if (zM9755b) {
                sc6.m10650V(this, 2).m4879h1();
                HashMap map = this.f33477v;
                if (map == null) {
                    map = new HashMap(2);
                    this.f33477v = map;
                }
                map.put(AbstractC0681ga.f19681a, Integer.valueOf(Math.round(hl4Var.m6431d(0) + 0.0f)));
                map.put(AbstractC0681ga.f19682b, Integer.valueOf(Math.round(hl4Var.m6431d(hl4Var.f20680g - 1) + 0.0f)));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            db3 db3VarMo5826e = sq2Var.mo5826e(C0638f5.m5548s(i, i, i2, i2));
            Map map2 = this.f33477v;
            C0830kc c0830kc = new C0830kc((byte) 15);
            c0830kc.f23061b = db3VarMo5826e;
            VarHandle.storeStoreFence();
            return zq2Var.mo3583l0(i, i2, map2, c0830kc);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        q73 q73VarM12325O0;
        vl4 vl4Var = this.f33480y;
        if (vl4Var == null) {
            q73VarM12325O0 = m12325O0();
        } else {
            if (!vl4Var.f32726c) {
                vl4Var = null;
            }
            if (vl4Var == null || (q73VarM12325O0 = vl4Var.f32727d) == null) {
                q73VarM12325O0 = m12325O0();
            }
        }
        q73VarM12325O0.m9757d(so2Var);
        return as4.m3261t(q73VarM12325O0.m9758e(so2Var.getLayoutDirection()).mo2952c());
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        ul4 ul4Var = this.f33479x;
        if (ul4Var == null) {
            ul4Var = new ul4((byte) 0);
            ul4Var.f31973b = this;
            VarHandle.storeStoreFence();
            this.f33479x = ul4Var;
        }
        C0875lk c0875lk = new C0875lk(this.f33470o);
        ic2[] ic2VarArr = o14.f26289a;
        q14Var.mo4898a(m14.f24535B, Collections.singletonList(c0875lk));
        vl4 vl4Var = this.f33480y;
        if (vl4Var != null) {
            boolean z = vl4Var.f32726c;
            p14 p14Var = m14.f24537D;
            ic2[] ic2VarArr2 = o14.f26289a;
            ic2 ic2Var = ic2VarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            p14Var.getClass();
            q14Var.mo4898a(p14Var, boolValueOf);
            C0875lk c0875lk2 = new C0875lk(vl4Var.f32725b);
            p14 p14Var2 = m14.f24536C;
            ic2 ic2Var2 = ic2VarArr2[16];
            p14Var2.getClass();
            q14Var.mo4898a(p14Var2, c0875lk2);
        }
        ul4 ul4Var2 = new ul4((byte) 1);
        ul4Var2.f31973b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(d14.f16715l, new C1353y2(null, ul4Var2));
        ul4 ul4Var3 = new ul4((byte) 2);
        ul4Var3.f31973b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(d14.f16716m, new C1353y2(null, ul4Var3));
        sj4 sj4Var = new sj4((byte) 2);
        sj4Var.f30344b = this;
        VarHandle.storeStoreFence();
        q14Var.mo4898a(d14.f16717n, new C1353y2(null, sj4Var));
        o14.m8920a(q14Var, ul4Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        q73 q73VarM12325O0;
        vl4 vl4Var = this.f33480y;
        if (vl4Var == null) {
            q73VarM12325O0 = m12325O0();
        } else {
            if (!vl4Var.f32726c) {
                vl4Var = null;
            }
            if (vl4Var == null || (q73VarM12325O0 = vl4Var.f32727d) == null) {
                q73VarM12325O0 = m12325O0();
            }
        }
        q73VarM12325O0.m9757d(so2Var);
        return q73VarM12325O0.m9754a(i, so2Var.getLayoutDirection());
    }
}
