package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mi2 implements yq2 {

    /* JADX INFO: renamed from: a */
    public final ni2 f24940a;

    /* JADX INFO: renamed from: b */
    public final int f24941b;

    /* JADX INFO: renamed from: c */
    public final boolean f24942c;

    /* JADX INFO: renamed from: d */
    public final float f24943d;

    /* JADX INFO: renamed from: e */
    public final yq2 f24944e;

    /* JADX INFO: renamed from: f */
    public final float f24945f;

    /* JADX INFO: renamed from: g */
    public final boolean f24946g;

    /* JADX INFO: renamed from: h */
    public final zo0 f24947h;

    /* JADX INFO: renamed from: i */
    public final ky0 f24948i;

    /* JADX INFO: renamed from: j */
    public final long f24949j;

    /* JADX INFO: renamed from: k */
    public final int f24950k;

    /* JADX INFO: renamed from: l */
    public final List f24951l;

    /* JADX INFO: renamed from: m */
    public final int f24952m;

    /* JADX INFO: renamed from: n */
    public final int f24953n;

    /* JADX INFO: renamed from: o */
    public final int f24954o;

    /* JADX INFO: renamed from: p */
    public final d63 f24955p;

    /* JADX INFO: renamed from: q */
    public final int f24956q;

    /* JADX INFO: renamed from: r */
    public final int f24957r;

    public mi2(ni2 ni2Var, int i, boolean z, float f, yq2 yq2Var, float f2, boolean z2, zo0 zo0Var, ky0 ky0Var, long j, int i2, List list, int i3, int i4, int i5, d63 d63Var, int i6, int i7) {
        this.f24940a = ni2Var;
        this.f24941b = i;
        this.f24942c = z;
        this.f24943d = f;
        this.f24944e = yq2Var;
        this.f24945f = f2;
        this.f24946g = z2;
        this.f24947h = zo0Var;
        this.f24948i = ky0Var;
        this.f24949j = j;
        this.f24950k = i2;
        this.f24951l = list;
        this.f24952m = i3;
        this.f24953n = i4;
        this.f24954o = i5;
        this.f24955p = d63Var;
        this.f24956q = i6;
        this.f24957r = i7;
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: a */
    public final Map mo4502a() {
        return this.f24944e.mo4502a();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: b */
    public final void mo4503b() {
        this.f24944e.mo4503b();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: c */
    public final mq1 mo5704c() {
        return this.f24944e.mo5704c();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: d */
    public final int mo4504d() {
        return this.f24944e.mo4504d();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: e */
    public final yp1 mo4505e() {
        return this.f24944e.mo4505e();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: f */
    public final yp1 mo5705f() {
        return this.f24944e.mo5705f();
    }

    @Override // p000.yq2
    /* JADX INFO: renamed from: g */
    public final int mo4506g() {
        return this.f24944e.mo4506g();
    }

    /* JADX INFO: renamed from: h */
    public final mi2 m8332h(int i, boolean z) {
        ni2 ni2Var;
        int i2;
        int i3;
        fh2[] fh2VarArr;
        if (this.f24946g) {
            return null;
        }
        List list = this.f24951l;
        if (list.isEmpty() || (ni2Var = this.f24940a) == null) {
            return null;
        }
        int iM8775b = ni2Var.m8775b();
        int i4 = this.f24941b - i;
        if (i4 < 0 || i4 >= iM8775b) {
            return null;
        }
        ni2 ni2Var2 = (ni2) hb0.m6299K0(list);
        ni2 ni2Var3 = (ni2) hb0.m6306R0(list);
        if (ni2Var2.f25866u || ni2Var3.f25866u) {
            return null;
        }
        int i5 = ni2Var2.f25859n;
        int i6 = this.f24953n;
        int i7 = this.f24952m;
        if (i < 0) {
            if (Math.min((ni2Var2.m8775b() + i5) - i7, (ni2Var3.m8775b() + ni2Var3.f25859n) - i6) <= (-i)) {
                return null;
            }
        } else if (Math.min(i7 - i5, i6 - ni2Var3.f25859n) <= i) {
            return null;
        }
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            ni2 ni2Var4 = (ni2) list.get(i8);
            boolean z2 = ni2Var4.f25848c;
            int[] iArr = ni2Var4.f25870y;
            if (!ni2Var4.f25866u) {
                ni2Var4.f25859n += i;
                int length = iArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    int i10 = i9 & 1;
                    if ((z2 && i10 != 0) || (!z2 && i10 == 0)) {
                        iArr[i9] = iArr[i9] + i;
                    }
                }
                if (z) {
                    int size2 = ni2Var4.f25847b.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        hh2 hh2Var = (hh2) ni2Var4.f25857l.f22272a.m8132g(ni2Var4.f25855j);
                        fh2 fh2Var = (hh2Var == null || (fh2VarArr = hh2Var.f20575a) == null) ? null : fh2VarArr[i11];
                        if (fh2Var != null) {
                            long j = fh2Var.f18993l;
                            if (z2) {
                                i2 = (int) (j >> 32);
                                i3 = ((int) (j & 4294967295L)) + i;
                            } else {
                                i2 = ((int) (j >> 32)) + i;
                                i3 = (int) (j & 4294967295L);
                            }
                            fh2Var.f18993l = (((long) i3) & 4294967295L) | (((long) i2) << 32);
                        } else {
                            size = size;
                        }
                        i11++;
                        size = size;
                    }
                }
            }
            i8++;
            size = size;
        }
        return new mi2(this.f24940a, i4, this.f24942c || i > 0, i, this.f24944e, this.f24945f, this.f24946g, this.f24947h, this.f24948i, this.f24949j, this.f24950k, list, this.f24952m, this.f24953n, this.f24954o, this.f24955p, this.f24956q, this.f24957r);
    }

    /* JADX INFO: renamed from: i */
    public final long m8333i() {
        yq2 yq2Var = this.f24944e;
        return (((long) yq2Var.mo4506g()) << 32) | (((long) yq2Var.mo4504d()) & 4294967295L);
    }
}
