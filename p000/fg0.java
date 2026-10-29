package p000;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg0 implements bi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18955a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18956b;

    public /* synthetic */ fg0(byte b) {
        this.f18955a = b;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d A[PHI: r7
  0x003d: PHI (r7v14 java.lang.String) = (r7v13 java.lang.String), (r7v11 java.lang.String) binds: [B:16:0x0051, B:10:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.bi3
    public final Object get() {
        byte b = this.f18955a;
        String str = null;
        Object obj = this.f18956b;
        switch (b) {
            case 0:
                String str2 = (String) obj;
                try {
                    Class<?> cls = Class.forName(str2);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new j72("Class " + str2 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str2 + " was not found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new j72(zi4.m13621u("Could not instantiate ", str2, "."), e);
                } catch (InstantiationException e2) {
                    throw new j72(zi4.m13621u("Could not instantiate ", str2, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new j72(zi4.m13620t("Could not instantiate ", str2), e3);
                } catch (InvocationTargetException e4) {
                    throw new j72(zi4.m13620t("Could not instantiate ", str2), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                hg1 hg1Var = (hg1) obj;
                r02 r02Var = new r02();
                hg1Var.m6388a();
                r02Var.f28927a = new e82(hg1Var.f20545a, "com.google.android.gms.appid");
                hg1Var.m6388a();
                ug1 ug1Var = hg1Var.f20547c;
                String str3 = ug1Var.f31846e;
                if (str3 != null) {
                    str = str3;
                } else {
                    hg1Var.m6388a();
                    String str4 = ug1Var.f31843b;
                    if (str4.startsWith("1:") || str4.startsWith("2:")) {
                        String[] strArrSplit = str4.split(":");
                        if (strArrSplit.length == 4) {
                            str4 = strArrSplit[1];
                            if (!str4.isEmpty()) {
                                str = str4;
                            }
                        }
                    } else {
                        str = str4;
                    }
                }
                r02Var.f28928b = str;
                VarHandle.storeStoreFence();
                return r02Var;
        }
    }
}
