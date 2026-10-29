package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xz1 implements yz1 {

    /* JADX INFO: renamed from: a */
    public IBinder f34735a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34735a;
    }

    @Override // p000.yz1
    /* JADX INFO: renamed from: j */
    public final void mo12797j(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(yz1.f35643lp);
            parcelObtain.writeStringArray(strArr);
            this.f34735a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
