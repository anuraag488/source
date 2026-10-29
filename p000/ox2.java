package p000;

import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdAssetNames;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ox2 extends AbstractC0507bx {
    public final View getAdvertiserView() {
        return getNativeAdViewContainer().m806b(NativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final View getBodyView() {
        return getNativeAdViewContainer().m806b(NativeAdAssetNames.ASSET_BODY);
    }

    public final View getCreativeSummaryView() {
        return getNativeAdViewContainer().m806b(NativeAdAssetNames.ASSET_CREATIVE_SUMMARY);
    }

    public final rr2 getMediaView() {
        View viewM806b = getNativeAdViewContainer().m806b(NativeAdAssetNames.ASSET_MEDIA_CONTENT);
        if (viewM806b instanceof rr2) {
            return (rr2) viewM806b;
        }
        return null;
    }

    public final View getPriceView() {
        return getNativeAdViewContainer().m806b(NativeAdAssetNames.ASSET_PRICE);
    }

    public final View getStoreView() {
        return getNativeAdViewContainer().m806b(NativeAdAssetNames.ASSET_STORE);
    }

    public final void setAdvertiserView(View view) {
        getNativeAdViewContainer().m805a(view, NativeAdAssetNames.ASSET_ADVERTISER);
    }

    public final void setBodyView(View view) {
        getNativeAdViewContainer().m805a(view, NativeAdAssetNames.ASSET_BODY);
    }

    public final void setCreativeSummaryView(View view) {
        getNativeAdViewContainer().m805a(view, NativeAdAssetNames.ASSET_CREATIVE_SUMMARY);
    }

    public final void setPriceView(View view) {
        getNativeAdViewContainer().m805a(view, NativeAdAssetNames.ASSET_PRICE);
    }

    public final void setStoreView(View view) {
        getNativeAdViewContainer().m805a(view, NativeAdAssetNames.ASSET_STORE);
    }
}
