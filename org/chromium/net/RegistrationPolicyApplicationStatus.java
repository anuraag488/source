package org.chromium.net;

import android.app.Activity;
import p000.AbstractC0581dn;
import p000.on6;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy {
    private boolean mDestroyed;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void destroy() {
        if (this.mDestroyed) {
            return;
        }
        on6 on6Var = AbstractC0581dn.f17201b;
        if (on6Var != null) {
            on6Var.m9194b(this);
        }
        on6 on6Var2 = AbstractC0581dn.f17202c;
        if (on6Var2 != null) {
            on6Var2.m9194b(this);
        }
        this.mDestroyed = true;
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        on6 on6Var = AbstractC0581dn.f17201b;
        if (on6Var == null) {
            on6Var = new on6();
            AbstractC0581dn.f17201b = on6Var;
        }
        on6Var.m9193a(this);
        on6 on6Var2 = AbstractC0581dn.f17202c;
        if (on6Var2 == null) {
            on6Var2 = new on6();
            AbstractC0581dn.f17202c = on6Var2;
        }
        on6Var2.m9193a(this);
        onApplicationStateChange(0);
    }

    public void onApplicationStateChange(int i) {
        synchronized (AbstractC0581dn.f17200a) {
        }
        unregister();
    }

    public void onWindowFocusChanged(Activity activity, boolean z) {
        if (z && isRegistrationFailed()) {
            register();
        }
    }
}
