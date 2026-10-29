package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ri4 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ri4> CREATOR = new C1280w4((byte) 18);

    /* JADX INFO: renamed from: d */
    public final int f29323d;

    /* JADX INFO: renamed from: e */
    public List f29324e;

    public ri4(List list, int i) {
        this.f29323d = i;
        this.f29324e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f29323d);
        oh6.m9090O(parcel, 2, this.f29324e);
        oh6.m9094S(parcel, iM9092Q);
    }
}
