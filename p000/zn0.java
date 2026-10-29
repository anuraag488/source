package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zn0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36194a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ uj2 f36195b;

    public /* synthetic */ zn0(byte b) {
        this.f36194a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f36194a;
        ju4 ju4Var = ju4.f22634a;
        uj2 uj2Var = this.f36195b;
        switch (b) {
            case 0:
                cf2 cf2Var = (cf2) obj;
                kl4 kl4VarM11577d = uj2Var.m11577d();
                if (kl4VarM11577d != null) {
                    kl4VarM11577d.f23218c = cf2Var;
                }
                return ju4Var;
            case 1:
                d83 d83Var = uj2Var.f31931t;
                xk4 xk4Var = (xk4) obj;
                String str = xk4Var.f34341a.f24092b;
                C0875lk c0875lk = uj2Var.f31921j;
                if (!z62.m13387o(str, c0875lk != null ? c0875lk.f24092b : null)) {
                    uj2Var.f31922k.setValue(wu1.f33741a);
                    if (((Boolean) d83Var.getValue()).booleanValue()) {
                        d83Var.setValue(Boolean.FALSE);
                    } else {
                        uj2Var.f31930s.setValue(Boolean.FALSE);
                    }
                }
                long j = ql4.f28556b;
                uj2Var.f31910A.setValue(ql4.m9897a(j));
                uj2Var.f31911B.setValue(ql4.m9897a(j));
                uj2Var.f31932u.invoke(xk4Var);
                yk3 yk3Var = uj2Var.f31913b;
                zk3 zk3Var = yk3Var.f35297a;
                if (zk3Var != null) {
                    zk3Var.mo13320f(yk3Var, null);
                }
                return ju4Var;
            case 2:
                uj2Var.f31929r.m7222L(((k12) obj).f22814a);
                return ju4Var;
            case 3:
                return Boolean.valueOf(uj2Var.f31929r.m7222L(((k12) obj).f22814a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                uj2Var.f31928q.setValue(bool);
                return ju4Var;
        }
    }
}
