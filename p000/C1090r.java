package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: r */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1090r implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28911a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f28912b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C0950nl f28913c;

    public /* synthetic */ C1090r(byte b) {
        this.f28911a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f28911a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                C0950nl c0950nl = this.f28913c;
                boolean z = this.f28912b;
                vg2 vg2Var = (vg2) obj;
                pg0 pg0Var = oh6.f26728b;
                C1127s c1127s = new C1127s((byte) 0);
                c1127s.f29778b = c0950nl;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, pg0Var, c1127s, 2);
                pg0 pg0Var2 = oh6.f26732f;
                C1090r c1090r = new C1090r(b3);
                c1090r.f28912b = z;
                c1090r.f28913c = c0950nl;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, pg0Var2, c1090r, 2);
                mz3.m8469k(vg2Var, oh6.f26746t, new C0891m((byte) 1), 2);
                mz3.m8469k(vg2Var, oh6.f26710D, new C0891m((byte) 0), 2);
                break;
            default:
                boolean z2 = this.f28912b;
                C0950nl c0950nl2 = this.f28913c;
                kz3 kz3Var = (kz3) obj;
                if (z2) {
                    kz3Var.m7753a(null, oh6.f26735i);
                }
                C0965o c0965o = new C0965o(b3);
                c0965o.f26228b = c0950nl2;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(-261498726, true, c0965o));
                kz3Var.m7753a(null, oh6.f26742p);
                C0965o c0965o2 = new C0965o(b2);
                c0965o2.f26228b = c0950nl2;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(-1885336030, true, c0965o2));
                break;
        }
        return ju4Var;
    }
}
