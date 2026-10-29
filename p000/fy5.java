package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fy5 extends kl5 implements az5 {
    public fy5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", (byte) 6);
    }

    @Override // p000.az5
    /* JADX INFO: renamed from: c */
    public final void mo3375c(String str, String str2, Bundle bundle, long j) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        st5.m10913b(parcelM7550G, bundle);
        parcelM7550G.writeLong(j);
        m7553J(parcelM7550G, 1);
    }

    @Override // p000.az5
    /* JADX INFO: renamed from: l */
    public final int mo3376l() {
        Parcel parcelM7549F = m7549F(m7550G(), 2);
        int i = parcelM7549F.readInt();
        parcelM7549F.recycle();
        return i;
    }
}
