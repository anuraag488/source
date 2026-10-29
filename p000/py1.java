package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class py1 implements mb1 {

    /* JADX INFO: renamed from: g */
    public static final List f28077g = zv4.m13815j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h */
    public static final List f28078h = zv4.m13815j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a */
    public hk3 f28079a;

    /* JADX INFO: renamed from: b */
    public nk3 f28080b;

    /* JADX INFO: renamed from: c */
    public oy1 f28081c;

    /* JADX INFO: renamed from: d */
    public volatile vy1 f28082d;

    /* JADX INFO: renamed from: e */
    public wh3 f28083e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f28084f;

    @Override // p000.mb1
    /* JADX INFO: renamed from: a */
    public final void mo5846a(bo3 bo3Var) throws IOException {
        int i;
        vy1 vy1Var;
        boolean z;
        if (this.f28082d != null) {
            return;
        }
        boolean z2 = bo3Var.f15465d != null;
        uv1 uv1Var = bo3Var.f15464c;
        ArrayList arrayList = new ArrayList(uv1Var.size() + 4);
        arrayList.add(new sv1(sv1.f30582f, bo3Var.f15463b));
        s50 s50Var = sv1.f30583g;
        dz1 dz1Var = bo3Var.f15462a;
        String strM4806b = dz1Var.m4806b();
        String strM4808d = dz1Var.m4808d();
        if (strM4808d != null) {
            strM4806b = strM4806b + '?' + strM4808d;
        }
        arrayList.add(new sv1(s50Var, strM4806b));
        String strM11657a = uv1Var.m11657a("Host");
        if (strM11657a != null) {
            arrayList.add(new sv1(sv1.f30585i, strM11657a));
        }
        arrayList.add(new sv1(sv1.f30584h, dz1Var.f17518a));
        int size = uv1Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = uv1Var.m11658b(i2).toLowerCase(Locale.US);
            if (!f28077g.contains(lowerCase) || (lowerCase.equals("te") && z62.m13387o(uv1Var.m11660d(i2), "trailers"))) {
                arrayList.add(new sv1(lowerCase, uv1Var.m11660d(i2)));
            }
        }
        oy1 oy1Var = this.f28081c;
        boolean z3 = !z2;
        synchronized (oy1Var.f27229w) {
            synchronized (oy1Var) {
                try {
                    if (oy1Var.f27211e > 1073741823) {
                        oy1Var.m9331g(8);
                    }
                    if (oy1Var.f27212f) {
                        throw new mk0();
                    }
                    i = oy1Var.f27211e;
                    oy1Var.f27211e = i + 2;
                    vy1Var = new vy1(i, oy1Var, z3, false, null);
                    z = !z2 || oy1Var.f27226t >= oy1Var.f27227u || vy1Var.f32936e >= vy1Var.f32937f;
                    if (vy1Var.m12026h()) {
                        oy1Var.f27208b.put(Integer.valueOf(i), vy1Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            oy1Var.f27229w.m12444j(z3, i, arrayList);
        }
        if (z) {
            oy1Var.f27229w.flush();
        }
        this.f28082d = vy1Var;
        boolean z4 = this.f28084f;
        vy1 vy1Var2 = this.f28082d;
        if (z4) {
            vy1Var2.m12023e(9);
            wb1.m12191j("Canceled");
        } else {
            vy1Var2.f32942k.mo7567g(this.f28080b.f25912g);
            this.f28082d.f32943l.mo7567g(this.f28080b.f25913h);
        }
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: b */
    public final ja4 mo5847b(xo3 xo3Var) {
        return this.f28082d.f32940i;
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: c */
    public final void mo5848c() {
        this.f28082d.m12024f().close();
    }

    @Override // p000.mb1
    public final void cancel() {
        this.f28084f = true;
        vy1 vy1Var = this.f28082d;
        if (vy1Var != null) {
            vy1Var.m12023e(9);
        }
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: d */
    public final void mo5849d() {
        this.f28081c.flush();
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: e */
    public final f74 mo5850e(bo3 bo3Var, long j) {
        return this.f28082d.m12024f();
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: f */
    public final long mo5851f(xo3 xo3Var) {
        if (xy1.m12774a(xo3Var)) {
            return zv4.m13814i(xo3Var);
        }
        return 0L;
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: g */
    public final wo3 mo5852g(boolean z) throws IOException {
        uv1 uv1Var;
        vy1 vy1Var = this.f28082d;
        if (vy1Var == null) {
            wb1.m12191j("stream wasn't created");
            return null;
        }
        synchronized (vy1Var) {
            vy1Var.f32942k.m10384h();
            while (vy1Var.f32938g.isEmpty() && vy1Var.f32944m == 0) {
                try {
                    try {
                        vy1Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    vy1Var.f32942k.m11682k();
                    throw th;
                }
            }
            vy1Var.f32942k.m11682k();
            if (vy1Var.f32938g.isEmpty()) {
                IOException iOException = vy1Var.f32945n;
                if (iOException != null) {
                    throw iOException;
                }
                throw new vc4(vy1Var.f32944m);
            }
            uv1Var = (uv1) vy1Var.f32938g.removeFirst();
        }
        wh3 wh3Var = this.f28083e;
        ArrayList arrayList = new ArrayList(20);
        int size = uv1Var.size();
        C0795je c0795jeM7596C = null;
        for (int i = 0; i < size; i++) {
            String strM11658b = uv1Var.m11658b(i);
            String strM11660d = uv1Var.m11660d(i);
            if (z62.m13387o(strM11658b, ":status")) {
                c0795jeM7596C = ks5.m7596C("HTTP/1.1 " + strM11660d);
            } else if (!f28078h.contains(strM11658b)) {
                arrayList.add(strM11658b);
                arrayList.add(hd4.m6360z0(strM11660d).toString());
            }
        }
        if (c0795jeM7596C == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        wo3 wo3Var = new wo3();
        wo3Var.f33550b = wh3Var;
        wo3Var.f33551c = c0795jeM7596C.f22193b;
        wo3Var.f33552d = (String) c0795jeM7596C.f22195d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        tv1 tv1Var = new tv1((byte) 0);
        tv1Var.f31466a.addAll(Arrays.asList(strArr));
        wo3Var.f33554f = tv1Var;
        if (z && wo3Var.f33551c == 100) {
            return null;
        }
        return wo3Var;
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: h */
    public final hk3 mo5853h() {
        return this.f28079a;
    }
}
