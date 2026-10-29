package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lm5 extends AbstractC0894m2 {
    public static final Parcelable.Creator<lm5> CREATOR = new C1280w4((byte) 25);

    /* JADX INFO: renamed from: d */
    public int f24181d;

    /* JADX INFO: renamed from: e */
    public IBinder f24182e;

    /* JADX INFO: renamed from: f */
    public lk0 f24183f;

    /* JADX INFO: renamed from: g */
    public boolean f24184g;

    /* JADX INFO: renamed from: h */
    public boolean f24185h;

    public final boolean equals(Object obj) {
        Object zq6Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm5)) {
            return false;
        }
        lm5 lm5Var = (lm5) obj;
        if (!this.f24183f.equals(lm5Var.f24183f)) {
            return false;
        }
        IBinder iBinder = this.f24182e;
        Object zq6Var2 = null;
        if (iBinder == null) {
            zq6Var = null;
        } else {
            int i = AbstractBinderC1169t4.f30745j;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zq6Var = iInterfaceQueryLocalInterface instanceof gz1 ? (gz1) iInterfaceQueryLocalInterface : new zq6(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
        }
        IBinder iBinder2 = lm5Var.f24182e;
        if (iBinder2 != null) {
            int i2 = AbstractBinderC1169t4.f30745j;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            zq6Var2 = iInterfaceQueryLocalInterface2 instanceof gz1 ? (gz1) iInterfaceQueryLocalInterface2 : new zq6(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
        }
        return AbstractC1356y5.m12927u(zq6Var, zq6Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        int i2 = this.f24181d;
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(i2);
        oh6.m9086K(parcel, 2, this.f24182e);
        oh6.m9087L(parcel, 3, this.f24183f, i);
        boolean z = this.f24184g;
        oh6.m9091P(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f24185h;
        oh6.m9091P(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        oh6.m9094S(parcel, iM9092Q);
    }
}
