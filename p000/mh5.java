package p000;

import ads_mobile_sdk.m81;
import android.app.Activity;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mh5 extends Binder implements IInterface {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f24926i;

    public mh5(String str, byte b) {
        this.f24926i = b;
        switch (b) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 5:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    /* JADX INFO: renamed from: E */
    public abstract boolean mo5422E(Parcel parcel, int i);

    /* JADX INFO: renamed from: F */
    public boolean mo8324F(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                sl5.m10873b(parcel);
                break;
            case 4:
                sl5.m10873b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                sl5.m10873b(parcel);
                break;
            case 7:
                sl5.m10873b(parcel);
                break;
            case 8:
                gm5 gm5Var = (gm5) sl5.m10872a(parcel, gm5.CREATOR);
                sl5.m10873b(parcel);
                xl5 xl5Var = (xl5) this;
                ar1 ar1Var = new ar1((byte) 7);
                ar1Var.f14799c = xl5Var;
                ar1Var.f14798b = gm5Var;
                VarHandle.storeStoreFence();
                xl5Var.f34394k.post(ar1Var);
                break;
            case 9:
                sl5.m10873b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: renamed from: G */
    public boolean mo5640G(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX INFO: renamed from: H */
    public boolean mo8063H(Parcel parcel, int i) {
        byte b = 0;
        byte b2 = 1;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) av5.m3324a(parcel);
        av5.m3325b(parcel);
        ae6 ae6Var = (ae6) this;
        int i2 = bundle.getInt("statusCode", 9270);
        if (i2 == 9281) {
            Log.i("HpoaClientImpl", "onStateChange: HPOA_SERVICE_NO_OP");
            return true;
        }
        String str = ae6Var.f14409m;
        String str2 = ae6Var.f14410n;
        em6 em6Var = ae6Var.f14415s;
        if (i2 == 9282) {
            C1283w7 c1283w7 = ae6Var.f14416t;
            Map map = ae6Var.f14414r;
            if (c1283w7 != null) {
                m81 m81Var = (m81) c1283w7.f33126b;
                ((gs5) c1283w7.f33127c).m6163h((String) c1283w7.f33128d, (String) c1283w7.f33129e, m81Var, map, false);
                return true;
            }
            Activity activity = em6Var.f18266b;
            Intent intentM6534c = hz5.m6534c(str, str2, activity.getPackageName(), map);
            intentM6534c.addFlags(536870912);
            if (activity.getPackageManager().resolveActivity(intentM6534c, 65536) != null) {
                activity.startActivityForResult(intentM6534c, 0);
                return true;
            }
            activity.startActivity(hz5.m6532a(str, str2, map));
            return true;
        }
        wx1 wx1Var = ae6Var.f14407k;
        switch (i2) {
            case 9271:
                Log.i("HpoaClientImpl", "HPOA session started");
                if (ae6Var.f14408l) {
                    ae6Var.f14415s.m5206a(str, ae6Var.f14410n, ae6Var.f14411o, ae6Var.f14412p, ae6Var.f14413q);
                }
                return true;
            case 9272:
                Log.i("HpoaClientImpl", "HPOA session ended");
                if (!ae6Var.f14406j) {
                    ae6Var.f14406j = true;
                    wx1Var.onAffordanceEnded();
                }
                cw5 cw5Var = em6Var.f18265a;
                if (cw5Var != null) {
                    iu5 iu5Var = new iu5(b);
                    iu5Var.f21811b = cw5Var;
                    VarHandle.storeStoreFence();
                    cw5Var.m4218b(iu5Var);
                    return true;
                }
                return true;
            case 9273:
                Log.i("HpoaClientImpl", "HPOA UI to be added");
                return true;
            case 9274:
                Log.i("HpoaClientImpl", "HPOA UI attached");
                wx1Var.onAffordanceStarted();
                return true;
            case 9275:
                Log.i("HpoaClientImpl", "HPOA UI to be removed");
                return true;
            case 9276:
                Log.i("HpoaClientImpl", "HPOA UI detached");
                if (!ae6Var.f14406j) {
                    ae6Var.f14406j = true;
                    wx1Var.onAffordanceEnded();
                    return true;
                }
                return true;
            case 9277:
                Log.i("HpoaClientImpl", "HPOA service requests to be disconnected");
                cw5 cw5Var2 = em6Var.f18265a;
                if (cw5Var2 == null) {
                    Log.e("HpoaClientImpl", "HPOA service is not available");
                    return true;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("appId", str);
                bundle2.putString("callerId", str2);
                l36 l36Var = new l36(b2);
                l36Var.f23774b = em6Var;
                l36Var.f23775c = bundle2;
                VarHandle.storeStoreFence();
                cw5Var2.m4222f(l36Var);
                return true;
            default:
                Log.e("HpoaClientImpl", "HPOA error: " + i2);
                Bundle bundle3 = new Bundle();
                if (i2 == 9278) {
                    bundle3.putString("errorMessage", "HPOA internal error");
                } else if (i2 == 9279) {
                    bundle3.putString("errorMessage", "HPOA authentication error");
                } else if (i2 == 9280) {
                    bundle3.putString("errorMessage", "HPOA invalid parameter");
                } else {
                    bundle3.putString("errorMessage", "HPOA unknown error");
                }
                wx1Var.onError(bundle3);
                cw5 cw5Var3 = em6Var.f18265a;
                if (cw5Var3 != null) {
                    iu5 iu5Var2 = new iu5(b);
                    iu5Var2.f21811b = cw5Var3;
                    VarHandle.storeStoreFence();
                    cw5Var3.m4218b(iu5Var2);
                    return true;
                }
                return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2205a(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        byte b = this.f24926i;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        switch (this.f24926i) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo2205a(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo8324F(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                return mo5422E(parcel, i);
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo8063H(parcel, i);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo5640G(i, parcel, parcel2);
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo8063H(parcel, i);
        }
    }
}
