package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q02 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f28118g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h */
    public static final String f28119h = Pattern.quote("/");

    /* JADX INFO: renamed from: a */
    public C0973o7 f28120a;

    /* JADX INFO: renamed from: b */
    public Context f28121b;

    /* JADX INFO: renamed from: c */
    public String f28122c;

    /* JADX INFO: renamed from: d */
    public sg1 f28123d;

    /* JADX INFO: renamed from: e */
    public bt0 f28124e;

    /* JADX INFO: renamed from: f */
    public C0701gu f28125f;

    /* JADX INFO: renamed from: a */
    public final synchronized String m9693a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f28118g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX INFO: renamed from: b */
    public final og1 m9694b(boolean z) {
        String str;
        sg1 sg1Var = this.f28123d;
        String str2 = null;
        if (!((Boolean) new C0941nc(0, jp0.f22479g, zq0.class, "isNotMainThread", "isNotMainThread()Z", 0, (byte) 3).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        if (z) {
            try {
                str = ((C0774iu) y62.m12983n(((rg1) sg1Var).m10332e(), 10000L)).f21777a;
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) y62.m12983n(((rg1) sg1Var).m10331c(), 10000L);
        } catch (Exception e2) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e2);
        }
        return new og1(str2, str);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized C0701gu m9695c() {
        String str;
        C0701gu c0701gu = this.f28125f;
        if (c0701gu != null && (c0701gu.f20121b != null || !this.f28124e.m3668a())) {
            return this.f28125f;
        }
        ig1 ig1Var = ig1.f21399w;
        ig1Var.m6801p("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f28121b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        ig1Var.m6801p("Cached Firebase Installation ID: " + string);
        if (this.f28124e.m3668a()) {
            og1 og1VarM9694b = m9694b(false);
            ig1Var.m6801p("Fetched Firebase Installation ID: " + og1VarM9694b.f26679a);
            if (og1VarM9694b.f26679a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                og1VarM9694b = new og1(str, null);
            }
            if (Objects.equals(og1VarM9694b.f26679a, string)) {
                this.f28125f = new C0701gu(sharedPreferences.getString("crashlytics.installation.id", null), og1VarM9694b.f26679a, og1VarM9694b.f26680b);
            } else {
                this.f28125f = new C0701gu(m9693a(sharedPreferences, og1VarM9694b.f26679a), og1VarM9694b.f26679a, og1VarM9694b.f26680b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f28125f = new C0701gu(m9693a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f28125f = new C0701gu(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        ig1Var.m6801p("Install IDs: " + this.f28125f);
        return this.f28125f;
    }

    /* JADX INFO: renamed from: d */
    public final String m9696d() {
        String str;
        C0973o7 c0973o7 = this.f28120a;
        Context context = this.f28121b;
        synchronized (c0973o7) {
            try {
                String str2 = c0973o7.f26402b;
                if (str2 == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    str2 = installerPackageName;
                    c0973o7.f26402b = str2;
                }
                str = "".equals(str2) ? null : c0973o7.f26402b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
