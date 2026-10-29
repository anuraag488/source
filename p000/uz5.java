package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uz5 extends mh5 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f32277j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ li4 f32278k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz5(Boolean bool, li4 li4Var) {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 1);
        this.f32277j = bool;
        this.f32278k = li4Var;
    }

    @Override // p000.mh5
    /* JADX INFO: renamed from: F */
    public final boolean mo8324F(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) sl5.m10872a(parcel, Status.CREATOR);
        sl5.m10873b(parcel);
        y42.m12831H0(status, this.f32277j, this.f32278k);
        return true;
    }
}
