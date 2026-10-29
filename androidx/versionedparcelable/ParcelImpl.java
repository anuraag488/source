package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C1280w4;
import p000.rx4;
import p000.sx4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1280w4((byte) 9);

    /* JADX INFO: renamed from: a */
    public sx4 f14679a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new rx4(parcel).m10165i(this.f14679a);
    }
}
