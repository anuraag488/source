package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yu3 {

    /* JADX INFO: renamed from: a */
    public zu3 f35540a;

    /* JADX INFO: renamed from: b */
    public hl3 f35541b;

    /* JADX INFO: renamed from: a */
    public final Bundle m13253a(String str) {
        zu3 zu3Var = this.f35540a;
        if (!zu3Var.f36390g) {
            C1077qn.m9989o("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = zu3Var.f36389f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleM10081F = bundle.containsKey(str) ? qs5.m10081F(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            zu3Var.f36389f = null;
        }
        return bundleM10081F;
    }

    /* JADX INFO: renamed from: b */
    public final xu3 m13254b(String str) {
        xu3 xu3Var;
        zu3 zu3Var = this.f35540a;
        synchronized (zu3Var.f36386c) {
            Iterator it = zu3Var.f36387d.entrySet().iterator();
            do {
                xu3Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                xu3 xu3Var2 = (xu3) entry.getValue();
                if (z62.m13387o(str2, str)) {
                    xu3Var = xu3Var2;
                }
            } while (xu3Var == null);
        }
        return xu3Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m13255c(String str, xu3 xu3Var) {
        zu3 zu3Var = this.f35540a;
        synchronized (zu3Var.f36386c) {
            if (zu3Var.f36387d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            zu3Var.f36387d.put(str, xu3Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13256d() {
        if (!this.f35540a.f36391h) {
            C1077qn.m9989o("Can not perform this action after onSaveInstanceState");
            return;
        }
        hl3 hl3Var = this.f35541b;
        if (hl3Var == null) {
            hl3Var = new hl3();
            hl3Var.f20673a = new LinkedHashSet();
            m13255c("androidx.savedstate.Restarter", hl3Var);
            VarHandle.storeStoreFence();
        }
        this.f35541b = hl3Var;
        try {
            tj2.class.getDeclaredConstructor(null);
            hl3 hl3Var2 = this.f35541b;
            if (hl3Var2 != null) {
                hl3Var2.f20673a.add(tj2.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + tj2.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
