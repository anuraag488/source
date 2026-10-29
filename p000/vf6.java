package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vf6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<vf6> CREATOR = new qo5(21);

    /* JADX INFO: renamed from: d */
    public Status f32580d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9087L(parcel, 1, this.f32580d, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
