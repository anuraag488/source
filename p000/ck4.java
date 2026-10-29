package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ck4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ uj2 f16087a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ jl1 f16088b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f16089c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ pk4 f16090d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ vi3 f16091e;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        uj2 uj2Var = this.f16087a;
        jl1 jl1Var = this.f16088b;
        boolean z = this.f16089c;
        pk4 pk4Var = this.f16090d;
        vi3 vi3Var = this.f16091e;
        b33 b33Var = (b33) obj;
        if (uj2Var.m11575b()) {
            ea4 ea4Var = uj2Var.f31914c;
            if (ea4Var != null) {
                ((ay0) ea4Var).m3366b();
            }
        } else {
            jl1.m7164a(jl1Var);
        }
        if (uj2Var.m11575b() && z) {
            if (uj2Var.m11574a() != wu1.f33742b) {
                kl4 kl4VarM11577d = uj2Var.m11577d();
                if (kl4VarM11577d != null) {
                    long j = b33Var.f15059a;
                    nh3 nh3Var = uj2Var.f31915d;
                    zn0 zn0Var = uj2Var.f31933v;
                    int iM7544b = kl4VarM11577d.m7544b(j, true);
                    vi3Var.m11899b(iM7544b);
                    zn0Var.invoke(xk4.m12702a((xk4) nh3Var.f25810b, null, sc6.m10657b(iM7544b, iM7544b), 5));
                    if (uj2Var.f31912a.f33431a.f24092b.length() > 0) {
                        uj2Var.f31922k.setValue(wu1.f33743c);
                    }
                }
            } else {
                pk4Var.m9542d(b33Var);
            }
        }
        return ju4.f22634a;
    }
}
