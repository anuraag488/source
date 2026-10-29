package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wu2 extends Binder implements zz1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f33745a;

    public wu2(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f33745a = multiInstanceInvalidationService;
        attachInterface(this, zz1.f36501mp);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        xu2 xu2Var;
        String str = zz1.f36501mp;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        int i3 = 0;
        yz1 yz1Var = null;
        yz1 yz1Var2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(yz1.f35643lp);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof yz1)) {
                    xz1 xz1Var = new xz1();
                    xz1Var.f34735a = strongBinder;
                    yz1Var = xz1Var;
                } else {
                    yz1Var = (yz1) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f33745a;
                synchronized (multiInstanceInvalidationService.f14677c) {
                    try {
                        int i4 = multiInstanceInvalidationService.f14675a + 1;
                        multiInstanceInvalidationService.f14675a = i4;
                        if (multiInstanceInvalidationService.f14677c.register(yz1Var, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.f14676b.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.f14675a--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(yz1.f35643lp);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof yz1)) {
                    xz1 xz1Var2 = new xz1();
                    xz1Var2.f34735a = strongBinder2;
                    yz1Var2 = xz1Var2;
                } else {
                    yz1Var2 = (yz1) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f33745a;
            synchronized (multiInstanceInvalidationService2.f14677c) {
                multiInstanceInvalidationService2.f14677c.unregister(yz1Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.f33745a;
        synchronized (multiInstanceInvalidationService3.f14677c) {
            try {
                String str2 = (String) multiInstanceInvalidationService3.f14676b.get(Integer.valueOf(i6));
                if (str2 == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                } else {
                    int iBeginBroadcast = multiInstanceInvalidationService3.f14677c.beginBroadcast();
                    while (true) {
                        xu2Var = multiInstanceInvalidationService3.f14677c;
                        if (i3 >= iBeginBroadcast) {
                            break;
                        }
                        try {
                            Integer num = (Integer) xu2Var.getBroadcastCookie(i3);
                            int iIntValue = num.intValue();
                            String str3 = (String) multiInstanceInvalidationService3.f14676b.get(num);
                            if (i6 != iIntValue && str2.equals(str3)) {
                                try {
                                    ((yz1) multiInstanceInvalidationService3.f14677c.getBroadcastItem(i3)).mo12797j(strArrCreateStringArray);
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService3.f14677c.finishBroadcast();
                            throw th2;
                        }
                    }
                    xu2Var.finishBroadcast();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
