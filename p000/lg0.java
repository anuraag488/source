package p000;

import android.app.Application;
import android.content.Context;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lg0 implements cg0, ai3, dr6 {

    /* JADX INFO: renamed from: h */
    public static final jg0 f24015h = new jg0((byte) 0);

    /* JADX INFO: renamed from: a */
    public Object f24016a;

    /* JADX INFO: renamed from: b */
    public Object f24017b;

    /* JADX INFO: renamed from: c */
    public Object f24018c;

    /* JADX INFO: renamed from: d */
    public Object f24019d;

    /* JADX INFO: renamed from: e */
    public Object f24020e;

    /* JADX INFO: renamed from: f */
    public Object f24021f;

    /* JADX INFO: renamed from: g */
    public Object f24022g;

    @Override // p000.cg0
    /* JADX INFO: renamed from: b */
    public synchronized bi3 mo4018b(ni3 ni3Var) {
        wi2 wi2Var = (wi2) ((HashMap) this.f24018c).get(ni3Var);
        if (wi2Var != null) {
            return wi2Var;
        }
        return f24015h;
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: e */
    public z53 mo4021e(ni3 ni3Var) {
        bi3 bi3VarMo4022f = mo4022f(ni3Var);
        if (bi3VarMo4022f == null) {
            return new z53(z53.f35757c, z53.f35758d);
        }
        return bi3VarMo4022f instanceof z53 ? (z53) bi3VarMo4022f : new z53(null, bi3VarMo4022f);
    }

    @Override // p000.cg0
    /* JADX INFO: renamed from: f */
    public synchronized bi3 mo4022f(ni3 ni3Var) {
        ev0.m5342Q(ni3Var, "Null interface requested.");
        return (bi3) ((HashMap) this.f24017b).get(ni3Var);
    }

    @Override // p000.ai3
    public Object get() {
        Context context = (Context) ((ai3) this.f24016a).get();
        vs2 vs2Var = (vs2) ((ai3) this.f24017b).get();
        pt3 pt3Var = (pt3) ((ai3) this.f24018c).get();
        jp0 jp0Var = (jp0) ((tt2) this.f24019d).get();
        Executor executor = (Executor) ((ai3) this.f24020e).get();
        pt3 pt3Var2 = (pt3) ((ai3) this.f24021f).get();
        r50 r50Var = new r50((byte) 22);
        f70 f70Var = new f70((byte) 21);
        pt3 pt3Var3 = (pt3) ((ai3) this.f24022g).get();
        wo5 wo5Var = new wo5();
        wo5Var.f33566a = context;
        wo5Var.f33567b = vs2Var;
        wo5Var.f33568c = pt3Var;
        wo5Var.f33569d = jp0Var;
        wo5Var.f33570e = executor;
        wo5Var.f33571f = pt3Var2;
        wo5Var.f33572g = r50Var;
        wo5Var.f33573h = f70Var;
        wo5Var.f33574i = pt3Var3;
        VarHandle.storeStoreFence();
        return wo5Var;
    }

    /* JADX INFO: renamed from: h */
    public bs3 m7962h() throws GeneralSecurityException {
        w42 w42Var;
        w42 w42Var2;
        gs3 gs3Var = (gs3) this.f24016a;
        if (gs3Var == null) {
            xy4.m12788q("Cannot build without a RSA SSA PKCS1 public key");
            return null;
        }
        w42 w42Var3 = (w42) this.f24018c;
        if (w42Var3 == null || (w42Var = (w42) this.f24019d) == null) {
            xy4.m12788q("Cannot build without prime factors");
            return null;
        }
        w42 w42Var4 = (w42) this.f24017b;
        if (w42Var4 == null) {
            xy4.m12788q("Cannot build without private exponent");
            return null;
        }
        w42 w42Var5 = (w42) this.f24020e;
        if (w42Var5 == null || (w42Var2 = (w42) this.f24021f) == null) {
            xy4.m12788q("Cannot build without prime exponents");
            return null;
        }
        w42 w42Var6 = (w42) this.f24022g;
        if (w42Var6 == null) {
            xy4.m12788q("Cannot build without CRT coefficient");
            return null;
        }
        BigInteger bigInteger = gs3Var.f20093u.f34565b;
        BigInteger bigInteger2 = gs3Var.f20094v;
        BigInteger bigInteger3 = (BigInteger) w42Var3.f33090b;
        BigInteger bigInteger4 = (BigInteger) w42Var.f33090b;
        BigInteger bigInteger5 = (BigInteger) w42Var4.f33090b;
        BigInteger bigInteger6 = (BigInteger) w42Var5.f33090b;
        BigInteger bigInteger7 = (BigInteger) w42Var2.f33090b;
        BigInteger bigInteger8 = (BigInteger) w42Var6.f33090b;
        if (!bigInteger3.isProbablePrime(10)) {
            xy4.m12788q("p is not a prime");
            return null;
        }
        if (!bigInteger4.isProbablePrime(10)) {
            xy4.m12788q("q is not a prime");
            return null;
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            xy4.m12788q("Prime p times prime q is not equal to the public key's modulus");
            return null;
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            xy4.m12788q("D is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            xy4.m12788q("dP is invalid.");
            return null;
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            xy4.m12788q("dQ is invalid.");
            return null;
        }
        if (!bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            xy4.m12788q("qInv is invalid.");
            return null;
        }
        gs3 gs3Var2 = (gs3) this.f24016a;
        w42 w42Var7 = (w42) this.f24018c;
        w42 w42Var8 = (w42) this.f24019d;
        w42 w42Var9 = (w42) this.f24017b;
        w42 w42Var10 = (w42) this.f24020e;
        w42 w42Var11 = (w42) this.f24021f;
        w42 w42Var12 = (w42) this.f24022g;
        bs3 bs3Var = new bs3();
        bs3Var.f15548u = gs3Var2;
        bs3Var.f15550w = w42Var7;
        bs3Var.f15551x = w42Var8;
        bs3Var.f15549v = w42Var9;
        bs3Var.f15552y = w42Var10;
        bs3Var.f15553z = w42Var11;
        bs3Var.f15547A = w42Var12;
        VarHandle.storeStoreFence();
        return bs3Var;
    }

    /* JADX INFO: renamed from: i */
    public void m7963i(Map map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            qf0 qf0Var = (qf0) entry.getKey();
            bi3 bi3Var = (bi3) entry.getValue();
            byte b = qf0Var.f28431d;
            if (b == 1 || (b == 2 && z)) {
                bi3Var.get();
            }
        }
        wa1 wa1Var = (wa1) this.f24020e;
        synchronized (wa1Var) {
            try {
                arrayDeque = wa1Var.f33191b;
                if (arrayDeque != null) {
                    wa1Var.f33191b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                xy4.m12778e();
            }
        }
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public Object mo4146j() {
        Application application = (Application) ((C1392z4) this.f24016a).f35744a;
        wu5 wu5Var = (wu5) ((cr6) this.f24018c).mo4146j();
        mq5 mq5Var = (mq5) ((cr6) this.f24019d).mo4146j();
        hu5 hu5Var = (hu5) ((C1392z4) this.f24020e).f35744a;
        fx5 fx5Var = (fx5) ((cr6) this.f24022g).mo4146j();
        yg3 yg3Var = (yg3) this.f24021f;
        ts5 ts5Var = new ts5();
        ts5Var.f31396i = new AtomicBoolean();
        ts5Var.f31397j = new AtomicReference();
        ts5Var.f31398k = new AtomicReference();
        ts5Var.f31399l = new AtomicReference();
        ts5Var.f31400m = false;
        ts5Var.f31401n = false;
        ts5Var.f31388a = application;
        ts5Var.f31389b = wu5Var;
        ts5Var.f31390c = mq5Var;
        ts5Var.f31391d = hu5Var;
        ts5Var.f31392e = yg3Var;
        ts5Var.f31393f = fx5Var;
        VarHandle.storeStoreFence();
        return ts5Var;
    }

    /* JADX INFO: renamed from: k */
    public void m7964k() {
        HashMap map = (HashMap) this.f24017b;
        HashMap map2 = (HashMap) this.f24018c;
        for (qf0 qf0Var : ((HashMap) this.f24016a).keySet()) {
            for (ny0 ny0Var : qf0Var.f28430c) {
                boolean z = ny0Var.f26189b == 2;
                ni3 ni3Var = ny0Var.f26188a;
                if (z && !map2.containsKey(ni3Var)) {
                    Set set = Collections.EMPTY_SET;
                    wi2 wi2Var = new wi2();
                    wi2Var.f33408b = null;
                    wi2Var.f33407a = Collections.newSetFromMap(new ConcurrentHashMap());
                    wi2Var.f33407a.addAll(set);
                    map2.put(ni3Var, wi2Var);
                } else if (map.containsKey(ni3Var)) {
                    continue;
                } else {
                    byte b = ny0Var.f26189b;
                    if (b == 1) {
                        throw new py0("Unsatisfied dependency for component " + qf0Var + ": " + ni3Var);
                    }
                    if (b != 2) {
                        map.put(ni3Var, new z53(z53.f35757c, z53.f35758d));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public ArrayList m7965l(ArrayList arrayList) {
        HashMap map = (HashMap) this.f24017b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            qf0 qf0Var = (qf0) obj;
            if (!qf0Var.f28432e) {
                bi3 bi3Var = (bi3) ((HashMap) this.f24016a).get(qf0Var);
                for (ni3 ni3Var : qf0Var.f28429b) {
                    if (map.containsKey(ni3Var)) {
                        z53 z53Var = (z53) ((bi3) map.get(ni3Var));
                        RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 4);
                        runnableC1285w9.f33164b = z53Var;
                        runnableC1285w9.f33165c = bi3Var;
                        VarHandle.storeStoreFence();
                        arrayList2.add(runnableC1285w9);
                    } else {
                        map.put(ni3Var, bi3Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public ArrayList m7966m() {
        HashMap map = (HashMap) this.f24018c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f24016a).entrySet()) {
            qf0 qf0Var = (qf0) entry.getKey();
            if (qf0Var.f28432e) {
                bi3 bi3Var = (bi3) entry.getValue();
                for (ni3 ni3Var : qf0Var.f28429b) {
                    if (!map2.containsKey(ni3Var)) {
                        map2.put(ni3Var, new HashSet());
                    }
                    ((Set) map2.get(ni3Var)).add(bi3Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                wi2 wi2Var = (wi2) map.get(entry2.getKey());
                for (bi3 bi3Var2 : (Set) entry2.getValue()) {
                    RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 5);
                    runnableC1285w9.f33164b = wi2Var;
                    runnableC1285w9.f33165c = bi3Var2;
                    VarHandle.storeStoreFence();
                    arrayList.add(runnableC1285w9);
                }
            } else {
                ni3 ni3Var2 = (ni3) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                wi2 wi2Var2 = new wi2();
                wi2Var2.f33408b = null;
                wi2Var2.f33407a = Collections.newSetFromMap(new ConcurrentHashMap());
                wi2Var2.f33407a.addAll(set);
                map.put(ni3Var2, wi2Var2);
            }
        }
        return arrayList;
    }
}
