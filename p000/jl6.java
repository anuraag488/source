package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jl6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<jl6> CREATOR = new qo5((byte) 25);

    /* JADX INFO: renamed from: d */
    public final long f22406d;

    /* JADX INFO: renamed from: e */
    public byte[] f22407e;

    /* JADX INFO: renamed from: f */
    public final String f22408f;

    /* JADX INFO: renamed from: g */
    public final Bundle f22409g;

    /* JADX INFO: renamed from: h */
    public final int f22410h;

    /* JADX INFO: renamed from: i */
    public final long f22411i;

    /* JADX INFO: renamed from: j */
    public String f22412j;

    public jl6(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f22406d = j;
        this.f22407e = bArr;
        this.f22408f = str;
        this.f22409g = bundle;
        this.f22410h = i;
        this.f22411i = j2;
        this.f22412j = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 8);
        parcel.writeLong(this.f22406d);
        oh6.m9085J(parcel, this.f22407e);
        oh6.m9088M(parcel, 3, this.f22408f);
        oh6.m9084I(parcel, 4, this.f22409g);
        oh6.m9091P(parcel, 5, 4);
        parcel.writeInt(this.f22410h);
        oh6.m9091P(parcel, 6, 8);
        parcel.writeLong(this.f22411i);
        oh6.m9088M(parcel, 7, this.f22412j);
        oh6.m9094S(parcel, iM9092Q);
    }
}
