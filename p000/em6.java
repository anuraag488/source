package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class em6 implements w06 {

    /* JADX INFO: renamed from: a */
    public cw5 f18265a;

    /* JADX INFO: renamed from: b */
    public Activity f18266b;

    /* JADX INFO: renamed from: a */
    public final void m5206a(String str, String str2, IBinder iBinder, int i, int i2) {
        cw5 cw5Var = this.f18265a;
        if (cw5Var == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putString("callerId", str2);
        bundle.putBinder("windowToken", iBinder);
        bundle.putInt("clientWindowWidthPx", i);
        bundle.putInt("clientWindowHeightPx", i2);
        l36 l36Var = new l36((byte) 0);
        l36Var.f23774b = this;
        l36Var.f23775c = bundle;
        VarHandle.storeStoreFence();
        cw5Var.m4222f(l36Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m5207b(String str, String str2, Map map, IBinder iBinder, ae6 ae6Var) {
        cw5 cw5Var = this.f18265a;
        if (cw5Var == null) {
            Log.e("HpoaClientImpl", "HPOA service is not available");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("appId", str);
        bundle.putString("callerId", str2);
        bundle.putBinder("windowToken", iBinder);
        if (map != null && map.containsKey("catalog_token")) {
            bundle.putBoolean("isCatalogInlineInstall", true);
        }
        yn3 yn3Var = new yn3((byte) 13);
        yn3Var.f35360b = this;
        yn3Var.f35361c = bundle;
        yn3Var.f35362d = ae6Var;
        VarHandle.storeStoreFence();
        cw5Var.m4222f(yn3Var);
    }
}
