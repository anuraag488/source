package p000;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class il3 implements jk2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21531a;

    /* JADX INFO: renamed from: b */
    public Object f21532b;

    public /* synthetic */ il3(byte b) {
        this.f21531a = b;
    }

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        switch (this.f21531a) {
            case 0:
                av3 av3Var = (av3) this.f21532b;
                if (ek2Var != ek2.ON_CREATE) {
                    C1077qn.m9985k("Next event must be ON_CREATE");
                    return;
                }
                lk2Var.getLifecycle().mo6017c(this);
                Bundle bundleM13253a = av3Var.getSavedStateRegistry().m13253a("androidx.savedstate.Restarter");
                if (bundleM13253a == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleM13253a.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    C1077qn.m9989o("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, il3.class.getClassLoader()).asSubclass(wu3.class);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                if (!(av3Var instanceof py4)) {
                                    xd2.m12669p(av3Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                oy4 oy4VarMo2976c = ((py4) av3Var).mo2976c();
                                yu3 savedStateRegistry = av3Var.getSavedStateRegistry();
                                LinkedHashMap linkedHashMap = oy4VarMo2976c.f27238a;
                                LinkedHashMap linkedHashMap2 = oy4VarMo2976c.f27238a;
                                Iterator it = hb0.m6322h1(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    jy4 jy4Var = (jy4) linkedHashMap2.get(it.next());
                                    if (jy4Var != null) {
                                        zy5.m13890y(jy4Var, savedStateRegistry, av3Var.getLifecycle());
                                    }
                                }
                                if (!hb0.m6322h1(linkedHashMap2.keySet()).isEmpty()) {
                                    savedStateRegistry.m13256d();
                                }
                            } catch (Exception e) {
                                xy4.m12785n(zi4.m13620t("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        xy4.m12785n(zi4.m13621u("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                ag0 ag0Var = (ag0) this.f21532b;
                if (ag0Var.f14451e == null) {
                    xf0 xf0Var = (xf0) ag0Var.getLastNonConfigurationInstance();
                    if (xf0Var != null) {
                        ag0Var.f14451e = xf0Var.f34220a;
                    }
                    if (ag0Var.f14451e == null) {
                        ag0Var.f14451e = new oy4();
                    }
                }
                ag0Var.f14447a.mo6017c(this);
                return;
            case 2:
                new HashMap();
                nr1[] nr1VarArr = (nr1[]) this.f21532b;
                if (nr1VarArr.length > 0) {
                    nr1 nr1Var = nr1VarArr[0];
                    throw null;
                }
                if (nr1VarArr.length <= 0) {
                    return;
                }
                nr1 nr1Var2 = nr1VarArr[0];
                throw null;
            case 3:
                if (ek2Var == ek2.ON_STOP) {
                    ((pn1) this.f21532b).getClass();
                    return;
                }
                return;
            default:
                if (ek2Var != ek2.ON_CREATE) {
                    xd2.m12669p(ek2Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    lk2Var.getLifecycle().mo6017c(this);
                    ((uu3) this.f21532b).m11649b();
                    return;
                }
        }
    }
}
