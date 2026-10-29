package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ko5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ko5> CREATOR = new qo5((byte) 1);

    /* JADX INFO: renamed from: d */
    public final long f23294d;

    /* JADX INFO: renamed from: e */
    public final int f23295e;

    /* JADX INFO: renamed from: f */
    public final long f23296f;

    public ko5(long j, int i, long j2) {
        this.f23294d = j;
        this.f23295e = i;
        this.f23296f = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 8);
        parcel.writeLong(this.f23294d);
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(this.f23295e);
        oh6.m9091P(parcel, 3, 8);
        parcel.writeLong(this.f23296f);
        oh6.m9094S(parcel, iM9092Q);
    }
}
