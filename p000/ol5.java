package p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ol5 implements rt1, st1 {

    /* JADX INFO: renamed from: a */
    public LinkedList f26856a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1074qk f26857b;

    /* JADX INFO: renamed from: c */
    public C0458al f26858c;

    /* JADX INFO: renamed from: d */
    public pq3 f26859d;

    /* JADX INFO: renamed from: e */
    public HashSet f26860e;

    /* JADX INFO: renamed from: f */
    public HashMap f26861f;

    /* JADX INFO: renamed from: g */
    public int f26862g;

    /* JADX INFO: renamed from: h */
    public xl5 f26863h;

    /* JADX INFO: renamed from: i */
    public boolean f26864i;

    /* JADX INFO: renamed from: j */
    public ArrayList f26865j;

    /* JADX INFO: renamed from: k */
    public lk0 f26866k;

    /* JADX INFO: renamed from: l */
    public int f26867l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ tt1 f26868m;

    /* JADX INFO: renamed from: a */
    public final void m9169a(lk0 lk0Var) {
        HashSet hashSet = this.f26860e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            xy4.m12778e();
        } else {
            if (AbstractC1356y5.m12927u(lk0Var, lk0.f24095i)) {
                this.f26857b.getEndpointPackageName();
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9170b(Status status) {
        y42.m12850W(this.f26868m.f31423m);
        m9171c(status, null, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m9171c(Status status, Exception exc, boolean z) {
        y42.m12850W(this.f26868m.f31423m);
        if ((status == null) == (exc == null)) {
            C1077qn.m9987m("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f26856a.iterator();
        while (it.hasNext()) {
            tl5 tl5Var = (tl5) it.next();
            if (!z || tl5Var.f31230a == 2) {
                if (status != null) {
                    tl5Var.mo4558c(status);
                } else {
                    tl5Var.mo4559d(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9172d() {
        LinkedList linkedList = this.f26856a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tl5 tl5Var = (tl5) arrayList.get(i);
            if (!this.f26857b.isConnected()) {
                return;
            }
            if (m9176h(tl5Var)) {
                linkedList.remove(tl5Var);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9173e() {
        tt1 tt1Var = this.f26868m;
        y42.m12850W(tt1Var.f31423m);
        this.f26866k = null;
        m9169a(lk0.f24095i);
        C0458al c0458al = this.f26858c;
        km5 km5Var = tt1Var.f31423m;
        if (this.f26864i) {
            km5Var.removeMessages(11, c0458al);
            km5Var.removeMessages(9, c0458al);
            this.f26864i = false;
        }
        Iterator it = this.f26861f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            xy4.m12778e();
        } else {
            m9172d();
            m9175g();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9174f(int i) {
        C0458al c0458al = this.f26858c;
        tt1 tt1Var = this.f26868m;
        km5 km5Var = tt1Var.f31423m;
        y42.m12850W(tt1Var.f31423m);
        this.f26866k = null;
        this.f26864i = true;
        String lastDisconnectMessage = this.f26857b.getLastDisconnectMessage();
        pq3 pq3Var = this.f26859d;
        pq3Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        pq3Var.m9618q(true, new Status(20, sb.toString(), null, null));
        km5Var.sendMessageDelayed(Message.obtain(km5Var, 9, c0458al), 5000L);
        km5Var.sendMessageDelayed(Message.obtain(km5Var, 11, c0458al), 120000L);
        ((SparseIntArray) tt1Var.f31417g.f35215b).clear();
        Iterator it = this.f26861f.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            xy4.m12778e();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m9175g() {
        C0458al c0458al = this.f26858c;
        tt1 tt1Var = this.f26868m;
        km5 km5Var = tt1Var.f31423m;
        km5Var.removeMessages(12, c0458al);
        km5Var.sendMessageDelayed(km5Var.obtainMessage(12, c0458al), tt1Var.f31411a);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m9176h(tl5 tl5Var) {
        ed1 ed1Var;
        if (tl5Var == null) {
            pq3 pq3Var = this.f26859d;
            InterfaceC1074qk interfaceC1074qk = this.f26857b;
            tl5Var.mo4561f(pq3Var, interfaceC1074qk.requiresSignIn());
            try {
                tl5Var.mo4560e(this);
                return true;
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                interfaceC1074qk.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        ed1[] ed1VarArrMo4557b = tl5Var.mo4557b(this);
        if (ed1VarArrMo4557b == null || ed1VarArrMo4557b.length == 0) {
            ed1Var = null;
            break;
        }
        ed1[] availableFeatures = this.f26857b.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new ed1[0];
        }
        C0805jo c0805jo = new C0805jo(availableFeatures.length);
        for (ed1 ed1Var2 : availableFeatures) {
            c0805jo.put(ed1Var2.f18013d, Long.valueOf(ed1Var2.m5091b()));
        }
        int length = ed1VarArrMo4557b.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ed1Var = null;
                break;
            }
            ed1Var = ed1VarArrMo4557b[i];
            Long l = (Long) c0805jo.get(ed1Var.f18013d);
            if (l == null || l.longValue() < ed1Var.m5091b()) {
                break;
            }
            i++;
        }
        if (ed1Var == null) {
            pq3 pq3Var2 = this.f26859d;
            InterfaceC1074qk interfaceC1074qk2 = this.f26857b;
            tl5Var.mo4561f(pq3Var2, interfaceC1074qk2.requiresSignIn());
            try {
                tl5Var.mo4560e(this);
                return true;
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                interfaceC1074qk2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f26857b.getClass().getName() + " could not execute call because it requires feature (" + ed1Var.f18013d + ", " + ed1Var.m5091b() + ").");
        if (!this.f26868m.f31424n || !tl5Var.mo4556a(this)) {
            tl5Var.mo4559d(new gv4(ed1Var));
            return true;
        }
        C0458al c0458al = this.f26858c;
        pl5 pl5Var = new pl5();
        pl5Var.f27738a = c0458al;
        pl5Var.f27739b = ed1Var;
        VarHandle.storeStoreFence();
        int iIndexOf = this.f26865j.indexOf(pl5Var);
        ArrayList arrayList = this.f26865j;
        if (iIndexOf >= 0) {
            pl5 pl5Var2 = (pl5) arrayList.get(iIndexOf);
            this.f26868m.f31423m.removeMessages(15, pl5Var2);
            km5 km5Var = this.f26868m.f31423m;
            km5Var.sendMessageDelayed(Message.obtain(km5Var, 15, pl5Var2), 5000L);
            return false;
        }
        arrayList.add(pl5Var);
        km5 km5Var2 = this.f26868m.f31423m;
        km5Var2.sendMessageDelayed(Message.obtain(km5Var2, 15, pl5Var), 5000L);
        km5 km5Var3 = this.f26868m.f31423m;
        km5Var3.sendMessageDelayed(Message.obtain(km5Var3, 16, pl5Var), 120000L);
        lk0 lk0Var = new lk0(2, null, null);
        m9177i(lk0Var);
        this.f26868m.m11136b(lk0Var, this.f26862g);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m9177i(lk0 lk0Var) {
        synchronized (tt1.f31409q) {
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m9178j() {
        tt1 tt1Var = this.f26868m;
        y42.m12850W(tt1Var.f31423m);
        InterfaceC1074qk interfaceC1074qk = this.f26857b;
        if (interfaceC1074qk.isConnected() || interfaceC1074qk.isConnecting()) {
            return;
        }
        try {
            yg3 yg3Var = tt1Var.f31417g;
            Context context = tt1Var.f31415e;
            SparseIntArray sparseIntArray = (SparseIntArray) yg3Var.f35215b;
            y42.m12854a0(context);
            int minApkVersion = interfaceC1074qk.getMinApkVersion();
            int iM10123b = ((SparseIntArray) yg3Var.f35215b).get(minApkVersion, -1);
            if (iM10123b == -1) {
                int i = 0;
                while (true) {
                    if (i >= sparseIntArray.size()) {
                        iM10123b = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i);
                    if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                        iM10123b = 0;
                        break;
                    }
                    i++;
                }
                if (iM10123b == -1) {
                    iM10123b = ((qt1) yg3Var.f35216c).m10123b(context, minApkVersion);
                }
                sparseIntArray.put(minApkVersion, iM10123b);
            }
            if (iM10123b != 0) {
                lk0 lk0Var = new lk0(iM10123b, null, null);
                Log.w("GoogleApiManager", "The service for " + interfaceC1074qk.getClass().getName() + " is not available: " + lk0Var.toString());
                m9180l(lk0Var, null);
                return;
            }
            C0458al c0458al = this.f26858c;
            bt0 bt0Var = new bt0();
            bt0Var.f15569f = tt1Var;
            bt0Var.f15567d = null;
            bt0Var.f15568e = null;
            bt0Var.f15564a = false;
            bt0Var.f15565b = interfaceC1074qk;
            bt0Var.f15566c = c0458al;
            VarHandle.storeStoreFence();
            if (interfaceC1074qk.requiresSignIn()) {
                xl5 xl5Var = this.f26863h;
                y42.m12854a0(xl5Var);
                km5 km5Var = xl5Var.f34394k;
                C0602e8 c0602e8 = xl5Var.f34397n;
                p64 p64Var = xl5Var.f34398o;
                if (p64Var != null) {
                    p64Var.disconnect();
                }
                c0602e8.f17867a = Integer.valueOf(System.identityHashCode(xl5Var));
                xl5Var.f34398o = (p64) xl5Var.f34395l.mo6631i(xl5Var.f34393j, km5Var.getLooper(), c0602e8, (q64) c0602e8.f17872f, xl5Var, xl5Var);
                xl5Var.f34399p = bt0Var;
                Set set = xl5Var.f34396m;
                if (set == null || set.isEmpty()) {
                    RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 9);
                    runnableC1029pc.f27515b = xl5Var;
                    VarHandle.storeStoreFence();
                    km5Var.post(runnableC1029pc);
                } else {
                    p64 p64Var2 = xl5Var.f34398o;
                    p64Var2.getClass();
                    js1 js1Var = new js1();
                    js1Var.f22555a = p64Var2;
                    VarHandle.storeStoreFence();
                    p64Var2.connect(js1Var);
                }
            }
            try {
                interfaceC1074qk.connect(bt0Var);
            } catch (SecurityException e) {
                m9180l(new lk0(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            m9180l(new lk0(10, null, null), e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m9179k(tl5 tl5Var) {
        LinkedList linkedList = this.f26856a;
        y42.m12850W(this.f26868m.f31423m);
        if (this.f26857b.isConnected()) {
            if (m9176h(tl5Var)) {
                m9175g();
                return;
            } else {
                linkedList.add(tl5Var);
                return;
            }
        }
        linkedList.add(tl5Var);
        lk0 lk0Var = this.f26866k;
        if (lk0Var == null || lk0Var.f24097e == 0 || lk0Var.f24098f == null) {
            m9178j();
        } else {
            m9180l(lk0Var, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9180l(lk0 lk0Var, RuntimeException runtimeException) {
        p64 p64Var;
        y42.m12850W(this.f26868m.f31423m);
        xl5 xl5Var = this.f26863h;
        if (xl5Var != null && (p64Var = xl5Var.f34398o) != null) {
            p64Var.disconnect();
        }
        y42.m12850W(this.f26868m.f31423m);
        this.f26866k = null;
        ((SparseIntArray) this.f26868m.f31417g.f35215b).clear();
        m9169a(lk0Var);
        if ((this.f26857b instanceof im5) && lk0Var.f24097e != 24) {
            tt1 tt1Var = this.f26868m;
            tt1Var.f31412b = true;
            km5 km5Var = tt1Var.f31423m;
            km5Var.sendMessageDelayed(km5Var.obtainMessage(19), 300000L);
        }
        if (lk0Var.f24097e == 4) {
            m9170b(tt1.f31408p);
            return;
        }
        if (this.f26856a.isEmpty()) {
            this.f26866k = lk0Var;
            return;
        }
        tt1 tt1Var2 = this.f26868m;
        if (runtimeException != null) {
            y42.m12850W(tt1Var2.f31423m);
            m9171c(null, runtimeException, false);
            return;
        }
        boolean z = tt1Var2.f31424n;
        C0458al c0458al = this.f26858c;
        if (!z) {
            m9170b(tt1.m11133c(c0458al, lk0Var));
            return;
        }
        m9171c(tt1.m11133c(c0458al, lk0Var), null, true);
        if (this.f26856a.isEmpty()) {
            return;
        }
        m9177i(lk0Var);
        if (this.f26868m.m11136b(lk0Var, this.f26862g)) {
            return;
        }
        if (lk0Var.f24097e == 18) {
            this.f26864i = true;
        }
        if (!this.f26864i) {
            m9170b(tt1.m11133c(this.f26858c, lk0Var));
            return;
        }
        tt1 tt1Var3 = this.f26868m;
        C0458al c0458al2 = this.f26858c;
        km5 km5Var2 = tt1Var3.f31423m;
        km5Var2.sendMessageDelayed(Message.obtain(km5Var2, 9, c0458al2), 5000L);
    }

    /* JADX INFO: renamed from: m */
    public final void m9181m(lk0 lk0Var) {
        y42.m12850W(this.f26868m.f31423m);
        InterfaceC1074qk interfaceC1074qk = this.f26857b;
        interfaceC1074qk.disconnect("onSignInFailed for " + interfaceC1074qk.getClass().getName() + " with " + String.valueOf(lk0Var));
        m9180l(lk0Var, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m9182n() {
        InterfaceC1074qk interfaceC1074qk = this.f26857b;
        y42.m12850W(this.f26868m.f31423m);
        Status status = tt1.f31407o;
        m9170b(status);
        this.f26859d.m9618q(false, status);
        for (gm2 gm2Var : (gm2[]) this.f26861f.keySet().toArray(new gm2[0])) {
            li4 li4Var = new li4();
            em5 em5Var = new em5(4);
            em5Var.f18263b = li4Var;
            em5Var.f18264c = gm2Var;
            VarHandle.storeStoreFence();
            m9179k(em5Var);
        }
        m9169a(new lk0(4, null, null));
        if (interfaceC1074qk.isConnected()) {
            wd3 wd3Var = new wd3((byte) 24);
            wd3Var.f33259b = this;
            VarHandle.storeStoreFence();
            interfaceC1074qk.onUserSignOut(wd3Var);
        }
    }

    @Override // p000.rt1
    public final void onConnected() {
        tt1 tt1Var = this.f26868m;
        Looper looperMyLooper = Looper.myLooper();
        km5 km5Var = tt1Var.f31423m;
        if (looperMyLooper == km5Var.getLooper()) {
            m9173e();
            return;
        }
        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 7);
        runnableC1029pc.f27515b = this;
        VarHandle.storeStoreFence();
        km5Var.post(runnableC1029pc);
    }

    @Override // p000.st1
    public final void onConnectionFailed(lk0 lk0Var) {
        m9180l(lk0Var, null);
    }

    @Override // p000.rt1
    public final void onConnectionSuspended(int i) {
        tt1 tt1Var = this.f26868m;
        Looper looperMyLooper = Looper.myLooper();
        km5 km5Var = tt1Var.f31423m;
        if (looperMyLooper == km5Var.getLooper()) {
            m9174f(i);
            return;
        }
        q60 q60Var = new q60((byte) 2);
        q60Var.f28237c = this;
        q60Var.f28236b = i;
        VarHandle.storeStoreFence();
        km5Var.post(q60Var);
    }
}
