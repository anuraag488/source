package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xs2 extends AbstractC0894m2 {
    public static final Parcelable.Creator<xs2> CREATOR = new C1280w4(23);

    /* JADX INFO: renamed from: d */
    public final int f34581d;

    /* JADX INFO: renamed from: e */
    public final int f34582e;

    /* JADX INFO: renamed from: f */
    public final int f34583f;

    /* JADX INFO: renamed from: g */
    public final long f34584g;

    /* JADX INFO: renamed from: h */
    public final long f34585h;

    /* JADX INFO: renamed from: i */
    public final String f34586i;

    /* JADX INFO: renamed from: j */
    public final String f34587j;

    /* JADX INFO: renamed from: k */
    public final int f34588k;

    /* JADX INFO: renamed from: l */
    public final int f34589l;

    public xs2(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f34581d = i;
        this.f34582e = i2;
        this.f34583f = i3;
        this.f34584g = j;
        this.f34585h = j2;
        this.f34586i = str;
        this.f34587j = str2;
        this.f34588k = i4;
        this.f34589l = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f34581d);
        oh6.m9091P(parcel, 2, 4);
        parcel.writeInt(this.f34582e);
        oh6.m9091P(parcel, 3, 4);
        parcel.writeInt(this.f34583f);
        oh6.m9091P(parcel, 4, 8);
        parcel.writeLong(this.f34584g);
        oh6.m9091P(parcel, 5, 8);
        parcel.writeLong(this.f34585h);
        oh6.m9088M(parcel, 6, this.f34586i);
        oh6.m9088M(parcel, 7, this.f34587j);
        oh6.m9091P(parcel, 8, 4);
        parcel.writeInt(this.f34588k);
        oh6.m9091P(parcel, 9, 4);
        parcel.writeInt(this.f34589l);
        oh6.m9094S(parcel, iM9092Q);
    }
}
