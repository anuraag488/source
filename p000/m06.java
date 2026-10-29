package p000;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m06 extends mh5 implements mr6 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f24522k = 0;

    /* JADX INFO: renamed from: j */
    public pq3 f24523j;

    @Override // p000.mh5
    /* JADX INFO: renamed from: H */
    public final boolean mo8063H(Parcel parcel, int i) {
        pq3 pq3Var = this.f24523j;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) ov5.m9313a(parcel, LocationResult.CREATOR);
            ov5.m9315c(parcel);
            hm2 hm2Var = (hm2) pq3Var.f27896b;
            rr5 rr5Var = new rr5((byte) 6);
            rr5Var.f29555b = locationResult;
            VarHandle.storeStoreFence();
            hm2Var.m6444a(rr5Var);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            m8173I();
            return true;
        }
        ov5.m9315c(parcel);
        Object obj = pq3Var.f27896b;
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final void m8173I() {
        hm2 hm2Var = (hm2) this.f24523j.f27896b;
        rr5 rr5Var = new rr5((byte) 7);
        rr5Var.f29555b = this;
        VarHandle.storeStoreFence();
        hm2Var.m6444a(rr5Var);
    }
}
