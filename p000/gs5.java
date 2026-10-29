package p000;

import ads_mobile_sdk.C0200km;
import ads_mobile_sdk.m81;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.play.core.hsdp.service.HsdpFeature;
import com.google.android.play.core.hsdp.service.HsdpFeatureHelper;
import com.google.android.play.core.hsdp.service.HsdpLoadingPanelContainer;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gs5 implements xx1 {

    /* JADX INFO: renamed from: a */
    public Context f20098a;

    /* JADX INFO: renamed from: b */
    public p56 f20099b;

    /* JADX INFO: renamed from: c */
    public p56 f20100c;

    /* JADX INFO: renamed from: d */
    public boolean f20101d;

    /* JADX INFO: renamed from: e */
    public boolean f20102e;

    /* JADX INFO: renamed from: f */
    public boolean f20103f;

    /* JADX INFO: renamed from: g */
    public String f20104g;

    /* JADX INFO: renamed from: h */
    public boolean f20105h;

    /* JADX INFO: renamed from: i */
    public tt2 f20106i;

    /* JADX INFO: renamed from: j */
    public rq5 f20107j;

    /* JADX INFO: renamed from: k */
    public gt5 f20108k;

    /* JADX INFO: renamed from: l */
    public xq5 f20109l;

    /* JADX INFO: renamed from: f */
    public static boolean m6155f(gs5 gs5Var) {
        gt5 gt5Var = gs5Var.f20108k;
        if (gt5Var == null) {
            return false;
        }
        Activity activity = (Activity) gs5Var.f20098a;
        if (activity.isChangingConfigurations()) {
            Log.i("HsdpDeepLinkServiceImpl", "Ignoring callback during activity recreation (changing config).");
            return true;
        }
        ct5 ct5Var = (ct5) gt5Var.f20116a.get(activity);
        if (ct5Var == null || !ct5Var.f16474i) {
            return false;
        }
        Log.i("HsdpDeepLinkServiceImpl", "Ignoring callback during activity recreation (state isRecreating).");
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static void m6156i(String str, wx1 wx1Var, Map map, w06 w06Var, Activity activity) {
        int iM7361c = k26.m7361c(activity);
        int iM7360b = k26.m7360b(activity);
        em6 em6Var = (em6) w06Var;
        Activity activity2 = em6Var.f18266b;
        String packageName = activity2.getPackageName();
        IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            em6Var.m5207b(str, packageName, map, windowToken, new ae6(em6Var, wx1Var, true, str, packageName, windowToken, iM7361c, iM7360b, null, map));
        } else {
            C1077qn.m9989o("Window token is null, cannot open HPOA service.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6157a(String str) {
        wp5 wp5Var = (wp5) ((ep6) this.f20100c.mo4490f());
        vt5 vt5Var = (vt5) wp5Var.f33585c.get(str);
        if (vt5Var == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("callingPackage", wp5Var.f33583a.getPackageName());
            bundle.putString("targetPackage", str);
            bundle.putString("sdkVersion", "2.2.0");
            bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
            lo5 lo5Var = vt5Var.f32871c;
            if (lo5Var == null) {
                Log.w("HsdpClientImpl", "No service listener for overlay: ".concat(str));
            } else {
                cw5 cw5Var = wp5Var.f33584b;
                yn3 yn3Var = new yn3((byte) 2);
                yn3Var.f35360b = wp5Var;
                yn3Var.f35361c = bundle;
                yn3Var.f35362d = lo5Var;
                VarHandle.storeStoreFence();
                cw5Var.m4222f(yn3Var);
            }
        }
        m6159c();
        gt5 gt5Var = this.f20108k;
        if (gt5Var != null) {
            Log.i("HsdpDeepLinkServiceImpl", "Removing session from activeSessions endSession");
            gt5Var.m6164a((Activity) this.f20098a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6158b(List list, C0200km c0200km) {
        if (!HsdpFeatureHelper.isFeatureEnabled(this.f20098a, HsdpFeature.SERVICE_BASED_HSDP_PREWARM)) {
            Bundle bundle = new Bundle();
            bundle.putInt("errorCode", 1);
            bundle.putString("errorMessage", "Prewarm is disabled by experiment.");
            c0200km.onError(bundle);
            return;
        }
        wp5 wp5Var = (wp5) ((ep6) this.f20100c.mo4490f());
        wp5Var.getClass();
        yn3 yn3Var = new yn3((byte) 23);
        yn3Var.f35360b = wp5Var;
        yn3Var.f35361c = list;
        yn3Var.f35362d = c0200km;
        VarHandle.storeStoreFence();
        wp5Var.f33584b.m4222f(yn3Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m6159c() {
        if (this.f20105h) {
            Context context = this.f20098a;
            tt2 tt2Var = this.f20106i;
            Activity activity = (Activity) context;
            if (tt2Var == null) {
                C1077qn.m9989o("hsdpLoadingPanel cannot be null when loading panel is enabled.");
                return;
            }
            tt2Var.m11146F();
            if (this.f20107j != null) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this.f20107j);
                this.f20107j = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d1  */
    /* JADX INFO: renamed from: d */
    public final void m6160d() throws PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        Drawable drawable;
        boolean z;
        if (this.f20105h) {
            Context context = this.f20098a;
            tt2 tt2Var = this.f20106i;
            Activity activity = (Activity) context;
            if (tt2Var == null) {
                C1077qn.m9989o("hsdpLoadingPanel cannot be null when enabling loading panel.");
                return;
            }
            if (((View) tt2Var.f31430d) == null) {
                if (this.f20107j != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(this.f20107j);
                }
                rq5 rq5Var = new rq5();
                rq5Var.f29532a = activity;
                rq5Var.f29533b = this;
                VarHandle.storeStoreFence();
                this.f20107j = rq5Var;
                activity.getApplication().registerActivityLifecycleCallbacks(this.f20107j);
                Activity activity2 = (Activity) tt2Var.f31428b;
                Log.i("HsdpLoadingPanel", "try to showLoading");
                if (((View) tt2Var.f31430d) != null) {
                    return;
                }
                Log.i("HsdpLoadingPanel", "showLoading");
                View viewInflate = LayoutInflater.from(activity2).inflate(C0995R.layout.sdk_loading_panel, (ViewGroup) null);
                if (viewInflate == null) {
                    Log.e("HsdpLoadingPanel", "Failed to inflate loading panel layout.");
                    return;
                }
                tt2Var.f31430d = viewInflate;
                RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 13);
                runnableC1029pc.f27515b = tt2Var;
                VarHandle.storeStoreFence();
                ((HsdpLoadingPanelContainer) viewInflate).setOnConfigurationChangedListener(runnableC1029pc);
                View viewFindViewById = viewInflate.findViewById(C0995R.id.hsdp_service_prism_with_loading_indicator);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(0);
                }
                try {
                    resourcesForApplication = activity2.getPackageManager().getResourcesForApplication("com.android.vending");
                } catch (Exception e) {
                    Log.e("HsdpLoadingPanel", "Error getting resources for com.android.vending", e);
                    resourcesForApplication = null;
                }
                ImageView imageView = (ImageView) viewInflate.findViewById(C0995R.id.play_prism);
                if (imageView != null) {
                    if (resourcesForApplication != null) {
                        try {
                            int identifier = resourcesForApplication.getIdentifier("product_logo_play_prism_color_24", "drawable", "com.android.vending");
                            if (identifier != 0) {
                                imageView.setImageDrawable(resourcesForApplication.getDrawable(identifier, activity2.getTheme()));
                                Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon as drawable from com.android.vending.");
                            } else {
                                try {
                                    imageView.setImageResource(C0995R.drawable.logo_play_prism_24dp);
                                    Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon from local resources.");
                                } catch (RuntimeException e2) {
                                    Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from local resources.", e2);
                                    Log.e("HsdpLoadingPanel", "Failed to load Play Prism icon.");
                                    tt2Var.f31430d = null;
                                    return;
                                }
                            }
                        } catch (RuntimeException e3) {
                            Log.e("HsdpLoadingPanel", "Error loading Play Prism icon from com.android.vending.", e3);
                        }
                    } else {
                        imageView.setImageResource(C0995R.drawable.logo_play_prism_24dp);
                        Log.i("HsdpLoadingPanel", "Successfully loaded Play Prism icon from local resources.");
                    }
                }
                ImageButton imageButton = (ImageButton) viewInflate.findViewById(C0995R.id.sdk_dismiss_button);
                if (imageButton != null) {
                    int color = activity2.getColor(tt2Var.m11149J() ? C0995R.color.dismiss_icon_grey_500 : C0995R.color.dismiss_icon_grey_700);
                    if (resourcesForApplication != null) {
                        try {
                            int identifier2 = resourcesForApplication.getIdentifier(tt2Var.m11149J() ? "grey_500" : "grey_700", "color", "com.android.vending");
                            if (identifier2 != 0) {
                                color = resourcesForApplication.getColor(identifier2, activity2.getTheme());
                            } else {
                                Log.w("HsdpLoadingPanel", "Could not load grey_500/grey_700 color from com.android.vending, falling back to local resources.");
                            }
                            int identifier3 = resourcesForApplication.getIdentifier("gs_close_rond100_vd_theme_24", "drawable", "com.android.vending");
                            if (identifier3 != 0) {
                                drawable = resourcesForApplication.getDrawable(identifier3, activity2.getTheme());
                                z = true;
                            } else {
                                Log.w("HsdpLoadingPanel", "Drawable resource 'gs_close_rond100_vd_theme_24' not found in com.android.vending");
                                z = false;
                                drawable = null;
                            }
                        } catch (RuntimeException e4) {
                            Log.e("HsdpLoadingPanel", "Error loading dismiss icon from com.android.vending.", e4);
                        }
                    } else {
                        z = false;
                        drawable = null;
                    }
                    if (drawable == null) {
                        drawable = C0006a5.m83u(activity2, R.drawable.ic_menu_close_clear_cancel);
                        z = false;
                    }
                    if (drawable == null) {
                        Log.e("HsdpLoadingPanel", "Failed to load dismiss button.");
                        tt2Var.f31430d = null;
                        return;
                    }
                    drawable.setTint(color);
                    imageButton.setImageDrawable(drawable);
                    ot5 ot5Var = new ot5();
                    ot5Var.f27099b = tt2Var;
                    VarHandle.storeStoreFence();
                    imageButton.setOnClickListener(ot5Var);
                    Log.i("HsdpLoadingPanel", "Successfully loaded and tinted dismiss icon from ".concat(true != z ? "local resources." : "com.android.vending."));
                }
                FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(C0995R.id.content_frame);
                if (frameLayout == null) {
                    Log.e("HsdpLoadingPanel", "content_frame not found in the layout.");
                } else {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(new float[]{k26.m7359a(activity2, 28), k26.m7359a(activity2, 28), k26.m7359a(activity2, 28), k26.m7359a(activity2, 28), 0.0f, 0.0f, 0.0f, 0.0f});
                    gradientDrawable.setColor(activity2.getColor(tt2Var.m11149J() ? C0995R.color.background_dark : C0995R.color.background_light));
                    frameLayout.setBackground(gradientDrawable);
                    frameLayout.setClipToOutline(true);
                }
                View viewFindViewById2 = viewInflate.findViewById(C0995R.id.placeholder_loading);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setVisibility(0);
                }
                try {
                    int iM7360b = k26.m7360b(activity2);
                    int dimensionPixelSize = activity2.getResources().getDimensionPixelSize(C0995R.dimen.sdk_hsdp_loading_ui_height);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2, 40, -3);
                    layoutParams.height = Math.min(activity2.getResources().getDimensionPixelSize(C0995R.dimen.sdk_hsdp_loading_ui_height), (int) (k26.m7360b(activity2) * 0.6f));
                    if (activity2.getResources().getConfiguration().screenWidthDp > 640) {
                        layoutParams.width = k26.m7359a(activity2, 640);
                    }
                    layoutParams.gravity = 81;
                    Log.i("HsdpLoadingPanel", "screenHeight: " + iM7360b + ", loadingUiHeight: " + dimensionPixelSize + ", wmParams.y: " + layoutParams.y);
                    ((WindowManager) tt2Var.f31429c).addView(viewInflate, layoutParams);
                    Log.i("HsdpLoadingPanel", "Successfully added view to WindowManager. loadingView size: " + viewInflate.getWidth() + 'x' + viewInflate.getHeight());
                    FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(C0995R.id.content_frame);
                    if (frameLayout2 != null) {
                        Log.i("HsdpLoadingPanel", "contentFrame size: " + frameLayout2.getWidth() + 'x' + frameLayout2.getHeight());
                    }
                } catch (RuntimeException e5) {
                    Log.e("HsdpLoadingPanel", "Error adding view to WindowManager", e5);
                    tt2Var.f31430d = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6161e(ct5 ct5Var, int i, int i2) throws PackageManager.NameNotFoundException {
        IInterface iInterface;
        p56 p56Var = this.f20100c;
        String str = ct5Var.f16467b;
        String str2 = ct5Var.f16468c;
        Context context = this.f20098a;
        String packageName = context.getPackageName();
        Map map = ct5Var.f16470e;
        String dataString = hz5.m6534c(str, str2, packageName, map).getDataString();
        dataString.getClass();
        boolean z = this.f20105h;
        if (z && ((iInterface = (b86) ((wp5) ((ep6) p56Var.mo4490f())).f33584b.f16551l) == null || !((kl5) iInterface).f23220b.isBinderAlive())) {
            m6160d();
        }
        ep6 ep6Var = (ep6) p56Var.mo4490f();
        Activity activity = (Activity) context;
        IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
        boolean z2 = ct5Var.f16471f;
        long j = ct5Var.f16472g;
        wx1 wx1Var = ct5Var.f16469d;
        xq5 xq5Var = !z ? new xq5(this, wx1Var, wx1Var, activity, str, str2, map) : new xq5(this, wx1Var, activity, wx1Var, str, str2, map);
        this.f20109l = xq5Var;
        ((wp5) ep6Var).m12354a(str, dataString, windowToken, i, i2, z2, true, j, xq5Var, ct5Var.f16473h);
    }

    /* JADX INFO: renamed from: g */
    public final void m6162g(Activity activity, String str, String str2, wx1 wx1Var, Map map, boolean z) throws PackageManager.NameNotFoundException {
        p56 p56Var = this.f20099b;
        Intent intentM6534c = hz5.m6534c(str, str2, activity.getPackageName(), map);
        intentM6534c.addFlags(536870912);
        intentM6534c.addFlags(262144);
        if (activity.getPackageManager().resolveActivity(intentM6534c, 65536) != null) {
            m6160d();
            Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity found.");
            activity.startActivityForResult(intentM6534c, 0);
            wx1Var.onDeepLinkStarted();
            if (z) {
                m6156i(str, wx1Var, map, (w06) p56Var.mo4490f(), activity);
                return;
            }
            return;
        }
        if (!this.f20101d) {
            activity.startActivityForResult(hz5.m6532a(str, str2, map), 0);
            return;
        }
        Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity not found. Ignoring error and still showing HPOA affordance.");
        if (z) {
            m6156i(str, wx1Var, map, (w06) p56Var.mo4490f(), activity);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6163h(String str, String str2, m81 m81Var, Map map, boolean z) {
        xq5 xq5Var;
        gs5 gs5Var;
        Activity activity;
        String str3;
        m81 m81Var2;
        String str4;
        xq5 xq5Var2;
        long j;
        Activity activity2;
        boolean z2 = this.f20103f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Log.isLoggable("HsdpDeepLinkServiceImpl", 4)) {
            Log.i("HsdpDeepLinkServiceImpl", "open: targetAppPackageName=" + str + ", lastTargetAppPackageName=" + this.f20104g);
        }
        xq5 xq5Var3 = this.f20109l;
        if (xq5Var3 != null) {
            xq5Var3.f34538c = true;
        }
        this.f20104g = str;
        Context context = this.f20098a;
        Intent intentM6534c = hz5.m6534c(str, str2, context.getPackageName(), map);
        boolean z3 = this.f20102e;
        if (!z3 || !HsdpFeatureHelper.isFeatureEnabled(context, HsdpFeature.SERVICE_BASED_HSDP)) {
            Activity activity3 = (Activity) context;
            if (this.f20106i != null) {
                m6162g(activity3, str, str2, m81Var, map, z2 && !z3);
                return;
            } else {
                C1077qn.m9989o("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
                return;
            }
        }
        Uri data = intentM6534c.getData();
        if (data == null) {
            Bundle bundle = new Bundle();
            bundle.putString("errorMessage", "Deeplink URL is null.");
            m81Var.onError(bundle);
            return;
        }
        String string = data.toString();
        if (!(context instanceof Activity)) {
            Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
            intent.putExtra("target_package_name", str);
            intent.putExtra("referrer", str2);
            intent.putExtra("auto_trigger", z);
            intent.putExtra("deeplink_url", string);
            intent.putExtra("request_timestamp_ms", jElapsedRealtime);
            if (map != null) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    bundle2.putString((String) entry.getKey(), (String) entry.getValue());
                }
                intent.putExtra("extra_query_params_bundle", bundle2);
            }
            intent.addFlags(262144);
            intent.addFlags(268435456);
            Log.i("HsdpDeepLinkServiceImpl", "Starting HSDP Shim Activity.");
            context.startActivity(intent);
            return;
        }
        Activity activity4 = (Activity) context;
        if (this.f20105h) {
            xq5Var = new xq5(this, m81Var, activity4, m81Var, str, str2, map);
            gs5Var = this;
            activity = activity4;
            str3 = str;
            m81Var2 = m81Var;
            str4 = str2;
        } else {
            activity = activity4;
            m81Var2 = m81Var;
            xq5Var = new xq5(this, m81Var, m81Var2, activity, str, str2, map);
            gs5Var = this;
            str3 = str;
            str4 = str2;
        }
        xq5 xq5Var4 = xq5Var;
        gs5Var.f20109l = xq5Var4;
        if (z2) {
            w06 w06Var = (w06) gs5Var.f20099b.mo4490f();
            C1283w7 c1283w7 = new C1283w7((byte) 28);
            c1283w7.f33127c = gs5Var;
            c1283w7.f33128d = str3;
            c1283w7.f33129e = str4;
            c1283w7.f33126b = m81Var2;
            VarHandle.storeStoreFence();
            em6 em6Var = (em6) w06Var;
            Activity activity5 = em6Var.f18266b;
            String packageName = activity5.getPackageName();
            IBinder windowToken = activity5.getWindow().getDecorView().getWindowToken();
            if (windowToken == null) {
                C1077qn.m9989o("Window token is null, cannot start HPOA session.");
                return;
            } else {
                xq5Var2 = xq5Var4;
                em6Var.m5207b(str, packageName, map, windowToken, new ae6(em6Var, xq5Var4, false, str, packageName, windowToken, 0, 0, c1283w7, map));
            }
        } else {
            xq5Var2 = xq5Var4;
        }
        gt5 gt5Var = gs5Var.f20108k;
        if (gt5Var != null) {
            int iM7361c = k26.m7361c(activity);
            int iM7360b = k26.m7360b(activity);
            String string2 = UUID.randomUUID().toString();
            j = jElapsedRealtime;
            activity2 = activity;
            gt5Var.f20116a.put(activity2, new ct5(str, str2, m81Var, map, z, j, iM7361c, iM7360b, null, string2));
            gt5Var.f20117b.put(string2, m81Var);
        } else {
            j = jElapsedRealtime;
            activity2 = activity;
        }
        p56 p56Var = gs5Var.f20100c;
        IInterface iInterface = (b86) ((wp5) ((ep6) p56Var.mo4490f())).f33584b.f16551l;
        if (iInterface == null || !((kl5) iInterface).f23220b.isBinderAlive()) {
            gs5Var.m6160d();
        }
        Activity activity6 = activity2;
        ((wp5) ((ep6) p56Var.mo4490f())).m12354a(str, string, activity2.getWindow().getDecorView().getWindowToken(), k26.m7361c(activity6), k26.m7360b(activity6), z, false, j, xq5Var2, null);
    }
}
