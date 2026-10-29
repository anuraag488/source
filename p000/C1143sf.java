package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: sf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1143sf implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30222a;

    /* JADX INFO: renamed from: b */
    public Object f30223b;

    public /* synthetic */ C1143sf(byte b) {
        this.f30222a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f30222a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                cb3.m3944n((cb3) obj, (db3) this.f30223b, 0, 0);
                return ju4Var;
            case 1:
                cb3 cb3Var = (cb3) obj;
                ArrayList arrayList = (ArrayList) this.f30223b;
                int iM7689T = kx5.m7689T(arrayList);
                if (iM7689T >= 0) {
                    int i = 0;
                    while (true) {
                        cb3.m3944n(cb3Var, (db3) arrayList.get(i), 0, 0);
                        if (i != iM7689T) {
                            i++;
                        }
                    }
                }
                return ju4Var;
            case 2:
                ((d70) this.f30223b).cancel();
                return ju4Var;
            case 3:
                ((List) this.f30223b).get(((Number) obj).intValue());
                return null;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                rc3 rc3Var = (rc3) this.f30223b;
                if (rc3Var != null) {
                    rc3Var.f29152c = zBooleanValue;
                }
                return ju4Var;
            case 5:
                Throwable th = (Throwable) obj;
                uf4 uf4Var = (uf4) this.f30223b;
                b70 b70Var = uf4Var.f31827c;
                if (b70Var != null) {
                    b70Var.mo115m(th);
                }
                uf4Var.f31827c = null;
                return ju4Var;
            default:
                float[] fArr = ((rq2) obj).f29528a;
                cf2 cf2Var = (cf2) this.f30223b;
                if (cf2Var.mo4000K()) {
                    y42.m12861j0(cf2Var).mo4002P(cf2Var, fArr);
                }
                return ju4Var;
        }
    }
}
