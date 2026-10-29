package p000;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jg3 {

    /* JADX INFO: renamed from: k */
    public static final String f22246k = wn2.m12327g("Processor");

    /* JADX INFO: renamed from: a */
    public Context f22247a;

    /* JADX INFO: renamed from: b */
    public ik0 f22248b;

    /* JADX INFO: renamed from: c */
    public j25 f22249c;

    /* JADX INFO: renamed from: d */
    public WorkDatabase f22250d;

    /* JADX INFO: renamed from: e */
    public HashMap f22251e;

    /* JADX INFO: renamed from: f */
    public HashMap f22252f;

    /* JADX INFO: renamed from: g */
    public HashMap f22253g;

    /* JADX INFO: renamed from: h */
    public HashSet f22254h;

    /* JADX INFO: renamed from: i */
    public ArrayList f22255i;

    /* JADX INFO: renamed from: j */
    public Object f22256j;

    /* JADX INFO: renamed from: d */
    public static boolean m7103d(String str, h35 h35Var, int i) {
        String str2 = f22246k;
        if (h35Var == null) {
            wn2.m12326e().m12328b(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        v82 v82Var = h35Var.f20352l;
        y25 y25Var = new y25();
        y25Var.f34826a = i;
        VarHandle.storeStoreFence();
        v82Var.m5008x(y25Var);
        wn2 wn2VarM12326e = wn2.m12326e();
        StringBuilder sbM10844j = sk5.m10844j("WorkerWrapper interrupted for ", str, " (");
        sbM10844j.append(h35Var.f20341a.f28164c);
        sbM10844j.append("), reason: ");
        sbM10844j.append(i);
        wn2VarM12326e.m12328b(str2, sbM10844j.toString());
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m7104a(rb1 rb1Var) {
        synchronized (this.f22256j) {
            this.f22255i.add(rb1Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final h35 m7105b(String str) {
        h35 h35Var = (h35) this.f22251e.remove(str);
        boolean z = h35Var != null;
        if (!z) {
            h35Var = (h35) this.f22252f.remove(str);
        }
        this.f22253g.remove(str);
        if (z) {
            synchronized (this.f22256j) {
                try {
                    if (this.f22251e.isEmpty()) {
                        Context context = this.f22247a;
                        String str2 = hg4.f20558j;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f22247a.startService(intent);
                        } catch (Throwable th) {
                            wn2.m12326e().m12330d(f22246k, "Unable to stop foreground service", th);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return h35Var;
    }

    /* JADX INFO: renamed from: c */
    public final h35 m7106c(String str) {
        h35 h35Var = (h35) this.f22251e.get(str);
        return h35Var == null ? (h35) this.f22252f.get(str) : h35Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m7107e(e25 e25Var) {
        bu3 bu3Var = this.f22249c.f21976e;
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 17);
        runnableC1285w9.f33164b = this;
        runnableC1285w9.f33165c = e25Var;
        VarHandle.storeStoreFence();
        bu3Var.execute(runnableC1285w9);
    }
}
