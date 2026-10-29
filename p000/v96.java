package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v96 implements na6 {

    /* JADX INFO: renamed from: a */
    public u36 f32481a;

    @Override // p000.na6
    /* JADX INFO: renamed from: a */
    public final s66 mo8654a() {
        u36 u36Var = this.f32481a;
        if (u36Var instanceof s66) {
            return ((s66) u36Var).m10544n();
        }
        o66 o66Var = (o66) ((s66) u36Var).mo3836j(5);
        boolean zM10541h = o66Var.f26373b.m10541h();
        s66 s66Var = o66Var.f26373b;
        if (!zM10541h) {
            return s66Var;
        }
        s66Var.getClass();
        da6.f16886b.m4415a(s66Var.getClass()).mo8656c(s66Var);
        s66Var.m10539e();
        return o66Var.f26373b;
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: b */
    public final boolean mo8655b(Object obj) {
        throw zi4.m13616p(obj);
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: c */
    public final void mo8656c(Object obj) {
        mb6 mb6Var = ((s66) obj).zzc;
        if (mb6Var.f24806e) {
            mb6Var.f24806e = false;
        }
        throw zi4.m13616p(obj);
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: d */
    public final int mo8657d(s66 s66Var) {
        return s66Var.zzc.hashCode();
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: e */
    public final boolean mo8658e(s66 s66Var, s66 s66Var2) {
        return s66Var.zzc.equals(s66Var2.zzc);
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: f */
    public final void mo8659f(Object obj, Object obj2) {
        ra6.m10273o(obj, obj2);
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: g */
    public final void mo8660g(Object obj, rr5 rr5Var) {
        throw zi4.m13616p(obj);
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: h */
    public final int mo8661h(u36 u36Var) {
        mb6 mb6Var = ((s66) u36Var).zzc;
        int i = mb6Var.f24805d;
        if (i != -1) {
            return i;
        }
        int iM10848n = 0;
        for (int i2 = 0; i2 < mb6Var.f24802a; i2++) {
            int i3 = mb6Var.f24803b[i2] >>> 3;
            r46 r46Var = (r46) mb6Var.f24804c[i2];
            int iM8593B = n83.m8593B(8);
            int iM8593B2 = n83.m8593B(i3) + n83.m8593B(16);
            int iM8593B3 = n83.m8593B(24);
            int iMo8519d = r46Var.mo8519d();
            iM10848n = sk5.m10848n(iM8593B + iM8593B, iM8593B2, sk5.m10842h(iMo8519d, iMo8519d, iM8593B3), iM10848n);
        }
        mb6Var.f24805d = iM10848n;
        return iM10848n;
    }

    @Override // p000.na6
    /* JADX INFO: renamed from: i */
    public final void mo8662i(Object obj, byte[] bArr, int i, int i2, C1411zn c1411zn) {
        s66 s66Var = (s66) obj;
        if (s66Var.zzc == mb6.f24801f) {
            s66Var.zzc = mb6.m8267b();
        }
        throw zi4.m13616p(obj);
    }
}
