package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fp6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<fp6> CREATOR = new jq6(0);

    /* JADX INFO: renamed from: d */
    public boolean f19219d;

    /* JADX INFO: renamed from: e */
    public String f19220e;

    /* JADX INFO: renamed from: f */
    public int f19221f;

    /* JADX INFO: renamed from: g */
    public int f19222g;

    /* JADX INFO: renamed from: h */
    public long f19223h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        boolean z = this.f19219d;
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(z ? 1 : 0);
        oh6.m9088M(parcel, 2, this.f19220e);
        int i2 = this.f19221f;
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.f19222g;
        oh6.m9091P(parcel, 4, 4);
        parcel.writeInt(i3);
        long j = this.f19223h;
        oh6.m9091P(parcel, 5, 8);
        parcel.writeLong(j);
        oh6.m9094S(parcel, iM9092Q);
    }
}
