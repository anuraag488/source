package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h82 extends Binder implements sz1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ i82 f20423a;

    public h82(i82 i82Var) {
        this.f20423a = i82Var;
        attachInterface(this, sz1.f30681ip);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = sz1.f30681ip;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        String string = parcel.readString();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f20423a.m6695g(new vi4(i3, string));
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            parcel2.writeNoException();
            return true;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
