package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class br3 extends AbstractC0894m2 {
    public static final Parcelable.Creator<br3> CREATOR = new jq6(1);

    /* JADX INFO: renamed from: d */
    public final int f15524d;

    /* JADX INFO: renamed from: e */
    public final boolean f15525e;

    /* JADX INFO: renamed from: f */
    public final boolean f15526f;

    /* JADX INFO: renamed from: g */
    public final int f15527g;

    /* JADX INFO: renamed from: h */
    public final int f15528h;

    public br3(int i, int i2, int i3, boolean z, boolean z2) {
        this.f15524d = i;
        this.f15525e = z;
        this.f15526f = z2;
        this.f15527g = i2;
        this.f15528h = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f15524d);
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(this.f15525e ? 1 : 0);
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(this.f15526f ? 1 : 0);
        oh6.m9091P(parcel, 4, 4);
        parcel.writeInt(this.f15527g);
        oh6.m9091P(parcel, 5, 4);
        parcel.writeInt(this.f15528h);
        oh6.m9094S(parcel, iM9092Q);
    }
}
