package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cc6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<cc6> CREATOR = new qo5((byte) 18);

    /* JADX INFO: renamed from: d */
    public Bundle f15932d;

    /* JADX INFO: renamed from: e */
    public ed1[] f15933e;

    /* JADX INFO: renamed from: f */
    public int f15934f;

    /* JADX INFO: renamed from: g */
    public qk0 f15935g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9084I(parcel, 1, this.f15932d);
        oh6.m9089N(parcel, 2, this.f15933e, i);
        int i2 = this.f15934f;
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(i2);
        oh6.m9087L(parcel, 4, this.f15935g, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
