package p000;

import android.app.Application;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bv3 implements my4 {

    /* JADX INFO: renamed from: a */
    public Application f15647a;

    /* JADX INFO: renamed from: b */
    public ly4 f15648b;

    /* JADX INFO: renamed from: c */
    public Bundle f15649c;

    /* JADX INFO: renamed from: d */
    public gk2 f15650d;

    /* JADX INFO: renamed from: e */
    public yu3 f15651e;

    @Override // p000.my4
    /* JADX INFO: renamed from: a */
    public final jy4 mo3725a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m3728d(cls, canonicalName);
        }
        C1077qn.m9987m("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // p000.my4
    /* JADX INFO: renamed from: b */
    public final jy4 mo3726b(Class cls, gv2 gv2Var) {
        q50 q50Var = js1.f22553c;
        LinkedHashMap linkedHashMap = gv2Var.f17298a;
        String str = (String) linkedHashMap.get(q50Var);
        if (str == null) {
            C1077qn.m9989o("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(tu3.f31456a) == null || linkedHashMap.get(tu3.f31457b) == null) {
            if (this.f15650d != null) {
                return m3728d(cls, str);
            }
            C1077qn.m9989o("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(ly4.f24472d);
        boolean zIsAssignableFrom = AbstractC0576di.class.isAssignableFrom(cls);
        Constructor constructorM4172a = (!zIsAssignableFrom || application == null) ? cv3.m4172a(cls, cv3.f16509b) : cv3.m4172a(cls, cv3.f16508a);
        if (constructorM4172a == null) {
            return this.f15648b.mo3726b(cls, gv2Var);
        }
        return (!zIsAssignableFrom || application == null) ? cv3.m4173b(cls, constructorM4172a, tu3.m11161a(gv2Var)) : cv3.m4173b(cls, constructorM4172a, application, tu3.m11161a(gv2Var));
    }

    @Override // p000.my4
    /* JADX INFO: renamed from: c */
    public final jy4 mo3727c(r90 r90Var, gv2 gv2Var) {
        return mo3726b(r90Var.f29101a, gv2Var);
    }

    /* JADX INFO: renamed from: d */
    public final jy4 m3728d(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        gk2 gk2Var = this.f15650d;
        if (gk2Var == null) {
            qm5.m9919j("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = AbstractC0576di.class.isAssignableFrom(cls);
        Constructor constructorM4172a = (!zIsAssignableFrom || this.f15647a == null) ? cv3.m4172a(cls, cv3.f16509b) : cv3.m4172a(cls, cv3.f16508a);
        if (constructorM4172a == null) {
            if (this.f15647a != null) {
                return this.f15648b.mo3725a(cls);
            }
            ny4 ny4Var = ny4.f26201a;
            if (ny4Var == null) {
                ny4Var = new ny4();
                ny4.f26201a = ny4Var;
            }
            return ny4Var.mo3725a(cls);
        }
        yu3 yu3Var = this.f15651e;
        qu3 qu3VarM10734o = se0.m10734o(yu3Var.m13253a(str), this.f15649c);
        ru3 ru3Var = new ru3();
        ru3Var.f29642a = str;
        ru3Var.f29643b = qu3VarM10734o;
        VarHandle.storeStoreFence();
        ru3Var.m10443a(yu3Var, gk2Var);
        fk2 fk2VarMo6016b = gk2Var.mo6016b();
        if (fk2VarMo6016b == fk2.f19055b || fk2VarMo6016b.m5728a(fk2.f19057d)) {
            yu3Var.m13256d();
        } else {
            lw0 lw0Var = new lw0((byte) 1);
            lw0Var.f24410b = gk2Var;
            lw0Var.f24411c = yu3Var;
            VarHandle.storeStoreFence();
            gk2Var.mo6015a(lw0Var);
        }
        jy4 jy4VarM4173b = (!zIsAssignableFrom || (application = this.f15647a) == null) ? cv3.m4173b(cls, constructorM4172a, qu3VarM10734o) : cv3.m4173b(cls, constructorM4172a, application, qu3VarM10734o);
        ky4 ky4Var = jy4VarM4173b.f22749a;
        if (ky4Var == null) {
            return jy4VarM4173b;
        }
        if (ky4Var.f23625d) {
            ky4.m7751a(ru3Var);
            return jy4VarM4173b;
        }
        synchronized (ky4Var.f23622a) {
            autoCloseable = (AutoCloseable) ky4Var.f23623b.put("androidx.lifecycle.savedstate.vm.tag", ru3Var);
        }
        ky4.m7751a(autoCloseable);
        return jy4VarM4173b;
    }
}
