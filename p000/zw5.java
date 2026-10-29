package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zw5 extends pt5 implements qx5 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f36435a;

    /* JADX INFO: renamed from: b */
    public boolean f36436b;

    public zw5() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f36435a = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m13831G(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", c75.m3879k("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // p000.pt5
    /* JADX INFO: renamed from: E */
    public final boolean mo2994E(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) st5.m10912a(parcel, Bundle.CREATOR);
        st5.m10915d(parcel);
        mo7338h(bundle);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final Bundle m13832F(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f36435a;
        synchronized (atomicReference) {
            if (!this.f36436b) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f36435a.get();
        }
        return bundle;
    }

    @Override // p000.qx5
    /* JADX INFO: renamed from: h */
    public final void mo7338h(Bundle bundle) {
        AtomicReference atomicReference = this.f36435a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f36436b = true;
                    this.f36435a.notify();
                } catch (Throwable th) {
                    this.f36435a.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
