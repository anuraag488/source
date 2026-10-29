package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rv5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<rv5> CREATOR = new qo5((byte) 9);

    /* JADX INFO: renamed from: d */
    public String f29670d;

    /* JADX INFO: renamed from: e */
    public int f29671e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9088M(parcel, 1, this.f29670d);
        int i2 = this.f29671e;
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(i2);
        oh6.m9094S(parcel, iM9092Q);
    }
}
