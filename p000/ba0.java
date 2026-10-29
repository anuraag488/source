package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ba0 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ba0> CREATOR = new C1280w4((byte) 17);

    /* JADX INFO: renamed from: d */
    public int f15186d;

    /* JADX INFO: renamed from: e */
    public String f15187e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj;
        return ba0Var.f15186d == this.f15186d && AbstractC1356y5.m12927u(ba0Var.f15187e, this.f15187e);
    }

    public final int hashCode() {
        return this.f15186d;
    }

    public final String toString() {
        return this.f15186d + ":" + this.f15187e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f15186d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i2);
        oh6.m9088M(parcel, 2, this.f15187e);
        oh6.m9094S(parcel, iM9092Q);
    }
}
