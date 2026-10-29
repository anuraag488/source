package p000;

import android.content.res.AssetFileDescriptor;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.invoke.VarHandle;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u72 extends Binder implements tz1 {

    /* JADX INFO: renamed from: a */
    public final m60 f31695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x72 f31696b;

    public u72(x72 x72Var, m60 m60Var) {
        this.f31696b = x72Var;
        attachInterface(this, tz1.f31556jp);
        this.f31695a = m60Var;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        i82 i82Var = (i82) this.f31696b.f34037b;
        String str = tz1.f31556jp;
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
        byte b = 3;
        if (i == 3) {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR);
            Objects.requireNonNull(assetFileDescriptor);
            try {
                ExecutorService executorService = i82Var.f21169c.f24731h;
                RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 13);
                runnableC1285w9.f33164b = this;
                runnableC1285w9.f33165c = assetFileDescriptor;
                VarHandle.storeStoreFence();
                executorService.execute(runnableC1285w9);
            } catch (RejectedExecutionException unused) {
                zc6.m13534t(assetFileDescriptor);
            }
            parcel2.writeNoException();
        } else {
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int i3 = parcel.readInt();
            AssetFileDescriptor assetFileDescriptor2 = (AssetFileDescriptor) parcel.readTypedObject(AssetFileDescriptor.CREATOR);
            Objects.requireNonNull(assetFileDescriptor2);
            try {
                ExecutorService executorService2 = i82Var.f21169c.f24731h;
                RunnableC1248v9 runnableC1248v9 = new RunnableC1248v9(b);
                runnableC1248v9.f32471c = this;
                runnableC1248v9.f32472d = assetFileDescriptor2;
                runnableC1248v9.f32470b = i3;
                VarHandle.storeStoreFence();
                executorService2.execute(runnableC1248v9);
            } catch (RejectedExecutionException unused2) {
                zc6.m13534t(assetFileDescriptor2);
            }
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
