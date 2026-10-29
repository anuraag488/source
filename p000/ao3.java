package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ao3 implements Parcelable {
    public static final Parcelable.Creator<ao3> CREATOR = new qo5((byte) 23);

    /* JADX INFO: renamed from: a */
    public String f14744a;

    /* JADX INFO: renamed from: b */
    public int f14745b;

    /* JADX INFO: renamed from: c */
    public int f14746c;

    /* JADX INFO: renamed from: d */
    public String f14747d;

    /* JADX INFO: renamed from: e */
    public long f14748e;

    public ao3(int i, int i2, long j, String str) {
        Objects.requireNonNull(str, "targetPackage cannot be null");
        this.f14744a = str;
        this.f14745b = i;
        this.f14746c = i2;
        this.f14747d = "2.2.0";
        this.f14748e = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14744a);
        parcel.writeInt(this.f14745b);
        parcel.writeInt(this.f14746c);
        parcel.writeString(this.f14747d);
        parcel.writeLong(this.f14748e);
    }
}
