package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q16 extends AbstractC0894m2 {
    public static final Parcelable.Creator<q16> CREATOR = new qo5((byte) 15);

    /* JADX INFO: renamed from: d */
    public final int f28143d;

    /* JADX INFO: renamed from: e */
    public final n16 f28144e;

    /* JADX INFO: renamed from: f */
    public final yr6 f28145f;

    /* JADX INFO: renamed from: g */
    public final mr6 f28146g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f28147h;

    /* JADX INFO: renamed from: i */
    public final ap6 f28148i;

    /* JADX INFO: renamed from: j */
    public final String f28149j;

    public q16(int i, n16 n16Var, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        yr6 qr6Var;
        mr6 gr6Var;
        this.f28143d = i;
        this.f28144e = n16Var;
        ap6 cm6Var = null;
        if (iBinder != null) {
            int i2 = tr6.f31380j;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            qr6Var = iInterfaceQueryLocalInterface instanceof yr6 ? (yr6) iInterfaceQueryLocalInterface : new qr6(iBinder, "com.google.android.gms.location.ILocationListener", (byte) 3);
        } else {
            qr6Var = null;
        }
        this.f28145f = qr6Var;
        this.f28147h = pendingIntent;
        if (iBinder2 != null) {
            int i3 = m06.f24522k;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            gr6Var = iInterfaceQueryLocalInterface2 instanceof mr6 ? (mr6) iInterfaceQueryLocalInterface2 : new gr6(iBinder2, "com.google.android.gms.location.ILocationCallback", (byte) 3);
        } else {
            gr6Var = null;
        }
        this.f28146g = gr6Var;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cm6Var = iInterfaceQueryLocalInterface3 instanceof ap6 ? (ap6) iInterfaceQueryLocalInterface3 : new cm6(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 3);
        }
        this.f28148i = cm6Var;
        this.f28149j = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f28143d);
        oh6.m9087L(parcel, 2, this.f28144e, i);
        IInterface iInterface = this.f28145f;
        oh6.m9086K(parcel, 3, iInterface == null ? null : ((kl5) iInterface).f23220b);
        oh6.m9087L(parcel, 4, this.f28147h, i);
        mr6 mr6Var = this.f28146g;
        oh6.m9086K(parcel, 5, mr6Var == null ? null : mr6Var.asBinder());
        ap6 ap6Var = this.f28148i;
        oh6.m9086K(parcel, 6, ap6Var != null ? ap6Var.asBinder() : null);
        oh6.m9088M(parcel, 8, this.f28149j);
        oh6.m9094S(parcel, iM9092Q);
    }
}
