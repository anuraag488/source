package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l16 extends AbstractC0894m2 {
    public static final Parcelable.Creator<l16> CREATOR = new qo5((byte) 13);

    /* JADX INFO: renamed from: d */
    public final int f23708d;

    /* JADX INFO: renamed from: e */
    public final IBinder f23709e;

    /* JADX INFO: renamed from: f */
    public final IBinder f23710f;

    /* JADX INFO: renamed from: g */
    public final PendingIntent f23711g;

    /* JADX INFO: renamed from: h */
    public final String f23712h;

    public l16(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f23708d = i;
        this.f23709e = iBinder;
        this.f23710f = iBinder2;
        this.f23711g = pendingIntent;
        this.f23712h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f23708d);
        oh6.m9086K(parcel, 2, this.f23709e);
        oh6.m9086K(parcel, 3, this.f23710f);
        oh6.m9087L(parcel, 4, this.f23711g, i);
        oh6.m9088M(parcel, 6, this.f23712h);
        oh6.m9094S(parcel, iM9092Q);
    }
}
