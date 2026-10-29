package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nk6 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ li4 f25919a;

    public nk6(li4 li4Var) {
        this.f25919a = li4Var;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = mv5.f25247a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        rv5 rv5VarCreateFromParcel = parcel.readInt() == 0 ? null : rv5.CREATOR.createFromParcel(parcel);
        y42.m12831H0(statusCreateFromParcel, rv5VarCreateFromParcel != null ? new C1298wm(rv5VarCreateFromParcel.f29670d, rv5VarCreateFromParcel.f29671e) : null, this.f25919a);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
