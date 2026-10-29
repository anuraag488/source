package p000;

import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.e62;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.ql0;
import ads_mobile_sdk.yv0;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: bx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0507bx extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public e62 f15664a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f15665b;

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f15665b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f15665b;
        if (z62.m13387o(frameLayout, view)) {
            return;
        }
        super.bringChildToFront(frameLayout);
    }

    public final C1133s5 getAdChoicesView() {
        View viewM806b = this.f15664a.m806b(NativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (viewM806b instanceof C1133s5) {
            return (C1133s5) viewM806b;
        }
        return null;
    }

    public final View getCallToActionView() {
        return this.f15664a.m806b(NativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final View getHeadlineView() {
        return this.f15664a.m806b(NativeAdAssetNames.ASSET_HEADLINE);
    }

    public final View getIconView() {
        return this.f15664a.m806b(NativeAdAssetNames.ASSET_ICON);
    }

    public final e62 getNativeAdViewContainer() {
        return this.f15664a;
    }

    public final View getStarRatingView() {
        return this.f15664a.m806b(NativeAdAssetNames.ASSET_STAR_RATING);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        yv0 yv0Var;
        ql0 ql0Var;
        e62 e62Var = this.f15664a;
        e62Var.getClass();
        synchronized (e62Var) {
            try {
                if (e62Var.f2809d.get()) {
                    return false;
                }
                InternalNativeAd internalNativeAd = e62Var.f2814i;
                if (internalNativeAd != null && (yv0Var = internalNativeAd.f16263e) != null) {
                    ey0 ey0Var = internalNativeAd.f16266r;
                    ey0Var.getClass();
                    Boolean bool = Boolean.FALSE;
                    C0033as c0033as = C0033as.a$19;
                    if (((Boolean) ey0Var.m13553a("gads:report_touch_event_on_intercept_touch:enabled", bool, c0033as)).booleanValue()) {
                        yv0Var.m2758a(e62Var.f2807b, motionEvent);
                    }
                    InternalNativeAd internalNativeAd2 = e62Var.f2814i;
                    if (internalNativeAd2 != null) {
                        ey0 ey0Var2 = internalNativeAd2.f16266r;
                        ey0Var2.getClass();
                        if (((Boolean) ey0Var2.m13553a("gads:native_ad_view:on_intercept_touch_event:enabled", Boolean.TRUE, c0033as)).booleanValue()) {
                            InternalNativeAd internalNativeAd3 = e62Var.f2814i;
                            if (internalNativeAd3 != null && (ql0Var = internalNativeAd3.f16267s) != null) {
                                ql0Var.m2053a(motionEvent);
                            }
                            if (yv0Var.m2759e() != 0) {
                                yv0Var.f13867f = new WeakReference(this);
                                GestureDetector gestureDetector = e62Var.f2812g;
                                if (gestureDetector != null) {
                                    gestureDetector.onTouchEvent(motionEvent);
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f15665b);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (z62.m13387o(this.f15665b, view)) {
            return;
        }
        super.removeView(view);
    }

    public final void setAdChoicesView(C1133s5 c1133s5) {
        this.f15664a.m805a(c1133s5, NativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW);
    }

    public final void setCallToActionView(View view) {
        this.f15664a.m805a(view, NativeAdAssetNames.ASSET_CALL_TO_ACTION);
    }

    public final void setHeadlineView(View view) {
        this.f15664a.m805a(view, NativeAdAssetNames.ASSET_HEADLINE);
    }

    public final void setIconView(View view) {
        this.f15664a.m805a(view, NativeAdAssetNames.ASSET_ICON);
    }

    public final void setStarRatingView(View view) {
        this.f15664a.m805a(view, NativeAdAssetNames.ASSET_STAR_RATING);
    }
}
