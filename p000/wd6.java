package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class wd6 {

    /* JADX INFO: renamed from: a */
    public static volatile y53 f33261a = C1275w.f32997a;

    /* JADX INFO: renamed from: b */
    public static final Object f33262b = new Object();

    /* JADX INFO: renamed from: a */
    public static boolean m12240a(Context context, Uri uri) {
        ProviderInfo providerInfoResolveContentProvider;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f33261a.mo2967b()) {
            return ((Boolean) f33261a.mo2966a()).booleanValue();
        }
        synchronized (f33262b) {
            try {
                if (f33261a.mo2967b()) {
                    return ((Boolean) f33261a.mo2966a()).booleanValue();
                }
                if ("com.google.android.gms".equals(context.getPackageName()) || ((providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 268435456)) != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName))) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                af3 af3Var = new af3();
                af3Var.f14440a = boolValueOf;
                VarHandle.storeStoreFence();
                f33261a = af3Var;
                return ((Boolean) f33261a.mo2966a()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
