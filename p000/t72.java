package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t72 extends Binder implements rz1 {

    /* JADX INFO: renamed from: a */
    public final m60 f30974a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x72 f30975b;

    public t72(x72 x72Var, m60 m60Var) {
        this.f30975b = x72Var;
        attachInterface(this, rz1.f29743hp);
        this.f30974a = m60Var;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = rz1.f29743hp;
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
        m60 m60Var = this.f30974a;
        x72 x72Var = this.f30975b;
        if (i == 1) {
            String string = parcel.readString();
            Objects.requireNonNull(string);
            x72Var.m12525l(m60Var);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                m60Var.m8198a(string);
                return true;
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        x72Var.m12525l(m60Var);
        long jClearCallingIdentity2 = Binder.clearCallingIdentity();
        try {
            x72Var.m12521g(m60Var, i3, string2);
            return true;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
