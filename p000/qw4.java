package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qw4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28854a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ rw4 f28855b;

    public /* synthetic */ qw4(byte b) {
        this.f28854a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f28854a;
        ju4 ju4Var = ju4.f22634a;
        rw4 rw4Var = this.f28855b;
        switch (b) {
            case 0:
                rw4Var.f29691d = true;
                rw4Var.f29693f.invoke();
                return ju4Var;
            default:
                u31 u31Var = (u31) obj;
                iu1 iu1Var = rw4Var.f29689b;
                float f = rw4Var.f29698k;
                float f2 = rw4Var.f29699l;
                jp0 jp0VarMo7035J = u31Var.mo7035J();
                long jM7219E = jp0VarMo7035J.m7219E();
                jp0VarMo7035J.m7248w().mo6253j();
                try {
                    ((ar3) jp0VarMo7035J.f22481b).m3155y(f, f2, 0L);
                    iu1Var.mo6934a(u31Var);
                    return ju4Var;
                } finally {
                    d55.m4374s(jp0VarMo7035J, jM7219E);
                }
        }
    }
}
