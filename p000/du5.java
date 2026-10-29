package p000;

import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class du5 implements wx1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f17416a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f17417b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ HashMap f17418c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ HsdpShimActivity f17419d;

    @Override // p000.wx1
    public final void onAffordanceEnded() {
        Log.w("HsdpShimActivity", "onAffordanceEnded is not supported when to call HSDP service from shim activity");
    }

    @Override // p000.wx1
    public final void onAffordanceStarted() {
        Log.w("HsdpShimActivity", "onAffordanceStarted is not supported when to call HSDP service from shim activity");
    }

    @Override // p000.wx1
    public final void onDeepLinkStarted() {
        Log.w("HsdpShimActivity", "onDeepLinkStarted is not supported when to call HSDP service from shim activity");
    }

    @Override // p000.wx1
    public final void onDismissed(Bundle bundle) {
        HsdpShimActivity hsdpShimActivity = this.f17419d;
        if (Log.isLoggable("HsdpShimActivity", 4)) {
            Log.i("HsdpShimActivity", "HSDP service based UI dismissed. hasBeenShown=" + hsdpShimActivity.f16300b);
        }
        boolean z = bundle.getBoolean("dldpRedirect", false);
        if (!hsdpShimActivity.f16300b && !z) {
            Log.i("HsdpShimActivity", "Ignore dismiss before shown (likely temporary reuse cleanup)");
            return;
        }
        Log.i("HsdpShimActivity", "Finish the shim activity.");
        hsdpShimActivity.f16299a = null;
        hsdpShimActivity.finish();
    }

    @Override // p000.wx1
    public final void onError(Bundle bundle) {
        HsdpShimActivity hsdpShimActivity = this.f17419d;
        Log.e("HsdpShimActivity", "HSDP service based UI error: " + String.valueOf(bundle) + ". Finish the shim activity.");
        try {
            hsdpShimActivity.startActivityForResult(hz5.m6532a(this.f17416a, this.f17417b, this.f17418c), 0);
        } catch (ActivityNotFoundException e) {
            Log.e("HsdpShimActivity", "Play Store activity not found for fallback deep link.", e);
        } catch (Exception e2) {
            Log.e("HsdpShimActivity", "Failed to start full deeplink fallback activity on error.", e2);
        }
        hsdpShimActivity.f16299a = null;
        hsdpShimActivity.f16300b = false;
        hsdpShimActivity.finish();
    }

    @Override // p000.wx1
    public final void onShown(Bundle bundle) {
        Log.i("HsdpShimActivity", "HSDP service based UI shown");
        this.f17419d.f16300b = true;
    }
}
