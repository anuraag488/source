package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
import p000.C0641f8;
import p000.p96;
import p000.s36;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class HsdpFeatureHelper {
    private HsdpFeatureHelper() {
    }

    public static boolean isFeatureEnabled(Context context, HsdpFeature hsdpFeature) {
        boolean zShouldAttemptServiceBasedHsdp;
        HsdpFeature hsdpFeature2 = HsdpFeature.SERVICE_BASED_HSDP;
        int iOrdinal = hsdpFeature.ordinal();
        if (iOrdinal == 0) {
            zShouldAttemptServiceBasedHsdp = shouldAttemptServiceBasedHsdp(context);
        } else if (iOrdinal == 1) {
            zShouldAttemptServiceBasedHsdp = shouldAttemptPrewarm(context);
        } else if (iOrdinal == 2) {
            zShouldAttemptServiceBasedHsdp = shouldAttemptHpoa(context);
        } else {
            if (iOrdinal != 3) {
                throw new RuntimeException(null, null);
            }
            zShouldAttemptServiceBasedHsdp = shouldAttemptServiceBasedHpoa(context);
        }
        if (zShouldAttemptServiceBasedHsdp && isServiceBasedHsdpSupported(context)) {
            return isServiceAvailable(context);
        }
        return false;
    }

    private static boolean isServiceAvailable(Context context) {
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(HsdpDeepLinkServiceFactory.createHsdpServiceIntent(), 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    private static boolean isServiceBasedHsdpSupported(Context context) {
        int i;
        C0641f8 c0641f8 = s36.f29861a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            i = (applicationInfo != null && applicationInfo.enabled && s36.m10519b(packageInfo.signatures)) ? packageInfo.versionCode : 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return i >= 80512000;
    }

    public static boolean shouldAttemptHpoa(Context context) {
        return p96.m9442c(context, "flag_enable_hpoa");
    }

    public static boolean shouldAttemptPrewarm(Context context) {
        return p96.m9442c(context, "flag_enable_hsdp_service_prewarm");
    }

    public static boolean shouldAttemptServiceBasedHpoa(Context context) {
        return p96.m9442c(context, "flag_enable_hpoa_in_hsdp_service");
    }

    public static boolean shouldAttemptServiceBasedHsdp(Context context) {
        return p96.m9442c(context, "flag_enable_hsdp_service");
    }
}
