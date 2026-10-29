package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ao1 implements Parcelable {
    public static final Parcelable.Creator<ao1> CREATOR = new C1280w4((byte) 4);

    /* JADX INFO: renamed from: a */
    public String f14741a;

    /* JADX INFO: renamed from: b */
    public int f14742b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14741a);
        parcel.writeInt(this.f14742b);
    }
}
