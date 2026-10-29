package p000;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.X509Util;
import org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tt2 implements o03, InterfaceC0618en, ku3, ai3, sz4, j16, rg6, k76 {

    /* JADX INFO: renamed from: e */
    public static volatile tt2 f31425e;

    /* JADX INFO: renamed from: f */
    public static tt2 f31426f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31427a;

    /* JADX INFO: renamed from: b */
    public Object f31428b;

    /* JADX INFO: renamed from: c */
    public Object f31429c;

    /* JADX INFO: renamed from: d */
    public Object f31430d;

    public tt2(byte b) throws NoSuchAlgorithmException, CertificateException {
        this.f31427a = b;
        switch (b) {
            case 19:
                this.f31428b = CertificateFactory.getInstance("X.509");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
                    this.f31429c = keyStore;
                    try {
                        keyStore.load(null);
                        break;
                    } catch (IOException unused) {
                    }
                    this.f31430d = new File(System.getenv("ANDROID_ROOT") + "/etc/security/cacerts");
                    break;
                } catch (KeyStoreException unused2) {
                }
                ld5 ld5Var = new ld5((byte) 2);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.security.action.KEYCHAIN_CHANGED");
                intentFilter.addAction("android.security.action.KEY_ACCESS_CHANGED");
                intentFilter.addAction("android.security.action.TRUST_STORE_CHANGED");
                x06.f33904a.registerReceiver(ld5Var, intentFilter, null, null, 0);
                break;
            default:
                this.f31428b = new AtomicReference(d24.f16746d);
                this.f31429c = new Object();
                break;
        }
    }

    /* JADX INFO: renamed from: E */
    public static tt2 m11139E(oa6 oa6Var) {
        tt2 tt2Var = f31426f;
        if (tt2Var != null) {
            return tt2Var;
        }
        Context context = oa6Var.f26509a;
        tt2 tt2Var2 = new tt2((byte) 27, false);
        tt2Var2.f31430d = new AtomicLong(-1L);
        si4 si4Var = new si4();
        si4Var.f30323b = "measurement:api";
        VarHandle.storeStoreFence();
        tt2Var2.f31429c = new hm5(context, hm5.f20705i, si4Var, nt1.f26079b);
        tt2Var2.f31428b = oa6Var;
        VarHandle.storeStoreFence();
        f31426f = tt2Var2;
        return tt2Var2;
    }

    /* JADX INFO: renamed from: H */
    public static tt2 m11140H() {
        if (f31425e == null) {
            synchronized (X509Util.sLock) {
                try {
                    if (f31425e == null) {
                        f31425e = new tt2((byte) 19);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31425e;
    }

    /* JADX INFO: renamed from: s */
    public static Message m11141s(ArrayList arrayList, int i) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (((Message) obj2).what == i) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* JADX INFO: renamed from: A */
    public void m11142A(int i) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f31430d).drainTo(arrayList);
        arrayList.add(Message.obtain(null, i, 0, 0));
        lb5.m7910S(zp0.m13670b((ro0) this.f31428b), null, null, new it1((Object) this, (Object) arrayList, (wm0) null, (byte) 25), 3);
    }

    /* JADX INFO: renamed from: B */
    public void m11143B(Object obj) {
        long jM9110p = oh6.m9110p();
        if (jM9110p == km4.f23241a) {
            this.f31430d = obj;
            return;
        }
        synchronized (this.f31429c) {
            fm4 fm4Var = (fm4) ((AtomicReference) this.f31428b).get();
            int iM5745a = fm4Var.m5745a(jM9110p);
            if (iM5745a < 0) {
                ((AtomicReference) this.f31428b).set(fm4Var.m5746b(jM9110p, obj));
            } else {
                fm4Var.f19126c[iM5745a] = obj;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m11144C(Object obj, Object obj2) {
        ((a44) obj).mo44a((String) this.f31428b, (jc2) this.f31429c).setValue(obj2);
    }

    /* JADX INFO: renamed from: D */
    public void m11145D() {
        lw2 lw2Var = (lw2) this.f31428b;
        String str = (String) this.f31429c;
        List list = (List) lw2Var.m8136k(str);
        if (list != null) {
            list.remove((wp1) this.f31430d);
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        lw2Var.m8138m(str, list);
    }

    /* JADX INFO: renamed from: F */
    public void m11146F() {
        Log.i("HsdpLoadingPanel", "try to hideLoading");
        View view = (View) this.f31430d;
        if (view == null) {
            return;
        }
        Activity activity = (Activity) this.f31428b;
        ar1 ar1Var = new ar1((byte) 11);
        ar1Var.f14798b = this;
        ar1Var.f14799c = view;
        VarHandle.storeStoreFence();
        activity.runOnUiThread(ar1Var);
    }

    /* JADX INFO: renamed from: G */
    public synchronized void m11147G(int i, int i2, long j, long j2) {
        ((oa6) this.f31428b).f26519k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f31430d;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        nr6 nr6VarM6447e = ((hm5) this.f31429c).m6447e(new ri4(Arrays.asList(new xs2(36301, i, 0, j, j2, null, null, 0, i2)), 0));
        vv1 vv1Var = new vv1();
        vv1Var.f32887b = this;
        vv1Var.f32886a = jElapsedRealtime;
        VarHandle.storeStoreFence();
        nr6VarM6447e.getClass();
        nr6VarM6447e.m8819c(mi4.f24958a, vv1Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:6:0x0029, B:8:0x0031, B:10:0x0039, B:13:0x003f, B:14:0x0052, B:16:0x0058), top: B:33:0x0029 }] */
    /* JADX INFO: renamed from: I */
    public void m11148I(int i, String str) {
        AtomicInteger atomicInteger = (AtomicInteger) this.f31430d;
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.f31428b;
        reentrantReadWriteLock.readLock().lock();
        try {
            HashMap map = (HashMap) this.f31429c;
            ym5 ym5Var = (ym5) map.get(str);
            if (ym5Var != null) {
                if (!ym5Var.m13175a(i)) {
                    atomicInteger.incrementAndGet();
                }
                reentrantReadWriteLock.readLock().unlock();
                return;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                ym5 ym5Var2 = (ym5) map.get(str);
                if (ym5Var2 != null) {
                    if (!ym5Var2.m13175a(i)) {
                        atomicInteger.incrementAndGet();
                    }
                } else if (map.size() >= 256) {
                    atomicInteger.incrementAndGet();
                } else {
                    ym5Var2 = new ym5();
                    ym5Var2.f35337a = new ArrayList(1);
                    VarHandle.storeStoreFence();
                    map.put(str, ym5Var2);
                    if (!ym5Var2.m13175a(i)) {
                        atomicInteger.incrementAndGet();
                    }
                }
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m11149J() {
        return (((Activity) this.f31428b).getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: a */
    public i43 m11150a() {
        UUID uuid = (UUID) this.f31428b;
        q25 q25Var = (q25) this.f31429c;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f31430d;
        i43 i43Var = new i43();
        i43Var.f21124a = uuid;
        i43Var.f21125b = q25Var;
        i43Var.f21126c = linkedHashSet;
        jl0 jl0Var = q25Var.f28171j;
        boolean z = !jl0Var.f22390i.isEmpty() || jl0Var.f22386e || jl0Var.f22384c || jl0Var.f22385d;
        q25 q25Var2 = (q25) this.f31429c;
        if (q25Var2.f28178q) {
            if (z) {
                C1077qn.m9987m("Expedited jobs only support network and storage constraints");
                return null;
            }
            if (q25Var2.f28168g > 0) {
                C1077qn.m9987m("Expedited jobs cannot be delayed");
                return null;
            }
        }
        String str = q25Var2.f28185x;
        if (str == null) {
            List listM6353s0 = hd4.m6353s0(q25Var2.f28164c, new String[]{"."}, 6);
            String strM6358x0 = listM6353s0.size() == 1 ? (String) listM6353s0.get(0) : (String) hb0.m6306R0(listM6353s0);
            if (strM6358x0.length() > 127) {
                strM6358x0 = hd4.m6358x0(127, strM6358x0);
            }
            q25Var2.f28185x = strM6358x0;
        } else if (str.length() > 127) {
            ((q25) this.f31429c).f28185x = hd4.m6358x0(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f31428b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        q25 q25Var3 = (q25) this.f31429c;
        String str2 = q25Var3.f28164c;
        f25 f25Var = q25Var3.f28163b;
        String str3 = q25Var3.f28165d;
        zs0 zs0Var = new zs0(q25Var3.f28166e);
        zs0 zs0Var2 = new zs0(q25Var3.f28167f);
        long j = q25Var3.f28168g;
        long j2 = q25Var3.f28169h;
        long j3 = q25Var3.f28170i;
        jl0 jl0Var2 = q25Var3.f28171j;
        jl0 jl0Var3 = new jl0();
        jl0Var3.f22384c = jl0Var2.f22384c;
        jl0Var3.f22385d = jl0Var2.f22385d;
        jl0Var3.f22383b = jl0Var2.f22383b;
        jl0Var3.f22382a = jl0Var2.f22382a;
        jl0Var3.f22386e = jl0Var2.f22386e;
        jl0Var3.f22387f = jl0Var2.f22387f;
        jl0Var3.f22390i = jl0Var2.f22390i;
        jl0Var3.f22388g = jl0Var2.f22388g;
        jl0Var3.f22389h = jl0Var2.f22389h;
        this.f31429c = new q25(string, f25Var, str2, str3, zs0Var, zs0Var2, j, j2, j3, jl0Var3, q25Var3.f28172k, q25Var3.f28173l, q25Var3.f28174m, q25Var3.f28175n, q25Var3.f28176o, q25Var3.f28177p, q25Var3.f28178q, q25Var3.f28179r, q25Var3.f28180s, q25Var3.f28182u, q25Var3.f28183v, q25Var3.f28184w, q25Var3.f28185x, q25Var3.f28186y, 524288);
        return i43Var;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: b */
    public void mo4826b(int i, Object obj) {
        kv2 kv2Var = (kv2) this.f31428b;
        kv2Var.m7633a(5);
        kv2Var.m7633a(i);
        ((cw2) this.f31429c).m4200a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[PHI: r8
  0x0033: PHI (r8v9 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0018, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    @Override // p000.rg6
    /* JADX INFO: renamed from: c */
    public void mo3676c(int i, Throwable th, byte[] bArr) {
        bh6 bh6Var;
        mg6 mg6Var = (mg6) this.f31428b;
        mg6Var.mo5038t();
        jl6 jl6Var = (jl6) this.f31430d;
        if (i == 200 || i == 204) {
            if (th == null) {
                d76 d76Var = ((oa6) mg6Var.f36084a).f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16831L.m12505b(Long.valueOf(jl6Var.f22406d), "[sgtm] Upload succeeded for row_id");
                bh6Var = bh6.f15278c;
            } else {
                d76 d76Var2 = ((oa6) mg6Var.f36084a).f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16838m.m12507d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(jl6Var.f22406d), Integer.valueOf(i), th);
                if (Arrays.asList(((String) e56.f17819u.m4379a(null)).split(",")).contains(String.valueOf(i))) {
                    bh6Var = bh6.f15280e;
                } else {
                    bh6Var = bh6.f15279d;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                d76 d76Var3 = ((oa6) mg6Var.f36084a).f26514f;
                oa6.m9016l(d76Var3);
                d76Var3.f16831L.m12505b(Long.valueOf(jl6Var.f22406d), "[sgtm] Upload succeeded for row_id");
                bh6Var = bh6.f15278c;
            } else {
                d76 d76Var4 = ((oa6) mg6Var.f36084a).f26514f;
                oa6.m9016l(d76Var4);
                d76Var4.f16838m.m12507d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(jl6Var.f22406d), Integer.valueOf(i), th);
                if (Arrays.asList(((String) e56.f17819u.m4379a(null)).split(",")).contains(String.valueOf(i))) {
                    bh6Var = bh6.f15280e;
                } else {
                    bh6Var = bh6.f15279d;
                }
            }
        } else {
            d76 d76Var5 = ((oa6) mg6Var.f36084a).f26514f;
            oa6.m9016l(d76Var5);
            d76Var5.f16838m.m12507d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(jl6Var.f22406d), Integer.valueOf(i), th);
            if (Arrays.asList(((String) e56.f17819u.m4379a(null)).split(",")).contains(String.valueOf(i))) {
                bh6Var = bh6.f15280e;
            } else {
                bh6Var = bh6.f15279d;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.f31429c;
        oj6 oj6VarM9027n = ((oa6) mg6Var.f36084a).m9027n();
        long j = jl6Var.f22406d;
        ko5 ko5Var = new ko5(j, bh6Var.f15282a, jl6Var.f22411i);
        oj6VarM9027n.mo5038t();
        oj6VarM9027n.m9741u();
        cp6 cp6VarM9142L = oj6VarM9027n.m9142L(true);
        yn3 yn3Var = new yn3((byte) 21);
        yn3Var.f35360b = oj6VarM9027n;
        yn3Var.f35361c = cp6VarM9142L;
        yn3Var.f35362d = ko5Var;
        VarHandle.storeStoreFence();
        oj6VarM9027n.m9140J(yn3Var);
        d76 d76Var6 = ((oa6) mg6Var.f36084a).f26514f;
        oa6.m9016l(d76Var6);
        d76Var6.f16831L.m12506c("[sgtm] Updated status for row_id", Long.valueOf(j), bh6Var);
        synchronized (atomicReference) {
            atomicReference.set(bh6Var);
            atomicReference.notifyAll();
        }
    }

    @Override // p000.InterfaceC0618en
    public void clear() {
        ((kv2) this.f31428b).m7633a(4);
    }

    public Object clone() {
        switch (this.f31427a) {
            case 18:
                en5 en5VarM5210a = ((en5) this.f31428b).clone();
                int i = 0;
                tt2 tt2Var = new tt2((byte) 18, 0 == true ? 1 : 0);
                tt2Var.f31428b = en5VarM5210a;
                tt2Var.f31429c = en5VarM5210a.clone();
                tt2Var.f31430d = new ArrayList();
                ArrayList arrayList = (ArrayList) this.f31430d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ArrayList) tt2Var.f31430d).add(((en5) obj).clone());
                }
                return tt2Var;
            default:
                return super.clone();
        }
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: d */
    public void mo4827d(Object obj) {
        ((kv2) this.f31428b).m7633a(1);
        ((cw2) this.f31429c).m4200a(obj);
    }

    @Override // p000.k76
    /* JADX INFO: renamed from: e */
    public void mo7423e(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((qm6) this.f31430d).m9980x(true, i, th, bArr, (String) this.f31428b, (ArrayList) this.f31429c);
    }

    @Override // p000.j16
    /* JADX INFO: renamed from: f */
    public void mo3680f() {
        switch (this.f31427a) {
            case 25:
                r06 r06Var = (r06) this.f31428b;
                i16 i16Var = r06Var.f28940d;
                if (i16Var.f21022f.compareAndSet(5, 4)) {
                    ByteBuffer byteBuffer = (ByteBuffer) this.f31430d;
                    r06Var.f28937a.onReadCompleted(i16Var, (UrlResponseInfo) this.f31429c, byteBuffer);
                }
                break;
            default:
                r06 r06Var2 = (r06) this.f31428b;
                r06Var2.f28937a.onRedirectReceived(r06Var2.f28940d, (m26) this.f31429c, (String) this.f31430d);
                break;
        }
    }

    @Override // p000.sz4
    /* JADX INFO: renamed from: g */
    public List mo5608g() {
        return (ArrayList) this.f31428b;
    }

    @Override // p000.ai3
    public Object get() {
        switch (this.f31427a) {
            case 9:
                Context context = (Context) ((ai3) this.f31428b).get();
                pt3 pt3Var = (pt3) ((ai3) this.f31429c).get();
                C1269vu c1269vu = (C1269vu) ((r50) this.f31430d).get();
                jp0 jp0Var = new jp0((byte) 24, false);
                jp0Var.f22481b = context;
                jp0Var.f22482c = pt3Var;
                jp0Var.f22483d = c1269vu;
                VarHandle.storeStoreFence();
                return jp0Var;
            case 13:
                long jM9110p = oh6.m9110p();
                if (jM9110p == km4.f23241a) {
                    return this.f31430d;
                }
                fm4 fm4Var = (fm4) ((AtomicReference) this.f31428b).get();
                int iM5745a = fm4Var.m5745a(jM9110p);
                if (iM5745a >= 0) {
                    return fm4Var.f19126c[iM5745a];
                }
                return null;
            default:
                r50 r50Var = new r50((byte) 22);
                f70 f70Var = new f70((byte) 21);
                qw0 qw0Var = (qw0) ((C1122rv) this.f31428b).get();
                wo5 wo5Var = (wo5) ((lg0) this.f31429c).get();
                C1283w7 c1283w7 = (C1283w7) ((C1283w7) this.f31430d).get();
                mp4 mp4Var = new mp4();
                mp4Var.f25115a = r50Var;
                mp4Var.f25116b = f70Var;
                mp4Var.f25117c = qw0Var;
                mp4Var.f25118d = wo5Var;
                Executor executor = (Executor) c1283w7.f33127c;
                RunnableC1054q0 runnableC1054q0 = new RunnableC1054q0((byte) 17);
                runnableC1054q0.f28115b = c1283w7;
                VarHandle.storeStoreFence();
                executor.execute(runnableC1054q0);
                VarHandle.storeStoreFence();
                return mp4Var;
        }
    }

    @Override // p000.sz4
    public Long getMaxTimePerTaskInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.f31430d).getMaxTimePerTaskInUiThreadMillis();
    }

    @Override // p000.sz4
    public Long getTotalTimeInUiThreadMillis() {
        return ((WebViewStartUpResultBoundaryInterface) this.f31430d).getTotalTimeInUiThreadMillis();
    }

    @Override // p000.o03
    /* JADX INFO: renamed from: h */
    public boolean mo6232h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f31428b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: i */
    public void mo4829i() {
        ((kv2) this.f31428b).m7633a(8);
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: j */
    public void mo4830j(int i, Object obj) {
        kv2 kv2Var = (kv2) this.f31428b;
        kv2Var.m7633a(6);
        kv2Var.m7633a(i);
        ((cw2) this.f31429c).m4200a(obj);
    }

    /* JADX INFO: renamed from: k */
    public gs3 m11151k() {
        u50 u50VarM7410a;
        if (((xr3) this.f31428b) == null) {
            xy4.m12788q("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.f31429c;
        if (bigInteger == null) {
            xy4.m12788q("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        xr3 xr3Var = (xr3) this.f31428b;
        int i = xr3Var.f34564a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(zi4.m13618r(iBitLength, i, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (xr3Var.mo5593a() && ((Integer) this.f31430d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((xr3) this.f31428b).mo5593a() && ((Integer) this.f31430d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        wr3 wr3Var = ((xr3) this.f31428b).f34566c;
        if (wr3Var == wr3.f33661e) {
            u50VarM7410a = k63.f22941a;
        } else if (wr3Var == wr3.f33660d || wr3Var == wr3.f33659c) {
            u50VarM7410a = k63.m7410a(((Integer) this.f31430d).intValue());
        } else {
            if (wr3Var != wr3.f33658b) {
                wb1.m12197q(((xr3) this.f31428b).f34566c, "Unknown RsaSsaPkcs1Parameters.Variant: ");
                return null;
            }
            u50VarM7410a = k63.m7411b(((Integer) this.f31430d).intValue());
        }
        xr3 xr3Var2 = (xr3) this.f31428b;
        BigInteger bigInteger2 = (BigInteger) this.f31429c;
        Integer num = (Integer) this.f31430d;
        gs3 gs3Var = new gs3();
        gs3Var.f20093u = xr3Var2;
        gs3Var.f20094v = bigInteger2;
        gs3Var.f20095w = u50VarM7410a;
        gs3Var.f20096x = num;
        VarHandle.storeStoreFence();
        return gs3Var;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: m */
    public void mo4831m(int i, int i2, int i3) {
        kv2 kv2Var = (kv2) this.f31428b;
        kv2Var.m7633a(3);
        kv2Var.m7633a(i);
        kv2Var.m7633a(i2);
        kv2Var.m7633a(i3);
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: n */
    public Object mo4832n() {
        return this.f31430d;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: o */
    public void mo4833o(int i, int i2) {
        kv2 kv2Var = (kv2) this.f31428b;
        kv2Var.m7633a(2);
        kv2Var.m7633a(i);
        kv2Var.m7633a(i2);
    }

    @Override // p000.sz4
    /* JADX INFO: renamed from: p */
    public List mo5610p() {
        return (ArrayList) this.f31429c;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: q */
    public void mo4834q(mq1 mq1Var, Object obj) {
        ((kv2) this.f31428b).m7633a(7);
        cw2 cw2Var = (cw2) this.f31429c;
        cw2Var.m4200a(mq1Var);
        cw2Var.m4200a(obj);
    }

    /* JADX INFO: renamed from: r */
    public zs3 m11152r() {
        u50 u50VarM7410a;
        if (((rs3) this.f31428b) == null) {
            xy4.m12788q("Cannot build without parameters");
            return null;
        }
        BigInteger bigInteger = (BigInteger) this.f31429c;
        if (bigInteger == null) {
            xy4.m12788q("Cannot build without modulus");
            return null;
        }
        int iBitLength = bigInteger.bitLength();
        rs3 rs3Var = (rs3) this.f31428b;
        int i = rs3Var.f29582a;
        if (iBitLength != i) {
            throw new GeneralSecurityException(zi4.m13618r(iBitLength, i, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (rs3Var.mo5593a() && ((Integer) this.f31430d) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((rs3) this.f31428b).mo5593a() && ((Integer) this.f31430d) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        qs3 qs3Var = ((rs3) this.f31428b).f29584c;
        if (qs3Var == qs3.f28764e) {
            u50VarM7410a = k63.f22941a;
        } else if (qs3Var == qs3.f28763d || qs3Var == qs3.f28762c) {
            u50VarM7410a = k63.m7410a(((Integer) this.f31430d).intValue());
        } else {
            if (qs3Var != qs3.f28761b) {
                wb1.m12197q(((rs3) this.f31428b).f29584c, "Unknown RsaSsaPssParameters.Variant: ");
                return null;
            }
            u50VarM7410a = k63.m7411b(((Integer) this.f31430d).intValue());
        }
        rs3 rs3Var2 = (rs3) this.f31428b;
        BigInteger bigInteger2 = (BigInteger) this.f31429c;
        Integer num = (Integer) this.f31430d;
        zs3 zs3Var = new zs3();
        zs3Var.f36342u = rs3Var2;
        zs3Var.f36343v = bigInteger2;
        zs3Var.f36344w = u50VarM7410a;
        zs3Var.f36345x = num;
        VarHandle.storeStoreFence();
        return zs3Var;
    }

    @Override // p000.o03
    public void shutdown() {
        ((ConnectivityManager) this.f31428b).unregisterNetworkCallback((qk3) this.f31430d);
    }

    /* JADX INFO: renamed from: t */
    public Object m11153t(Object obj, ic2 ic2Var) {
        Object value = ((a44) obj).mo44a((String) this.f31428b, (jc2) this.f31429c).getValue();
        return value == null ? this.f31430d : value;
    }

    @Override // p000.InterfaceC0618en
    /* JADX INFO: renamed from: u */
    public void mo4835u() {
        ((kv2) this.f31428b).m7633a(0);
    }

    /* JADX INFO: renamed from: v */
    public boolean m11154v() {
        if (((is4) this.f31428b).getValue() != this.f31430d) {
            return true;
        }
        tt2 tt2Var = (tt2) this.f31429c;
        return tt2Var != null && tt2Var.m11154v();
    }

    /* JADX INFO: renamed from: w */
    public void m11155w(Network network, boolean z) {
        boolean z2;
        boolean z3 = false;
        for (Network network2 : ((ConnectivityManager) this.f31428b).getAllNetworks()) {
            if (z62.m13387o(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f31428b).getNetworkCapabilities(network2);
                z2 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z2) {
                z3 = true;
                break;
            }
        }
        fg4 fg4Var = (fg4) this.f31429c;
        synchronized (fg4Var) {
            try {
                if (((lk3) fg4Var.f18964a.get()) != null) {
                    fg4Var.f18968e = z3;
                } else {
                    fg4Var.m5707b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m11156x(InterfaceC0618en interfaceC0618en, om3 om3Var) {
        Exception e;
        int i;
        kv2 kv2Var = (kv2) this.f31428b;
        int i2 = kv2Var.f23538b;
        cw2 cw2Var = (cw2) this.f31429c;
        cw2 cw2Var2 = new cw2();
        interfaceC0618en.getClass();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i3 + 1;
            try {
                try {
                    switch (kv2Var.m7635c(i3)) {
                        case 0:
                            interfaceC0618en.mo4835u();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            interfaceC0618en.mo4827d(cw2Var.m4206g(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            interfaceC0618en.mo4833o(kv2Var.m7635c(i5), kv2Var.m7635c(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    interfaceC0618en.mo4831m(kv2Var.m7635c(i5), kv2Var.m7635c(i8), kv2Var.m7635c(i9));
                                } catch (Exception e2) {
                                    e = e2;
                                    i3 = i9;
                                    rh0 rh0Var = new rh0(e);
                                    rh0Var.f29279a = cw2Var;
                                    rh0Var.f29280b = cw2Var2;
                                    rh0Var.f29281c = kv2Var;
                                    rh0Var.f29282d = i3 - 1;
                                    VarHandle.storeStoreFence();
                                    throw rh0Var;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            interfaceC0618en.clear();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            interfaceC0618en.mo4826b(kv2Var.m7635c(i5), cw2Var.m4206g(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                interfaceC0618en.mo4830j(kv2Var.m7635c(i5), cw2Var.m4206g(i4));
                                i4 = i;
                            } catch (Exception e4) {
                                e = e4;
                                rh0 rh0Var2 = new rh0(e);
                                rh0Var2.f29279a = cw2Var;
                                rh0Var2.f29280b = cw2Var2;
                                rh0Var2.f29281c = kv2Var;
                                rh0Var2.f29282d = i3 - 1;
                                VarHandle.storeStoreFence();
                                throw rh0Var2;
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objM4206g = cw2Var.m4206g(i4);
                            as4.m3259r(2, objM4206g);
                            i4 += 2;
                            interfaceC0618en.mo4834q((mq1) objM4206g, cw2Var.m4206g(i10));
                            i3 = i5;
                            break;
                        case 8:
                            Object objMo4832n = interfaceC0618en.mo4832n();
                            if (objMo4832n instanceof ph0) {
                                ph0 ph0Var = (ph0) objMo4832n;
                                if (om3Var.f26885f.m11671k(ph0Var)) {
                                    ph0Var.mo3603d();
                                }
                            }
                            cw2Var2.m4200a(objMo4832n);
                            interfaceC0618en.mo4829i();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Throwable th) {
                    interfaceC0618en.mo5208l();
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
                i3 = i5;
            }
        }
        if (i4 != cw2Var.f16533b) {
            qi0.m9889a("Applier operation size mismatch");
        }
        cw2Var.m4203d();
        kv2Var.f23538b = 0;
        interfaceC0618en.mo5208l();
    }

    /* JADX INFO: renamed from: y */
    public void m11157y(ek2 ek2Var) {
        v24 v24Var = (v24) this.f31430d;
        if (v24Var != null) {
            v24Var.run();
        }
        ok2 ok2Var = (ok2) this.f31428b;
        v24 v24Var2 = new v24();
        v24Var2.f32348a = ok2Var;
        v24Var2.f32349b = ek2Var;
        VarHandle.storeStoreFence();
        this.f31430d = v24Var2;
        ((Handler) this.f31429c).postAtFrontOfQueue(v24Var2);
    }

    /* JADX INFO: renamed from: z */
    public void m11158z(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f31430d;
        if (!linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
    }

    public tt2(qm6 qm6Var, String str, ArrayList arrayList) {
        this.f31427a = (byte) 29;
        this.f31428b = str;
        this.f31429c = arrayList;
        this.f31430d = qm6Var;
    }

    public /* synthetic */ tt2(byte b, boolean z) {
        this.f31427a = b;
    }

    public tt2(Class cls) {
        this.f31427a = (byte) 2;
        this.f31428b = UUID.randomUUID();
        this.f31429c = new q25(((UUID) this.f31428b).toString(), (f25) null, cls.getName(), (String) null, (zs0) null, (zs0) null, 0L, 0L, 0L, (jl0) null, 0, (EnumC0887lw) null, 0L, 0L, 0L, 0L, false, (f63) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(fq2.m5779K(1));
        linkedHashSet.add(strArr[0]);
        this.f31430d = linkedHashSet;
    }

    public tt2(Method method, Method method2, Method method3) {
        this.f31427a = (byte) 0;
        this.f31428b = method;
        this.f31429c = method2;
        this.f31430d = method3;
    }
}
