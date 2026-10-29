package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qk0 extends AbstractC0894m2 {
    public static final Parcelable.Creator<qk0> CREATOR = new qo5((byte) 19);

    /* JADX INFO: renamed from: d */
    public br3 f28534d;

    /* JADX INFO: renamed from: e */
    public boolean f28535e;

    /* JADX INFO: renamed from: f */
    public boolean f28536f;

    /* JADX INFO: renamed from: g */
    public int[] f28537g;

    /* JADX INFO: renamed from: h */
    public int f28538h;

    /* JADX INFO: renamed from: i */
    public int[] f28539i;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9087L(parcel, 1, this.f28534d, i);
        boolean z = this.f28535e;
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f28536f;
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int[] iArr = this.f28537g;
        if (iArr != null) {
            int iM9092Q2 = oh6.m9092Q(parcel, 4);
            parcel.writeIntArray(iArr);
            oh6.m9094S(parcel, iM9092Q2);
        }
        int i2 = this.f28538h;
        oh6.m9091P(parcel, 5, 4);
        parcel.writeInt(i2);
        int[] iArr2 = this.f28539i;
        if (iArr2 != null) {
            int iM9092Q3 = oh6.m9092Q(parcel, 6);
            parcel.writeIntArray(iArr2);
            oh6.m9094S(parcel, iM9092Q3);
        }
        oh6.m9094S(parcel, iM9092Q);
    }
}
