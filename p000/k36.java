package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k36 extends kl5 implements b86 {
    /* JADX INFO: renamed from: N */
    public final void m7366N(String str, String str2, String str3, Bundle bundle, lo5 lo5Var) {
        Parcel parcelM7550G = m7550G();
        parcelM7550G.writeString(str);
        parcelM7550G.writeString(str2);
        parcelM7550G.writeString(str3);
        int i = av5.f14906a;
        parcelM7550G.writeInt(1);
        bundle.writeToParcel(parcelM7550G, 0);
        parcelM7550G.writeStrongBinder(lo5Var);
        m7552I(parcelM7550G, 2);
    }
}
