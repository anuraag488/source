package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class iy5 extends pt5 implements az5 {
    public iy5() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p000.pt5
    /* JADX INFO: renamed from: E */
    public final boolean mo2994E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iMo3376l = mo3376l();
            parcel2.writeNoException();
            parcel2.writeInt(iMo3376l);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        st5.m10915d(parcel);
        mo3375c(string, string2, bundle, j);
        parcel2.writeNoException();
        return true;
    }
}
