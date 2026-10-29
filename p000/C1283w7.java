package p000;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: w7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1283w7 implements t24, ai3, bx4, dr6, wy5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33125a;

    /* JADX INFO: renamed from: b */
    public Object f33126b;

    /* JADX INFO: renamed from: c */
    public Object f33127c;

    /* JADX INFO: renamed from: d */
    public Object f33128d;

    /* JADX INFO: renamed from: e */
    public Object f33129e;

    public C1283w7(r24 r24Var) {
        this.f33125a = (byte) 18;
        this.f33127c = new HashMap(r24Var.f28970a);
        this.f33128d = new HashMap(r24Var.f28971b);
        this.f33129e = new HashMap(r24Var.f28972c);
        this.f33126b = new HashMap(r24Var.f28973d);
    }

    /* JADX INFO: renamed from: e */
    public static void m12113e(C1283w7 c1283w7, dz2 dz2Var) {
        c1283w7.getClass();
        if (((dw2) c1283w7.f33129e).m4773a(dz2Var)) {
            jz2 jz2Var = (jz2) c1283w7.f33128d;
            jz2Var.getClass();
            if (dz2Var.f17533g != null) {
                xy4.m12783l("Handler '", dz2Var, "' is already registered with a dispatcher");
                return;
            }
            jz2Var.f22757e.addFirst(dz2Var);
            dz2Var.f17533g = c1283w7;
            jz2Var.m7348b();
        }
    }

    /* JADX INFO: renamed from: A */
    public pn1 m12114A(String str) {
        for (lo1 lo1Var : ((HashMap) this.f33128d).values()) {
            if (lo1Var != null) {
                pn1 pn1VarM12114A = lo1Var.f24224c;
                if (!str.equals(pn1VarM12114A.f27782e)) {
                    pn1VarM12114A = pn1VarM12114A.f27799v.f18306c.m12114A(str);
                }
                if (pn1VarM12114A != null) {
                    return pn1VarM12114A;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public void m12115B(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m12125L();
    }

    /* JADX INFO: renamed from: C */
    public void m12116C(bk3 bk3Var) {
        bk3Var.f15364b.decrementAndGet();
        m12115B((ArrayDeque) this.f33129e, bk3Var);
    }

    /* JADX INFO: renamed from: D */
    public ArrayList m12117D() {
        ArrayList arrayList = new ArrayList();
        for (lo1 lo1Var : ((HashMap) this.f33128d).values()) {
            if (lo1Var != null) {
                arrayList.add(lo1Var);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E */
    public ArrayList m12118E() {
        ArrayList arrayList = new ArrayList();
        for (lo1 lo1Var : ((HashMap) this.f33128d).values()) {
            if (lo1Var != null) {
                arrayList.add(lo1Var.f24224c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: F */
    public List m12119F() {
        ArrayList arrayList;
        if (((ArrayList) this.f33127c).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f33127c)) {
            arrayList = new ArrayList((ArrayList) this.f33127c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public List m12120G() {
        hq2 hq2Var = (hq2) this.f33126b;
        if (hq2Var != null) {
            return hq2Var;
        }
        hq2 hq2Var2 = new hq2((byte) 0);
        hq2Var2.f20783b = this;
        VarHandle.storeStoreFence();
        this.f33126b = hq2Var2;
        return hq2Var2;
    }

    /* JADX INFO: renamed from: H */
    public r52 m12121H() {
        Matcher matcher = (Matcher) this.f33127c;
        return sc6.m10660c0(matcher.start(), matcher.end());
    }

    /* JADX INFO: renamed from: I */
    public jy4 m12122I(r90 r90Var, String str) {
        jy4 jy4Var;
        jy4 jy4VarMo3725a;
        bv3 bv3Var;
        gk2 gk2Var;
        synchronized (((q50) this.f33126b)) {
            try {
                jy4Var = (jy4) ((oy4) this.f33127c).f27238a.get(str);
                if (r90Var.m10250c(jy4Var)) {
                    my4 my4Var = (my4) this.f33128d;
                    if ((my4Var instanceof bv3) && (gk2Var = (bv3Var = (bv3) my4Var).f15650d) != null) {
                        zy5.m13890y(jy4Var, bv3Var.f15651e, gk2Var);
                    }
                } else {
                    gv2 gv2Var = new gv2((dr0) this.f33129e);
                    gv2Var.m6174a(js1.f22553c, str);
                    my4 my4Var2 = (my4) this.f33128d;
                    try {
                        try {
                            jy4VarMo3725a = my4Var2.mo3727c(r90Var, gv2Var);
                        } catch (AbstractMethodError unused) {
                            jy4VarMo3725a = my4Var2.mo3726b(r90Var.f29101a, gv2Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        jy4VarMo3725a = my4Var2.mo3725a(r90Var.f29101a);
                    }
                    jy4Var = jy4VarMo3725a;
                    jy4 jy4Var2 = (jy4) ((oy4) this.f33127c).f27238a.put(str, jy4Var);
                    if (jy4Var2 != null) {
                        jy4Var2.m7339a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jy4Var;
    }

    /* JADX INFO: renamed from: J */
    public void m12123J(lo1 lo1Var) {
        pn1 pn1Var = lo1Var.f24224c;
        String str = pn1Var.f27782e;
        HashMap map = (HashMap) this.f33128d;
        if (map.get(str) != null) {
            return;
        }
        map.put(pn1Var.f27782e, lo1Var);
        if (eo1.m5212J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + pn1Var);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m12124K(lo1 lo1Var) {
        HashMap map = (HashMap) this.f33128d;
        pn1 pn1Var = lo1Var.f24224c;
        if (pn1Var.f27758C) {
            ((ho1) this.f33126b).m6463f(pn1Var);
        }
        if (map.get(pn1Var.f27782e) == lo1Var && ((lo1) map.put(pn1Var.f27782e, null)) != null && eo1.m5212J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + pn1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {, blocks: (B:22:0x0068, B:24:0x006e), top: B:50:0x0068 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x006e, please report this as an issue */
    /* JADX INFO: renamed from: L */
    public void m12125L() {
        int size;
        int i;
        bk3 bk3Var;
        ExecutorService executorService;
        byte[] bArr = zv4.f36415a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f33128d).iterator();
                while (it.hasNext()) {
                    bk3 bk3Var2 = (bk3) it.next();
                    if (((ArrayDeque) this.f33129e).size() >= 64) {
                        break;
                    }
                    if (bk3Var2.f15364b.get() < 5) {
                        it.remove();
                        bk3Var2.f15364b.incrementAndGet();
                        arrayList.add(bk3Var2);
                        ((ArrayDeque) this.f33129e).add(bk3Var2);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f33129e).size();
                    ((ArrayDeque) this.f33126b).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    bk3Var = (bk3) arrayList.get(i);
                    synchronized (this) {
                        executorService = (ExecutorService) this.f33127c;
                        if (executorService == null) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            SynchronousQueue synchronousQueue = new SynchronousQueue();
                            String str = zv4.f36421g + " Dispatcher";
                            xv4 xv4Var = new xv4();
                            xv4Var.f34646a = str;
                            xv4Var.f34647b = false;
                            VarHandle.storeStoreFence();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, xv4Var);
                            this.f33127c = threadPoolExecutor;
                            executorService = threadPoolExecutor;
                        }
                    }
                    ek3 ek3Var = bk3Var.f15365c;
                    byte[] bArr2 = zv4.f36415a;
                    try {
                        try {
                            executorService.execute(bk3Var);
                        } catch (Throwable th) {
                            ek3Var.f18171a.f20312a.m12116C(bk3Var);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        ek3Var.m5158i(interruptedIOException);
                        bk3Var.f15363a.onFailure(ek3Var, interruptedIOException);
                        ek3Var.f18171a.f20312a.m12116C(bk3Var);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
            bk3Var = (bk3) arrayList.get(i);
            synchronized (this) {
                executorService = (ExecutorService) this.f33127c;
                if (executorService == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String str2 = zv4.f36421g + " Dispatcher";
                    xv4 xv4Var2 = new xv4();
                    xv4Var2.f34646a = str2;
                    xv4Var2.f34647b = false;
                    VarHandle.storeStoreFence();
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, xv4Var2);
                    this.f33127c = threadPoolExecutor2;
                    executorService = threadPoolExecutor2;
                }
                ek3 ek3Var2 = bk3Var.f15365c;
                byte[] bArr3 = zv4.f36415a;
                executorService.execute(bk3Var);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m12126M() {
        this.f33127c = 12;
    }

    /* JADX INFO: renamed from: N */
    public void m12127N(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.f33127c = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: O */
    public void m12128O(int i) {
        switch (this.f33125a) {
            case 1:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f33126b = Integer.valueOf(i);
                return;
            default:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.f33126b = Integer.valueOf(i);
                return;
        }
    }

    /* JADX INFO: renamed from: P */
    public Bundle m12129P(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f33129e;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    /* JADX INFO: renamed from: Q */
    public void m12130Q() {
        switch (this.f33125a) {
            case 1:
                this.f33128d = 16;
                break;
            default:
                this.f33128d = 16;
                break;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m12131R(ec3 ec3Var) {
        if (((qc3) this.f33128d) == qc3.f28384b) {
            e13 e13Var = (e13) this.f33127c;
            if (e13Var == null) {
                C1077qn.m9989o("layoutCoordinates not set");
                return;
            }
            long jMo4005S = e13Var.mo4005S(0L);
            rc3 rc3Var = (rc3) this.f33126b;
            b71 b71Var = new b71((byte) 22);
            b71Var.f15141b = rc3Var;
            VarHandle.storeStoreFence();
            i20.m6573H(ec3Var, jMo4005S, b71Var, true);
        }
        this.f33128d = qc3.f28385c;
    }

    /* JADX INFO: renamed from: S */
    public void m12132S(qb4 qb4Var) {
        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 19);
        runnableC1285w9.f33164b = this;
        runnableC1285w9.f33165c = qb4Var;
        VarHandle.storeStoreFence();
        synchronized (this.f33129e) {
        }
        ((Handler) ((ar3) this.f33127c).f14813b).postDelayed(runnableC1285w9, 5400000L);
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public r36 mo4146j() {
        c16 c16Var = (c16) ((cr6) this.f33127c).mo4146j();
        C1283w7 c1283w7M6473a = ((hq5) this.f33128d).m6473a();
        mq5 mq5Var = (mq5) ((cr6) this.f33129e).mo4146j();
        fx5 fx5Var = (fx5) ((cr6) this.f33126b).mo4146j();
        r36 r36Var = new r36();
        r36Var.f28986b = c16Var;
        r36Var.f28985a = c1283w7M6473a;
        r36Var.f28987c = mq5Var;
        r36Var.f28988d = fx5Var;
        VarHandle.storeStoreFence();
        return r36Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0282  */
    /* JADX WARN: Code duplicated, block: B:105:0x0292  */
    /* JADX WARN: Code duplicated, block: B:106:0x0295  */
    /* JADX WARN: Code duplicated, block: B:108:0x0299  */
    /* JADX WARN: Code duplicated, block: B:109:0x029c  */
    /* JADX WARN: Code duplicated, block: B:111:0x029f  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x024e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0255  */
    /* JADX WARN: Code duplicated, block: B:91:0x025c  */
    /* JADX WARN: Code duplicated, block: B:93:0x025f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0262  */
    /* JADX WARN: Code duplicated, block: B:98:0x027b  */
    /* JADX WARN: Failed to find 'out' block for switch in B:70:0x0207. Please report as an issue. */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x024e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0262, please report this as an issue */
    @Override // p000.wy5
    /* JADX INFO: renamed from: b */
    public boolean mo12134b(String str, JSONObject jSONObject) {
        HashMap map;
        HashMap map2;
        HashMap map3;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        int iIntValue;
        Object obj;
        Object obj2;
        mq5 mq5Var = (mq5) this.f33128d;
        Application application = (Application) this.f33127c;
        int iHashCode = str.hashCode();
        boolean zBooleanValue = false;
        if (iHashCode == 94746189) {
            if (!str.equals("clear")) {
                return false;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
                return true;
            }
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (TextUtils.isEmpty(strOptString)) {
                    Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i);
                } else {
                    hashSet.add(strOptString);
                }
            }
            by5 by5Var = new by5(application);
            Iterator it = hashSet.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = by5Var.f15687c;
                if (!zHasNext) {
                    break;
                }
                String str6 = (String) it.next();
                a52 a52VarM4233a = cy5.m4233a(application, str6);
                if (a52VarM4233a == null) {
                    Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str6)));
                } else {
                    String str7 = a52VarM4233a.f109a;
                    if (!map.containsKey(str7)) {
                        map.put(str7, by5Var.f15686b.getSharedPreferences(str7, 0).edit());
                    }
                    ((SharedPreferences.Editor) map.get(str7)).remove(a52VarM4233a.f110b);
                }
            }
            Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.Editor) it2.next()).commit();
            }
            return true;
        }
        if (iHashCode != 113399775 || !str.equals("write")) {
            return false;
        }
        by5 by5Var2 = new by5(application);
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            boolean zHasNext2 = itKeys.hasNext();
            map2 = by5Var2.f15687c;
            map3 = by5Var2.f15685a;
            if (!zHasNext2) {
                break;
            }
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(objOpt));
            Context context = by5Var2.f15686b;
            a52 a52VarM4233a2 = cy5.m4233a(context, next);
            if (a52VarM4233a2 != null) {
                String str8 = a52VarM4233a2.f110b;
                String str9 = a52VarM4233a2.f109a;
                if (!map2.containsKey(str9)) {
                    map2.put(str9, context.getSharedPreferences(str9, 0).edit());
                }
                SharedPreferences.Editor editor = (SharedPreferences.Editor) map2.get(str9);
                if (objOpt instanceof Integer) {
                    Integer num2 = (Integer) objOpt;
                    editor.putInt(str8, num2.intValue());
                    if (by5.f15684d.contains(str8)) {
                        map3.put(str8, num2);
                    }
                } else if (objOpt instanceof Long) {
                    editor.putLong(str8, ((Long) objOpt).longValue());
                } else if (objOpt instanceof Double) {
                    editor.putFloat(str8, ((Double) objOpt).floatValue());
                } else if (objOpt instanceof Float) {
                    editor.putFloat(str8, ((Float) objOpt).floatValue());
                } else if (objOpt instanceof Boolean) {
                    editor.putBoolean(str8, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof String) {
                    editor.putString(str8, (String) objOpt);
                }
                mq5Var.f25153c.add(next);
            }
            Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
        }
        mq5Var.f25152b.edit().putStringSet("written_values", mq5Var.f25153c).commit();
        Iterator it3 = map2.values().iterator();
        while (it3.hasNext()) {
            ((SharedPreferences.Editor) it3.next()).commit();
        }
        if (map3.size() <= 1) {
            return true;
        }
        uf6 uf6Var = (uf6) this.f33129e;
        up5 up5Var = uf6Var.f31831a;
        AtomicReference atomicReference = up5Var.f32073g;
        AtomicReference atomicReference2 = up5Var.f32072f;
        AtomicReference atomicReference3 = up5Var.f32071e;
        AtomicReference atomicReference4 = up5Var.f32070d;
        AtomicReference atomicReference5 = up5Var.f32069c;
        AtomicReference atomicReference6 = up5Var.f32068b;
        if (atomicReference.get() != null) {
            zBooleanValue = ((Boolean) atomicReference.get()).booleanValue();
        } else {
            Context context2 = up5Var.f32067a;
            if (context2 == null) {
                atomicReference.set(Boolean.FALSE);
            } else {
                try {
                    atomicReference6.set(FirebaseAnalytics.class.getDeclaredMethod("getInstance", Context.class).invoke(null, context2));
                    atomicReference5.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
                    Method declaredMethod = cg1.class.getDeclaredMethod("valueOf", String.class);
                    Method declaredMethod2 = dg1.class.getDeclaredMethod("valueOf", String.class);
                    atomicReference4.set(declaredMethod);
                    atomicReference3.set(declaredMethod2);
                    atomicReference.set(Boolean.TRUE);
                    zBooleanValue = true;
                } catch (Exception e) {
                    Log.w("UserMessagingPlatform", "No Firebase class found. ", e);
                    atomicReference.set(Boolean.FALSE);
                    zBooleanValue = false;
                }
            }
        }
        if (zBooleanValue) {
            Context context3 = uf6Var.f31832b;
            if (atomicReference2.get() == null) {
                try {
                    atomicReference2.set(r35.m10189a(context3).m12997a(128, context3.getPackageName()).metaData);
                } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
                    Log.w("UserMessagingPlatform", "Failed to get metadata. ", e2);
                }
            }
            String str10 = "IABTCF_gdprApplies";
            Integer num3 = (Integer) map3.get("IABTCF_gdprApplies");
            HashMap map4 = new HashMap();
            for (String str11 : map3.keySet()) {
                if (!str11.equals(str10)) {
                    switch (str11) {
                        case "UMP_CoMoAdPersonalizationPurposeConsentStatus":
                            str3 = "google_analytics_default_allow_ad_personalization_signals";
                            str4 = "AD_PERSONALIZATION";
                            iIntValue = ((Integer) map3.get(str11)).intValue();
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map4.put(str4, "GRANTED");
                                    num3 = num;
                                    break;
                                } else {
                                    str2 = str10;
                                    if (iIntValue != 2) {
                                        map4.put(str4, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + iIntValue);
                                        } else {
                                            if (atomicReference2.get() != null || (obj2 = ((Bundle) atomicReference2.get()).get(str3)) == null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map4.put(str4, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else {
                                                String str12 = str4;
                                                if ((obj instanceof String) || !obj.equals("eu_consent_policy") || (!(str12.equals("AD_PERSONALIZATION") || str12.equals("AD_USER_DATA")) || num == null)) {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                } else {
                                                    map4.put(str12, num.intValue() == 1 ? "DENIED" : "GRANTED");
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                str2 = str10;
                                num = num3;
                            }
                        case "UMP_CoMoAnalyticsStoragePurposeConsentStatus":
                            str3 = "google_analytics_default_allow_analytics_storage";
                            str5 = "ANALYTICS_STORAGE";
                            str4 = str5;
                            iIntValue = ((Integer) map3.get(str11)).intValue();
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map4.put(str4, "GRANTED");
                                    num3 = num;
                                    break;
                                } else {
                                    str2 = str10;
                                    if (iIntValue != 2) {
                                        map4.put(str4, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + iIntValue);
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map4.put(str4, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else {
                                                String str13 = str4;
                                                if (obj instanceof String) {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                } else {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                str2 = str10;
                                num = num3;
                            }
                        case "UMP_CoMoAdStoragePurposeConsentStatus":
                            str3 = "google_analytics_default_allow_ad_storage";
                            str5 = "AD_STORAGE";
                            str4 = str5;
                            iIntValue = ((Integer) map3.get(str11)).intValue();
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map4.put(str4, "GRANTED");
                                    num3 = num;
                                    break;
                                } else {
                                    str2 = str10;
                                    if (iIntValue != 2) {
                                        map4.put(str4, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + iIntValue);
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map4.put(str4, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else {
                                                String str14 = str4;
                                                if (obj instanceof String) {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                } else {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                str2 = str10;
                                num = num3;
                            }
                        case "UMP_CoMoAdUserDataPurposeConsentStatus":
                            str3 = "google_analytics_default_allow_ad_user_data";
                            str4 = "AD_USER_DATA";
                            iIntValue = ((Integer) map3.get(str11)).intValue();
                            if (iIntValue != -1) {
                                num = num3;
                                if (iIntValue != 1) {
                                    map4.put(str4, "GRANTED");
                                    num3 = num;
                                    break;
                                } else {
                                    str2 = str10;
                                    if (iIntValue != 2) {
                                        map4.put(str4, "DENIED");
                                    } else if (iIntValue != 4) {
                                        if (iIntValue != 5) {
                                            Log.w("UserMessagingPlatform", "Invalid CoMo consent status: " + iIntValue);
                                        } else {
                                            if (atomicReference2.get() != null) {
                                                obj = null;
                                            } else if (obj2 instanceof Boolean) {
                                                obj = (Boolean) obj2;
                                            } else if (obj2 instanceof String) {
                                                obj = (String) obj2;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj == null) {
                                                Log.w("UserMessagingPlatform", "No default metadata");
                                            } else if (obj instanceof Boolean) {
                                                map4.put(str4, true != ((Boolean) obj).booleanValue() ? "DENIED" : "GRANTED");
                                            } else {
                                                String str15 = str4;
                                                if (obj instanceof String) {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                } else {
                                                    Log.w("UserMessagingPlatform", "Failed to get the default eu_consent_policy value.");
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                str2 = str10;
                                num = num3;
                            }
                        default:
                            str2 = str10;
                            num = num3;
                    }
                }
            }
            Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map4.toString()));
            HashMap map5 = new HashMap();
            for (String str16 : map4.keySet()) {
                try {
                    try {
                        map5.put((Enum) ((Method) atomicReference3.get()).invoke(null, str16), (Enum) ((Method) atomicReference4.get()).invoke(null, map4.get(str16)));
                    } catch (Exception e3) {
                        e = e3;
                        Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e);
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
            if (atomicReference5.get() != null && !map5.isEmpty()) {
                try {
                    ((Method) atomicReference5.get()).invoke(atomicReference6.get(), map5);
                } catch (Exception e5) {
                    Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e5);
                }
            }
        }
        map3.clear();
        return true;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: c */
    public long mo3358c(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        int iMo4034b = abstractC0654fk.mo4034b();
        long jMax = 0;
        for (int i = 0; i < iMo4034b; i++) {
            jMax = Math.max(jMax, ((InterfaceC0691gk) this.f33127c).get(i).mo4510d(abstractC0654fk.mo3608a(i), abstractC0654fk2.mo3608a(i), abstractC0654fk3.mo3608a(i)));
        }
        return jMax;
    }

    /* JADX INFO: renamed from: d */
    public void m12135d(pn1 pn1Var) {
        if (((ArrayList) this.f33127c).contains(pn1Var)) {
            wb1.m12196p(pn1Var, "Fragment already added: ");
            return;
        }
        synchronized (((ArrayList) this.f33127c)) {
            ((ArrayList) this.f33127c).add(pn1Var);
        }
        pn1Var.f27788k = true;
    }

    @Override // p000.wy5
    /* JADX INFO: renamed from: f */
    public Executor mo12136f() {
        return (Executor) this.f33126b;
    }

    /* JADX INFO: renamed from: g */
    public void m12137g(iz2 iz2Var) {
        if (((dw2) this.f33126b).m4773a(iz2Var)) {
            ((jz2) this.f33128d).m7347a(this, iz2Var, -1);
        }
    }

    @Override // p000.ai3
    public Object get() {
        switch (this.f33125a) {
            case 10:
                hg1 hg1Var = (hg1) ((v42) this.f33127c).f32392a;
                s34 s34Var = (s34) ((ai3) this.f33128d).get();
                ro0 ro0Var = (ro0) ((ai3) this.f33129e).get();
                m34 m34Var = (m34) ((ai3) this.f33126b).get();
                dh1 dh1Var = new dh1();
                dh1Var.f17046a = hg1Var;
                dh1Var.f17047b = s34Var;
                Log.d(FirebaseSessionsRegistrar.TAG, "Initializing Firebase Sessions SDK.");
                hg1Var.m6388a();
                Context applicationContext = hg1Var.f20545a.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(q34.f28197a);
                    lb5.m7910S(zp0.m13670b(ro0Var), null, null, new C1199ty(dh1Var, ro0Var, m34Var, null, (byte) 5), 3);
                } else {
                    Log.e(FirebaseSessionsRegistrar.TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
                }
                VarHandle.storeStoreFence();
                return dh1Var;
            default:
                Executor executor = (Executor) ((ai3) this.f33127c).get();
                pt3 pt3Var = (pt3) ((ai3) this.f33128d).get();
                jp0 jp0Var = (jp0) ((tt2) this.f33129e).get();
                pt3 pt3Var2 = (pt3) ((ai3) this.f33126b).get();
                C1283w7 c1283w7 = new C1283w7((byte) 24);
                c1283w7.f33127c = executor;
                c1283w7.f33128d = pt3Var;
                c1283w7.f33129e = jp0Var;
                c1283w7.f33126b = pt3Var2;
                VarHandle.storeStoreFence();
                return c1283w7;
        }
    }

    @Override // p000.t24
    public Object getDefaultValue() {
        return ((wp1) this.f33127c).invoke();
    }

    /* JADX INFO: renamed from: h */
    public void m12138h(l33 l33Var, int i) {
        if (i != 1 && i != 0) {
            C1077qn.m9988n(c75.m3877i(i, "Unsupported priority value: "));
        } else if (((dw2) this.f33126b).m4773a(l33Var)) {
            ((jz2) this.f33128d).m7347a(this, l33Var, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public C1358y7 m12139i() throws GeneralSecurityException {
        wd3 wd3Var;
        u50 u50VarM7411b;
        C0679g8 c0679g8 = (C0679g8) this.f33127c;
        if (c0679g8 == null) {
            xy4.m12788q("Cannot build without parameters");
            return null;
        }
        wd3 wd3Var2 = (wd3) this.f33128d;
        if (wd3Var2 == null || (wd3Var = (wd3) this.f33129e) == null) {
            xy4.m12788q("Cannot build without key material");
            return null;
        }
        if (c0679g8.f19647a != ((u50) wd3Var2.f33259b).f31654a.length) {
            xy4.m12788q("AES key size mismatch");
            return null;
        }
        if (c0679g8.f19648b != ((u50) wd3Var.f33259b).f31654a.length) {
            xy4.m12788q("HMAC key size mismatch");
            return null;
        }
        if (c0679g8.mo5593a() && ((Integer) this.f33126b) == null) {
            xy4.m12788q("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((C0679g8) this.f33127c).mo5593a() && ((Integer) this.f33126b) != null) {
            xy4.m12788q("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        C0973o7 c0973o7 = ((C0679g8) this.f33127c).f19651e;
        if (c0973o7 == C0973o7.f26383i) {
            u50VarM7411b = k63.f22941a;
        } else if (c0973o7 == C0973o7.f26382h) {
            u50VarM7411b = k63.m7410a(((Integer) this.f33126b).intValue());
        } else {
            if (c0973o7 != C0973o7.f26381g) {
                wb1.m12197q(((C0679g8) this.f33127c).f19651e, "Unknown AesCtrHmacAeadParameters.Variant: ");
                return null;
            }
            u50VarM7411b = k63.m7411b(((Integer) this.f33126b).intValue());
        }
        C0679g8 c0679g9 = (C0679g8) this.f33127c;
        wd3 wd3Var3 = (wd3) this.f33128d;
        wd3 wd3Var4 = (wd3) this.f33129e;
        Integer num = (Integer) this.f33126b;
        C1358y7 c1358y7 = new C1358y7();
        c1358y7.f34966u = c0679g9;
        c1358y7.f34967v = wd3Var3;
        c1358y7.f34968w = wd3Var4;
        c1358y7.f34969x = u50VarM7411b;
        c1358y7.f34970y = num;
        VarHandle.storeStoreFence();
        return c1358y7;
    }

    /* JADX INFO: renamed from: l */
    public C0602e8 m12140l() {
        C0879lo c0879lo = (C0879lo) this.f33127c;
        String str = (String) this.f33128d;
        String str2 = (String) this.f33129e;
        q64 q64Var = (q64) this.f33126b;
        C0602e8 c0602e8 = new C0602e8();
        Set setUnmodifiableSet = c0879lo == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(c0879lo);
        c0602e8.f17868b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        c0602e8.f17870d = str;
        c0602e8.f17871e = str2;
        if (q64Var == null) {
            q64Var = q64.f28243b;
        }
        c0602e8.f17872f = q64Var;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            xy4.m12778e();
            return null;
        }
        c0602e8.f17869c = Collections.unmodifiableSet(hashSet);
        VarHandle.storeStoreFence();
        return c0602e8;
    }

    /* JADX INFO: renamed from: m */
    public C1322x8 m12141m() {
        Integer num = (Integer) this.f33126b;
        if (num == null) {
            xy4.m12788q("Key size is not set");
            return null;
        }
        if (((Integer) this.f33127c) == null) {
            xy4.m12788q("IV size is not set");
            return null;
        }
        if (((C0641f8) this.f33129e) == null) {
            xy4.m12788q("Variant is not set");
            return null;
        }
        if (((Integer) this.f33128d) == null) {
            xy4.m12788q("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f33127c).intValue();
        int iIntValue3 = ((Integer) this.f33128d).intValue();
        C0641f8 c0641f8 = (C0641f8) this.f33129e;
        C1322x8 c1322x8 = new C1322x8();
        c1322x8.f34054a = iIntValue;
        c1322x8.f34055b = iIntValue2;
        c1322x8.f34056c = iIntValue3;
        c1322x8.f34057d = c0641f8;
        VarHandle.storeStoreFence();
        return c1322x8;
    }

    /* JADX INFO: renamed from: n */
    public C0754i9 m12142n() {
        Integer num = (Integer) this.f33126b;
        if (num == null) {
            xy4.m12788q("Key size is not set");
            return null;
        }
        if (((C0973o7) this.f33129e) == null) {
            xy4.m12788q("Variant is not set");
            return null;
        }
        if (((Integer) this.f33127c) == null) {
            xy4.m12788q("IV size is not set");
            return null;
        }
        if (((Integer) this.f33128d) == null) {
            xy4.m12788q("Tag size is not set");
            return null;
        }
        int iIntValue = num.intValue();
        int iIntValue2 = ((Integer) this.f33127c).intValue();
        int iIntValue3 = ((Integer) this.f33128d).intValue();
        C0973o7 c0973o7 = (C0973o7) this.f33129e;
        C0754i9 c0754i9 = new C0754i9();
        c0754i9.f21179a = iIntValue;
        c0754i9.f21180b = iIntValue2;
        c0754i9.f21181c = iIntValue3;
        c0754i9.f21182d = c0973o7;
        VarHandle.storeStoreFence();
        return c0754i9;
    }

    /* JADX INFO: renamed from: o */
    public ru0 m12143o() {
        cf1 cf1Var = (cf1) this.f33127c;
        hp0 hp0Var = (hp0) this.f33129e;
        wm0 wm0Var = null;
        List listSingletonList = Collections.singletonList(new C0594e0(this.f33126b, wm0Var, (byte) 23));
        ro0 ro0Var = (ro0) this.f33128d;
        ru0 ru0Var = new ru0();
        ru0Var.f29625a = cf1Var;
        ru0Var.f29626b = hp0Var;
        o85 o85Var = o85.f26448h;
        t82 t82Var = (t82) ro0Var.get(o85Var);
        if (t82Var == null) {
            xd2.m12669p(ro0Var, "Missing Job on Coroutine context: ");
            return null;
        }
        um0 um0VarM13670b = zp0.m13670b(ro0Var.plus(t82Var));
        ro0 ro0Var2 = um0VarM13670b.f31989a;
        ru0Var.f29627c = um0VarM13670b;
        byte b = 2;
        ru0Var.f29628d = qq2.m10032p(new C1199ty(ru0Var, wm0Var, b));
        ru0Var.f29629e = hx2.m6530a();
        su0 su0Var = new su0();
        su0Var.f30564a = bc4.m3547a(wt4.f33723b);
        VarHandle.storeStoreFence();
        ru0Var.f29632h = su0Var;
        C1122rv c1122rv = new C1122rv(b, false);
        c1122rv.f29655f = ru0Var;
        c1122rv.f29651b = hx2.m6530a();
        c1122rv.f29652c = new cf0();
        c1122rv.f29653d = ro0Var2;
        c1122rv.f29654e = hb0.m6319e1(listSingletonList);
        VarHandle.storeStoreFence();
        ru0Var.f29633i = c1122rv;
        mt0 mt0Var = new mt0(0 == true ? 1 : 0);
        mt0Var.f25187b = ru0Var;
        VarHandle.storeStoreFence();
        ru0Var.f29634j = new dg4(mt0Var);
        mt0 mt0Var2 = new mt0((byte) 1);
        mt0Var2.f25187b = ru0Var;
        VarHandle.storeStoreFence();
        ru0Var.f29635k = new dg4(mt0Var2);
        C1127s c1127s = new C1127s((byte) 26);
        c1127s.f29778b = ru0Var;
        VarHandle.storeStoreFence();
        en0 en0Var = new en0((byte) 11);
        C0594e0 c0594e0 = new C0594e0((Object) ru0Var, wm0Var, (byte) 25);
        C1283w7 c1283w7 = new C1283w7((byte) 19);
        c1283w7.f33127c = um0VarM13670b;
        c1283w7.f33128d = c0594e0;
        c1283w7.f33129e = ev0.m5333H(Integer.MAX_VALUE, null, null, 6);
        c1283w7.f33126b = new js1((byte) 6);
        t82 t82Var2 = (t82) ro0Var2.get(o85Var);
        if (t82Var2 != null) {
            C1164t c1164t = new C1164t((byte) 27);
            c1164t.f30700c = c1127s;
            c1164t.f30699b = c1283w7;
            c1164t.f30701d = en0Var;
            VarHandle.storeStoreFence();
            t82Var2.mo4972C(c1164t);
        }
        VarHandle.storeStoreFence();
        ru0Var.f29636l = c1283w7;
        VarHandle.storeStoreFence();
        return ru0Var;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: p */
    public AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        AbstractC0654fk abstractC0654fkMo4035c = (AbstractC0654fk) this.f33129e;
        if (abstractC0654fkMo4035c == null) {
            abstractC0654fkMo4035c = abstractC0654fk3.mo4035c();
            this.f33129e = abstractC0654fkMo4035c;
        }
        int iMo4034b = abstractC0654fkMo4035c.mo4034b();
        int i = 0;
        while (true) {
            AbstractC0654fk abstractC0654fk4 = (AbstractC0654fk) this.f33129e;
            if (i >= iMo4034b) {
                if (abstractC0654fk4 != null) {
                    return abstractC0654fk4;
                }
                z62.m13366Y("velocityVector");
                throw null;
            }
            if (abstractC0654fk4 == null) {
                z62.m13366Y("velocityVector");
                throw null;
            }
            long j2 = j;
            abstractC0654fk4.mo3610e(((InterfaceC0691gk) this.f33127c).get(i).mo4509c(j2, abstractC0654fk.mo3608a(i), abstractC0654fk2.mo3608a(i), abstractC0654fk3.mo3608a(i)), i);
            i++;
            j = j2;
        }
    }

    /* JADX INFO: renamed from: q */
    public l51 m12144q() {
        C0973o7 c0973o7 = C0973o7.f26392r;
        C0641f8 c0641f8 = (C0641f8) this.f33127c;
        if (c0641f8 == null) {
            xy4.m12788q("signature encoding is not set");
            return null;
        }
        k51 k51Var = (k51) this.f33128d;
        if (k51Var == null) {
            xy4.m12788q("EC curve type is not set");
            return null;
        }
        C0973o7 c0973o8 = (C0973o7) this.f33129e;
        if (c0973o8 == null) {
            xy4.m12788q("hash type is not set");
            return null;
        }
        C0973o7 c0973o9 = (C0973o7) this.f33126b;
        if (c0973o9 == null) {
            xy4.m12788q("variant is not set");
            return null;
        }
        if (k51Var == k51.f22897c && c0973o8 != C0973o7.f26390p) {
            xy4.m12788q("NIST_P256 requires SHA256");
            return null;
        }
        if (k51Var == k51.f22898d && c0973o8 != C0973o7.f26391q && c0973o8 != c0973o7) {
            xy4.m12788q("NIST_P384 requires SHA384 or SHA512");
            return null;
        }
        if (k51Var == k51.f22899e && c0973o8 != c0973o7) {
            xy4.m12788q("NIST_P521 requires SHA512");
            return null;
        }
        l51 l51Var = new l51();
        l51Var.f23792a = c0641f8;
        l51Var.f23793b = k51Var;
        l51Var.f23794c = c0973o8;
        l51Var.f23795d = c0973o9;
        VarHandle.storeStoreFence();
        return l51Var;
    }

    @Override // p000.t24
    public Object readFrom(FileInputStream fileInputStream) throws gp0 {
        try {
            return gq6.m6092q((i92) this.f33128d, (jc2) ((wp1) this.f33129e).invoke(), fileInputStream);
        } catch (o24 e) {
            throw new gp0("Unable to read " + ((wp1) this.f33126b), e);
        }
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: s */
    public AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        AbstractC0654fk abstractC0654fkMo4035c = (AbstractC0654fk) this.f33128d;
        if (abstractC0654fkMo4035c == null) {
            abstractC0654fkMo4035c = abstractC0654fk.mo4035c();
            this.f33128d = abstractC0654fkMo4035c;
        }
        int iMo4034b = abstractC0654fkMo4035c.mo4034b();
        int i = 0;
        while (true) {
            AbstractC0654fk abstractC0654fk4 = (AbstractC0654fk) this.f33128d;
            if (i >= iMo4034b) {
                if (abstractC0654fk4 != null) {
                    return abstractC0654fk4;
                }
                z62.m13366Y("valueVector");
                throw null;
            }
            if (abstractC0654fk4 == null) {
                z62.m13366Y("valueVector");
                throw null;
            }
            long j2 = j;
            abstractC0654fk4.mo3610e(((InterfaceC0691gk) this.f33127c).get(i).mo4508b(j2, abstractC0654fk.mo3608a(i), abstractC0654fk2.mo3608a(i), abstractC0654fk3.mo3608a(i)), i);
            i++;
            j = j2;
        }
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: t */
    public AbstractC0654fk mo12090t(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        AbstractC0654fk abstractC0654fkMo4035c = (AbstractC0654fk) this.f33126b;
        if (abstractC0654fkMo4035c == null) {
            abstractC0654fkMo4035c = abstractC0654fk3.mo4035c();
            this.f33126b = abstractC0654fkMo4035c;
        }
        int iMo4034b = abstractC0654fkMo4035c.mo4034b();
        int i = 0;
        while (true) {
            AbstractC0654fk abstractC0654fk4 = (AbstractC0654fk) this.f33126b;
            if (i >= iMo4034b) {
                if (abstractC0654fk4 != null) {
                    return abstractC0654fk4;
                }
                z62.m13366Y("endVelocityVector");
                throw null;
            }
            if (abstractC0654fk4 == null) {
                z62.m13366Y("endVelocityVector");
                throw null;
            }
            abstractC0654fk4.mo3610e(((InterfaceC0691gk) this.f33127c).get(i).mo4511e(abstractC0654fk.mo3608a(i), abstractC0654fk2.mo3608a(i), abstractC0654fk3.mo3608a(i)), i);
            i++;
        }
    }

    /* JADX INFO: renamed from: u */
    public zw1 m12145u() {
        Integer num = (Integer) this.f33126b;
        if (num == null) {
            xy4.m12788q("key size is not set");
            return null;
        }
        if (((Integer) this.f33127c) == null) {
            xy4.m12788q("tag size is not set");
            return null;
        }
        if (((xw1) this.f33128d) == null) {
            xy4.m12788q("hash type is not set");
            return null;
        }
        if (((yw1) this.f33129e) == null) {
            xy4.m12788q("variant is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f33126b));
        }
        Integer num2 = (Integer) this.f33127c;
        int iIntValue = num2.intValue();
        xw1 xw1Var = (xw1) this.f33128d;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (xw1Var == xw1.f34659b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (xw1Var == xw1.f34660c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (xw1Var == xw1.f34661d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (xw1Var == xw1.f34662e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (xw1Var != xw1.f34663f) {
                xy4.m12788q("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        int iIntValue2 = ((Integer) this.f33126b).intValue();
        int iIntValue3 = ((Integer) this.f33127c).intValue();
        yw1 yw1Var = (yw1) this.f33129e;
        xw1 xw1Var2 = (xw1) this.f33128d;
        zw1 zw1Var = new zw1();
        zw1Var.f36424a = iIntValue2;
        zw1Var.f36425b = iIntValue3;
        zw1Var.f36426c = yw1Var;
        zw1Var.f36427d = xw1Var2;
        VarHandle.storeStoreFence();
        return zw1Var;
    }

    /* JADX INFO: renamed from: v */
    public r24 m12146v() {
        r24 r24Var = new r24();
        r24Var.f28970a = new HashMap((HashMap) this.f33127c);
        r24Var.f28971b = new HashMap((HashMap) this.f33128d);
        r24Var.f28972c = new HashMap((HashMap) this.f33129e);
        r24Var.f28973d = new HashMap((HashMap) this.f33126b);
        VarHandle.storeStoreFence();
        return r24Var;
    }

    /* JADX INFO: renamed from: w */
    public void m12147w(qb4 qb4Var) {
        Runnable runnable;
        synchronized (this.f33129e) {
            runnable = (Runnable) ((LinkedHashMap) this.f33126b).remove(qb4Var);
        }
        if (runnable != null) {
            ((Handler) ((ar3) this.f33127c).f14813b).removeCallbacks(runnable);
        }
    }

    @Override // p000.t24
    public void writeTo(Object obj, xt4 xt4Var) throws IOException {
        i92 i92Var = (i92) this.f33128d;
        jc2 jc2Var = (jc2) ((wp1) this.f33129e).invoke();
        C1253ve c1253ve = new C1253ve();
        c1253ve.f32549b = xt4Var;
        a50 a50Var = a50.f108c;
        byte[] bArrM3452c = a50Var.m3452c(512);
        c1253ve.f32550c = bArrM3452c;
        r80 r80Var = r80.f29074c;
        c1253ve.f32551d = r80Var.m3453d(128);
        VarHandle.storeStoreFence();
        try {
            sc6.m10685z(i92Var, c1253ve, jc2Var, obj);
            c1253ve.m11876f();
            r80Var.m3451b((char[]) c1253ve.f32551d);
            a50Var.m3450a(bArrM3452c);
        } catch (Throwable th) {
            c1253ve.m11876f();
            r80.f29074c.m3451b((char[]) c1253ve.f32551d);
            a50.f108c.m3450a((byte[]) c1253ve.f32550c);
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m12148x(iz2 iz2Var, bz2 bz2Var) {
        jz2 jz2Var = (jz2) this.f33128d;
        if (jz2Var.f22759g != 0) {
            return;
        }
        dz2 dz2VarM7349c = jz2Var.m7349c(-1);
        jz2Var.f22758f = dz2VarM7349c;
        jz2Var.f22759g = -1;
        jz2Var.f22760h = iz2Var;
        if (bz2Var != null) {
            if (dz2VarM7349c != null) {
                dz2VarM7349c.f17530d = new mz2(bz2Var, -1);
                dz2VarM7349c.mo4815d(bz2Var);
            }
            ac4 ac4Var = jz2Var.f22753a;
            mz2 mz2Var = new mz2(bz2Var, -1);
            ac4Var.getClass();
            ac4Var.m200k(null, mz2Var);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m12149y(ec3 ec3Var, boolean z) {
        rc3 rc3Var = (rc3) this.f33126b;
        List list = ec3Var.f18000a;
        List list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (((lc3) list.get(i)).m7954c()) {
                m12131R(ec3Var);
                return;
            }
        }
        e13 e13Var = (e13) this.f33127c;
        if (e13Var == null) {
            C1077qn.m9989o("layoutCoordinates not set");
            return;
        }
        long jMo4005S = e13Var.mo4005S(0L);
        na1 na1Var = new na1((byte) 19);
        na1Var.f25595b = this;
        na1Var.f25596c = rc3Var;
        VarHandle.storeStoreFence();
        i20.m6573H(ec3Var, jMo4005S, na1Var, false);
        if (((qc3) this.f33128d) == qc3.f28384b) {
            if (z) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((lc3) list.get(i2)).m7952a();
                }
            }
            rd6 rd6Var = ec3Var.f18001b;
            if (rd6Var != null) {
                rd6Var.f29196b = !rc3Var.f29152c;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public pn1 m12150z(String str) {
        lo1 lo1Var = (lo1) ((HashMap) this.f33128d).get(str);
        if (lo1Var != null) {
            return lo1Var.f24224c;
        }
        return null;
    }

    public C1283w7(cf1 cf1Var, ro0 ro0Var) {
        this.f33125a = (byte) 7;
        this.f33127c = cf1Var;
        this.f33128d = ro0Var;
        this.f33129e = new i50((byte) 16);
        this.f33126b = v71.f32439a;
    }

    public C1283w7() {
        this.f33125a = (byte) 8;
        this.f33128d = new ArrayDeque();
        this.f33129e = new ArrayDeque();
        this.f33126b = new ArrayDeque();
    }

    public /* synthetic */ C1283w7(byte b) {
        this.f33125a = b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1283w7(ExecutorService executorService) {
        this();
        this.f33125a = (byte) 8;
        this.f33127c = executorService;
    }

    public C1283w7(Object obj, nq1 nq1Var, nq1 nq1Var2, C0928n c0928n) {
        this.f33125a = (byte) 17;
        this.f33127c = obj;
        this.f33128d = nq1Var;
        this.f33129e = nq1Var2;
        this.f33126b = c0928n;
    }

    public C1283w7(Matcher matcher, CharSequence charSequence) {
        this.f33125a = (byte) 13;
        this.f33127c = matcher;
        this.f33128d = charSequence;
        iq2 iq2Var = new iq2((byte) 0);
        iq2Var.f21635b = this;
        VarHandle.storeStoreFence();
        this.f33129e = iq2Var;
    }

    public C1283w7(InterfaceC0691gk interfaceC0691gk) {
        this.f33125a = (byte) 22;
        this.f33127c = interfaceC0691gk;
    }

    public C1283w7(di1 di1Var) {
        this.f33125a = (byte) 22;
        wd3 wd3Var = new wd3((byte) 18);
        wd3Var.f33259b = di1Var;
        VarHandle.storeStoreFence();
        this(wd3Var);
    }
}
