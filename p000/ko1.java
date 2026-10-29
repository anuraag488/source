package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ko1 implements Parcelable {
    public static final Parcelable.Creator<ko1> CREATOR = new C1280w4((byte) 6);

    /* JADX INFO: renamed from: a */
    public String f23271a;

    /* JADX INFO: renamed from: b */
    public String f23272b;

    /* JADX INFO: renamed from: c */
    public boolean f23273c;

    /* JADX INFO: renamed from: d */
    public boolean f23274d;

    /* JADX INFO: renamed from: e */
    public int f23275e;

    /* JADX INFO: renamed from: f */
    public int f23276f;

    /* JADX INFO: renamed from: g */
    public String f23277g;

    /* JADX INFO: renamed from: h */
    public boolean f23278h;

    /* JADX INFO: renamed from: i */
    public boolean f23279i;

    /* JADX INFO: renamed from: j */
    public boolean f23280j;

    /* JADX INFO: renamed from: k */
    public boolean f23281k;

    /* JADX INFO: renamed from: l */
    public int f23282l;

    /* JADX INFO: renamed from: m */
    public String f23283m;

    /* JADX INFO: renamed from: n */
    public int f23284n;

    /* JADX INFO: renamed from: o */
    public boolean f23285o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = this.f23283m;
        String str2 = this.f23277g;
        int i = this.f23276f;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f23271a);
        sb.append(" (");
        sb.append(this.f23272b);
        sb.append(")}:");
        if (this.f23273c) {
            sb.append(" fromLayout");
        }
        if (this.f23274d) {
            sb.append(" dynamicContainer");
        }
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        if (str2 != null && !str2.isEmpty()) {
            sb.append(" tag=");
            sb.append(str2);
        }
        if (this.f23278h) {
            sb.append(" retainInstance");
        }
        if (this.f23279i) {
            sb.append(" removing");
        }
        if (this.f23280j) {
            sb.append(" detached");
        }
        if (this.f23281k) {
            sb.append(" hidden");
        }
        if (str != null) {
            sb.append(" targetWho=");
            sb.append(str);
            sb.append(" targetRequestCode=");
            sb.append(this.f23284n);
        }
        if (this.f23285o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23271a);
        parcel.writeString(this.f23272b);
        parcel.writeInt(this.f23273c ? 1 : 0);
        parcel.writeInt(this.f23274d ? 1 : 0);
        parcel.writeInt(this.f23275e);
        parcel.writeInt(this.f23276f);
        parcel.writeString(this.f23277g);
        parcel.writeInt(this.f23278h ? 1 : 0);
        parcel.writeInt(this.f23279i ? 1 : 0);
        parcel.writeInt(this.f23280j ? 1 : 0);
        parcel.writeInt(this.f23281k ? 1 : 0);
        parcel.writeInt(this.f23282l);
        parcel.writeString(this.f23283m);
        parcel.writeInt(this.f23284n);
        parcel.writeInt(this.f23285o ? 1 : 0);
    }
}
