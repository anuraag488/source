package p000;

import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.f32;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rr2 extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView.ScaleType f29548a;

    /* JADX INFO: renamed from: b */
    public C0310ra f29549b;

    public final ImageView.ScaleType getImageScaleType() {
        return this.f29548a;
    }

    public final mr2 getMediaContent() {
        return null;
    }

    public final void setImageScaleType(ImageView.ScaleType scaleType) {
        C0310ra c0310ra;
        this.f29548a = scaleType;
        if (scaleType != null) {
            synchronized (this) {
                c0310ra = this.f29549b;
            }
            if (c0310ra != null) {
                c0310ra.m2096a(scaleType);
            }
        }
    }

    public final void setMediaContent(mr2 mr2Var) {
        InternalNativeAd internalNativeAdM8385a;
        if (mr2Var == null || (internalNativeAdM8385a = mr2Var.m8385a()) == null || internalNativeAdM8385a.f16262a.f4258b != f32.f3284b || internalNativeAdM8385a.f16264l.m1268a(this)) {
            return;
        }
        removeAllViews();
    }
}
