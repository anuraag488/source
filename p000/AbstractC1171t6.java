package p000;

import ads_mobile_sdk.EnumC0338t2;
import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: t6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1171t6 implements as2 {
    public static final C1134s6 Companion = new C1134s6();
    public static final String ERROR_MESSAGE_METHOD_NOT_FOUND = "Method is not found";

    public abstract ox4 getSDKVersionInfo();

    public abstract ox4 getVersionInfo();

    public abstract void initialize(Context context, k32 k32Var, List<zr2> list);

    public void loadAppOpenAd(wr2 wr2Var, tr2 tr2Var) {
        EnumC0338t2[] enumC0338t2Arr = EnumC0338t2.f11833b;
        tr2Var.onFailure(new C1170t5(getClass().getSimpleName().concat(" does not support app open ads.")));
    }

    public void loadBannerAd(xr2 xr2Var, tr2 tr2Var) {
        EnumC0338t2[] enumC0338t2Arr = EnumC0338t2.f11833b;
        tr2Var.onFailure(new C1170t5(getClass().getSimpleName().concat(" does not support banner ads.")));
    }

    public void loadInterscrollerAd(xr2 xr2Var, tr2 tr2Var) {
        EnumC0338t2[] enumC0338t2Arr = EnumC0338t2.f11833b;
        tr2Var.onFailure(new C1170t5(getClass().getSimpleName().concat(" does not support interscroller ads.")));
    }

    public void loadInterstitialAd(bs2 bs2Var, tr2 tr2Var) {
        EnumC0338t2[] enumC0338t2Arr = EnumC0338t2.f11833b;
        tr2Var.onFailure(new C1170t5(getClass().getSimpleName().concat(" does not support interstitial ads.")));
    }

    public void loadNativeAd(ds2 ds2Var, tr2 tr2Var) {
        EnumC0338t2[] enumC0338t2Arr = EnumC0338t2.f11833b;
        tr2Var.onFailure(new C1170t5(getClass().getSimpleName().concat(" does not support native ads.")));
    }

    public void loadNativeAdMapper(ds2 ds2Var, tr2 tr2Var) {
        throw new IllegalStateException(ERROR_MESSAGE_METHOD_NOT_FOUND);
    }

    public void loadRewardedAd(fs2 fs2Var, tr2 tr2Var) {
        EnumC0338t2[] enumC0338t2Arr = EnumC0338t2.f11833b;
        tr2Var.onFailure(new C1170t5(getClass().getSimpleName().concat(" does not support rewarded ads.")));
    }

    public void loadRewardedInterstitialAd(fs2 fs2Var, tr2 tr2Var) {
        EnumC0338t2[] enumC0338t2Arr = EnumC0338t2.f11833b;
        tr2Var.onFailure(new C1170t5(getClass().getSimpleName().concat(" does not support rewarded interstitial ads.")));
    }
}
