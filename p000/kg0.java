package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg0 implements bi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23103a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23104b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23105c;

    public /* synthetic */ kg0(byte b) {
        this.f23103a = b;
    }

    @Override // p000.bi3
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z = true;
        switch (this.f23103a) {
            case 0:
                lg0 lg0Var = (lg0) this.f23104b;
                qf0 qf0Var = (qf0) this.f23105c;
                lg0Var.getClass();
                gg0 gg0Var = qf0Var.f28433f;
                C0602e8 c0602e8 = new C0602e8();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<ny0> set = qf0Var.f28430c;
                Set set2 = qf0Var.f28434g;
                for (ny0 ny0Var : set) {
                    byte b = ny0Var.f26190c;
                    byte b2 = ny0Var.f26189b;
                    boolean z2 = b == 0 ? z : false;
                    ni3 ni3Var = ny0Var.f26188a;
                    if (z2) {
                        if (b2 == 2) {
                            hashSet4.add(ni3Var);
                        } else {
                            hashSet.add(ni3Var);
                        }
                    } else if (b == 2) {
                        hashSet3.add(ni3Var);
                    } else if (b2 == 2) {
                        hashSet5.add(ni3Var);
                    } else {
                        hashSet2.add(ni3Var);
                    }
                    z = true;
                }
                if (!set2.isEmpty()) {
                    hashSet.add(ni3.m8779a(ii3.class));
                }
                c0602e8.f17867a = Collections.unmodifiableSet(hashSet);
                c0602e8.f17868b = Collections.unmodifiableSet(hashSet2);
                c0602e8.f17869c = Collections.unmodifiableSet(hashSet3);
                c0602e8.f17870d = Collections.unmodifiableSet(hashSet4);
                c0602e8.f17871e = Collections.unmodifiableSet(hashSet5);
                c0602e8.f17872f = lg0Var;
                VarHandle.storeStoreFence();
                return gg0Var.mo3007e(c0602e8);
            case 1:
                Context context = (Context) this.f23104b;
                String str = (String) this.f23105c;
                zv1 zv1Var = new zv1();
                zv1Var.f36410a = new e82(context, "FirebaseHeartBeat".concat(str));
                VarHandle.storeStoreFence();
                return zv1Var;
            default:
                hg1 hg1Var = (hg1) this.f23104b;
                Context context2 = (Context) this.f23105c;
                String strM6390d = hg1Var.m6390d();
                ct0 ct0Var = new ct0();
                Context contextCreateDeviceProtectedStorageContext = context2.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strM6390d), 0);
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                ct0Var.f16442a = z;
                VarHandle.storeStoreFence();
                return ct0Var;
        }
    }
}
