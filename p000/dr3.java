package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dr3 {

    /* JADX INFO: renamed from: a */
    public long f17301a;

    /* JADX INFO: renamed from: b */
    public long f17302b;

    /* JADX INFO: renamed from: c */
    public long f17303c;

    /* JADX INFO: renamed from: d */
    public long f17304d;

    /* JADX INFO: renamed from: e */
    public long f17305e;

    /* JADX INFO: renamed from: f */
    public float f17306f;

    /* JADX INFO: renamed from: g */
    public float f17307g;

    /* JADX INFO: renamed from: h */
    public float f17308h;

    /* JADX INFO: renamed from: i */
    public long f17309i;

    /* JADX INFO: renamed from: b */
    public static as0 m4660b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long jM10700M = se0.m10700M(j2, j);
        float fM10745z = se0.m10745z(jM10700M);
        ji1 ji1Var = null;
        if (fM10745z <= 0.0f) {
            C1077qn.m9987m("Can't get the direction of a 0-length vector");
            return null;
        }
        long jM10737r = se0.m10737r(jM10700M, fM10745z);
        long jM10704S = se0.m10704S(j, se0.m10721f0(se0.m10721f0(jM10737r, f), 1.0f + f2));
        long jM10737r2 = se0.m10737r(se0.m10704S(j3, j4), 2.0f);
        long jM7130a = ji1.m7130a(ew4.m5414b(se0.m10691D(j3), se0.m10691D(jM10737r2), f2), ew4.m5414b(se0.m10692E(j3), se0.m10692E(jM10737r2), f2));
        long jM10704S2 = se0.m10704S(j5, se0.m10721f0(ew4.m5413a(se0.m10691D(jM7130a) - se0.m10691D(j5), se0.m10692E(jM7130a) - se0.m10692E(j5)), f3));
        long jM10700M2 = se0.m10700M(jM10704S2, j5);
        long jM7130a2 = ji1.m7130a(-se0.m10692E(jM10700M2), se0.m10691D(jM10700M2));
        long jM7130a3 = ji1.m7130a(-se0.m10692E(jM7130a2), se0.m10691D(jM7130a2));
        float fM10738s = se0.m10738s(jM10737r, jM7130a3);
        if (Math.abs(fM10738s) >= 1.0E-4f) {
            float fM10738s2 = se0.m10738s(se0.m10700M(jM10704S2, j2), jM7130a3);
            if (Math.abs(fM10738s) >= Math.abs(fM10738s2) * 1.0E-4f) {
                long jM10704S3 = se0.m10704S(j2, se0.m10721f0(jM10737r, fM10738s2 / fM10738s));
                ji1Var = new ji1();
                ji1Var.f22298a = jM10704S3;
                VarHandle.storeStoreFence();
            }
        }
        long j6 = ji1Var != null ? ji1Var.f22298a : j3;
        long jM10737r3 = se0.m10737r(se0.m10704S(jM10704S, se0.m10721f0(j6, 2.0f)), 3.0f);
        return new as0(new float[]{se0.m10691D(jM10704S), se0.m10692E(jM10704S), se0.m10691D(jM10737r3), se0.m10692E(jM10737r3), se0.m10691D(j6), se0.m10692E(j6), se0.m10691D(jM10704S2), se0.m10692E(jM10704S2)});
    }

    /* JADX INFO: renamed from: a */
    public final float m4661a(float f) {
        float f2 = this.f17308h;
        float f3 = this.f17307g;
        if (f > m4662c()) {
            return f3;
        }
        if (f > f2) {
            return ((f - f2) * f3) / (m4662c() - f2);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m4662c() {
        return (1.0f + this.f17307g) * this.f17308h;
    }
}
