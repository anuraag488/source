package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rl5 {

    /* JADX INFO: renamed from: a */
    public static final x64 f29399a = new x64(0);

    /* JADX INFO: renamed from: b */
    public static Locale f29400b;

    /* JADX INFO: renamed from: a */
    public static String m10363a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = r35.m10189a(context).f34949a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m10364b(Context context, int i) {
        Resources resources = context.getResources();
        String strM10363a = m10363a(context);
        if (i == 1) {
            return resources.getString(C0995R.string.common_google_play_services_install_text, strM10363a);
        }
        if (i == 2) {
            return AbstractC0647fd.m5644B(context) ? resources.getString(C0995R.string.common_google_play_services_wear_update_text) : resources.getString(C0995R.string.common_google_play_services_update_text, strM10363a);
        }
        if (i == 3) {
            return resources.getString(C0995R.string.common_google_play_services_enable_text, strM10363a);
        }
        if (i == 5) {
            return m10366d(context, "common_google_play_services_invalid_account_text", strM10363a);
        }
        if (i == 7) {
            return m10366d(context, "common_google_play_services_network_error_text", strM10363a);
        }
        if (i == 9) {
            return resources.getString(C0995R.string.common_google_play_services_unsupported_text, strM10363a);
        }
        if (i == 20) {
            return m10366d(context, "common_google_play_services_restricted_profile_text", strM10363a);
        }
        switch (i) {
            case 16:
                return m10366d(context, "common_google_play_services_api_unavailable_text", strM10363a);
            case 17:
                return m10366d(context, "common_google_play_services_sign_in_failed_text", strM10363a);
            case 18:
                return resources.getString(C0995R.string.common_google_play_services_updating_text, strM10363a);
            default:
                return resources.getString(C0995R.string.common_google_play_services_unknown_issue, strM10363a);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m10365c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C0995R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C0995R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C0995R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m10367e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m10367e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m10367e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m10367e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m10366d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strM10367e = m10367e(context, str);
        if (strM10367e == null) {
            strM10367e = resources.getString(C0995R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strM10367e, str2);
    }

    /* JADX INFO: renamed from: e */
    public static String m10367e(Context context, String str) {
        Resources resourcesForApplication;
        x64 x64Var = f29399a;
        synchronized (x64Var) {
            try {
                Locale locale = an2.m3052a(context.getResources().getConfiguration().getLocales()).f14639a.f15435a.get(0);
                if (!locale.equals(f29400b)) {
                    x64Var.clear();
                    f29400b = locale;
                }
                String str2 = (String) x64Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = yt1.f35521e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            f29399a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
