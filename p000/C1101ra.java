package p000;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: ra */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1101ra implements InterfaceC0755ia {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ xn2 f29107a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ FirebaseAnalytics f29108b;

    @Override // p000.InterfaceC0755ia
    /* JADX INFO: renamed from: a */
    public final void mo6705a(String str, String str2) {
        xn2 xn2Var = this.f29107a;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, c75.m3879k("set user property ", str, " ", str2), null);
            }
        }
        x36 x36Var = this.f29108b.f16302a;
        x36Var.getClass();
        x36Var.m12478c(new qz5(x36Var, (String) null, str, (Object) str2, false));
    }

    @Override // p000.InterfaceC0755ia
    /* JADX INFO: renamed from: b */
    public final void mo6706b(String str, Bundle bundle) {
        xn2 xn2Var = this.f29107a;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "log " + str + " " + bundle, null);
            }
        }
        x36 x36Var = this.f29108b.f16302a;
        x36Var.getClass();
        x36Var.m12478c(new f26(x36Var, null, null, str, bundle, false, true));
    }
}
