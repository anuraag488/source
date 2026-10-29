package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l34 extends Handler {

    /* JADX INFO: renamed from: a */
    public boolean f23768a;

    /* JADX INFO: renamed from: b */
    public long f23769b;

    /* JADX INFO: renamed from: c */
    public ArrayList f23770c;

    /* JADX INFO: renamed from: a */
    public final void m7825a() {
        Log.d("SessionLifecycleService", "Broadcasting new session");
        g34 g34Var = (g34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33686k.get();
        c34 c34Var = ((h34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33688m.get()).f20340c;
        if (c34Var == null) {
            z62.m13366Y("currentSession");
            throw null;
        }
        lb5.m7910S(zp0.m13670b(g34Var.f19592e), null, null, new kt1(g34Var, c34Var, null), 3);
        ArrayList arrayList = new ArrayList(this.f23770c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m7826b((Messenger) obj);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7826b(Messenger messenger) {
        try {
            if (this.f23768a) {
                c34 c34Var = ((h34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33688m.get()).f20340c;
                if (c34Var != null) {
                    m7828d(messenger, c34Var.f15784a);
                    return;
                } else {
                    z62.m13366Y("currentSession");
                    throw null;
                }
            }
            ih1 ih1Var = (ih1) ((a34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33685j.get()).f81c.get();
            String str = ih1Var != null ? ih1Var.f21418a : null;
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (str != null) {
                m7828d(messenger, str);
            }
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to send session to client.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7827c() {
        try {
            ((h34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33688m.get()).m6209a();
            Log.d("SessionLifecycleService", "Generated new session.");
            m7825a();
            a34 a34Var = (a34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33685j.get();
            c34 c34Var = ((h34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33688m.get()).f20340c;
            wm0 wm0Var = null;
            if (c34Var == null) {
                z62.m13366Y("currentSession");
                throw null;
            }
            lb5.m7910S(zp0.m13670b(a34Var.f79a), null, null, new it1((Object) a34Var, (Object) c34Var.f15784a, wm0Var, (byte) 24), 3);
        } catch (IllegalStateException e) {
            Log.w("SessionLifecycleService", "Failed to generate new session.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7828d(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message messageObtain = Message.obtain(null, 3, 0, 0);
            messageObtain.setData(bundle);
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f23770c.remove(messenger);
        } catch (Exception e) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0100  */
    /* JADX WARN: Code duplicated, block: B:30:0x0108  */
    /* JADX WARN: Code duplicated, block: B:35:0x0117  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        i41 i41VarMo6663d;
        long jM3238Q;
        if (this.f23769b > message.getWhen()) {
            Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f23769b + '.');
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
                this.f23769b = message.getWhen();
                return;
            }
            if (i != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
                super.handleMessage(message);
                return;
            }
            ArrayList arrayList = this.f23770c;
            arrayList.add(message.replyTo);
            m7826b(message.replyTo);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + arrayList.size());
            return;
        }
        Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
        if (this.f23768a) {
            long when = message.getWhen() - this.f23769b;
            s34 s34Var = (s34) ((ws0) ((fh1) hg1.m6386c().m6389b(fh1.class))).f33683h.get();
            i41 i41VarMo6663d2 = s34Var.f29856a.mo6663d();
            if (i41VarMo6663d2 != null) {
                jM3238Q = i41VarMo6663d2.f21121a;
                if (!i41.m6650i(jM3238Q) || i41.m6649h(jM3238Q)) {
                    i41VarMo6663d = s34Var.f29857b.mo6663d();
                    if (i41VarMo6663d != null) {
                        jM3238Q = i41VarMo6663d.f21121a;
                        if (i41.m6650i(jM3238Q) || i41.m6649h(jM3238Q)) {
                            r50 r50Var = i41.f21117b;
                            jM3238Q = as4.m3238Q(30, m41.MINUTES);
                        }
                    } else {
                        r50 r50Var2 = i41.f21117b;
                        jM3238Q = as4.m3238Q(30, m41.MINUTES);
                    }
                }
            } else {
                i41VarMo6663d = s34Var.f29857b.mo6663d();
                if (i41VarMo6663d != null) {
                    jM3238Q = i41VarMo6663d.f21121a;
                    if (i41.m6650i(jM3238Q)) {
                        r50 r50Var3 = i41.f21117b;
                        jM3238Q = as4.m3238Q(30, m41.MINUTES);
                    } else {
                        r50 r50Var4 = i41.f21117b;
                        jM3238Q = as4.m3238Q(30, m41.MINUTES);
                    }
                } else {
                    r50 r50Var5 = i41.f21117b;
                    jM3238Q = as4.m3238Q(30, m41.MINUTES);
                }
            }
            if (when > i41.m6647f(jM3238Q)) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                m7827c();
            }
        } else {
            Log.d("SessionLifecycleService", "Cold start detected.");
            this.f23768a = true;
            m7827c();
        }
        this.f23769b = message.getWhen();
    }
}
