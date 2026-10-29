package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: fw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0666fw implements Parcelable {
    public static final Parcelable.Creator<C0666fw> CREATOR = new C1280w4((byte) 2);

    /* JADX INFO: renamed from: a */
    public ArrayList f19348a;

    /* JADX INFO: renamed from: b */
    public ArrayList f19349b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f19348a);
        parcel.writeTypedList(this.f19349b);
    }
}
