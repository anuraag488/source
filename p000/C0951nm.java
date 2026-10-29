package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: nm */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0951nm implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25936a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f25937b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f25938c;

    public /* synthetic */ C0951nm(byte b) {
        this.f25936a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f25936a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                List list = this.f25937b;
                yp1 yp1Var = this.f25938c;
                kz3 kz3Var = (kz3) obj;
                for (Object obj2 : list) {
                    C1113rm c1113rm = new C1113rm((byte) 0);
                    c1113rm.f29403b = obj2;
                    c1113rm.f29404c = yp1Var;
                    VarHandle.storeStoreFence();
                    kz3Var.m7753a((C0766im) obj2, new pg0(-1568955183, true, c1113rm));
                }
                break;
            default:
                List list2 = this.f25937b;
                yp1 yp1Var2 = this.f25938c;
                kz3 kz3Var2 = (kz3) obj;
                for (Object obj3 : list2) {
                    Object obj4 = ((l73) obj3).f23833a;
                    C1113rm c1113rm2 = new C1113rm((byte) 2);
                    c1113rm2.f29403b = obj3;
                    c1113rm2.f29404c = yp1Var2;
                    VarHandle.storeStoreFence();
                    kz3Var2.m7753a(obj4, new pg0(-1568955183, true, c1113rm2));
                }
                break;
        }
        return ju4Var;
    }
}
