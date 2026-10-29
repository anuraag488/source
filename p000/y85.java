package p000;

import ads_mobile_sdk.a83;
import ads_mobile_sdk.fy1;
import ads_mobile_sdk.gf2;
import ads_mobile_sdk.lb3;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y85 {
    /* JADX INFO: renamed from: a */
    public static ui5 m13048a(y85 y85Var, String str, boolean z, a83 a83Var, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) == 0;
        if ((i & 8) != 0) {
            a83Var = a83.UNKNOWN;
        }
        y85Var.getClass();
        try {
            Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
            if (!z) {
                if (objNewInstance instanceof vr2) {
                    vr2 vr2Var = (vr2) objNewInstance;
                    if (((a83Var == a83.BANNER && (vr2Var instanceof MediationBannerAdapter)) || ((a83Var == a83.INTERSTITIAL && (vr2Var instanceof MediationInterstitialAdapter)) || (a83Var == a83.NATIVE && (vr2Var instanceof MediationNativeAdapter)))) && !z2) {
                        gf2 gf2Var = new gf2();
                        gf2Var.f3932a = (vr2) objNewInstance;
                        VarHandle.storeStoreFence();
                        return gf2Var;
                    }
                }
                if (objNewInstance instanceof AbstractC1171t6) {
                    return new fy1((AbstractC1171t6) objNewInstance);
                }
            } else if (objNewInstance instanceof RtbAdapter) {
                RtbAdapter rtbAdapter = (RtbAdapter) objNewInstance;
                lb3 lb3Var = new lb3(rtbAdapter);
                lb3Var.f6773b = rtbAdapter;
                VarHandle.storeStoreFence();
                return lb3Var;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
