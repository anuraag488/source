package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wj6 implements gk6 {

    /* JADX INFO: renamed from: a */
    public ef6 f33440a;

    /* JADX INFO: renamed from: b */
    public yj5 f33441b;

    @Override // p000.gk6
    /* JADX INFO: renamed from: a */
    public final void mo6023a(Object obj, bt5 bt5Var) {
        throw zi4.m13616p(obj);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: b */
    public final boolean mo6024b(Object obj) {
        throw zi4.m13616p(obj);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: c */
    public final void mo6025c(Object obj) {
        this.f33441b.getClass();
        el6 el6Var = ((zh6) obj).zzc;
        if (el6Var.f18247e) {
            el6Var.f18247e = false;
        }
        int i = dh6.f17072a;
        throw zi4.m13616p(obj);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: d */
    public final int mo6026d(ef6 ef6Var) {
        el6 el6Var = ((zh6) ef6Var).zzc;
        int i = el6Var.f18246d;
        if (i != -1) {
            return i;
        }
        int iM10848n = 0;
        for (int i2 = 0; i2 < el6Var.f18243a; i2++) {
            int i3 = el6Var.f18244b[i2] >>> 3;
            ig6 ig6Var = (ig6) el6Var.f18245c[i2];
            int iM8713s = ng6.m8713s(8);
            int iM8713s2 = ng6.m8713s(i3) + ng6.m8713s(16);
            int iM8713s3 = ng6.m8713s(24);
            int iMo3593d = ig6Var.mo3593d();
            iM10848n = sk5.m10848n(iM8713s + iM8713s, iM8713s2, sk5.m10845k(iMo3593d, iMo3593d, iM8713s3), iM10848n);
        }
        el6Var.f18246d = iM10848n;
        return iM10848n;
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: e */
    public final boolean mo6027e(zh6 zh6Var, zh6 zh6Var2) {
        return zh6Var.zzc.equals(zh6Var2.zzc);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: f */
    public final zh6 mo6028f() {
        ef6 ef6Var = this.f33440a;
        if (ef6Var instanceof zh6) {
            return (zh6) ((zh6) ef6Var).mo97n(4);
        }
        th6 th6Var = (th6) ((zh6) ef6Var).mo97n(5);
        boolean zM13566d = th6Var.f31181b.m13566d();
        zh6 zh6Var = th6Var.f31181b;
        if (!zM13566d) {
            return zh6Var;
        }
        zh6Var.getClass();
        bk6.f15375c.m3613a(zh6Var.getClass()).mo6025c(zh6Var);
        zh6Var.m13567e();
        return th6Var.f31181b;
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: g */
    public final int mo6029g(zh6 zh6Var) {
        return zh6Var.zzc.hashCode();
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: h */
    public final void mo6030h(Object obj, byte[] bArr, int i, int i2, C1411zn c1411zn) {
        zh6 zh6Var = (zh6) obj;
        if (zh6Var.zzc == el6.f18242f) {
            zh6Var.zzc = el6.m5193a();
        }
        throw zi4.m13616p(obj);
    }

    @Override // p000.gk6
    /* JADX INFO: renamed from: i */
    public final void mo6031i(Object obj, Object obj2) {
        jk6.m7139b(obj, obj2);
    }
}
