package p000;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class is0 extends Binder implements iz1 {

    /* JADX INFO: renamed from: a */
    public final Handler f21735a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k43 f21736b;

    public is0(k43 k43Var) {
        this.f21736b = k43Var;
        attachInterface(this, iz1.f21898dp);
        this.f21735a = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = iz1.f21898dp;
        byte b = 1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        byte b2 = 0;
        Handler handler = this.f21735a;
        k43 k43Var = this.f21736b;
        switch (i) {
            case 2:
                int i3 = parcel.readInt();
                if (k43Var != null) {
                    q60 q60Var = new q60(b);
                    q60Var.f28237c = this;
                    q60Var.f28236b = i3;
                    VarHandle.storeStoreFence();
                    handler.post(q60Var);
                    return true;
                }
                return true;
            case 3:
                parcel.readString();
                if (k43Var != null) {
                    hs0 hs0Var = new hs0(b);
                    hs0Var.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var);
                    return true;
                }
                return true;
            case 4:
                if (k43Var != null) {
                    hs0 hs0Var2 = new hs0((byte) 2);
                    hs0Var2.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var2);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                if (k43Var != null) {
                    oz5 oz5Var = new oz5(b);
                    oz5Var.f27250c = this;
                    oz5Var.f27249b = string;
                    VarHandle.storeStoreFence();
                    handler.post(oz5Var);
                }
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.readInt();
                parcel.readInt();
                if (k43Var != null) {
                    hs0 hs0Var3 = new hs0((byte) 3);
                    hs0Var3.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var3);
                    return true;
                }
                return true;
            case 7:
                parcel.readString();
                if (k43Var != null) {
                    k43Var.extraCallbackWithResult();
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                parcel.readInt();
                parcel.readInt();
                if (k43Var != null) {
                    hs0 hs0Var4 = new hs0((byte) 4);
                    hs0Var4.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var4);
                    return true;
                }
                return true;
            case 9:
                if (k43Var != null) {
                    hs0 hs0Var5 = new hs0((byte) 5);
                    hs0Var5.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var5);
                    return true;
                }
                return true;
            case 10:
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                if (k43Var != null) {
                    hs0 hs0Var6 = new hs0((byte) 6);
                    hs0Var6.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var6);
                    return true;
                }
                return true;
            case 11:
                if (k43Var != null) {
                    hs0 hs0Var7 = new hs0((byte) 7);
                    hs0Var7.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var7);
                    return true;
                }
                return true;
            case 12:
                if (k43Var != null) {
                    hs0 hs0Var8 = new hs0(b2);
                    hs0Var8.f20824b = this;
                    VarHandle.storeStoreFence();
                    handler.post(hs0Var8);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
