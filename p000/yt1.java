package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class yt1 {

    /* JADX INFO: renamed from: b */
    public static boolean f35518b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f35519c = false;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f35521e = 0;

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f35517a = new AtomicBoolean();

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f35520d = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public static void m13235a(Context context) throws xt1, wt1 {
        qt1 qt1Var = qt1.f28785b;
        int iM10123b = qt1Var.m10123b(context, 11925000);
        if (iM10123b != 0) {
            Intent intentMo9664a = qt1Var.mo9664a(context, iM10123b, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(iM10123b).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(iM10123b);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentMo9664a != null) {
                throw new xt1("Google Play Services not available");
            }
            throw new wt1();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13236b(Context context) {
        try {
            if (!f35519c) {
                PackageInfo packageInfoM12998b = r35.m10189a(context).m12998b(134217792, "com.google.android.gms");
                zt1.m13748a(context);
                if (packageInfoM12998b == null || zt1.m13749c(packageInfoM12998b, false) || !zt1.m13749c(packageInfoM12998b, true)) {
                    f35518b = false;
                } else {
                    f35518b = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            f35519c = true;
        }
        return f35518b || !"user".equals(Build.TYPE);
    }
}
