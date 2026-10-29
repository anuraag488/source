package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cl6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<cl6> CREATOR = new qo5(24);

    /* JADX INFO: renamed from: d */
    public final String f16114d;

    /* JADX INFO: renamed from: e */
    public final long f16115e;

    /* JADX INFO: renamed from: f */
    public final int f16116f;

    public cl6(int i, long j, String str) {
        this.f16114d = str;
        this.f16115e = j;
        this.f16116f = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9088M(parcel, 1, this.f16114d);
        oh6.m9091P(parcel, 2, 8);
        parcel.writeLong(this.f16115e);
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(this.f16116f);
        oh6.m9094S(parcel, iM9092Q);
    }
}
