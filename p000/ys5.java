package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ys5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<ys5> CREATOR = new qo5((byte) 7);

    /* JADX INFO: renamed from: d */
    public final String f35504d;

    /* JADX INFO: renamed from: e */
    public final os5 f35505e;

    /* JADX INFO: renamed from: f */
    public final String f35506f;

    /* JADX INFO: renamed from: g */
    public final long f35507g;

    public ys5(ys5 ys5Var, long j) {
        y42.m12854a0(ys5Var);
        this.f35504d = ys5Var.f35504d;
        this.f35505e = ys5Var.f35505e;
        this.f35506f = ys5Var.f35506f;
        this.f35507g = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f35505e);
        String str = this.f35506f;
        int length = String.valueOf(str).length();
        String str2 = this.f35504d;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        zi4.m13599B(sb, "origin=", str, ",name=", str2);
        return zi4.m13623w(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qo5.m9996b(this, parcel, i);
    }

    public ys5(String str, os5 os5Var, String str2, long j) {
        this.f35504d = str;
        this.f35505e = os5Var;
        this.f35506f = str2;
        this.f35507g = j;
    }
}
