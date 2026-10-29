package p000;

import ads_mobile_sdk.C0200km;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lo5 extends mh5 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ byte f24234j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ wp5 f24235k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ wp5 f24236l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f24237m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo5(wp5 wp5Var, C0200km c0200km) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServicePrewarmListener", (byte) 3);
        this.f24237m = c0200km;
        this.f24236l = wp5Var;
        this.f24235k = wp5Var;
    }

    @Override // p000.mh5
    /* JADX INFO: renamed from: H */
    public final boolean mo8063H(Parcel parcel, int i) {
        byte b = 1;
        byte b2 = 0;
        switch (this.f24234j) {
            case 0:
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    av5.m3325b(parcel);
                    cw5 cw5Var = this.f24235k.f33584b;
                    iu5 iu5Var = new iu5(b2);
                    iu5Var.f21811b = cw5Var;
                    VarHandle.storeStoreFence();
                    cw5Var.m4218b(iu5Var);
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle = (Bundle) av5.m3324a(parcel);
                av5.m3325b(parcel);
                C0200km c0200km = (C0200km) this.f24237m;
                p96.m9441b(this.f24235k.f33583a, bundle);
                int i2 = bundle.getInt("hsdpPrewarmStatusCode", 1);
                if (!bundle.containsKey("hsdpPrewarmStatusCode")) {
                    Log.w("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: cannot find status code");
                }
                if (Log.isLoggable("HsdpClientImpl", 3)) {
                    Log.d("HsdpClientImpl", "HsdpServicePrewarmListener.onStateChange: " + i2);
                }
                String string = bundle.getString("errorMessage", "");
                if (i2 == 2) {
                    return true;
                }
                wp5 wp5Var = this.f24236l;
                if (i2 == 6) {
                    Handler handlerM4221e = wp5Var.f33584b.m4221e();
                    RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 10);
                    runnableC1029pc.f27515b = c0200km;
                    VarHandle.storeStoreFence();
                    handlerM4221e.post(runnableC1029pc);
                    return true;
                }
                Handler handlerM4221e2 = wp5Var.f33584b.m4221e();
                wn5 wn5Var = new wn5();
                wn5Var.f33523a = i2;
                wn5Var.f33524b = string;
                wn5Var.f33525c = c0200km;
                VarHandle.storeStoreFence();
                handlerM4221e2.post(wn5Var);
                return true;
            default:
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    av5.m3325b(parcel);
                    cw5 cw5Var2 = this.f24235k.f33584b;
                    iu5 iu5Var2 = new iu5(b2);
                    iu5Var2.f21811b = cw5Var2;
                    VarHandle.storeStoreFence();
                    cw5Var2.m4218b(iu5Var2);
                    return true;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) av5.m3324a(parcel);
                av5.m3325b(parcel);
                vt5 vt5Var = (vt5) this.f24237m;
                p96.m9441b(this.f24235k.f33583a, bundle2);
                int i3 = bundle2.getInt("hsdpStatusCode", 1);
                if (!bundle2.containsKey("hsdpStatusCode")) {
                    Log.w("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find status code");
                }
                String string2 = bundle2.getString("targetPackage", "");
                if (Log.isLoggable("HsdpClientImpl", 4)) {
                    Log.i("HsdpClientImpl", "HsdpServiceListener.onStateChange: " + i3 + " for target package: " + string2);
                }
                if (string2.isEmpty()) {
                    Log.e("HsdpClientImpl", "HsdpServiceListener.onStateChange: cannot find target package");
                    return true;
                }
                wp5 wp5Var2 = this.f24236l;
                switch (i3) {
                    case 1:
                        m8064I(string2, i3, bundle2.getString("errorMessage", "HSDP service unknown status"));
                        return true;
                    case 2:
                        return true;
                    case 3:
                        wp5.m12353b(wp5Var2, vt5Var, 2, null);
                        return true;
                    case 4:
                        wp5.m12353b(wp5Var2, vt5Var, 3, null);
                        return true;
                    case 5:
                        zo5 zo5Var = new zo5(b2);
                        zo5Var.f36221b = this;
                        zo5Var.f36222c = string2;
                        zo5Var.f36223d = vt5Var;
                        VarHandle.storeStoreFence();
                        wp5.m12353b(wp5Var2, vt5Var, 4, zo5Var);
                        return true;
                    case 6:
                        m8064I(string2, i3, bundle2.getString("errorMessage", "HSDP service error"));
                        return true;
                    case 7:
                        zo5 zo5Var2 = new zo5(b);
                        zo5Var2.f36221b = this;
                        zo5Var2.f36222c = string2;
                        zo5Var2.f36223d = vt5Var;
                        VarHandle.storeStoreFence();
                        wp5.m12353b(wp5Var2, vt5Var, 5, zo5Var2);
                        return true;
                    case 8:
                        m8064I(string2, i3, bundle2.getString("errorMessage", "HSDP service cancelled"));
                        return true;
                    default:
                        Log.w("HsdpClientImpl", "Ignoring HSDP service unsupported status code: " + i3 + " for target package: " + string2);
                        return true;
                }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m8064I(String str, int i, String str2) {
        vt5 vt5Var = (vt5) this.f24237m;
        ro5 ro5Var = new ro5();
        ro5Var.f29479a = this;
        ro5Var.f29480b = str;
        ro5Var.f29481c = vt5Var;
        ro5Var.f29482d = i;
        ro5Var.f29483e = str2;
        VarHandle.storeStoreFence();
        wp5.m12353b(this.f24236l, vt5Var, 4, ro5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo5(wp5 wp5Var, vt5 vt5Var) {
        super("com.google.android.play.core.hsdp.protocol.IHsdpServiceListener", (byte) 3);
        this.f24237m = vt5Var;
        this.f24236l = wp5Var;
        this.f24235k = wp5Var;
    }
}
