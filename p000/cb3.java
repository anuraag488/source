package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cb3 implements ky0 {

    /* JADX INFO: renamed from: a */
    public boolean f15915a;

    /* JADX INFO: renamed from: m */
    public static void m3943m(cb3 cb3Var, db3 db3Var, long j) {
        cb3Var.m3951j(db3Var);
        db3Var.mo4424n0(o52.m8958e(j, db3Var.f16903e), 0.0f, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m3944n(cb3 cb3Var, db3 db3Var, int i, int i2) {
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (cb3Var.mo3949e() == df2.f17011a || cb3Var.mo3950h() == 0) {
            cb3Var.m3951j(db3Var);
            db3Var.mo4424n0(o52.m8958e(j, db3Var.f16903e), 0.0f, null);
        } else {
            int iMo3950h = (cb3Var.mo3950h() - db3Var.f16899a) - ((int) (j >> 32));
            cb3Var.m3951j(db3Var);
            db3Var.mo4424n0(o52.m8958e((((long) iMo3950h) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), db3Var.f16903e), 0.0f, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m3945s(cb3 cb3Var, db3 db3Var, int i, int i2) {
        t63 t63Var = eb3.f17951a;
        long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (cb3Var.mo3949e() == df2.f17011a || cb3Var.mo3950h() == 0) {
            cb3Var.m3951j(db3Var);
            db3Var.mo4424n0(o52.m8958e(j, db3Var.f16903e), 0.0f, t63Var);
        } else {
            int iMo3950h = (cb3Var.mo3950h() - db3Var.f16899a) - ((int) (j >> 32));
            cb3Var.m3951j(db3Var);
            db3Var.mo4424n0(o52.m8958e((((long) iMo3950h) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), db3Var.f16903e), 0.0f, t63Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m3946u(cb3 cb3Var, db3 db3Var, int i, int i2, yp1 yp1Var, int i3) {
        if ((i3 & 8) != 0) {
            yp1Var = eb3.f17951a;
        }
        cb3Var.m3951j(db3Var);
        db3Var.mo4424n0(o52.m8958e((((long) i2) & 4294967295L) | (((long) i) << 32), db3Var.f16903e), 0.0f, yp1Var);
    }

    /* JADX INFO: renamed from: a */
    public float mo3947a(gx1 gx1Var) {
        return Float.NaN;
    }

    /* JADX INFO: renamed from: b */
    public abstract cf2 mo3948b();

    /* JADX INFO: renamed from: e */
    public abstract df2 mo3949e();

    /* JADX INFO: renamed from: h */
    public abstract int mo3950h();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final void m3951j(db3 db3Var) {
        if (db3Var instanceof iu2) {
            ((iu2) db3Var).mo6940s(this.f15915a);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3952k(db3 db3Var, int i, int i2, float f) {
        m3951j(db3Var);
        db3Var.mo4424n0(o52.m8958e((((long) i2) & 4294967295L) | (((long) i) << 32), db3Var.f16903e), f, null);
    }
}
