package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mz5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<mz5> CREATOR = new qo5((byte) 10);

    /* JADX INFO: renamed from: d */
    public final long f25347d;

    /* JADX INFO: renamed from: e */
    public final long f25348e;

    /* JADX INFO: renamed from: f */
    public final boolean f25349f;

    /* JADX INFO: renamed from: g */
    public final Bundle f25350g;

    /* JADX INFO: renamed from: h */
    public final String f25351h;

    public mz5(long j, long j2, boolean z, Bundle bundle, String str) {
        this.f25347d = j;
        this.f25348e = j2;
        this.f25349f = z;
        this.f25350g = bundle;
        this.f25351h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 8);
        parcel.writeLong(this.f25347d);
        oh6.m9091P(parcel, 2, 8);
        parcel.writeLong(this.f25348e);
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(this.f25349f ? 1 : 0);
        oh6.m9084I(parcel, 7, this.f25350g);
        oh6.m9088M(parcel, 8, this.f25351h);
        oh6.m9094S(parcel, iM9092Q);
    }
}
