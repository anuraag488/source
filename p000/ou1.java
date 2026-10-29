package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.invoke.VarHandle;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ou1 {

    /* JADX INFO: renamed from: i */
    public static final gn1 f27107i = gn1.f19970d;

    /* JADX INFO: renamed from: j */
    public static final int f27108j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f27109k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f27110l = 2;

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f27111a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f27112b;

    /* JADX INFO: renamed from: c */
    public final z32 f27113c;

    /* JADX INFO: renamed from: d */
    public final l92 f27114d;

    /* JADX INFO: renamed from: e */
    public final List f27115e;

    /* JADX INFO: renamed from: f */
    public final boolean f27116f;

    /* JADX INFO: renamed from: g */
    public final boolean f27117g;

    /* JADX INFO: renamed from: h */
    public final gn1 f27118h;

    public ou1(qb1 qb1Var, int i, Map map, boolean z, gn1 gn1Var, List list, int i2, int i3, List list2) {
        t23 t23Var;
        i23 i23Var;
        this.f27111a = new ThreadLocal();
        this.f27112b = new ConcurrentHashMap();
        z32 z32Var = new z32((byte) 7);
        z32Var.f35738b = map;
        z32Var.f35739c = list2;
        VarHandle.storeStoreFence();
        this.f27113c = z32Var;
        this.f27116f = z;
        byte b = 1;
        this.f27117g = true;
        this.f27118h = gn1Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zr4.f36292A);
        if (i2 == 1) {
            t23Var = u23.f31624c;
        } else {
            t23 t23Var2 = u23.f31624c;
            t23Var = new t23();
            t23Var.f30735a = i2;
            VarHandle.storeStoreFence();
        }
        arrayList.add(t23Var);
        arrayList.add(qb1Var);
        arrayList.addAll(list);
        arrayList.add(zr4.f36309p);
        arrayList.add(zr4.f36300g);
        arrayList.add(zr4.f36297d);
        arrayList.add(zr4.f36298e);
        arrayList.add(zr4.f36299f);
        xq4 xq4Var = zr4.f36304k;
        arrayList.add(zr4.m13734b(Long.TYPE, Long.class, xq4Var));
        byte b2 = 0;
        arrayList.add(zr4.m13734b(Double.TYPE, Double.class, new lu1(b2)));
        arrayList.add(zr4.m13734b(Float.TYPE, Float.class, new lu1(b)));
        if (i3 == 2) {
            i23Var = j23.f21965b;
        } else {
            j23 j23Var = new j23();
            j23Var.f21966a = i3;
            VarHandle.storeStoreFence();
            i23 i23Var2 = new i23(b2);
            i23Var2.f21063b = j23Var;
            VarHandle.storeStoreFence();
            i23Var = i23Var2;
        }
        arrayList.add(i23Var);
        arrayList.add(zr4.f36301h);
        arrayList.add(zr4.f36302i);
        mu1 mu1Var = new mu1(b2);
        mu1Var.f25219b = xq4Var;
        VarHandle.storeStoreFence();
        arrayList.add(zr4.m13733a(AtomicLong.class, mu1Var.m11626a()));
        mu1 mu1Var2 = new mu1(b);
        mu1Var2.f25219b = xq4Var;
        VarHandle.storeStoreFence();
        arrayList.add(zr4.m13733a(AtomicLongArray.class, mu1Var2.m11626a()));
        arrayList.add(zr4.f36303j);
        arrayList.add(zr4.f36305l);
        arrayList.add(zr4.f36310q);
        arrayList.add(zr4.f36311r);
        arrayList.add(zr4.m13733a(BigDecimal.class, zr4.f36306m));
        arrayList.add(zr4.m13733a(BigInteger.class, zr4.f36307n));
        arrayList.add(zr4.m13733a(ng2.class, zr4.f36308o));
        arrayList.add(zr4.f36312s);
        arrayList.add(zr4.f36313t);
        arrayList.add(zr4.f36315v);
        arrayList.add(zr4.f36316w);
        arrayList.add(zr4.f36318y);
        arrayList.add(zr4.f36314u);
        arrayList.add(zr4.f36295b);
        arrayList.add(rv0.f29656c);
        arrayList.add(zr4.f36317x);
        if (jb4.f22154a) {
            arrayList.add(jb4.f22156c);
            arrayList.add(jb4.f22155b);
            arrayList.add(jb4.f22157d);
        }
        arrayList.add(C0953no.f25975c);
        arrayList.add(zr4.f36294a);
        gb0 gb0Var = new gb0(b2);
        gb0Var.f19701b = z32Var;
        VarHandle.storeStoreFence();
        arrayList.add(gb0Var);
        gb0 gb0Var2 = new gb0(b);
        gb0Var2.f19701b = z32Var;
        VarHandle.storeStoreFence();
        arrayList.add(gb0Var2);
        l92 l92Var = new l92();
        l92Var.f23876a = z32Var;
        l92Var.f23877b = new ConcurrentHashMap();
        VarHandle.storeStoreFence();
        this.f27114d = l92Var;
        arrayList.add(l92Var);
        arrayList.add(zr4.f36293B);
        bm3 bm3Var = new bm3();
        bm3Var.f15413a = z32Var;
        bm3Var.f15414b = i;
        bm3Var.f15415c = qb1Var;
        bm3Var.f15416d = l92Var;
        bm3Var.f15417e = list2;
        VarHandle.storeStoreFence();
        arrayList.add(bm3Var);
        this.f27115e = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m9268a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m9269b(kb2 kb2Var, cs4 cs4Var) {
        int i = kb2Var.f23055o;
        boolean z = true;
        if (i == 2) {
            kb2Var.f23055o = 1;
        }
        try {
            try {
                try {
                    try {
                        try {
                            kb2Var.mo7481R();
                            z = false;
                            uq4 uq4VarM9271d = m9271d(cs4Var);
                            Class cls = cs4Var.f16429a;
                            Object objMo166b = uq4VarM9271d.mo166b(kb2Var);
                            Class clsM7378L = k43.m7378L(cls);
                            if (objMo166b != null && !clsM7378L.isInstance(objMo166b)) {
                                throw new ClassCastException("Type adapter '" + uq4VarM9271d + "' returned wrong type; requested " + cls + " but got instance of " + objMo166b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            kb2Var.m7484U(i);
                            return objMo166b;
                        } catch (AssertionError e) {
                            throw new AssertionError("AssertionError (GSON 2.13.2): " + e.getMessage(), e);
                        }
                    } catch (EOFException e2) {
                        if (!z) {
                            throw new lb2(e2);
                        }
                        kb2Var.m7484U(i);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    throw new lb2(e3);
                }
            } catch (IOException e4) {
                throw new lb2(e4);
            }
        } catch (Throwable th) {
            kb2Var.m7484U(i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m9270c(String str, cs4 cs4Var) {
        if (str == null) {
            return null;
        }
        kb2 kb2Var = new kb2(new StringReader(str));
        kb2Var.m7484U(2);
        Object objM9269b = m9269b(kb2Var, cs4Var);
        if (objM9269b != null) {
            try {
                if (kb2Var.mo7481R() != 10) {
                    throw new lb2("JSON document was not fully consumed.");
                }
            } catch (op2 e) {
                throw new lb2(e);
            } catch (IOException e2) {
                throw new ia2(e2);
            }
        }
        return objM9269b;
    }

    /* JADX INFO: renamed from: d */
    public final uq4 m9271d(cs4 cs4Var) {
        boolean z;
        Objects.requireNonNull(cs4Var, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f27112b;
        uq4 uq4Var = (uq4) concurrentHashMap.get(cs4Var);
        if (uq4Var != null) {
            return uq4Var;
        }
        ThreadLocal threadLocal = this.f27111a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            uq4 uq4Var2 = (uq4) map.get(cs4Var);
            if (uq4Var2 != null) {
                return uq4Var2;
            }
            z = false;
        }
        try {
            nu1 nu1Var = new nu1();
            map.put(cs4Var, nu1Var);
            Iterator it = this.f27115e.iterator();
            uq4 uq4VarMo3628a = null;
            while (it.hasNext()) {
                uq4VarMo3628a = ((vq4) it.next()).mo3628a(this, cs4Var);
                if (uq4VarMo3628a != null) {
                    if (nu1Var.f26092a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    nu1Var.f26092a = uq4VarMo3628a;
                    map.put(cs4Var, uq4VarMo3628a);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (uq4VarMo3628a == null) {
                wb1.m12195o(cs4Var, "GSON (2.13.2) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return uq4VarMo3628a;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX INFO: renamed from: e */
    public final uq4 m9272e(vq4 vq4Var, cs4 cs4Var) {
        Objects.requireNonNull(vq4Var, "skipPast must not be null");
        Objects.requireNonNull(cs4Var, "type must not be null");
        l92 l92Var = this.f27114d;
        l92Var.getClass();
        ConcurrentHashMap concurrentHashMap = l92Var.f23877b;
        if (vq4Var == l92.f23874c) {
            vq4Var = l92Var;
        } else {
            Class cls = cs4Var.f16429a;
            vq4 vq4Var2 = (vq4) concurrentHashMap.get(cls);
            if (vq4Var2 == null) {
                j92 j92Var = (j92) cls.getAnnotation(j92.class);
                if (j92Var != null) {
                    Class clsValue = j92Var.value();
                    if (vq4.class.isAssignableFrom(clsValue)) {
                        vq4 vq4Var3 = (vq4) l92Var.f23876a.m13329z(new cs4(clsValue), true).mo7823g();
                        vq4 vq4Var4 = (vq4) concurrentHashMap.putIfAbsent(cls, vq4Var3);
                        if (vq4Var4 != null) {
                            vq4Var3 = vq4Var4;
                        }
                        if (vq4Var3 == vq4Var) {
                            vq4Var = l92Var;
                        }
                    }
                }
            } else if (vq4Var2 == vq4Var) {
                vq4Var = l92Var;
            }
        }
        boolean z = false;
        for (vq4 vq4Var5 : this.f27115e) {
            if (z) {
                uq4 uq4VarMo3628a = vq4Var5.mo3628a(this, cs4Var);
                if (uq4VarMo3628a != null) {
                    return uq4VarMo3628a;
                }
            } else if (vq4Var5 == vq4Var) {
                z = true;
            }
        }
        if (!z) {
            return m9271d(cs4Var);
        }
        wb1.m12195o(cs4Var, "GSON cannot serialize or deserialize ");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final yb2 m9273f(Writer writer) {
        yb2 yb2Var = new yb2(writer);
        yb2Var.m13087v(this.f27118h);
        yb2Var.f35098i = this.f27117g;
        yb2Var.m13080A(2);
        yb2Var.f35100k = this.f27116f;
        return yb2Var;
    }

    /* JADX INFO: renamed from: g */
    public final String m9274g(ba2 ba2Var) {
        StringBuilder sb = new StringBuilder();
        try {
            m9276i(ba2Var, m9273f(new ad4(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new ia2(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final String m9275h(Object obj) {
        if (obj == null) {
            return m9274g(sa2.f30035a);
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            m9277j(obj, cls, m9273f(new ad4(sb)));
            return sb.toString();
        } catch (IOException e) {
            throw new ia2(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9276i(ba2 ba2Var, yb2 yb2Var) {
        int i = yb2Var.f35097h;
        boolean z = yb2Var.f35098i;
        boolean z2 = yb2Var.f35100k;
        yb2Var.f35098i = this.f27117g;
        yb2Var.f35100k = this.f27116f;
        if (i == 2) {
            yb2Var.f35097h = 1;
        }
        try {
            try {
                ga2 ga2Var = zr4.f36319z;
                ga2Var.getClass();
                ga2Var.mo167c(ba2Var, yb2Var);
                yb2Var.m13080A(i);
                yb2Var.f35098i = z;
                yb2Var.f35100k = z2;
            } catch (IOException e) {
                throw new ia2(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            yb2Var.m13080A(i);
            yb2Var.f35098i = z;
            yb2Var.f35100k = z2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9277j(Object obj, Class cls, yb2 yb2Var) {
        uq4 uq4VarM9271d = m9271d(new cs4(cls));
        int i = yb2Var.f35097h;
        if (i == 2) {
            yb2Var.f35097h = 1;
        }
        boolean z = yb2Var.f35098i;
        boolean z2 = yb2Var.f35100k;
        yb2Var.f35098i = this.f27117g;
        yb2Var.f35100k = this.f27116f;
        try {
            try {
                uq4VarM9271d.mo167c(yb2Var, obj);
                yb2Var.m13080A(i);
                yb2Var.f35098i = z;
                yb2Var.f35100k = z2;
            } catch (IOException e) {
                throw new ia2(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            yb2Var.m13080A(i);
            yb2Var.f35098i = z;
            yb2Var.f35100k = z2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final ba2 m9278k(Object obj) {
        sa2 sa2Var = sa2.f30035a;
        if (obj == null) {
            return sa2Var;
        }
        Class cls = obj.getClass();
        wb2 wb2Var = new wb2(wb2.f33213r);
        wb2Var.f33215o = new ArrayList();
        wb2Var.f33217q = sa2Var;
        VarHandle.storeStoreFence();
        m9277j(obj, cls, wb2Var);
        ArrayList arrayList = wb2Var.f33215o;
        if (arrayList.isEmpty()) {
            return wb2Var.f33217q;
        }
        wb1.m12196p(arrayList, "Expected one JSON element but was ");
        return null;
    }

    public final String toString() {
        return "{serializeNulls:" + this.f27116f + ",factories:" + this.f27115e + ",instanceCreators:" + this.f27113c + "}";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ou1() {
        qb1 qb1Var = qb1.f28357c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(qb1Var, f27108j, map, false, f27107i, list, f27109k, f27110l, list);
    }
}
