package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ml5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ml5> CREATOR = new C1280w4((byte) 19);

    /* JADX INFO: renamed from: d */
    public int f25007d;

    /* JADX INFO: renamed from: e */
    public int f25008e;

    /* JADX INFO: renamed from: f */
    public Intent f25009f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f25007d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.f25008e;
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(i3);
        oh6.m9087L(parcel, 3, this.f25009f, i);
        oh6.m9094S(parcel, iM9092Q);
    }
}
