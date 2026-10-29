package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q73 {

    /* JADX INFO: renamed from: a */
    public String f28245a;

    /* JADX INFO: renamed from: b */
    public xl4 f28246b;

    /* JADX INFO: renamed from: c */
    public am1 f28247c;

    /* JADX INFO: renamed from: d */
    public int f28248d;

    /* JADX INFO: renamed from: e */
    public boolean f28249e;

    /* JADX INFO: renamed from: f */
    public int f28250f;

    /* JADX INFO: renamed from: g */
    public int f28251g;

    /* JADX INFO: renamed from: i */
    public ky0 f28253i;

    /* JADX INFO: renamed from: j */
    public C1328xe f28254j;

    /* JADX INFO: renamed from: k */
    public boolean f28255k;

    /* JADX INFO: renamed from: m */
    public ct2 f28257m;

    /* JADX INFO: renamed from: n */
    public p73 f28258n;

    /* JADX INFO: renamed from: o */
    public df2 f28259o;

    /* JADX INFO: renamed from: s */
    public long f28263s;

    /* JADX INFO: renamed from: h */
    public long f28252h = u32.f31635a;

    /* JADX INFO: renamed from: l */
    public long f28256l = 0;

    /* JADX INFO: renamed from: p */
    public long f28260p = ll0.m8016h(0, 0, 0, 0);

    /* JADX INFO: renamed from: q */
    public int f28261q = -1;

    /* JADX INFO: renamed from: r */
    public int f28262r = -1;

    public q73(String str, xl4 xl4Var, am1 am1Var, int i, boolean z, int i2, int i3) {
        this.f28245a = str;
        this.f28246b = xl4Var;
        this.f28247c = am1Var;
        this.f28248d = i;
        this.f28249e = z;
        this.f28250f = i2;
        this.f28251g = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m9754a(int i, df2 df2Var) {
        int i2 = this.f28261q;
        int i3 = this.f28262r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM8009a = ll0.m8009a(0, i, 0, Integer.MAX_VALUE);
        int i4 = 1;
        if (this.f28251g > 1) {
            ct2 ct2VarM3222A = as4.m3222A(this.f28257m, df2Var, this.f28246b, this.f28253i, this.f28247c);
            this.f28257m = ct2VarM3222A;
            jM8009a = ct2VarM3222A.m4167a(this.f28251g, jM8009a);
        }
        p73 p73VarM9758e = m9758e(df2Var);
        long jM7392q = k43.m7392q(jM8009a, this.f28249e, this.f28248d, p73VarM9758e.mo2952c());
        boolean z = this.f28249e;
        int i5 = this.f28248d;
        int i6 = this.f28250f;
        if ((z || (i5 != 2 && i5 != 4 && i5 != 5)) && i6 >= 1) {
            i4 = i6;
        }
        int iM3261t = as4.m3261t(kx5.m7704e(p73VarM9758e, jM7392q, i4, i5).f34187e);
        int iM7540j = kl0.m7540j(jM8009a);
        if (iM3261t < iM7540j) {
            iM3261t = iM7540j;
        }
        this.f28261q = i;
        this.f28262r = iM3261t;
        return iM3261t;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9755b(long j, df2 df2Var) {
        p73 p73Var;
        this.f28263s = (this.f28263s << 2) | 3;
        boolean z = true;
        if (this.f28251g > 1) {
            ct2 ct2VarM3222A = as4.m3222A(this.f28257m, df2Var, this.f28246b, this.f28253i, this.f28247c);
            this.f28257m = ct2VarM3222A;
            j = ct2VarM3222A.m4167a(this.f28251g, j);
        }
        C1328xe c1328xe = this.f28254j;
        boolean z2 = false;
        if (c1328xe != null && (p73Var = this.f28258n) != null && !p73Var.mo2951b() && df2Var == this.f28259o && (kl0.m7533c(j, this.f28260p) || (kl0.m7539i(j) == kl0.m7539i(this.f28260p) && kl0.m7541k(j) == kl0.m7541k(this.f28260p) && kl0.m7538h(j) >= c1328xe.f34187e && !c1328xe.f34185c.f20677d))) {
            if (!kl0.m7533c(j, this.f28260p)) {
                C1328xe c1328xe2 = this.f28254j;
                long jM8012d = ll0.m8012d(j, (((long) as4.m3261t(Math.min(c1328xe2.f34183a.f14424h.m6791b(), c1328xe2.m12675c()))) << 32) | (((long) as4.m3261t(c1328xe2.f34187e)) & 4294967295L));
                this.f28256l = jM8012d;
                if (this.f28248d == 3 || (((int) (jM8012d >> 32)) >= c1328xe2.m12675c() && ((int) (jM8012d & 4294967295L)) >= c1328xe2.f34187e)) {
                    z = false;
                }
                this.f28255k = z;
                this.f28260p = j;
            }
            return false;
        }
        p73 p73VarM9758e = m9758e(df2Var);
        long jM7392q = k43.m7392q(j, this.f28249e, this.f28248d, p73VarM9758e.mo2952c());
        boolean z3 = this.f28249e;
        int i = this.f28248d;
        int i2 = this.f28250f;
        if ((!z3 && (i == 2 || i == 4 || i == 5)) || i2 < 1) {
            i2 = 1;
        }
        C1328xe c1328xeM7704e = kx5.m7704e(p73VarM9758e, jM7392q, i2, i);
        this.f28260p = j;
        long jM8012d2 = ll0.m8012d(j, (((long) as4.m3261t(c1328xeM7704e.m12675c())) << 32) | (((long) as4.m3261t(c1328xeM7704e.f34187e)) & 4294967295L));
        this.f28256l = jM8012d2;
        if (this.f28248d != 3 && (((int) (jM8012d2 >> 32)) < c1328xeM7704e.m12675c() || ((int) (jM8012d2 & 4294967295L)) < c1328xeM7704e.f34187e)) {
            z2 = true;
        }
        this.f28255k = z2;
        this.f28254j = c1328xeM7704e;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m9756c() {
        this.f28254j = null;
        this.f28258n = null;
        this.f28259o = null;
        this.f28261q = -1;
        this.f28262r = -1;
        this.f28260p = ll0.m8016h(0, 0, 0, 0);
        this.f28256l = 0L;
        this.f28255k = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m9757d(ky0 ky0Var) {
        long jM11228a;
        ky0 ky0Var2 = this.f28253i;
        if (ky0Var != null) {
            int i = u32.f31636b;
            jM11228a = u32.m11228a(ky0Var.mo3580c(), ky0Var.mo3585r());
        } else {
            jM11228a = u32.f31635a;
        }
        if (ky0Var2 == null) {
            this.f28253i = ky0Var;
            this.f28252h = jM11228a;
        } else if (ky0Var == null || this.f28252h != jM11228a) {
            this.f28253i = ky0Var;
            this.f28252h = jM11228a;
            this.f28263s = (this.f28263s << 2) | 1;
            m9756c();
        }
    }

    /* JADX INFO: renamed from: e */
    public final p73 m9758e(df2 df2Var) {
        p73 p73VarM13773d = this.f28258n;
        if (p73VarM13773d == null || df2Var != this.f28259o || p73VarM13773d.mo2951b()) {
            this.f28259o = df2Var;
            String str = this.f28245a;
            xl4 xl4VarM13512I = zc6.m13512I(this.f28246b, df2Var);
            ky0 ky0Var = this.f28253i;
            am1 am1Var = this.f28247c;
            boolean z = this.f28249e;
            v71 v71Var = v71.f32439a;
            p73VarM13773d = zt5.m13773d(str, xl4VarM13512I, v71Var, ky0Var, am1Var, v71Var, z);
        }
        this.f28258n = p73VarM13773d;
        return p73VarM13773d;
    }

    public final String toString() {
        return d55.m4369n(zi4.m13625y("ParagraphLayoutCache(paragraph=", this.f28254j != null ? "<paragraph>" : "null", ", lastDensity=", u32.m11229b(this.f28252h), ", history="), this.f28263s, ", constraints=$)");
    }
}
