package p000;

import android.view.ViewConfiguration;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ru2 extends o13 {

    /* JADX INFO: renamed from: f */
    public js1 f29639f;

    /* JADX INFO: renamed from: g */
    public f40 f29640g;

    /* JADX INFO: renamed from: h */
    public t82 f29641h;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public static final Object m10438e(ru2 ru2Var, ql3 ql3Var, nl3 nl3Var, vy3 vy3Var, ql3 ql3Var2, long j, ym0 ym0Var) {
        qu2 qu2Var;
        vy3 vy3Var2;
        ql3 ql3Var3;
        ru2 ru2Var2;
        ql3 ql3Var4;
        nl3 nl3Var2;
        boolean z;
        if (ym0Var instanceof qu2) {
            qu2Var = (qu2) ym0Var;
            int i = qu2Var.f28817z;
            if ((i & Integer.MIN_VALUE) != 0) {
                qu2Var.f28817z = i - Integer.MIN_VALUE;
            } else {
                qu2Var = new qu2(ym0Var);
            }
        } else {
            qu2Var = new qu2(ym0Var);
        }
        Object objM10727i0 = qu2Var.f28816y;
        ap0 ap0Var = ap0.f14763a;
        int i2 = qu2Var.f28817z;
        wm0 wm0Var = null;
        if (i2 == 0) {
            k43.m7376J(objM10727i0);
            if (j < 0) {
                return Boolean.FALSE;
            }
            C0982og c0982og = new C0982og((Object) ru2Var, wm0Var, (byte) 15);
            qu2Var.f28811t = ru2Var;
            qu2Var.f28812u = ql3Var;
            qu2Var.f28813v = nl3Var;
            vy3Var2 = vy3Var;
            qu2Var.f28814w = vy3Var2;
            ql3Var3 = ql3Var2;
            qu2Var.f28815x = ql3Var3;
            qu2Var.f28817z = 1;
            objM10727i0 = se0.m10727i0(j, c0982og, qu2Var);
            if (objM10727i0 == ap0Var) {
                return ap0Var;
            }
            ru2Var2 = ru2Var;
            ql3Var4 = ql3Var;
            nl3Var2 = nl3Var;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql3 ql3Var5 = qu2Var.f28815x;
            vy3 vy3Var3 = qu2Var.f28814w;
            nl3Var2 = qu2Var.f28813v;
            ql3Var4 = qu2Var.f28812u;
            ru2 ru2Var3 = qu2Var.f28811t;
            k43.m7376J(objM10727i0);
            ql3Var3 = ql3Var5;
            vy3Var2 = vy3Var3;
            ru2Var2 = ru2Var3;
        }
        nu2 nu2Var = (nu2) objM10727i0;
        if (nu2Var != null) {
            boolean z2 = ((nu2) ql3Var4.f28555a).f26095c;
            long j2 = nu2Var.f26093a;
            ql3Var4.f28555a = new nu2(j2, nu2Var.f26094b, z2);
            nl3Var2.f25933a = vy3Var2.m12037j(vy3Var2.m12033f(j2));
            ql3Var3.f28555a = k43.m7379a(0.0f, 0.0f, 30);
            nh3 nh3Var = ru2Var2.f26288e;
            long j3 = nu2Var.f26094b;
            long j4 = nu2Var.f26093a;
            ((lx4) nh3Var.f25810b).m8145a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((lx4) nh3Var.f25811c).m8145a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            z = !y70.m13007H(nl3Var2.f25933a);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: g */
    public static nu2 m10439g(f40 f40Var) {
        mu2 mu2Var = new mu2((byte) 0);
        mu2Var.f25221b = f40Var;
        VarHandle.storeStoreFence();
        nu2 nu2Var = null;
        b24 b24VarM4325z = d24.m4325z(new p13(mu2Var, null));
        while (b24VarM4325z.hasNext()) {
            nu2 nu2VarM8850a = (nu2) b24VarM4325z.next();
            if (nu2Var != null) {
                nu2VarM8850a = nu2Var.m8850a(nu2VarM8850a);
            }
            nu2Var = nu2VarM8850a;
        }
        return nu2Var;
    }

    /* JADX INFO: renamed from: c */
    public final float m10440c(ty3 ty3Var, float f) {
        vy3 vy3Var = this.f26284a;
        long jM12036i = vy3Var.m12036i(vy3Var.m12032e(f));
        vy3 vy3Var2 = ty3Var.f31538a;
        return vy3Var.m12035h(vy3Var.m12033f(vy3Var2.m12031d(vy3Var2.f32968k, jM12036i, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: d */
    public final Object m10441d(vy3 vy3Var, nu2 nu2Var, float f, float f2, ym0 ym0Var) {
        ou2 ou2Var;
        ju4 ju4Var;
        nh3 nh3Var;
        nl3 nl3Var;
        float f3;
        vy3 vy3Var2;
        ru2 ru2Var = this;
        if (ym0Var instanceof ou2) {
            ou2Var = (ou2) ym0Var;
            int i = ou2Var.f27124y;
            if ((i & Integer.MIN_VALUE) != 0) {
                ou2Var.f27124y = i - Integer.MIN_VALUE;
            } else {
                ou2Var = new ou2(ru2Var, ym0Var);
            }
        } else {
            ou2Var = new ou2(ru2Var, ym0Var);
        }
        ou2 ou2Var2 = ou2Var;
        Object obj = ou2Var2.f27122w;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ou2Var2.f27124y;
        nh3 nh3Var2 = ru2Var.f26288e;
        ju4 ju4Var2 = ju4.f22634a;
        if (i2 == 0) {
            k43.m7376J(obj);
            ql3 ql3Var = new ql3();
            ql3Var.f28555a = nu2Var;
            long j = nu2Var.f26094b;
            ju4Var = ju4Var2;
            long j2 = nu2Var.f26093a;
            ((lx4) nh3Var2.f25810b).m8145a(j, Float.intBitsToFloat((int) (j2 >> 32)));
            ((lx4) nh3Var2.f25811c).m8145a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
            nu2 nu2VarM10439g = m10439g(this.f29640g);
            if (nu2VarM10439g != null) {
                long j3 = nu2VarM10439g.f26094b;
                long j4 = nu2VarM10439g.f26093a;
                ((lx4) nh3Var2.f25810b).m8145a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                nh3Var = nh3Var2;
                ((lx4) nh3Var.f25811c).m8145a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                ql3Var.f28555a = ((nu2) ql3Var.f28555a).m8850a(nu2VarM10439g);
            } else {
                nh3Var = nh3Var2;
            }
            nl3 nl3Var2 = new nl3();
            float fM12035h = vy3Var.m12035h(vy3Var.m12033f(((nu2) ql3Var.f28555a).f26093a));
            nl3Var2.f25933a = fM12035h;
            if (!y70.m13007H(fM12035h)) {
                ql3 ql3Var2 = new ql3();
                ql3Var2.f28555a = k43.m7379a(0.0f, 0.0f, 30);
                ru2Var = this;
                pu2 pu2Var = new pu2(nl3Var2, ql3Var2, ql3Var, f, ru2Var, f2, vy3Var, null);
                ou2Var2.f27119t = vy3Var;
                ou2Var2.f27120u = nl3Var2;
                ou2Var2.f27121v = f2;
                ou2Var2.f27124y = 1;
                if (ru2Var.m8919b(pu2Var, ou2Var2) != ap0Var) {
                    nl3Var = nl3Var2;
                    f3 = f2;
                    vy3Var2 = vy3Var;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                k43.m7376J(obj);
                return ju4Var2;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = ou2Var2.f27121v;
        nl3Var = ou2Var2.f27120u;
        vy3Var2 = ou2Var2.f27119t;
        k43.m7376J(obj);
        nh3Var = nh3Var2;
        ju4Var = ju4Var2;
        long jM10097b = qs5.m10097b(((lx4) nh3Var.f25810b).m8147c(Float.MAX_VALUE), ((lx4) nh3Var.f25811c).m8147c(Float.MAX_VALUE));
        if (jM10097b == 0) {
            float fM12032e = vy3Var2.m12032e(Math.signum(nl3Var.f25933a)) * Math.min(Math.abs(nl3Var.f25933a) / 100.0f, f3) * 1000.0f;
            if (fM12032e == 0.0f) {
                jM10097b = 0;
            } else {
                jM10097b = vy3Var2.f32961d == d63.f16815b ? qs5.m10097b(fM12032e, 0.0f) : qs5.m10097b(0.0f, fM12032e);
            }
        }
        jx4 jx4VarM7330a = jx4.m7330a(jM10097b);
        ou2Var2.f27119t = null;
        ou2Var2.f27120u = null;
        ou2Var2.f27124y = 2;
        return ru2Var.f26285b.invoke(jx4VarM7330a, ou2Var2) == ap0Var ? ap0Var : ju4Var;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10442f(ec3 ec3Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f29639f.f22555a;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = ec3Var.f18000a;
        b33 b33VarM3423a = b33.m3423a(0L);
        int size = list.size();
        boolean zMo6020c = false;
        int i = 0;
        while (true) {
            j = b33VarM3423a.f15059a;
            if (i >= size) {
                break;
            }
            b33VarM3423a = b33.m3423a(b33.m3430h(j, ((lc3) list.get(i)).f23944j));
            i++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        vy3 vy3Var = this.f26284a;
        float fM12037j = vy3Var.m12037j(vy3Var.m12033f(jFloatToRawIntBits));
        if (fM12037j != 0.0f) {
            jy3 jy3Var = vy3Var.f32958a;
            zMo6020c = fM12037j > 0.0f ? jy3Var.mo6020c() : jy3Var.mo6018a();
        }
        return zMo6020c ? !(this.f29640g.mo5493n(new nu2(jFloatToRawIntBits, ((lc3) hb0.m6299K0(ec3Var.f18000a)).f23936b, false)) instanceof n80) : this.f26287d;
    }
}
