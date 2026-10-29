package p000;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hg4 implements x33, rb1 {

    /* JADX INFO: renamed from: j */
    public static final String f20558j = wn2.m12327g("SystemFgDispatcher");

    /* JADX INFO: renamed from: a */
    public g25 f20559a;

    /* JADX INFO: renamed from: b */
    public j25 f20560b;

    /* JADX INFO: renamed from: c */
    public Object f20561c;

    /* JADX INFO: renamed from: d */
    public e25 f20562d;

    /* JADX INFO: renamed from: e */
    public LinkedHashMap f20563e;

    /* JADX INFO: renamed from: f */
    public HashMap f20564f;

    /* JADX INFO: renamed from: g */
    public HashMap f20565g;

    /* JADX INFO: renamed from: h */
    public cu2 f20566h;

    /* JADX INFO: renamed from: i */
    public SystemForegroundService f20567i;

    /* JADX INFO: renamed from: a */
    public final void m6393a(Intent intent) {
        LinkedHashMap linkedHashMap = this.f20563e;
        if (this.f20567i == null) {
            C1077qn.m9989o("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        e25 e25Var = new e25(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        wn2.m12326e().m12328b(f20558j, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            C1077qn.m9987m("Notification passed in the intent was null.");
            return;
        }
        dn1 dn1Var = new dn1(intExtra, notification, intExtra2);
        linkedHashMap.put(e25Var, dn1Var);
        dn1 dn1Var2 = (dn1) linkedHashMap.get(this.f20562d);
        if (dn1Var2 == null) {
            this.f20562d = e25Var;
        } else {
            this.f20567i.f14714d.notify(intExtra, notification);
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((dn1) ((Map.Entry) it.next()).getValue()).f17207b;
            }
            dn1Var = new dn1(dn1Var2.f17206a, dn1Var2.f17208c, i);
        }
        SystemForegroundService systemForegroundService = this.f20567i;
        int i2 = dn1Var.f17206a;
        int i3 = dn1Var.f17207b;
        Notification notification2 = dn1Var.f17208c;
        systemForegroundService.getClass();
        String str = SystemForegroundService.f14710e;
        try {
            systemForegroundService.startForeground(i2, notification2, i3);
        } catch (ForegroundServiceStartNotAllowedException e) {
            wn2.m12326e().m12333i(str, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            wn2.m12326e().m12333i(str, "Unable to start foreground service", e2);
        }
    }

    @Override // p000.x33
    /* JADX INFO: renamed from: b */
    public final void mo6394b(q25 q25Var, ql0 ql0Var) {
        if (ql0Var instanceof pl0) {
            String str = q25Var.f28162a;
            wn2.m12326e().m12328b(f20558j, "Constraints unmet for WorkSpec " + str);
            g25 g25Var = this.f20559a;
            e25 e25VarM7904L = lb5.m7904L(q25Var);
            int i = ((pl0) ql0Var).f27725a;
            g25Var.f19515d.f21972a.execute(new rc4(g25Var.f19517f, new qb4(e25VarM7904L), true, i));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6395c() {
        this.f20567i = null;
        synchronized (this.f20561c) {
            try {
                Iterator it = this.f20565g.values().iterator();
                while (it.hasNext()) {
                    ((t82) it.next()).mo4993a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jg3 jg3Var = this.f20559a.f19517f;
        synchronized (jg3Var.f22256j) {
            jg3Var.f22255i.remove(this);
        }
    }

    @Override // p000.rb1
    /* JADX INFO: renamed from: d */
    public final void mo3084d(e25 e25Var, boolean z) {
        Map.Entry entry;
        synchronized (this.f20561c) {
            try {
                t82 t82Var = ((q25) this.f20564f.remove(e25Var)) != null ? (t82) this.f20565g.remove(e25Var) : null;
                if (t82Var != null) {
                    t82Var.mo4993a(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        dn1 dn1Var = (dn1) this.f20563e.remove(e25Var);
        if (e25Var.equals(this.f20562d)) {
            if (this.f20563e.size() > 0) {
                Iterator it = this.f20563e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f20562d = (e25) entry.getKey();
                if (this.f20567i != null) {
                    dn1 dn1Var2 = (dn1) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f20567i;
                    int i = dn1Var2.f17206a;
                    int i2 = dn1Var2.f17207b;
                    Notification notification = dn1Var2.f17208c;
                    systemForegroundService.getClass();
                    String str = SystemForegroundService.f14710e;
                    try {
                        systemForegroundService.startForeground(i, notification, i2);
                    } catch (ForegroundServiceStartNotAllowedException e) {
                        wn2.m12326e().m12333i(str, "Unable to start foreground service", e);
                    } catch (SecurityException e2) {
                        wn2.m12326e().m12333i(str, "Unable to start foreground service", e2);
                    }
                    this.f20567i.f14714d.cancel(dn1Var2.f17206a);
                }
            } else {
                this.f20562d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.f20567i;
        if (dn1Var == null || systemForegroundService2 == null) {
            return;
        }
        wn2.m12326e().m12328b(f20558j, "Removing Notification (id: " + dn1Var.f17206a + ", workSpecId: " + e25Var + ", notificationType: " + dn1Var.f17207b);
        systemForegroundService2.f14714d.cancel(dn1Var.f17206a);
    }

    /* JADX INFO: renamed from: e */
    public final void m6396e(int i, int i2) {
        wn2.m12326e().m12331f(f20558j, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.f20563e.entrySet()) {
            if (((dn1) entry.getValue()).f17207b == i2) {
                e25 e25Var = (e25) entry.getKey();
                g25 g25Var = this.f20559a;
                g25Var.f19515d.f21972a.execute(new rc4(g25Var.f19517f, new qb4(e25Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.f20567i;
        if (systemForegroundService != null) {
            systemForegroundService.f14712b = true;
            wn2.m12326e().m12328b(SystemForegroundService.f14710e, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
