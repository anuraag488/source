package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l36 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23773a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ em6 f23774b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Bundle f23775c;

    public /* synthetic */ l36(byte b) {
        this.f23773a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23773a) {
            case 0:
                em6 em6Var = this.f23774b;
                Bundle bundle = this.f23775c;
                try {
                    cw5 cw5Var = em6Var.f18265a;
                    if (cw5Var == null) {
                        throw null;
                    }
                    ev5 ev5Var = (ev5) cw5Var.f16551l;
                    if (ev5Var == null) {
                        return;
                    }
                    vm5 vm5Var = (vm5) ev5Var;
                    Parcel parcelM7550G = vm5Var.m7550G();
                    int i = av5.f14906a;
                    parcelM7550G.writeInt(1);
                    bundle.writeToParcel(parcelM7550G, 0);
                    vm5Var.m7552I(parcelM7550G, 2);
                    return;
                } catch (RemoteException e) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.show", e);
                    return;
                }
            default:
                em6 em6Var2 = this.f23774b;
                Bundle bundle2 = this.f23775c;
                try {
                    cw5 cw5Var2 = em6Var2.f18265a;
                    if (cw5Var2 == null) {
                        throw null;
                    }
                    ev5 ev5Var2 = (ev5) cw5Var2.f16551l;
                    if (ev5Var2 == null) {
                        return;
                    }
                    vm5 vm5Var2 = (vm5) ev5Var2;
                    Parcel parcelM7550G2 = vm5Var2.m7550G();
                    int i2 = av5.f14906a;
                    parcelM7550G2.writeInt(1);
                    bundle2.writeToParcel(parcelM7550G2, 0);
                    vm5Var2.m7552I(parcelM7550G2, 3);
                    return;
                } catch (RemoteException e2) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.endSession", e2);
                    return;
                }
        }
    }
}
