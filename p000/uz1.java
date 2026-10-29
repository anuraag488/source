package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 implements wz1 {

    /* JADX INFO: renamed from: a */
    public IBinder f32265a;

    /* JADX INFO: renamed from: E */
    public final qz1 m11684E() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(wz1.f33872kp);
            if (!this.f32265a.transact(1, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method createIsolate is unimplemented.");
            }
            parcelObtain2.readException();
            qz1 qz1VarM9688E = pz1.m9688E(parcelObtain2.readStrongBinder());
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return qz1VarM9688E;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public final qz1 m11685F(sz1 sz1Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(wz1.f33872kp);
            parcelObtain.writeLong(0L);
            parcelObtain.writeStrongInterface(sz1Var);
            if (!this.f32265a.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method createIsolate2 is unimplemented.");
            }
            parcelObtain2.readException();
            qz1 qz1VarM9688E = pz1.m9688E(parcelObtain2.readStrongBinder());
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return qz1VarM9688E;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    public final qz1 m11686G() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(wz1.f33872kp);
            parcelObtain.writeLong(0L);
            if (!this.f32265a.transact(3, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method createIsolateWithMaxHeapSizeBytes is unimplemented.");
            }
            parcelObtain2.readException();
            qz1 qz1VarM9688E = pz1.m9688E(parcelObtain2.readStrongBinder());
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return qz1VarM9688E;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f32265a;
    }
}
