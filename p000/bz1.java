package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bz1 implements oe1 {

    /* JADX INFO: renamed from: e */
    public static final x50 f15693e = new x50(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: f */
    public static final x50 f15694f = new x50(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* JADX INFO: renamed from: a */
    public String f15695a;

    /* JADX INFO: renamed from: b */
    public b63 f15696b;

    /* JADX INFO: renamed from: c */
    public dg4 f15697c;

    /* JADX INFO: renamed from: d */
    public dg4 f15698d;

    /* JADX INFO: renamed from: d */
    public static String m3766d(String str, qr2 qr2Var) {
        String strM6199b;
        String str2 = qr2Var != null ? qr2Var.f28728a : null;
        if ((str2 == null || od4.m9043X(str2, "text/plain", false)) && (strM6199b = AbstractC0707h.m6199b(MimeTypeMap.getSingleton(), str)) != null) {
            return strM6199b;
        }
        if (str2 == null) {
            return null;
        }
        int iM6342h0 = hd4.m6342h0(str2, ';', 0, 6);
        return iM6342h0 == -1 ? str2 : str2.substring(0, iM6342h0);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e1 A[Catch: Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, blocks: (B:85:0x01db, B:87:0x01e1, B:89:0x01fe, B:91:0x0203, B:90:0x0201, B:95:0x020a, B:96:0x020f), top: B:114:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01fe A[Catch: Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, blocks: (B:85:0x01db, B:87:0x01e1, B:89:0x01fe, B:91:0x0203, B:90:0x0201, B:95:0x020a, B:96:0x020f), top: B:114:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0201 A[Catch: Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, blocks: (B:85:0x01db, B:87:0x01e1, B:89:0x01fe, B:91:0x0203, B:90:0x0201, B:95:0x020a, B:96:0x020f), top: B:114:0x01db }] */
    /* JADX WARN: Code duplicated, block: B:95:0x020a A[Catch: Exception -> 0x0207, TryCatch #4 {Exception -> 0x0207, blocks: (B:85:0x01db, B:87:0x01e1, B:89:0x01fe, B:91:0x0203, B:90:0x0201, B:95:0x020a, B:96:0x020f), top: B:114:0x01db }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [b63] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v22 */
    @Override // p000.oe1
    /* JADX INFO: renamed from: a */
    public final Object mo3767a(wm0 wm0Var) throws Exception {
        az1 az1Var;
        ik3 ik3Var;
        e60 e60VarM4380a;
        Object objM3768b;
        jk3 jk3Var;
        ik3 ik3Var2;
        xo3 xo3Var;
        xo3 xo3Var2;
        d12 d12Var;
        kt0 kt0Var;
        bz1 bz1Var = this;
        ?? r2 = bz1Var.f15696b;
        String str = bz1Var.f15695a;
        if (wm0Var instanceof az1) {
            az1Var = (az1) wm0Var;
            int i = az1Var.f14956y;
            if ((i & Integer.MIN_VALUE) != 0) {
                az1Var.f14956y = i - Integer.MIN_VALUE;
            } else {
                az1Var = new az1(bz1Var, (ym0) wm0Var);
            }
        } else {
            az1Var = new az1(bz1Var, (ym0) wm0Var);
        }
        Object obj = az1Var.f14954w;
        ap0 ap0Var = ap0.f14763a;
        int i2 = az1Var.f14956y;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                if (!r2.f15122n.f127a || (jk3Var = (jk3) bz1Var.f15698d.getValue()) == null) {
                    ik3Var = null;
                } else {
                    String str2 = r2.f15117i;
                    if (str2 == null) {
                        str2 = str;
                    }
                    d01 d01Var = jk3Var.f22349b;
                    byte[] bytes = str2.getBytes(z80.f35863a);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(bytes, 0, bytes.length);
                    byte[] bArrDigest = messageDigest.digest();
                    char[] cArr = new char[bArrDigest.length * 2];
                    int i3 = 0;
                    for (byte b : bArrDigest) {
                        int i4 = i3 + 1;
                        char[] cArr2 = AbstractC0647fd.f18911a;
                        cArr[i3] = cArr2[(b >> 4) & 15];
                        i3 += 2;
                        cArr[i4] = cArr2[b & 15];
                    }
                    b01 b01VarM4248e = d01Var.m4248e(new String(cArr));
                    if (b01VarM4248e != null) {
                        ik3Var = new ik3(b01VarM4248e);
                    } else {
                        ik3Var = null;
                    }
                }
                if (ik3Var != null) {
                    jf1 jf1VarM3769c = bz1Var.m3769c();
                    b01 b01Var = ik3Var.f21518a;
                    if (b01Var.f14978b) {
                        throw new IllegalStateException("snapshot is closed");
                    }
                    Long l = jf1VarM3769c.m7090l((p83) b01Var.f14977a.f11c.get(0)).f34193d;
                    if (l != null && l.longValue() == 0) {
                        return new oa4(bz1Var.m3772g(ik3Var), m3766d(str, null), kt0.f23415c);
                    }
                    e60VarM4380a = new d60(bz1Var.m3770e(), bz1Var.m3771f(ik3Var)).m4380a();
                    c60 c60Var = e60VarM4380a.f17835b;
                    if (e60VarM4380a.f17834a == null && c60Var != null) {
                        return new oa4(bz1Var.m3772g(ik3Var), m3766d(str, (qr2) c60Var.f15829b.getValue()), kt0.f23415c);
                    }
                } else {
                    e60VarM4380a = new d60(bz1Var.m3770e(), null).m4380a();
                }
                bo3 bo3Var = e60VarM4380a.f17834a;
                az1Var.f14951t = bz1Var;
                az1Var.f14952u = ik3Var;
                az1Var.f14953v = e60VarM4380a;
                az1Var.f14956y = 1;
                objM3768b = bz1Var.m3768b(bo3Var, az1Var);
                if (objM3768b == ap0Var) {
                }
                return ap0Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xo3Var = (xo3) az1Var.f14953v;
                ik3Var2 = az1Var.f14952u;
                bz1Var = az1Var.f14951t;
                try {
                    k43.m7376J(obj);
                    xo3Var2 = (xo3) obj;
                    try {
                        Bitmap.Config[] configArr = AbstractC0707h.f20231a;
                        d12Var = xo3Var2.f34500g;
                        if (d12Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        k40 k40VarMo4278j = d12Var.mo4278j();
                        Context context = bz1Var.f15696b.f15109a;
                        ka4 ka4Var = new ka4(k40VarMo4278j, null);
                        String strM3766d = m3766d(bz1Var.f15695a, d12Var.mo4276e());
                        if (xo3Var2.f34501h != null) {
                            kt0Var = kt0.f23416d;
                        } else {
                            kt0Var = kt0.f23415c;
                        }
                        return new oa4(ka4Var, strM3766d, kt0Var);
                    } catch (Exception e) {
                        e = e;
                        xo3Var = xo3Var2;
                        try {
                            AbstractC0707h.m6198a(xo3Var);
                            throw e;
                        } catch (Exception e2) {
                            e = e2;
                            r2 = ik3Var2;
                            if (r2 != 0) {
                                AbstractC0707h.m6198a(r2);
                            }
                            throw e;
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    AbstractC0707h.m6198a(xo3Var);
                    throw e;
                }
            }
            e60 e60Var = (e60) az1Var.f14953v;
            ik3Var = az1Var.f14952u;
            bz1 bz1Var2 = az1Var.f14951t;
            k43.m7376J(obj);
            e60VarM4380a = e60Var;
            bz1Var = bz1Var2;
            objM3768b = obj;
            xo3 xo3Var3 = (xo3) objM3768b;
            Bitmap.Config[] configArr2 = AbstractC0707h.f20231a;
            d12 d12Var2 = xo3Var3.f34500g;
            if (d12Var2 == null) {
                throw new IllegalStateException("response body == null");
            }
            try {
                ik3 ik3VarM3773h = bz1Var.m3773h(ik3Var, e60VarM4380a.f17834a, xo3Var3, e60VarM4380a.f17835b);
                String str3 = bz1Var.f15695a;
                try {
                    if (ik3VarM3773h != null) {
                        ue1 ue1VarM3772g = bz1Var.m3772g(ik3VarM3773h);
                        c60 c60VarM3771f = bz1Var.m3771f(ik3VarM3773h);
                        return new oa4(ue1VarM3772g, m3766d(str3, c60VarM3771f != null ? (qr2) c60VarM3771f.f15829b.getValue() : null), kt0.f23416d);
                    }
                    if (d12Var2.mo4278j().mo3028i(1L)) {
                        k40 k40VarMo4278j2 = d12Var2.mo4278j();
                        Context context2 = bz1Var.f15696b.f15109a;
                        return new oa4(new ka4(k40VarMo4278j2, null), m3766d(str3, d12Var2.mo4276e()), xo3Var3.f34501h != null ? kt0.f23416d : kt0.f23415c);
                    }
                    AbstractC0707h.m6198a(xo3Var3);
                    bo3 bo3VarM3770e = bz1Var.m3770e();
                    az1Var.f14951t = bz1Var;
                    az1Var.f14952u = ik3VarM3773h;
                    az1Var.f14953v = xo3Var3;
                    az1Var.f14956y = 2;
                    Object objM3768b2 = bz1Var.m3768b(bo3VarM3770e, az1Var);
                    if (objM3768b2 != ap0Var) {
                        ik3Var2 = ik3VarM3773h;
                        obj = objM3768b2;
                        xo3Var = xo3Var3;
                        xo3Var2 = (xo3) obj;
                        Bitmap.Config[] configArr3 = AbstractC0707h.f20231a;
                        d12Var = xo3Var2.f34500g;
                        if (d12Var != null) {
                            throw new IllegalStateException("response body == null");
                        }
                        k40 k40VarMo4278j3 = d12Var.mo4278j();
                        Context context3 = bz1Var.f15696b.f15109a;
                        ka4 ka4Var2 = new ka4(k40VarMo4278j3, null);
                        String strM3766d2 = m3766d(bz1Var.f15695a, d12Var.mo4276e());
                        if (xo3Var2.f34501h != null) {
                            kt0Var = kt0.f23416d;
                        } else {
                            kt0Var = kt0.f23415c;
                        }
                        return new oa4(ka4Var2, strM3766d2, kt0Var);
                    }
                    return ap0Var;
                } catch (Exception e4) {
                    e = e4;
                    xo3Var = xo3Var3;
                    ik3Var2 = ik3VarM3773h;
                    AbstractC0707h.m6198a(xo3Var);
                    throw e;
                }
            } catch (Exception e5) {
                e = e5;
                ik3Var2 = ik3Var;
                xo3Var = xo3Var3;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m3768b(bo3 bo3Var, ym0 ym0Var) {
        zy1 zy1Var;
        xo3 xo3VarM5156g;
        int i;
        d12 d12Var;
        if (ym0Var instanceof zy1) {
            zy1Var = (zy1) ym0Var;
            int i2 = zy1Var.f36465v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zy1Var.f36465v = i2 - Integer.MIN_VALUE;
            } else {
                zy1Var = new zy1(this, ym0Var);
            }
        } else {
            zy1Var = new zy1(this, ym0Var);
        }
        Object objM3495r = zy1Var.f36463t;
        ap0 ap0Var = ap0.f14763a;
        int i3 = zy1Var.f36465v;
        if (i3 == 0) {
            k43.m7376J(objM3495r);
            Bitmap.Config[] configArr = AbstractC0707h.f20231a;
            if (!z62.m13387o(Looper.myLooper(), Looper.getMainLooper())) {
                h33 h33Var = (h33) this.f15697c.getValue();
                h33Var.getClass();
                ek3 ek3Var = new ek3(h33Var, bo3Var);
                zy1Var.f36465v = 1;
                b70 b70Var = new b70(1, C0006a5.m86x(zy1Var));
                b70Var.m3497u();
                C0686gf c0686gf = new C0686gf((byte) 3);
                c0686gf.f19762b = ek3Var;
                c0686gf.f19763c = b70Var;
                VarHandle.storeStoreFence();
                ek3Var.m5154e(c0686gf);
                b70Var.m3499w(c0686gf);
                objM3495r = b70Var.m3495r();
                if (objM3495r == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (this.f15696b.f15123o.f127a) {
                    throw new NetworkOnMainThreadException();
                }
                h33 h33Var2 = (h33) this.f15697c.getValue();
                h33Var2.getClass();
                ek3 ek3Var2 = new ek3(h33Var2, bo3Var);
                if (!ek3Var2.f18175e.compareAndSet(false, true)) {
                    C1077qn.m9989o("Already Executed");
                    return null;
                }
                ek3Var2.f18174d.m10384h();
                ek3Var2.m5152c();
                try {
                    C1283w7 c1283w7 = h33Var2.f20312a;
                    synchronized (c1283w7) {
                        ((ArrayDeque) c1283w7.f33126b).add(ek3Var2);
                    }
                    xo3VarM5156g = ek3Var2.m5156g();
                    C1283w7 c1283w8 = h33Var2.f20312a;
                    c1283w8.m12115B((ArrayDeque) c1283w8.f33126b, ek3Var2);
                } catch (Throwable th) {
                    C1283w7 c1283w9 = ek3Var2.f18171a.f20312a;
                    c1283w9.m12115B((ArrayDeque) c1283w9.f33126b, ek3Var2);
                    throw th;
                }
            }
            i = xo3VarM5156g.f34497d;
            if ((200 > i && i < 300) || i == 304) {
                return xo3VarM5156g;
            }
            d12Var = xo3VarM5156g.f34500g;
            if (d12Var != null) {
                AbstractC0707h.m6198a(d12Var);
            }
            throw new gf0("HTTP " + xo3VarM5156g.f34497d + ": " + xo3VarM5156g.f34496c);
        }
        if (i3 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(objM3495r);
        xo3VarM5156g = (xo3) objM3495r;
        i = xo3VarM5156g.f34497d;
        if (200 > i) {
        }
        d12Var = xo3VarM5156g.f34500g;
        if (d12Var != null) {
            AbstractC0707h.m6198a(d12Var);
        }
        throw new gf0("HTTP " + xo3VarM5156g.f34497d + ": " + xo3VarM5156g.f34496c);
    }

    /* JADX INFO: renamed from: c */
    public final jf1 m3769c() {
        return ((jk3) this.f15698d.getValue()).f22348a;
    }

    /* JADX INFO: renamed from: e */
    public final bo3 m3770e() {
        C1122rv c1122rv = new C1122rv((byte) 7);
        c1122rv.m10467z(this.f15695a);
        b63 b63Var = this.f15696b;
        c1122rv.f29653d = b63Var.f15118j.m11659c();
        for (Map.Entry entry : b63Var.f15119k.f31879a.entrySet()) {
            Class cls = (Class) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1122rv.f29655f;
            if (value == null) {
                linkedHashMap.remove(cls);
            } else {
                if (linkedHashMap.isEmpty()) {
                    c1122rv.f29655f = new LinkedHashMap();
                }
                ((LinkedHashMap) c1122rv.f29655f).put(cls, cls.cast(value));
            }
        }
        a60 a60Var = b63Var.f15122n;
        boolean z = a60Var.f127a;
        boolean z2 = b63Var.f15123o.f127a;
        if (!z2 && z) {
            c1122rv.m10451j(x50.f33993o);
        } else if (!z2 || z) {
            if (!z2 && !z) {
                c1122rv.m10451j(f15694f);
            }
        } else if (a60Var.f128b) {
            c1122rv.m10451j(x50.f33992n);
        } else {
            c1122rv.m10451j(f15693e);
        }
        return c1122rv.m10450i();
    }

    /* JADX INFO: renamed from: f */
    public final c60 m3771f(ik3 ik3Var) throws Throwable {
        Throwable th;
        c60 c60Var;
        try {
            jf1 jf1VarM3769c = m3769c();
            b01 b01Var = ik3Var.f21518a;
            if (b01Var.f14978b) {
                throw new IllegalStateException("snapshot is closed");
            }
            ak3 ak3Var = new ak3(jf1VarM3769c.mo3781u((p83) b01Var.f14977a.f11c.get(0)));
            try {
                c60Var = new c60(ak3Var);
                try {
                    ak3Var.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    ak3Var.close();
                } catch (Throwable th4) {
                    se0.m10720f(th3, th4);
                }
                th = th3;
                c60Var = null;
            }
            if (th == null) {
                return c60Var;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final ue1 m3772g(ik3 ik3Var) {
        b01 b01Var = ik3Var.f21518a;
        if (b01Var.f14978b) {
            C1077qn.m9989o("snapshot is closed");
            return null;
        }
        p83 p83Var = (p83) b01Var.f14977a.f11c.get(1);
        jf1 jf1VarM3769c = m3769c();
        String str = this.f15696b.f15117i;
        if (str == null) {
            str = this.f15695a;
        }
        ue1 ue1Var = new ue1();
        ue1Var.f31802a = p83Var;
        ue1Var.f31803b = jf1VarM3769c;
        ue1Var.f31804c = str;
        ue1Var.f31805d = ik3Var;
        VarHandle.storeStoreFence();
        return ue1Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:96:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x017e  */
    /* JADX INFO: renamed from: h */
    public final ik3 m3773h(ik3 ik3Var, bo3 bo3Var, xo3 xo3Var, c60 c60Var) throws NoSuchAlgorithmException {
        w42 w42Var;
        Throwable th;
        C1126rz c1126rzM4247b;
        Throwable th2 = null;
        if (this.f15696b.f15122n.f128b && !bo3Var.m3643a().f33995b) {
            x50 x50VarM11826J = xo3Var.f34507n;
            if (x50VarM11826J == null) {
                x50VarM11826J = vd6.m11826J(xo3Var.f34499f);
                xo3Var.f34507n = x50VarM11826J;
            }
            if (!x50VarM11826J.f33995b && !z62.m13387o(xo3Var.f34499f.m11657a("Vary"), "*")) {
                if (ik3Var != null) {
                    b01 b01Var = ik3Var.f21518a;
                    d01 d01Var = b01Var.f14979c;
                    synchronized (d01Var) {
                        b01Var.close();
                        c1126rzM4247b = d01Var.m4247b(b01Var.f14977a.f9a);
                    }
                    if (c1126rzM4247b != null) {
                        w42Var = new w42(c1126rzM4247b);
                    } else {
                        w42Var = null;
                    }
                } else {
                    jk3 jk3Var = (jk3) this.f15698d.getValue();
                    if (jk3Var == null) {
                        w42Var = null;
                    } else {
                        String str = this.f15696b.f15117i;
                        if (str == null) {
                            str = this.f15695a;
                        }
                        d01 d01Var2 = jk3Var.f22349b;
                        byte[] bytes = str.getBytes(z80.f35863a);
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(bytes, 0, bytes.length);
                        byte[] bArrDigest = messageDigest.digest();
                        char[] cArr = new char[bArrDigest.length * 2];
                        int i = 0;
                        for (byte b : bArrDigest) {
                            int i2 = i + 1;
                            char[] cArr2 = AbstractC0647fd.f18911a;
                            cArr[i] = cArr2[(b >> 4) & 15];
                            i += 2;
                            cArr[i2] = cArr2[b & 15];
                        }
                        C1126rz c1126rzM4247b2 = d01Var2.m4247b(new String(cArr));
                        if (c1126rzM4247b2 != null) {
                            w42Var = new w42(c1126rzM4247b2);
                        } else {
                            w42Var = null;
                        }
                    }
                }
                try {
                    if (w42Var != null) {
                        try {
                            if (xo3Var.f34497d != 304 || c60Var == null) {
                                yj3 yj3VarM13681m = zp0.m13681m(m3769c().mo3780t(((C1126rz) w42Var.f33090b).m10505b(0)));
                                try {
                                    new c60(xo3Var).m3852a(yj3VarM13681m);
                                    try {
                                        yj3VarM13681m.close();
                                        th = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        yj3VarM13681m.close();
                                    } catch (Throwable th5) {
                                        se0.m10720f(th4, th5);
                                    }
                                    th = th4;
                                }
                                if (th != null) {
                                    throw th;
                                }
                                yj3 yj3VarM13681m2 = zp0.m13681m(m3769c().mo3780t(((C1126rz) w42Var.f33090b).m10505b(1)));
                                try {
                                    xo3Var.f34500g.mo4278j().mo3039x(yj3VarM13681m2);
                                    try {
                                        yj3VarM13681m2.close();
                                    } catch (Throwable th6) {
                                        th2 = th6;
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    try {
                                        yj3VarM13681m2.close();
                                    } catch (Throwable th8) {
                                        se0.m10720f(th2, th8);
                                    }
                                }
                                if (th2 != null) {
                                    throw th2;
                                }
                            } else {
                                wo3 wo3VarM12724a = xo3Var.m12724a();
                                wo3VarM12724a.f33554f = gq6.m6091p(c60Var.f15833f, xo3Var.f34499f).m11659c();
                                xo3 xo3VarM12344a = wo3VarM12724a.m12344a();
                                yj3 yj3VarM13681m3 = zp0.m13681m(m3769c().mo3780t(((C1126rz) w42Var.f33090b).m10505b(0)));
                                try {
                                    new c60(xo3VarM12344a).m3852a(yj3VarM13681m3);
                                    try {
                                        yj3VarM13681m3.close();
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                    }
                                } catch (Throwable th10) {
                                    th2 = th10;
                                    try {
                                        yj3VarM13681m3.close();
                                    } catch (Throwable th11) {
                                        se0.m10720f(th2, th11);
                                    }
                                }
                                if (th2 != null) {
                                    throw th2;
                                }
                            }
                            ik3 ik3VarM12083b = w42Var.m12083b();
                            AbstractC0707h.m6198a(xo3Var);
                            return ik3VarM12083b;
                        } catch (Exception e) {
                            Bitmap.Config[] configArr = AbstractC0707h.f20231a;
                            try {
                                ((C1126rz) w42Var.f33090b).m10504a(false);
                            } catch (Exception unused) {
                            }
                            throw e;
                        }
                    }
                } catch (Throwable th12) {
                    AbstractC0707h.m6198a(xo3Var);
                    throw th12;
                }
            } else if (ik3Var != null) {
                AbstractC0707h.m6198a(ik3Var);
            }
        } else if (ik3Var != null) {
            AbstractC0707h.m6198a(ik3Var);
        }
        return null;
    }
}
