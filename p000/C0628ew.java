package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: ew */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0628ew implements Parcelable {
    public static final Parcelable.Creator<C0628ew> CREATOR = new C1280w4((byte) 1);

    /* JADX INFO: renamed from: a */
    public int[] f18518a;

    /* JADX INFO: renamed from: b */
    public ArrayList f18519b;

    /* JADX INFO: renamed from: c */
    public int[] f18520c;

    /* JADX INFO: renamed from: d */
    public int[] f18521d;

    /* JADX INFO: renamed from: e */
    public int f18522e;

    /* JADX INFO: renamed from: f */
    public String f18523f;

    /* JADX INFO: renamed from: g */
    public int f18524g;

    /* JADX INFO: renamed from: h */
    public int f18525h;

    /* JADX INFO: renamed from: i */
    public CharSequence f18526i;

    /* JADX INFO: renamed from: j */
    public int f18527j;

    /* JADX INFO: renamed from: k */
    public CharSequence f18528k;

    /* JADX INFO: renamed from: l */
    public ArrayList f18529l;

    /* JADX INFO: renamed from: m */
    public ArrayList f18530m;

    /* JADX INFO: renamed from: n */
    public boolean f18531n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f18518a);
        parcel.writeStringList(this.f18519b);
        parcel.writeIntArray(this.f18520c);
        parcel.writeIntArray(this.f18521d);
        parcel.writeInt(this.f18522e);
        parcel.writeString(this.f18523f);
        parcel.writeInt(this.f18524g);
        parcel.writeInt(this.f18525h);
        TextUtils.writeToParcel(this.f18526i, parcel, 0);
        parcel.writeInt(this.f18527j);
        TextUtils.writeToParcel(this.f18528k, parcel, 0);
        parcel.writeStringList(this.f18529l);
        parcel.writeStringList(this.f18530m);
        parcel.writeInt(this.f18531n ? 1 : 0);
    }
}
