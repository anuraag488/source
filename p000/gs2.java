package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gs2 implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<gs2> CREATOR = new C1280w4(8);

    /* JADX INFO: renamed from: a */
    public final String f20091a;

    /* JADX INFO: renamed from: b */
    public final Map f20092b;

    public gs2(String str, Map map) {
        this.f20091a = str;
        this.f20092b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs2)) {
            return false;
        }
        gs2 gs2Var = (gs2) obj;
        return z62.m13387o(this.f20091a, gs2Var.f20091a) && z62.m13387o(this.f20092b, gs2Var.f20092b);
    }

    public final int hashCode() {
        return this.f20092b.hashCode() + (this.f20091a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f20091a + ", extras=" + this.f20092b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20091a);
        Map map = this.f20092b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
