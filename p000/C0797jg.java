package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: jg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0797jg implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22227a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yp1 f22228b;

    public /* synthetic */ C0797jg(byte b) {
        this.f22227a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        o41 o41Var;
        byte b = this.f22227a;
        boolean z = true;
        yp1 yp1Var = this.f22228b;
        switch (b) {
            case 0:
                return yp1Var.invoke((gp0) obj);
            case 1:
                yp1Var.invoke((C0766im) obj);
                return ju4.f22634a;
            case 2:
                C0797jg c0797jg = new C0797jg((byte) 3);
                c0797jg.f22228b = yp1Var;
                VarHandle.storeStoreFence();
                mz3.m8469k((vg2) obj, null, c0797jg, 3);
                return ju4.f22634a;
            case 3:
                yp1Var.invoke((kz3) obj);
                return ju4.f22634a;
            case 4:
                kz3 kz3Var = (kz3) obj;
                for (Object obj2 : lr2.f24313d) {
                    C1113rm c1113rm = new C1113rm(z ? 1 : 0);
                    c1113rm.f29403b = obj2;
                    c1113rm.f29404c = yp1Var;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a(null, new pg0(-1568955183, true, c1113rm));
                }
                return ju4.f22634a;
            case 5:
                y41 y41Var = (y41) obj;
                double dM8941a = 50.0d;
                if (y41Var != null && (o41Var = (o41) yp1Var.invoke(y41Var)) != null) {
                    dM8941a = o41Var.m8941a(y41Var);
                }
                return Double.valueOf(dM8941a);
            case 6:
                pp4 pp4Var = (pp4) obj;
                if (!(pp4Var instanceof bs1)) {
                    C1077qn.m9989o("Node is not a GestureNode instance");
                    return null;
                }
                Object obj3 = ((bs1) pp4Var).f15546o;
                Object obj4 = obj3 != null ? obj3 : null;
                return Boolean.valueOf(obj4 != null ? ((Boolean) yp1Var.invoke(obj4)).booleanValue() : true);
            case 7:
                e94 e94Var = (e94) yp1Var.invoke((i94) obj);
                synchronized (k94.f23012c) {
                    k94.f23013d = k94.f23013d.m6704e(e94Var.mo5015g());
                }
                return e94Var;
            default:
                Object obj5 = (Long) obj;
                obj5.getClass();
                return yp1Var.invoke(obj5);
        }
    }
}
