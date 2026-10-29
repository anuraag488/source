package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class co0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ uj2 f16168a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f16169b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ bl4 f16170c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ xk4 f16171d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ l12 f16172e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ vi3 f16173f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ pk4 f16174g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ zo0 f16175h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ e30 f16176i;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        kl4 kl4VarM11577d;
        uj2 uj2Var = this.f16168a;
        boolean z = this.f16169b;
        bl4 bl4Var = this.f16170c;
        xk4 xk4Var = this.f16171d;
        l12 l12Var = this.f16172e;
        vi3 vi3Var = this.f16173f;
        pk4 pk4Var = this.f16174g;
        zo0 zo0Var = this.f16175h;
        e30 e30Var = this.f16176i;
        nl1 nl1Var = (nl1) obj;
        boolean zM11575b = uj2Var.m11575b();
        boolean zM8794a = nl1Var.m8794a();
        ju4 ju4Var = ju4.f22634a;
        if (zM11575b != zM8794a) {
            uj2Var.f31917f.setValue(Boolean.valueOf(nl1Var.m8794a()));
            if (uj2Var.m11575b() && z) {
                oh6.m9078C(bl4Var, uj2Var, xk4Var, l12Var, vi3Var);
            } else {
                oh6.m9112r(uj2Var);
            }
            if (nl1Var.m8794a() && (kl4VarM11577d = uj2Var.m11577d()) != null) {
                lb5.m7910S(zo0Var, null, null, new C0980oe(e30Var, xk4Var, uj2Var, kl4VarM11577d, vi3Var, null, (byte) 5), 3);
            }
            if (!nl1Var.m8794a()) {
                pk4Var.m9542d(null);
            }
        }
        return ju4Var;
    }
}
