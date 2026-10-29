package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d01 implements Closeable, Flushable {

    /* JADX INFO: renamed from: q */
    public static final cm3 f16663q = new cm3("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: a */
    public p83 f16664a;

    /* JADX INFO: renamed from: b */
    public long f16665b;

    /* JADX INFO: renamed from: c */
    public p83 f16666c;

    /* JADX INFO: renamed from: d */
    public p83 f16667d;

    /* JADX INFO: renamed from: e */
    public p83 f16668e;

    /* JADX INFO: renamed from: f */
    public LinkedHashMap f16669f;

    /* JADX INFO: renamed from: g */
    public um0 f16670g;

    /* JADX INFO: renamed from: h */
    public long f16671h;

    /* JADX INFO: renamed from: i */
    public int f16672i;

    /* JADX INFO: renamed from: j */
    public yj3 f16673j;

    /* JADX INFO: renamed from: k */
    public boolean f16674k;

    /* JADX INFO: renamed from: l */
    public boolean f16675l;

    /* JADX INFO: renamed from: m */
    public boolean f16676m;

    /* JADX INFO: renamed from: n */
    public boolean f16677n;

    /* JADX INFO: renamed from: o */
    public boolean f16678o;

    /* JADX INFO: renamed from: p */
    public c01 f16679p;

    /* JADX INFO: renamed from: A */
    public static void m4244A(String str) {
        if (f16663q.m4046b(str)) {
            return;
        }
        C1077qn.m9988n(zi4.m13617q('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str));
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m4245B() {
        Throwable th;
        try {
            yj3 yj3Var = this.f16673j;
            if (yj3Var != null) {
                yj3Var.close();
            }
            yj3 yj3VarM13681m = zp0.m13681m(this.f16679p.mo3780t(this.f16667d));
            try {
                yj3VarM13681m.mo6998F("libcore.io.DiskLruCache");
                yj3VarM13681m.writeByte(10);
                yj3VarM13681m.mo6998F("1");
                yj3VarM13681m.writeByte(10);
                yj3VarM13681m.m13148b(1L);
                yj3VarM13681m.writeByte(10);
                yj3VarM13681m.m13148b(2L);
                yj3VarM13681m.writeByte(10);
                yj3VarM13681m.writeByte(10);
                for (a01 a01Var : this.f16669f.values()) {
                    if (a01Var.f15g != null) {
                        yj3VarM13681m.mo6998F("DIRTY");
                        yj3VarM13681m.writeByte(32);
                        yj3VarM13681m.mo6998F(a01Var.f9a);
                        yj3VarM13681m.writeByte(10);
                    } else {
                        yj3VarM13681m.mo6998F("CLEAN");
                        yj3VarM13681m.writeByte(32);
                        yj3VarM13681m.mo6998F(a01Var.f9a);
                        for (long j : a01Var.f10b) {
                            yj3VarM13681m.writeByte(32);
                            yj3VarM13681m.m13148b(j);
                        }
                        yj3VarM13681m.writeByte(10);
                    }
                }
                try {
                    yj3VarM13681m.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    yj3VarM13681m.close();
                } catch (Throwable th4) {
                    se0.m10720f(th3, th4);
                }
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            boolean zM7089j = this.f16679p.m7089j(this.f16666c);
            c01 c01Var = this.f16679p;
            if (zM7089j) {
                c01Var.mo3775b(this.f16666c, this.f16668e);
                this.f16679p.mo3775b(this.f16667d, this.f16666c);
                this.f16679p.mo3777g(this.f16668e);
            } else {
                c01Var.mo3775b(this.f16667d, this.f16666c);
            }
            this.f16673j = m4251k();
            this.f16672i = 0;
            this.f16674k = false;
            this.f16678o = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0114 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:26:0x0058, B:30:0x0071, B:32:0x007f, B:34:0x0086, B:27:0x005c, B:29:0x006a, B:38:0x00a6, B:40:0x00ad, B:43:0x00b2, B:45:0x00c0, B:48:0x00c5, B:53:0x0100, B:55:0x010b, B:59:0x0114, B:49:0x00dd, B:51:0x00f2, B:52:0x00fd, B:37:0x0096, B:62:0x0119, B:63:0x0120), top: B:66:0x0001 }] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m4246a(C1126rz c1126rz, boolean z) {
        a01 a01Var = (a01) c1126rz.f29738b;
        if (!z62.m13387o(a01Var.f15g, c1126rz)) {
            throw new IllegalStateException("Check failed.");
        }
        if (!z || a01Var.f14f) {
            for (int i = 0; i < 2; i++) {
                this.f16679p.mo3777g((p83) a01Var.f12d.get(i));
            }
        } else {
            for (int i2 = 0; i2 < 2; i2++) {
                if (((boolean[]) c1126rz.f29739c)[i2] && !this.f16679p.m7089j((p83) a01Var.f12d.get(i2))) {
                    c1126rz.m10504a(false);
                    return;
                }
            }
            for (int i3 = 0; i3 < 2; i3++) {
                p83 p83Var = (p83) a01Var.f12d.get(i3);
                p83 p83Var2 = (p83) a01Var.f11c.get(i3);
                boolean zM7089j = this.f16679p.m7089j(p83Var);
                c01 c01Var = this.f16679p;
                if (zM7089j) {
                    c01Var.mo3775b(p83Var, p83Var2);
                } else {
                    p83 p83Var3 = (p83) a01Var.f11c.get(i3);
                    if (!c01Var.m7089j(p83Var3)) {
                        AbstractC0707h.m6198a(c01Var.mo3780t(p83Var3));
                    }
                }
                long j = a01Var.f10b[i3];
                Long l = this.f16679p.m7090l(p83Var2).f34193d;
                long jLongValue = l != null ? l.longValue() : 0L;
                a01Var.f10b[i3] = jLongValue;
                this.f16671h = (this.f16671h - j) + jLongValue;
            }
        }
        a01Var.f15g = null;
        if (a01Var.f14f) {
            m4255u(a01Var);
            return;
        }
        this.f16672i++;
        yj3 yj3Var = this.f16673j;
        if (z || a01Var.f13e) {
            a01Var.f13e = true;
            yj3Var.mo6998F("CLEAN");
            yj3Var.writeByte(32);
            yj3Var.mo6998F(a01Var.f9a);
            for (long j2 : a01Var.f10b) {
                yj3Var.writeByte(32);
                yj3Var.m13148b(j2);
            }
            yj3Var.writeByte(10);
        } else {
            this.f16669f.remove(a01Var.f9a);
            yj3Var.mo6998F("REMOVE");
            yj3Var.writeByte(32);
            yj3Var.mo6998F(a01Var.f9a);
            yj3Var.writeByte(10);
        }
        yj3Var.flush();
        if (this.f16671h > this.f16665b) {
            m4250j();
        } else if (this.f16672i >= 2000) {
            m4250j();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized C1126rz m4247b(String str) {
        if (this.f16676m) {
            throw new IllegalStateException("cache is closed");
        }
        m4244A(str);
        m4249g();
        a01 a01Var = (a01) this.f16669f.get(str);
        if ((a01Var != null ? a01Var.f15g : null) != null) {
            return null;
        }
        if (a01Var != null && a01Var.f16h != 0) {
            return null;
        }
        if (!this.f16677n && !this.f16678o) {
            yj3 yj3Var = this.f16673j;
            yj3Var.mo6998F("DIRTY");
            yj3Var.writeByte(32);
            yj3Var.mo6998F(str);
            yj3Var.writeByte(10);
            yj3Var.flush();
            if (this.f16674k) {
                return null;
            }
            if (a01Var == null) {
                a01Var = new a01(this, str);
                this.f16669f.put(str, a01Var);
            }
            C1126rz c1126rz = new C1126rz(this, a01Var);
            a01Var.f15g = c1126rz;
            return c1126rz;
        }
        m4250j();
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f16675l && !this.f16676m) {
                for (a01 a01Var : (a01[]) this.f16669f.values().toArray(new a01[0])) {
                    C1126rz c1126rz = a01Var.f15g;
                    if (c1126rz != null) {
                        a01 a01Var2 = (a01) c1126rz.f29738b;
                        if (z62.m13387o(a01Var2.f15g, c1126rz)) {
                            a01Var2.f14f = true;
                        }
                    }
                }
                m4256v();
                zp0.m13682n(this.f16670g, null);
                this.f16673j.close();
                this.f16673j = null;
                this.f16676m = true;
                return;
            }
            this.f16676m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized b01 m4248e(String str) {
        b01 b01VarM2a;
        if (this.f16676m) {
            throw new IllegalStateException("cache is closed");
        }
        m4244A(str);
        m4249g();
        a01 a01Var = (a01) this.f16669f.get(str);
        if (a01Var != null && (b01VarM2a = a01Var.m2a()) != null) {
            boolean z = true;
            this.f16672i++;
            yj3 yj3Var = this.f16673j;
            yj3Var.mo6998F("READ");
            yj3Var.writeByte(32);
            yj3Var.mo6998F(str);
            yj3Var.writeByte(10);
            if (this.f16672i < 2000) {
                z = false;
            }
            if (z) {
                m4250j();
            }
            return b01VarM2a;
        }
        return null;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f16675l) {
            if (this.f16676m) {
                throw new IllegalStateException("cache is closed");
            }
            m4256v();
            this.f16673j.flush();
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m4249g() {
        try {
            if (this.f16675l) {
                return;
            }
            this.f16679p.mo3777g(this.f16667d);
            if (this.f16679p.m7089j(this.f16668e)) {
                boolean zM7089j = this.f16679p.m7089j(this.f16666c);
                c01 c01Var = this.f16679p;
                p83 p83Var = this.f16668e;
                if (zM7089j) {
                    c01Var.mo3777g(p83Var);
                } else {
                    c01Var.mo3775b(p83Var, this.f16666c);
                }
            }
            if (this.f16679p.m7089j(this.f16666c)) {
                try {
                    m4253q();
                    m4252l();
                    this.f16675l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        i20.m6595t(this.f16679p, this.f16664a);
                        this.f16676m = false;
                        m4245B();
                        this.f16675l = true;
                    } catch (Throwable th) {
                        this.f16676m = false;
                        throw th;
                    }
                }
            }
            m4245B();
            this.f16675l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4250j() {
        lb5.m7910S(this.f16670g, null, null, new C1088qy(this, null, (byte) 1), 3);
    }

    /* JADX INFO: renamed from: k */
    public final yj3 m4251k() {
        c01 c01Var = this.f16679p;
        f74 f74VarMo3774a = c01Var.f15731b.mo3774a(this.f16666c);
        C1127s c1127s = new C1127s((byte) 27);
        c1127s.f29778b = this;
        VarHandle.storeStoreFence();
        bd1 bd1Var = new bd1(f74VarMo3774a);
        bd1Var.f15214b = c1127s;
        VarHandle.storeStoreFence();
        return zp0.m13681m(bd1Var);
    }

    /* JADX INFO: renamed from: l */
    public final void m4252l() {
        c01 c01Var = this.f16679p;
        Iterator it = this.f16669f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            a01 a01Var = (a01) it.next();
            int i = 0;
            if (a01Var.f15g == null) {
                while (i < 2) {
                    j += a01Var.f10b[i];
                    i++;
                }
            } else {
                a01Var.f15g = null;
                while (i < 2) {
                    c01Var.mo3777g((p83) a01Var.f11c.get(i));
                    c01Var.mo3777g((p83) a01Var.f12d.get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.f16671h = j;
    }

    /* JADX INFO: renamed from: q */
    public final void m4253q() throws Throwable {
        ak3 ak3Var = new ak3(this.f16679p.f15731b.mo3781u(this.f16666c));
        try {
            String strMo3040y = ak3Var.mo3040y(Long.MAX_VALUE);
            String strMo3040y2 = ak3Var.mo3040y(Long.MAX_VALUE);
            String strMo3040y3 = ak3Var.mo3040y(Long.MAX_VALUE);
            String strMo3040y4 = ak3Var.mo3040y(Long.MAX_VALUE);
            String strMo3040y5 = ak3Var.mo3040y(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo3040y) || !"1".equals(strMo3040y2) || !z62.m13387o(String.valueOf(1), strMo3040y3) || !z62.m13387o(String.valueOf(2), strMo3040y4) || strMo3040y5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo3040y + ", " + strMo3040y2 + ", " + strMo3040y3 + ", " + strMo3040y4 + ", " + strMo3040y5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    m4254t(ak3Var.mo3040y(Long.MAX_VALUE));
                    i++;
                } catch (EOFException unused) {
                    this.f16672i = i - this.f16669f.size();
                    if (ak3Var.m3023a()) {
                        this.f16673j = m4251k();
                    } else {
                        m4245B();
                    }
                    try {
                        ak3Var.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                ak3Var.close();
            } catch (Throwable th3) {
                se0.m10720f(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4254t(String str) throws IOException {
        String strSubstring;
        LinkedHashMap linkedHashMap = this.f16669f;
        int iM6342h0 = hd4.m6342h0(str, ' ', 0, 6);
        if (iM6342h0 == -1) {
            wb1.m12191j("unexpected journal line: ".concat(str));
            return;
        }
        int i = iM6342h0 + 1;
        int iM6342h1 = hd4.m6342h0(str, ' ', i, 4);
        if (iM6342h1 == -1) {
            strSubstring = str.substring(i);
            if (iM6342h0 == 6 && od4.m9043X(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iM6342h1);
        }
        Object a01Var = linkedHashMap.get(strSubstring);
        if (a01Var == null) {
            a01Var = new a01(this, strSubstring);
            linkedHashMap.put(strSubstring, a01Var);
        }
        a01 a01Var2 = (a01) a01Var;
        if (iM6342h1 == -1 || iM6342h0 != 5 || !od4.m9043X(str, "CLEAN", false)) {
            if (iM6342h1 == -1 && iM6342h0 == 5 && od4.m9043X(str, "DIRTY", false)) {
                a01Var2.f15g = new C1126rz(this, a01Var2);
                return;
            } else {
                if (iM6342h1 == -1 && iM6342h0 == 4 && od4.m9043X(str, "READ", false)) {
                    return;
                }
                wb1.m12191j("unexpected journal line: ".concat(str));
                return;
            }
        }
        List listM6354t0 = hd4.m6354t0(str.substring(iM6342h1 + 1), new char[]{' '});
        a01Var2.f13e = true;
        a01Var2.f15g = null;
        if (listM6354t0.size() != 2) {
            nm0.m8795g(listM6354t0, "unexpected journal line: ");
            return;
        }
        try {
            int size = listM6354t0.size();
            for (int i2 = 0; i2 < size; i2++) {
                a01Var2.f10b[i2] = Long.parseLong((String) listM6354t0.get(i2));
            }
        } catch (NumberFormatException unused) {
            nm0.m8795g(listM6354t0, "unexpected journal line: ");
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4255u(a01 a01Var) {
        yj3 yj3Var;
        int i = a01Var.f16h;
        String str = a01Var.f9a;
        if (i > 0 && (yj3Var = this.f16673j) != null) {
            yj3Var.mo6998F("DIRTY");
            yj3Var.writeByte(32);
            yj3Var.mo6998F(str);
            yj3Var.writeByte(10);
            yj3Var.flush();
        }
        if (a01Var.f16h > 0 || a01Var.f15g != null) {
            a01Var.f14f = true;
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f16679p.mo3777g((p83) a01Var.f11c.get(i2));
            long j = this.f16671h;
            long[] jArr = a01Var.f10b;
            this.f16671h = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f16672i++;
        yj3 yj3Var2 = this.f16673j;
        if (yj3Var2 != null) {
            yj3Var2.mo6998F("REMOVE");
            yj3Var2.writeByte(32);
            yj3Var2.mo6998F(str);
            yj3Var2.writeByte(10);
        }
        this.f16669f.remove(str);
        if (this.f16672i >= 2000) {
            m4250j();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m4256v() {
        while (this.f16671h > this.f16665b) {
            for (a01 a01Var : this.f16669f.values()) {
                if (!a01Var.f14f) {
                    m4255u(a01Var);
                }
            }
            return;
        }
        this.f16677n = false;
    }
}
