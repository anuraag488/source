package p000;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zz5 extends mh5 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ li4 f36512j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz5(li4 li4Var) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback", (byte) 5);
        this.f36512j = li4Var;
    }

    @Override // p000.mh5
    /* JADX INFO: renamed from: H */
    public final boolean mo8063H(Parcel parcel, int i) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) ov5.m9313a(parcel, Status.CREATOR);
        Location location = (Location) ov5.m9313a(parcel, Location.CREATOR);
        ov5.m9315c(parcel);
        y42.m12831H0(status, location, this.f36512j);
        return true;
    }
}
