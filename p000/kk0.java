package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kk0 implements g62 {

    /* JADX INFO: renamed from: b */
    public static final kk0 f23190b = new kk0(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23191a;

    public /* synthetic */ kk0(byte b) {
        this.f23191a = b;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0149 A[Catch: IOException -> 0x00c4, TryCatch #5 {IOException -> 0x00c4, blocks: (B:51:0x00bf, B:54:0x00c7, B:61:0x00e8, B:62:0x0100, B:67:0x0126, B:69:0x013a, B:72:0x0143, B:79:0x0158, B:81:0x015c, B:85:0x016b, B:87:0x017e, B:89:0x0188, B:90:0x0192, B:74:0x0149, B:93:0x0195, B:94:0x0198, B:63:0x0104, B:66:0x010f), top: B:203:0x00bf, inners: #4 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [wo3] */
    /* JADX WARN: Type inference failed for: r0v35, types: [wo3] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    @Override // p000.g62
    public final xo3 intercept(nk3 nk3Var) throws Throwable {
        uv1 uv1Var;
        ?? r2;
        IOException iOException;
        ?? M5940d;
        boolean z = true;
        switch (this.f23191a) {
            case 0:
                ek3 ek3Var = nk3Var.f25906a;
                synchronized (ek3Var) {
                    try {
                        if (!ek3Var.f18182l) {
                            throw new IllegalStateException("released");
                        }
                        if (ek3Var.f18181k) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (ek3Var.f18180j) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                nb1 nb1Var = ek3Var.f18177g;
                h33 h33Var = ek3Var.f18171a;
                try {
                    mb1 mb1VarM6422b0 = nb1Var.m8679a(nk3Var.f25911f, nk3Var.f25912g, nk3Var.f25913h, h33Var.f20317f, !z62.m13387o(nk3Var.f25910e.f15463b, "GET")).m6422b0(h33Var, nk3Var);
                    g90 g90Var = new g90();
                    g90Var.f19662b = ek3Var;
                    g90Var.f19663c = nb1Var;
                    g90Var.f19664d = mb1VarM6422b0;
                    g90Var.f19665e = mb1VarM6422b0.mo5853h();
                    VarHandle.storeStoreFence();
                    ek3Var.f18179i = g90Var;
                    ek3Var.f18184n = g90Var;
                    synchronized (ek3Var) {
                        ek3Var.f18180j = true;
                        ek3Var.f18181k = true;
                    }
                    if (!ek3Var.f18183m) {
                        return nk3.m8791a(nk3Var, 0, g90Var, null, 61).m8792b(nk3Var.f25910e);
                    }
                    wb1.m12191j("Canceled");
                    return null;
                } catch (IOException e) {
                    nb1Var.m8680b(e);
                    throw new lr3(e);
                } catch (lr3 e2) {
                    nb1Var.m8680b(e2.f24317b);
                    throw e2;
                }
            case 1:
                System.currentTimeMillis();
                bo3 bo3Var = nk3Var.f25910e;
                byte b = 4;
                Object obj = null;
                nh3 nh3Var = new nh3(bo3Var, obj, b);
                if (bo3Var.m3643a().f34003j) {
                    nh3Var = new nh3(obj, obj, b);
                }
                bo3 bo3Var2 = (bo3) nh3Var.f25810b;
                xo3 xo3Var = (xo3) nh3Var.f25811c;
                if (bo3Var2 == null && xo3Var == null) {
                    wo3 wo3Var = new wo3();
                    wo3Var.f33549a = bo3Var;
                    wo3Var.f33550b = wh3.HTTP_1_1;
                    wo3Var.f33551c = 504;
                    wo3Var.f33552d = "Unsatisfiable Request (only-if-cached)";
                    wo3Var.f33555g = zv4.f36417c;
                    wo3Var.f33559k = -1L;
                    wo3Var.f33560l = System.currentTimeMillis();
                    return wo3Var.m12344a();
                }
                if (bo3Var2 == null) {
                    wo3 wo3VarM12724a = xo3Var.m12724a();
                    xo3 xo3VarM9079D = oh6.m9079D(xo3Var);
                    wo3.m12343b("cacheResponse", xo3VarM9079D);
                    wo3VarM12724a.f33557i = xo3VarM9079D;
                    return wo3VarM12724a.m12344a();
                }
                xo3 xo3VarM8792b = nk3Var.m8792b(bo3Var2);
                if (xo3Var != null) {
                    if (xo3VarM8792b.f34497d == 304) {
                        wo3 wo3VarM12724a2 = xo3Var.m12724a();
                        uv1 uv1Var2 = xo3Var.f34499f;
                        uv1 uv1Var3 = xo3VarM8792b.f34499f;
                        ArrayList arrayList = new ArrayList(20);
                        int size = uv1Var2.size();
                        int i = 0;
                        while (i < size) {
                            String strM11658b = uv1Var2.m11658b(i);
                            String strM11660d = uv1Var2.m11660d(i);
                            if ("Warning".equalsIgnoreCase(strM11658b)) {
                                uv1Var = uv1Var2;
                                if (od4.m9043X(strM11660d, "1", false)) {
                                }
                                i++;
                                uv1Var2 = uv1Var;
                            } else {
                                uv1Var = uv1Var2;
                            }
                            if ("Content-Length".equalsIgnoreCase(strM11658b) || "Content-Encoding".equalsIgnoreCase(strM11658b) || "Content-Type".equalsIgnoreCase(strM11658b) || !oh6.m9117w(strM11658b) || uv1Var3.m11657a(strM11658b) == null) {
                                arrayList.add(strM11658b);
                                arrayList.add(hd4.m6360z0(strM11660d).toString());
                            }
                            i++;
                            uv1Var2 = uv1Var;
                        }
                        int size2 = uv1Var3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            String strM11658b2 = uv1Var3.m11658b(i2);
                            if (!"Content-Length".equalsIgnoreCase(strM11658b2) && !"Content-Encoding".equalsIgnoreCase(strM11658b2) && !"Content-Type".equalsIgnoreCase(strM11658b2) && oh6.m9117w(strM11658b2)) {
                                String strM11660d2 = uv1Var3.m11660d(i2);
                                arrayList.add(strM11658b2);
                                arrayList.add(hd4.m6360z0(strM11660d2).toString());
                            }
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        tv1 tv1Var = new tv1((byte) 0);
                        tv1Var.f31466a.addAll(Arrays.asList(strArr));
                        wo3VarM12724a2.f33554f = tv1Var;
                        wo3VarM12724a2.f33559k = xo3VarM8792b.f34504k;
                        wo3VarM12724a2.f33560l = xo3VarM8792b.f34505l;
                        xo3 xo3VarM9079D2 = oh6.m9079D(xo3Var);
                        wo3.m12343b("cacheResponse", xo3VarM9079D2);
                        wo3VarM12724a2.f33557i = xo3VarM9079D2;
                        xo3 xo3VarM9079D3 = oh6.m9079D(xo3VarM8792b);
                        wo3.m12343b("networkResponse", xo3VarM9079D3);
                        wo3VarM12724a2.f33556h = xo3VarM9079D3;
                        wo3VarM12724a2.m12344a();
                        xo3VarM8792b.f34500g.close();
                        throw null;
                    }
                    d12 d12Var = xo3Var.f34500g;
                    if (d12Var != null) {
                        zv4.m13808c(d12Var);
                    }
                }
                wo3 wo3VarM12724a3 = xo3VarM8792b.m12724a();
                xo3 xo3VarM9079D4 = oh6.m9079D(xo3Var);
                wo3.m12343b("cacheResponse", xo3VarM9079D4);
                wo3VarM12724a3.f33557i = xo3VarM9079D4;
                xo3 xo3VarM9079D5 = oh6.m9079D(xo3VarM8792b);
                wo3.m12343b("networkResponse", xo3VarM9079D5);
                wo3VarM12724a3.f33556h = xo3VarM9079D5;
                return wo3VarM12724a3.m12344a();
            default:
                g90 g90Var2 = nk3Var.f25909d;
                ek3 ek3Var2 = (ek3) g90Var2.f19662b;
                mb1 mb1Var = (mb1) g90Var2.f19664d;
                hk3 hk3Var = (hk3) g90Var2.f19665e;
                bo3 bo3Var3 = nk3Var.f25910e;
                zi3 zi3Var = bo3Var3.f15465d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        mb1Var.mo5846a(bo3Var3);
                        ?? M7597D = ks5.m7597D(bo3Var3.f15463b);
                        try {
                            if (M7597D == 0 || zi3Var == null) {
                                ek3Var2.m5157h(g90Var2, true, false, null);
                                M7597D = 0;
                            } else {
                                if ("100-continue".equalsIgnoreCase(bo3Var3.f15464c.m11657a("Expect"))) {
                                    try {
                                        mb1Var.mo5849d();
                                        M7597D = g90Var2.m5940d(true);
                                    } catch (IOException e3) {
                                        g90Var2.m5941e(e3);
                                        throw e3;
                                    }
                                } else {
                                    M7597D = 0;
                                }
                                if (M7597D == 0) {
                                    long j = bo3Var3.f15465d.f36140a;
                                    yj3 yj3VarM13681m = zp0.m13681m(new kb1(g90Var2, mb1Var.mo5850e(bo3Var3, j), j));
                                    byte[] bArr = zi3Var.f36141b;
                                    int i3 = zi3Var.f36140a;
                                    if (yj3VarM13681m.f35267c) {
                                        throw new IllegalStateException("closed");
                                    }
                                    yj3VarM13681m.f35266b.m12051L(i3, bArr);
                                    yj3VarM13681m.m13147a();
                                    yj3VarM13681m.close();
                                } else {
                                    ek3Var2.m5157h(g90Var2, true, false, null);
                                    if (hk3Var.f20647o == null) {
                                        z = false;
                                    }
                                    if (!z) {
                                        mb1Var.mo5853h().m6423c0();
                                    }
                                }
                            }
                            try {
                                mb1Var.mo5848c();
                                M5940d = M7597D;
                                iOException = null;
                                if (M5940d == 0) {
                                    try {
                                        M5940d = g90Var2.m5940d(false);
                                    } catch (IOException e4) {
                                        if (iOException == null) {
                                            throw e4;
                                        }
                                        se0.m10720f(iOException, e4);
                                        throw iOException;
                                    }
                                }
                                M5940d.f33549a = bo3Var3;
                                M5940d.f33553e = hk3Var.f20645m;
                                M5940d.f33559k = jCurrentTimeMillis;
                                M5940d.f33560l = System.currentTimeMillis();
                                xo3 xo3VarM12344a = M5940d.m12344a();
                                int i4 = xo3VarM12344a.f34497d;
                                if (i4 == 100 || (102 <= i4 && i4 < 200)) {
                                    wo3 wo3VarM5940d = g90Var2.m5940d(false);
                                    wo3VarM5940d.f33549a = bo3Var3;
                                    wo3VarM5940d.f33553e = hk3Var.f20645m;
                                    wo3VarM5940d.f33559k = jCurrentTimeMillis;
                                    wo3VarM5940d.f33560l = System.currentTimeMillis();
                                    xo3VarM12344a = wo3VarM5940d.m12344a();
                                    i4 = xo3VarM12344a.f34497d;
                                }
                                wo3 wo3VarM12724a4 = xo3VarM12344a.m12724a();
                                try {
                                    String strM11657a = xo3VarM12344a.f34499f.m11657a("Content-Type");
                                    if (strM11657a == null) {
                                        strM11657a = null;
                                    }
                                    long jMo5851f = mb1Var.mo5851f(xo3VarM12344a);
                                    wo3VarM12724a4.f33555g = new rk3(strM11657a, jMo5851f, new ak3(new lb1(g90Var2, mb1Var.mo5847b(xo3VarM12344a), jMo5851f)));
                                    xo3 xo3VarM12344a2 = wo3VarM12724a4.m12344a();
                                    if ("close".equalsIgnoreCase(xo3VarM12344a2.f34494a.f15464c.m11657a("Connection"))) {
                                        mb1Var.mo5853h().m6423c0();
                                    } else {
                                        String strM11657a2 = xo3VarM12344a2.f34499f.m11657a("Connection");
                                        if (strM11657a2 == null) {
                                            strM11657a2 = null;
                                        }
                                        if ("close".equalsIgnoreCase(strM11657a2)) {
                                            mb1Var.mo5853h().m6423c0();
                                        }
                                    }
                                    if (i4 == 204 || i4 == 205) {
                                        d12 d12Var2 = xo3VarM12344a2.f34500g;
                                        if ((d12Var2 != null ? d12Var2.mo4275b() : -1L) > 0) {
                                            StringBuilder sb = new StringBuilder("HTTP ");
                                            sb.append(i4);
                                            sb.append(" had non-zero Content-Length: ");
                                            d12 d12Var3 = xo3VarM12344a2.f34500g;
                                            sb.append(d12Var3 != null ? Long.valueOf(d12Var3.mo4275b()) : null);
                                            throw new ProtocolException(sb.toString());
                                        }
                                    }
                                    return xo3VarM12344a2;
                                } catch (IOException e5) {
                                    g90Var2.m5941e(e5);
                                    throw e5;
                                }
                            } catch (IOException e6) {
                                g90Var2.m5941e(e6);
                                throw e6;
                            }
                        } catch (IOException e7) {
                            e = e7;
                            r2 = M7597D;
                            if (!(e instanceof mk0) || !g90Var2.f19661a) {
                                throw e;
                            }
                            ?? r18 = r2;
                            iOException = e;
                            M5940d = r18;
                        }
                    } catch (IOException e8) {
                        g90Var2.m5941e(e8);
                        throw e8;
                    }
                } catch (IOException e9) {
                    e = e9;
                    r2 = 0;
                    if (!(e instanceof mk0)) {
                        throw e;
                    }
                    throw e;
                }
                break;
        }
    }
}
