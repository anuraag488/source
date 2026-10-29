package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jx5 extends kl5 implements qx5 {
    public jx5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", (byte) 6);
    }

    @Override // p000.qx5
    /* JADX INFO: renamed from: h */
    public final void mo7338h(Bundle bundle) {
        Parcel parcelM7550G = m7550G();
        st5.m10913b(parcelM7550G, bundle);
        m7553J(parcelM7550G, 1);
    }
}
