package p000;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 {

    /* JADX INFO: renamed from: a */
    public volatile yg3 f20697a;

    /* JADX INFO: renamed from: b */
    public volatile gm2 f20698b;

    /* JADX INFO: renamed from: a */
    public final void m6444a(rr5 rr5Var) {
        yg3 yg3Var = this.f20697a;
        if (yg3Var == null) {
            return;
        }
        switch (rr5Var.f29554a) {
            case 6:
                LocationResult locationResult = (LocationResult) rr5Var.f29555b;
                li4 li4Var = (li4) yg3Var.f35215b;
                List list = locationResult.f16252d;
                int size = list.size();
                li4Var.m7990c(size != 0 ? (Location) list.get(size - 1) : null);
                try {
                    t06 t06Var = (t06) yg3Var.f35216c;
                    y42.m12852Y("GetCurrentLocation", "Listener type must not be empty");
                    t06Var.m10958c(new gm2(yg3Var), false, new li4());
                } catch (RemoteException unused) {
                    return;
                }
                break;
            default:
                ((li4) ((m06) rr5Var.f29555b).f24523j.f27897c).m7990c(null);
                break;
        }
    }
}
