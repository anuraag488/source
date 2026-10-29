package p000;

import ads_mobile_sdk.am0;
import ads_mobile_sdk.rz3;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class id5 extends kl5 implements ke5 {
    /* JADX INFO: renamed from: N */
    public final void m6769N(am0 am0Var, rz3 rz3Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f23221c);
        int i = a95.f197a;
        parcelObtain.writeInt(1);
        am0Var.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(rz3Var);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.f23220b.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
