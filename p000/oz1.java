package p000;

import android.content.res.AssetFileDescriptor;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oz1 implements qz1 {

    /* JADX INFO: renamed from: a */
    public IBinder f27242a;

    /* JADX INFO: renamed from: E */
    public final void m9338E() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(qz1.f28899gp);
            if (!this.f27242a.transact(2, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method close is unimplemented.");
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m9339F(String str, t72 t72Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(qz1.f28899gp);
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(t72Var);
            if (!this.f27242a.transact(1, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method evaluateJavascript is unimplemented.");
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m9340G(AssetFileDescriptor assetFileDescriptor, u72 u72Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(qz1.f28899gp);
            parcelObtain.writeTypedObject(assetFileDescriptor, 0);
            parcelObtain.writeStrongInterface(u72Var);
            if (!this.f27242a.transact(4, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method evaluateJavascriptWithFd is unimplemented.");
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m9341H(w72 w72Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(qz1.f28899gp);
            parcelObtain.writeStrongInterface(w72Var);
            if (!this.f27242a.transact(5, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method setConsoleCallback is unimplemented.");
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f27242a;
    }
}
