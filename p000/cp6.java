package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cp6 extends AbstractC0894m2 {
    public static final Parcelable.Creator<cp6> CREATOR = new qo5((byte) 29);

    /* JADX INFO: renamed from: A */
    public int f16341A;

    /* JADX INFO: renamed from: B */
    public String f16342B;

    /* JADX INFO: renamed from: C */
    public int f16343C;

    /* JADX INFO: renamed from: D */
    public long f16344D;

    /* JADX INFO: renamed from: E */
    public String f16345E;

    /* JADX INFO: renamed from: F */
    public String f16346F;

    /* JADX INFO: renamed from: G */
    public long f16347G;

    /* JADX INFO: renamed from: H */
    public int f16348H;

    /* JADX INFO: renamed from: d */
    public String f16349d;

    /* JADX INFO: renamed from: e */
    public String f16350e;

    /* JADX INFO: renamed from: f */
    public String f16351f;

    /* JADX INFO: renamed from: g */
    public String f16352g;

    /* JADX INFO: renamed from: h */
    public long f16353h;

    /* JADX INFO: renamed from: i */
    public long f16354i;

    /* JADX INFO: renamed from: j */
    public String f16355j;

    /* JADX INFO: renamed from: k */
    public boolean f16356k;

    /* JADX INFO: renamed from: l */
    public boolean f16357l;

    /* JADX INFO: renamed from: m */
    public long f16358m;

    /* JADX INFO: renamed from: n */
    public String f16359n;

    /* JADX INFO: renamed from: o */
    public long f16360o;

    /* JADX INFO: renamed from: p */
    public int f16361p;

    /* JADX INFO: renamed from: q */
    public boolean f16362q;

    /* JADX INFO: renamed from: r */
    public boolean f16363r;

    /* JADX INFO: renamed from: s */
    public Boolean f16364s;

    /* JADX INFO: renamed from: t */
    public long f16365t;

    /* JADX INFO: renamed from: u */
    public List f16366u;

    /* JADX INFO: renamed from: v */
    public String f16367v;

    /* JADX INFO: renamed from: w */
    public String f16368w;

    /* JADX INFO: renamed from: x */
    public String f16369x;

    /* JADX INFO: renamed from: y */
    public boolean f16370y;

    /* JADX INFO: renamed from: z */
    public long f16371z;

    public cp6(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4) {
        y42.m12851X(str);
        this.f16349d = str;
        this.f16350e = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f16351f = str3;
        this.f16358m = j;
        this.f16352g = str4;
        this.f16353h = j2;
        this.f16354i = j3;
        this.f16355j = str5;
        this.f16356k = z;
        this.f16357l = z2;
        this.f16359n = str6;
        this.f16360o = j4;
        this.f16361p = i;
        this.f16362q = z3;
        this.f16363r = z4;
        this.f16364s = bool;
        this.f16365t = j5;
        this.f16366u = list;
        this.f16367v = str7;
        this.f16368w = str8;
        this.f16369x = str9;
        this.f16370y = z5;
        this.f16371z = j6;
        this.f16341A = i2;
        this.f16342B = str10;
        this.f16343C = i3;
        this.f16344D = j7;
        this.f16345E = str11;
        this.f16346F = str12;
        this.f16347G = j8;
        this.f16348H = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f16349d;
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9088M(parcel, 2, str);
        oh6.m9088M(parcel, 3, this.f16350e);
        oh6.m9088M(parcel, 4, this.f16351f);
        oh6.m9088M(parcel, 5, this.f16352g);
        long j = this.f16353h;
        oh6.m9091P(parcel, 6, 8);
        parcel.writeLong(j);
        long j2 = this.f16354i;
        oh6.m9091P(parcel, 7, 8);
        parcel.writeLong(j2);
        oh6.m9088M(parcel, 8, this.f16355j);
        boolean z = this.f16356k;
        oh6.m9091P(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f16357l;
        oh6.m9091P(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j3 = this.f16358m;
        oh6.m9091P(parcel, 11, 8);
        parcel.writeLong(j3);
        oh6.m9088M(parcel, 12, this.f16359n);
        long j4 = this.f16360o;
        oh6.m9091P(parcel, 14, 8);
        parcel.writeLong(j4);
        int i2 = this.f16361p;
        oh6.m9091P(parcel, 15, 4);
        parcel.writeInt(i2);
        boolean z3 = this.f16362q;
        oh6.m9091P(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.f16363r;
        oh6.m9091P(parcel, 18, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Boolean bool = this.f16364s;
        if (bool != null) {
            oh6.m9091P(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        long j5 = this.f16365t;
        oh6.m9091P(parcel, 22, 8);
        parcel.writeLong(j5);
        List<String> list = this.f16366u;
        if (list != null) {
            int iM9092Q2 = oh6.m9092Q(parcel, 23);
            parcel.writeStringList(list);
            oh6.m9094S(parcel, iM9092Q2);
        }
        oh6.m9088M(parcel, 25, this.f16367v);
        oh6.m9088M(parcel, 26, this.f16368w);
        oh6.m9088M(parcel, 27, this.f16369x);
        boolean z5 = this.f16370y;
        oh6.m9091P(parcel, 28, 4);
        parcel.writeInt(z5 ? 1 : 0);
        long j6 = this.f16371z;
        oh6.m9091P(parcel, 29, 8);
        parcel.writeLong(j6);
        int i3 = this.f16341A;
        oh6.m9091P(parcel, 30, 4);
        parcel.writeInt(i3);
        oh6.m9088M(parcel, 31, this.f16342B);
        int i4 = this.f16343C;
        oh6.m9091P(parcel, 32, 4);
        parcel.writeInt(i4);
        long j7 = this.f16344D;
        oh6.m9091P(parcel, 34, 8);
        parcel.writeLong(j7);
        oh6.m9088M(parcel, 35, this.f16345E);
        oh6.m9088M(parcel, 36, this.f16346F);
        long j8 = this.f16347G;
        oh6.m9091P(parcel, 37, 8);
        parcel.writeLong(j8);
        int i5 = this.f16348H;
        oh6.m9091P(parcel, 38, 4);
        parcel.writeInt(i5);
        oh6.m9094S(parcel, iM9092Q);
    }
}
