package p000;

import android.os.Trace;
import android.view.View;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s61 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29931a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f29932b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29933c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29934d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f29935e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f29936f;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29931a) {
            case 0:
                v61 v61Var = (v61) this.f29932b;
                eg4 eg4Var = (eg4) this.f29933c;
                eg4 eg4Var2 = (eg4) this.f29934d;
                ag0 ag0Var = (ag0) this.f29935e;
                View view = (View) this.f29936f;
                v61Var.mo11753a(eg4Var, eg4Var2, ag0Var.getWindow(), view, ((Boolean) eg4Var.f18079c.invoke(view.getResources())).booleanValue(), ((Boolean) eg4Var2.f18079c.invoke(view.getResources())).booleanValue());
                return;
            default:
                r50 r50Var = (r50) this.f29932b;
                String strSubstring = (String) this.f29933c;
                wp1 wp1Var = (wp1) this.f29934d;
                qv2 qv2Var = (qv2) this.f29935e;
                m60 m60Var = (m60) this.f29936f;
                r50Var.getClass();
                boolean zIsEnabled = Trace.isEnabled();
                if (zIsEnabled) {
                    try {
                        if (strSubstring.length() > 127) {
                            strSubstring = strSubstring.substring(0, 127);
                        }
                        Trace.beginSection(strSubstring);
                    } catch (Throwable th) {
                        if (!zIsEnabled) {
                            throw th;
                        }
                        Trace.endSection();
                        throw th;
                    }
                }
                try {
                    wp1Var.invoke();
                    p53 p53Var = wv1.f33769l;
                    qv2Var.m10131d(p53Var);
                    m60Var.m8198a(p53Var);
                    break;
                } catch (Throwable th2) {
                    o53 o53Var = new o53();
                    o53Var.f26353n = th2;
                    VarHandle.storeStoreFence();
                    qv2Var.m10131d(o53Var);
                    m60Var.m8199b(th2);
                    break;
                }
                if (zIsEnabled) {
                    Trace.endSection();
                    return;
                }
                return;
        }
    }
}
