package p000;

import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25959a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pn1 f25960b;

    public /* synthetic */ nn1(byte b) {
        this.f25959a = b;
    }

    /* JADX INFO: renamed from: a */
    public final void m8801a() {
        switch (this.f25959a) {
            case 0:
                pn1 pn1Var = this.f25960b;
                pn1Var.f27773R.m9607e();
                tu3.m11162b(pn1Var);
                Bundle bundle = pn1Var.f27779b;
                pn1Var.f27773R.m9608f(bundle != null ? bundle.getBundle("registryState") : null);
                break;
            default:
                pn1 pn1Var2 = this.f25960b;
                zt1 zt1Var = pn1Var2.f27770O;
                zt1Var.f36357b = pn1Var2.f27798u.f29431v;
                Iterator it = ((CopyOnWriteArraySet) zt1Var.f36356a).iterator();
                while (it.hasNext()) {
                    ((wf0) it.next()).m12243a();
                }
                break;
        }
    }
}
