package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class is1 extends AbstractC0894m2 {
    public static final Parcelable.Creator<is1> CREATOR = new qo5((byte) 20);

    /* JADX INFO: renamed from: r */
    public static final Scope[] f21737r = new Scope[0];

    /* JADX INFO: renamed from: s */
    public static final ed1[] f21738s = new ed1[0];

    /* JADX INFO: renamed from: d */
    public final int f21739d;

    /* JADX INFO: renamed from: e */
    public final int f21740e;

    /* JADX INFO: renamed from: f */
    public final int f21741f;

    /* JADX INFO: renamed from: g */
    public String f21742g;

    /* JADX INFO: renamed from: h */
    public IBinder f21743h;

    /* JADX INFO: renamed from: i */
    public Scope[] f21744i;

    /* JADX INFO: renamed from: j */
    public Bundle f21745j;

    /* JADX INFO: renamed from: k */
    public Account f21746k;

    /* JADX INFO: renamed from: l */
    public ed1[] f21747l;

    /* JADX INFO: renamed from: m */
    public ed1[] f21748m;

    /* JADX INFO: renamed from: n */
    public final boolean f21749n;

    /* JADX INFO: renamed from: o */
    public final int f21750o;

    /* JADX INFO: renamed from: p */
    public boolean f21751p;

    /* JADX INFO: renamed from: q */
    public final String f21752q;

    public is1(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ed1[] ed1VarArr, ed1[] ed1VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f21737r : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        ed1[] ed1VarArr3 = f21738s;
        ed1[] ed1VarArr4 = ed1VarArr == null ? ed1VarArr3 : ed1VarArr;
        ed1VarArr3 = ed1VarArr2 != null ? ed1VarArr2 : ed1VarArr3;
        this.f21739d = i;
        this.f21740e = i2;
        this.f21741f = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f21742g = "com.google.android.gms";
        } else {
            this.f21742g = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC1169t4.f30745j;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface zq6Var = iInterfaceQueryLocalInterface instanceof gz1 ? (gz1) iInterfaceQueryLocalInterface : new zq6(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 2);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        zq6 zq6Var2 = (zq6) zq6Var;
                        Parcel parcelM7548E = zq6Var2.m7548E(zq6Var2.m7550G(), 2);
                        Account account3 = (Account) nv5.m8862a(parcelM7548E, Account.CREATOR);
                        parcelM7548E.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.f21743h = iBinder;
            account2 = account;
        }
        this.f21746k = account2;
        this.f21744i = scopeArr2;
        this.f21745j = bundle2;
        this.f21747l = ed1VarArr4;
        this.f21748m = ed1VarArr3;
        this.f21749n = z;
        this.f21750o = i4;
        this.f21751p = z2;
        this.f21752q = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qo5.m9995a(this, parcel, i);
    }
}
