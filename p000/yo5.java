package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yo5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<yo5> CREATOR = new qo5((byte) 2);

    /* JADX INFO: renamed from: d */
    public String f35432d;

    /* JADX INFO: renamed from: e */
    public String f35433e;

    /* JADX INFO: renamed from: f */
    public xm6 f35434f;

    /* JADX INFO: renamed from: g */
    public long f35435g;

    /* JADX INFO: renamed from: h */
    public boolean f35436h;

    /* JADX INFO: renamed from: i */
    public String f35437i;

    /* JADX INFO: renamed from: j */
    public final ys5 f35438j;

    /* JADX INFO: renamed from: k */
    public long f35439k;

    /* JADX INFO: renamed from: l */
    public ys5 f35440l;

    /* JADX INFO: renamed from: m */
    public final long f35441m;

    /* JADX INFO: renamed from: n */
    public final ys5 f35442n;

    public yo5(yo5 yo5Var) {
        y42.m12854a0(yo5Var);
        this.f35432d = yo5Var.f35432d;
        this.f35433e = yo5Var.f35433e;
        this.f35434f = yo5Var.f35434f;
        this.f35435g = yo5Var.f35435g;
        this.f35436h = yo5Var.f35436h;
        this.f35437i = yo5Var.f35437i;
        this.f35438j = yo5Var.f35438j;
        this.f35439k = yo5Var.f35439k;
        this.f35440l = yo5Var.f35440l;
        this.f35441m = yo5Var.f35441m;
        this.f35442n = yo5Var.f35442n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9088M(parcel, 2, this.f35432d);
        oh6.m9088M(parcel, 3, this.f35433e);
        oh6.m9087L(parcel, 4, this.f35434f, i);
        long j = this.f35435g;
        oh6.m9091P(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.f35436h;
        oh6.m9091P(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        oh6.m9088M(parcel, 7, this.f35437i);
        oh6.m9087L(parcel, 8, this.f35438j, i);
        long j2 = this.f35439k;
        oh6.m9091P(parcel, 9, 8);
        parcel.writeLong(j2);
        oh6.m9087L(parcel, 10, this.f35440l, i);
        oh6.m9091P(parcel, 11, 8);
        parcel.writeLong(this.f35441m);
        oh6.m9087L(parcel, 12, this.f35442n, i);
        oh6.m9094S(parcel, iM9092Q);
    }

    public yo5(String str, String str2, xm6 xm6Var, long j, boolean z, String str3, ys5 ys5Var, long j2, ys5 ys5Var2, long j3, ys5 ys5Var3) {
        this.f35432d = str;
        this.f35433e = str2;
        this.f35434f = xm6Var;
        this.f35435g = j;
        this.f35436h = z;
        this.f35437i = str3;
        this.f35438j = ys5Var;
        this.f35439k = j2;
        this.f35440l = ys5Var2;
        this.f35441m = j3;
        this.f35442n = ys5Var3;
    }
}
