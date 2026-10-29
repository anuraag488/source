package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hw0 implements Parcelable {
    public static final Parcelable.Creator<hw0> CREATOR = new C1280w4((byte) 3);

    /* JADX INFO: renamed from: a */
    public final int f20900a;

    public hw0(int i) {
        this.f20900a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw0) && this.f20900a == ((hw0) obj).f20900a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20900a);
    }

    public final String toString() {
        return c75.m3878j("DefaultLazyKey(index=", this.f20900a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20900a);
    }
}
