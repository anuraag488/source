package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l91 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ o91 f23867i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xb4 f23868j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f23869k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f23870l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ db3 f23871m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f23872n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ f31 f23873o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(o91 o91Var, xo4 xo4Var, long j, long j2, long j3, db3 db3Var, long j4, f31 f31Var) {
        super(1);
        this.f23867i = o91Var;
        this.f23868j = xo4Var;
        this.f23869k = j2;
        this.f23870l = j3;
        this.f23871m = db3Var;
        this.f23872n = j4;
        this.f23873o = f31Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        cb3 cb3Var = (cb3) obj;
        o91 o91Var = this.f23867i;
        b54 b54Var = o91Var.f26485u;
        long jMo3927a = 0;
        xb4 xb4Var = this.f23868j;
        long j = xb4Var != null ? ((o52) xb4Var.getValue()).f26352a : 0L;
        b54Var.m3457b();
        if (b54Var.m3457b()) {
            b54Var.f15091c.getClass();
        }
        long jM8958e = o52.m8958e(j, 0L);
        if (b54Var.m3457b()) {
            b54Var.f15097i = jM8958e;
        }
        InterfaceC0520ca interfaceC0520ca = o91Var.f26489y;
        if (interfaceC0520ca != null) {
            jMo3927a = interfaceC0520ca.mo3927a(this.f23869k, this.f23870l, df2.f17011a);
        }
        long jM8958e2 = o52.m8958e(jMo3927a, jM8958e);
        long j2 = this.f23872n;
        db3 db3Var = this.f23871m;
        cb3Var.m3951j(db3Var);
        db3Var.mo4424n0(o52.m8958e((((long) (((int) (jM8958e2 >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (jM8958e2 & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L), db3Var.f16903e), 0.0f, this.f23873o);
        return ju4.f22634a;
    }
}
