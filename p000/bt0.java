package p000;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bt0 implements InterfaceC1198tx {

    /* JADX INFO: renamed from: a */
    public boolean f15564a;

    /* JADX INFO: renamed from: b */
    public Object f15565b;

    /* JADX INFO: renamed from: c */
    public Object f15566c;

    /* JADX INFO: renamed from: d */
    public Object f15567d;

    /* JADX INFO: renamed from: e */
    public Object f15568e;

    /* JADX INFO: renamed from: f */
    public Object f15569f;

    /* JADX INFO: renamed from: a */
    public synchronized boolean m3668a() {
        boolean zBooleanValue;
        boolean z;
        Boolean bool = (Boolean) this.f15569f;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            try {
                hg1 hg1Var = (hg1) this.f15565b;
                hg1Var.m6388a();
                ct0 ct0Var = (ct0) hg1Var.f20551g.get();
                synchronized (ct0Var) {
                    z = ct0Var.f16442a;
                }
                zBooleanValue = z;
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
        }
        m3669b(zBooleanValue);
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public void m3669b(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (((Boolean) this.f15569f) == null) {
            str = "global Firebase setting";
        } else {
            str = this.f15564a ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strM13622v = zi4.m13622v("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM13622v, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public FileInputStream m3670c(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
            return null;
        }
    }

    @Override // p000.InterfaceC1198tx
    /* JADX INFO: renamed from: d */
    public void mo3671d(lk0 lk0Var) {
        km5 km5Var = ((tt1) this.f15569f).f31423m;
        oz5 oz5Var = new oz5((byte) 6);
        oz5Var.f27250c = this;
        oz5Var.f27249b = lk0Var;
        VarHandle.storeStoreFence();
        km5Var.post(oz5Var);
    }

    /* JADX INFO: renamed from: e */
    public void m3672e(int i, IOException iOException) {
        ((wd3) this.f15565b).mo10207h(i, iOException);
    }

    /* JADX INFO: renamed from: f */
    public void m3673f(lk0 lk0Var) {
        ol5 ol5Var = (ol5) ((tt1) this.f15569f).f31420j.get((C0458al) this.f15566c);
        if (ol5Var != null) {
            ol5Var.m9181m(lk0Var);
        }
    }
}
