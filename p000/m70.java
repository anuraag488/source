package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m70 implements jp4 {

    /* JADX INFO: renamed from: a */
    public w42 f24697a;

    /* JADX INFO: renamed from: b */
    public ConnectivityManager f24698b;

    /* JADX INFO: renamed from: c */
    public Context f24699c;

    /* JADX INFO: renamed from: d */
    public URL f24700d;

    /* JADX INFO: renamed from: e */
    public ja0 f24701e;

    /* JADX INFO: renamed from: f */
    public ja0 f24702f;

    /* JADX INFO: renamed from: g */
    public int f24703g;

    /* JADX INFO: renamed from: b */
    public static URL m8212b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(zi4.m13620t("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX INFO: renamed from: a */
    public final C0467au m8213a(C0467au c0467au) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        Context context = this.f24699c;
        NetworkInfo activeNetworkInfo = this.f24698b.getActiveNetworkInfo();
        C0940nb c0940nbM3310c = c0467au.m3310c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c0940nbM3310c.f25610g;
        if (map2 == null) {
            C1077qn.m9989o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        c0940nbM3310c.m8667b("model", Build.MODEL);
        c0940nbM3310c.m8667b("hardware", Build.HARDWARE);
        c0940nbM3310c.m8667b("device", Build.DEVICE);
        c0940nbM3310c.m8667b("product", Build.PRODUCT);
        c0940nbM3310c.m8667b("os-uild", Build.ID);
        c0940nbM3310c.m8667b("manufacturer", Build.MANUFACTURER);
        c0940nbM3310c.m8667b("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c0940nbM3310c.f25610g;
        if (map3 == null) {
            C1077qn.m9989o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = m03.f24517a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c0940nbM3310c.f25610g;
        if (map4 == null) {
            C1077qn.m9989o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = l03.f23666a;
                subtype = 100;
            } else if (((l03) l03.f23666a.get(subtype)) == null) {
            }
            map = (HashMap) c0940nbM3310c.f25610g;
            if (map != null) {
                C1077qn.m9989o("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c0940nbM3310c.m8667b("country", Locale.getDefault().getCountry());
            c0940nbM3310c.m8667b("locale", Locale.getDefault().getLanguage());
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c0940nbM3310c.m8667b("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                se0.m10739t("CctTransportBackend", "Unable to find version code for package", e);
            }
            c0940nbM3310c.m8667b("application_build", Integer.toString(i2));
            return c0940nbM3310c.m8669e();
        }
        SparseArray sparseArray3 = l03.f23666a;
        subtype = 0;
        map = (HashMap) c0940nbM3310c.f25610g;
        if (map != null) {
            C1077qn.m9989o("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c0940nbM3310c.m8667b("country", Locale.getDefault().getCountry());
        c0940nbM3310c.m8667b("locale", Locale.getDefault().getLanguage());
        simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        c0940nbM3310c.m8667b("mcc_mnc", simOperator);
        i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        c0940nbM3310c.m8667b("application_build", Integer.toString(i2));
        return c0940nbM3310c.m8669e();
    }
}
