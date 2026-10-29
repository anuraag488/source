package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g25 {

    /* JADX INFO: renamed from: k */
    public static g25 f19509k;

    /* JADX INFO: renamed from: l */
    public static g25 f19510l;

    /* JADX INFO: renamed from: m */
    public static final Object f19511m;

    /* JADX INFO: renamed from: a */
    public Context f19512a;

    /* JADX INFO: renamed from: b */
    public ik0 f19513b;

    /* JADX INFO: renamed from: c */
    public WorkDatabase f19514c;

    /* JADX INFO: renamed from: d */
    public j25 f19515d;

    /* JADX INFO: renamed from: e */
    public List f19516e;

    /* JADX INFO: renamed from: f */
    public jg3 f19517f;

    /* JADX INFO: renamed from: g */
    public wd3 f19518g;

    /* JADX INFO: renamed from: h */
    public boolean f19519h;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f19520i;

    /* JADX INFO: renamed from: j */
    public ko4 f19521j;

    static {
        wn2.m12327g("WorkManagerImpl");
        f19509k = null;
        f19510l = null;
        f19511m = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static g25 m5888b(Context context) {
        g25 g25VarM5888b;
        Object obj = f19511m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        g25VarM5888b = f19509k;
                        if (g25VarM5888b == null) {
                            g25VarM5888b = f19510l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return g25VarM5888b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (g25VarM5888b == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof EsApp)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            m5889c(applicationContext, C0006a5.m71i());
            g25VarM5888b = m5888b(applicationContext);
        }
        return g25VarM5888b;
    }

    /* JADX INFO: renamed from: c */
    public static void m5889c(Context context, ik0 ik0Var) {
        synchronized (f19511m) {
            try {
                g25 g25Var = f19509k;
                if (g25Var != null && f19510l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (g25Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    g25 g25VarM6623r = f19510l;
                    if (g25VarM6623r == null) {
                        g25VarM6623r = i25.m6623r(applicationContext, ik0Var);
                        f19510l = g25VarM6623r;
                    }
                    f19509k = g25VarM6623r;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5890a(i43 i43Var) {
        List listSingletonList = Collections.singletonList(i43Var);
        if (listSingletonList.isEmpty()) {
            C1077qn.m9987m("enqueue needs at least one WorkRequest.");
            return;
        }
        lc1[] lc1VarArr = lc1.f23932a;
        x15 x15Var = new x15();
        x15Var.f33927a = this;
        x15Var.f33928b = listSingletonList;
        ArrayList arrayList = new ArrayList(listSingletonList.size());
        x15Var.f33929c = arrayList;
        x15Var.f33930d = new ArrayList();
        for (int i = 0; i < listSingletonList.size(); i++) {
            lc1[] lc1VarArr2 = lc1.f23932a;
            String string = ((i43) listSingletonList.get(i)).f21124a.toString();
            arrayList.add(string);
            x15Var.f33930d.add(string);
        }
        VarHandle.storeStoreFence();
        g25 g25Var = x15Var.f33927a;
        if (x15Var.f33931e) {
            wn2.m12326e().m12332h(x15.f33926f, "Already enqueued work ids (" + TextUtils.join(", ", arrayList) + ")");
            return;
        }
        r50 r50Var = g25Var.f19513b.f21515l;
        lc1[] lc1VarArr3 = lc1.f23932a;
        j24 j24Var = g25Var.f19515d.f21972a;
        sj4 sj4Var = new sj4((byte) 8);
        sj4Var.f30344b = x15Var;
        VarHandle.storeStoreFence();
        qq2.m10040x(r50Var, "EnqueueRunnable_KEEP", j24Var, sj4Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m5891d() {
        synchronized (f19511m) {
            try {
                this.f19519h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f19520i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f19520i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5892e() {
        r50 r50Var = this.f19513b.f21515l;
        sj4 sj4Var = new sj4((byte) 9);
        sj4Var.f30344b = this;
        VarHandle.storeStoreFence();
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            try {
                Trace.beginSection("ReschedulingWork");
            } finally {
                if (zIsEnabled) {
                    Trace.endSection();
                }
            }
        }
        sj4Var.invoke();
    }
}
