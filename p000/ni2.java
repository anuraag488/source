package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ni2 {

    /* JADX INFO: renamed from: a */
    public int f25846a;

    /* JADX INFO: renamed from: b */
    public List f25847b;

    /* JADX INFO: renamed from: c */
    public boolean f25848c;

    /* JADX INFO: renamed from: d */
    public C0779iz f25849d;

    /* JADX INFO: renamed from: e */
    public C0816jz f25850e;

    /* JADX INFO: renamed from: f */
    public df2 f25851f;

    /* JADX INFO: renamed from: g */
    public int f25852g;

    /* JADX INFO: renamed from: h */
    public int f25853h;

    /* JADX INFO: renamed from: i */
    public long f25854i;

    /* JADX INFO: renamed from: j */
    public Object f25855j;

    /* JADX INFO: renamed from: k */
    public Object f25856k;

    /* JADX INFO: renamed from: l */
    public jh2 f25857l;

    /* JADX INFO: renamed from: m */
    public long f25858m;

    /* JADX INFO: renamed from: n */
    public int f25859n;

    /* JADX INFO: renamed from: o */
    public int f25860o;

    /* JADX INFO: renamed from: p */
    public int f25861p;

    /* JADX INFO: renamed from: q */
    public int f25862q;

    /* JADX INFO: renamed from: r */
    public int f25863r;

    /* JADX INFO: renamed from: s */
    public int f25864s;

    /* JADX INFO: renamed from: t */
    public int f25865t;

    /* JADX INFO: renamed from: u */
    public boolean f25866u;

    /* JADX INFO: renamed from: v */
    public int f25867v;

    /* JADX INFO: renamed from: w */
    public int f25868w;

    /* JADX INFO: renamed from: x */
    public int f25869x;

    /* JADX INFO: renamed from: y */
    public int[] f25870y;

    /* JADX INFO: renamed from: a */
    public final int m8774a(long j) {
        return (int) (this.f25848c ? j & 4294967295L : j >> 32);
    }

    /* JADX INFO: renamed from: b */
    public final int m8775b() {
        int i;
        int i2;
        if (this.f25848c) {
            i = this.f25862q;
            i2 = this.f25864s;
        } else {
            i = this.f25861p;
            i2 = this.f25863r;
        }
        int i3 = i + i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final long m8776c(int i) {
        if (i == 0 && this.f25847b.size() == 0) {
            boolean z = this.f25848c;
            int i2 = this.f25859n;
            return z ? ((long) i2) & 4294967295L : ((long) i2) << 32;
        }
        int[] iArr = this.f25870y;
        int i3 = i * 2;
        return (((long) iArr[i3 + 1]) & 4294967295L) | (((long) iArr[i3]) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final void m8777d(cb3 cb3Var, boolean z) {
        fh2[] fh2VarArr;
        boolean z2 = this.f25848c;
        List list = this.f25847b;
        if (this.f25867v == Integer.MIN_VALUE) {
            t32.m10968a("position() should be called first");
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            db3 db3Var = (db3) list.get(i);
            int i2 = this.f25868w - (z2 ? db3Var.f16900b : db3Var.f16899a);
            int i3 = this.f25869x;
            long jM8776c = m8776c(i);
            hh2 hh2Var = (hh2) this.f25857l.f22272a.m8132g(this.f25855j);
            bu1 bu1Var = null;
            byte b = 0;
            fh2 fh2Var = (hh2Var == null || (fh2VarArr = hh2Var.f20575a) == null) ? null : fh2VarArr[i];
            if (fh2Var != null) {
                if (z) {
                    fh2Var.f18995n = jM8776c;
                } else {
                    if (!o52.m8956c(fh2Var.f18995n, 9223372034707292159L)) {
                        jM8776c = fh2Var.f18995n;
                    }
                    long jM8958e = o52.m8958e(jM8776c, ((o52) fh2Var.f18999r.getValue()).f26352a);
                    if (((m8774a(jM8776c) <= i2 && m8774a(jM8958e) <= i2) || (m8774a(jM8776c) >= i3 && m8774a(jM8958e) >= i3)) && ((Boolean) fh2Var.f18989h.getValue()).booleanValue()) {
                        lb5.m7910S(fh2Var.f18982a, null, null, new dh2(fh2Var, b == true ? 1 : 0, (byte) 1), 3);
                    }
                    jM8776c = jM8958e;
                }
                bu1Var = fh2Var.f18996o;
            } else {
                z2 = z2;
                list = list;
            }
            long jM8958e2 = o52.m8958e(jM8776c, this.f25854i);
            if (!z && fh2Var != null) {
                fh2Var.f18994m = jM8958e2;
            }
            if (z2) {
                if (bu1Var != null) {
                    cb3Var.m3951j(db3Var);
                    db3Var.mo4425p0(o52.m8958e(jM8958e2, db3Var.f16903e), 0.0f, bu1Var);
                } else {
                    t63 t63Var = eb3.f17951a;
                    cb3Var.m3951j(db3Var);
                    db3Var.mo4424n0(o52.m8958e(jM8958e2, db3Var.f16903e), 0.0f, t63Var);
                }
            } else if (bu1Var == null) {
                t63 t63Var2 = eb3.f17951a;
                if (cb3Var.mo3949e() == df2.f17011a || cb3Var.mo3950h() == 0) {
                    cb3Var.m3951j(db3Var);
                    db3Var.mo4424n0(o52.m8958e(jM8958e2, db3Var.f16903e), 0.0f, t63Var2);
                } else {
                    int iMo3950h = (cb3Var.mo3950h() - db3Var.f16899a) - ((int) (jM8958e2 >> 32));
                    cb3Var.m3951j(db3Var);
                    db3Var.mo4424n0(o52.m8958e((((long) ((int) (jM8958e2 & 4294967295L))) & 4294967295L) | (((long) iMo3950h) << 32), db3Var.f16903e), 0.0f, t63Var2);
                }
            } else if (cb3Var.mo3949e() == df2.f17011a || cb3Var.mo3950h() == 0) {
                cb3Var.m3951j(db3Var);
                db3Var.mo4425p0(o52.m8958e(jM8958e2, db3Var.f16903e), 0.0f, bu1Var);
            } else {
                int iMo3950h2 = (cb3Var.mo3950h() - db3Var.f16899a) - ((int) (jM8958e2 >> 32));
                cb3Var.m3951j(db3Var);
                db3Var.mo4425p0(o52.m8958e((((long) ((int) (jM8958e2 & 4294967295L))) & 4294967295L) | (((long) iMo3950h2) << 32), db3Var.f16903e), 0.0f, bu1Var);
            }
            i++;
            z2 = z2;
            list = list;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8778e(int i, int i2, int i3) {
        int i4;
        int[] iArr = this.f25870y;
        this.f25859n = i;
        boolean z = this.f25848c;
        this.f25867v = z ? i3 : i2;
        List list = this.f25847b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            db3 db3Var = (db3) list.get(i5);
            int i6 = i5 * 2;
            if (z) {
                C0779iz c0779iz = this.f25849d;
                if (c0779iz == null) {
                    throw d55.m4375t("null horizontalAlignment when isVertical == true");
                }
                iArr[i6] = c0779iz.m6970a(db3Var.f16899a, i2, this.f25851f);
                iArr[i6 + 1] = i;
                i4 = db3Var.f16900b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                C0816jz c0816jz = this.f25850e;
                if (c0816jz == null) {
                    throw d55.m4375t("null verticalAlignment when isVertical == false");
                }
                iArr[i7] = c0816jz.m7343a(db3Var.f16900b, i3);
                i4 = db3Var.f16899a;
            }
            i += i4;
        }
        this.f25868w = -this.f25852g;
        this.f25869x = this.f25867v + this.f25853h;
    }
}
