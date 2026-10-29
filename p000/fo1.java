package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fo1 implements Parcelable {
    public static final Parcelable.Creator<fo1> CREATOR = new C1280w4((byte) 5);

    /* JADX INFO: renamed from: a */
    public ArrayList f19171a;

    /* JADX INFO: renamed from: b */
    public ArrayList f19172b;

    /* JADX INFO: renamed from: c */
    public C0628ew[] f19173c;

    /* JADX INFO: renamed from: d */
    public int f19174d;

    /* JADX INFO: renamed from: e */
    public String f19175e;

    /* JADX INFO: renamed from: f */
    public ArrayList f19176f;

    /* JADX INFO: renamed from: g */
    public ArrayList f19177g;

    /* JADX INFO: renamed from: h */
    public ArrayList f19178h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f19171a);
        parcel.writeStringList(this.f19172b);
        parcel.writeTypedArray(this.f19173c, i);
        parcel.writeInt(this.f19174d);
        parcel.writeString(this.f19175e);
        parcel.writeStringList(this.f19176f);
        parcel.writeTypedList(this.f19177g);
        parcel.writeTypedList(this.f19178h);
    }
}
