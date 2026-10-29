package p000;

import java.io.EOFException;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.Proxy;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fy1 implements mb1 {

    /* JADX INFO: renamed from: a */
    public final h33 f19409a;

    /* JADX INFO: renamed from: b */
    public final hk3 f19410b;

    /* JADX INFO: renamed from: c */
    public final k40 f19411c;

    /* JADX INFO: renamed from: d */
    public final j40 f19412d;

    /* JADX INFO: renamed from: e */
    public byte f19413e;

    /* JADX INFO: renamed from: f */
    public final vv1 f19414f;

    public fy1(h33 h33Var, hk3 hk3Var, ak3 ak3Var, yj3 yj3Var) {
        this.f19409a = h33Var;
        this.f19410b = hk3Var;
        this.f19411c = ak3Var;
        this.f19412d = yj3Var;
        vv1 vv1Var = new vv1();
        vv1Var.f32887b = ak3Var;
        vv1Var.f32886a = 262144L;
        VarHandle.storeStoreFence();
        this.f19414f = vv1Var;
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: a */
    public final void mo5846a(bo3 bo3Var) {
        Proxy.Type type = this.f19410b.f20642j.f22544b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(bo3Var.f15463b);
        sb.append(' ');
        dz1 dz1Var = bo3Var.f15462a;
        if (dz1Var.f17526i || type != Proxy.Type.HTTP) {
            String strM4806b = dz1Var.m4806b();
            String strM4808d = dz1Var.m4808d();
            if (strM4808d != null) {
                strM4806b = strM4806b + '?' + strM4808d;
            }
            sb.append(strM4806b);
        } else {
            sb.append(dz1Var);
        }
        sb.append(" HTTP/1.1");
        m5855j(bo3Var.f15464c, sb.toString());
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: b */
    public final ja4 mo5847b(xo3 xo3Var) {
        if (!xy1.m12774a(xo3Var)) {
            return m5854i(0L);
        }
        String strM11657a = xo3Var.f34499f.m11657a("Transfer-Encoding");
        if (strM11657a == null) {
            strM11657a = null;
        }
        if ("chunked".equalsIgnoreCase(strM11657a)) {
            dz1 dz1Var = xo3Var.f34494a.f15462a;
            if (this.f19413e == 4) {
                this.f19413e = (byte) 5;
                return new by1(this, dz1Var);
            }
            xd2.m12664k(this.f19413e, "state: ");
            return null;
        }
        long jM13814i = zv4.m13814i(xo3Var);
        if (jM13814i != -1) {
            return m5854i(jM13814i);
        }
        if (this.f19413e != 4) {
            xd2.m12664k(this.f19413e, "state: ");
            return null;
        }
        this.f19413e = (byte) 5;
        this.f19410b.m6423c0();
        return new ey1(this);
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: c */
    public final void mo5848c() {
        this.f19412d.flush();
    }

    @Override // p000.mb1
    public final void cancel() {
        Socket socket = this.f19410b.f20643k;
        if (socket != null) {
            zv4.m13809d(socket);
        }
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: d */
    public final void mo5849d() {
        this.f19412d.flush();
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: e */
    public final f74 mo5850e(bo3 bo3Var, long j) {
        boolean zEqualsIgnoreCase = "chunked".equalsIgnoreCase(bo3Var.f15464c.m11657a("Transfer-Encoding"));
        j40 j40Var = this.f19412d;
        if (zEqualsIgnoreCase) {
            if (this.f19413e != 1) {
                xd2.m12664k(this.f19413e, "state: ");
                return null;
            }
            this.f19413e = (byte) 2;
            ay1 ay1Var = new ay1();
            ay1Var.f14942c = this;
            ay1Var.f14940a = new kn1(j40Var.mo3367c());
            VarHandle.storeStoreFence();
            return ay1Var;
        }
        if (j == -1) {
            C1077qn.m9989o("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f19413e != 1) {
            xd2.m12664k(this.f19413e, "state: ");
            return null;
        }
        this.f19413e = (byte) 2;
        dy1 dy1Var = new dy1();
        dy1Var.f17491c = this;
        dy1Var.f17489a = new kn1(j40Var.mo3367c());
        VarHandle.storeStoreFence();
        return dy1Var;
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: f */
    public final long mo5851f(xo3 xo3Var) {
        if (!xy1.m12774a(xo3Var)) {
            return 0L;
        }
        String strM11657a = xo3Var.f34499f.m11657a("Transfer-Encoding");
        if (strM11657a == null) {
            strM11657a = null;
        }
        if ("chunked".equalsIgnoreCase(strM11657a)) {
            return -1L;
        }
        return zv4.m13814i(xo3Var);
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: g */
    public final wo3 mo5852g(boolean z) {
        vv1 vv1Var = this.f19414f;
        byte b = this.f19413e;
        if (b != 1 && b != 2 && b != 3) {
            xd2.m12664k(this.f19413e, "state: ");
            return null;
        }
        try {
            String strMo3040y = ((k40) vv1Var.f32887b).mo3040y(vv1Var.f32886a);
            vv1Var.f32886a -= (long) strMo3040y.length();
            C0795je c0795jeM7596C = ks5.m7596C(strMo3040y);
            int i = c0795jeM7596C.f22193b;
            wo3 wo3Var = new wo3();
            wo3Var.f33550b = (wh3) c0795jeM7596C.f22194c;
            wo3Var.f33551c = i;
            wo3Var.f33552d = (String) c0795jeM7596C.f22195d;
            wo3Var.f33554f = vv1Var.m11992c().m11659c();
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.f19413e = (byte) 3;
                return wo3Var;
            }
            if (102 > i || i >= 200) {
                this.f19413e = (byte) 4;
                return wo3Var;
            }
            this.f19413e = (byte) 3;
            return wo3Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.f19410b.f20642j.f22543a.f35775h.m4810f()), e);
        }
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: h */
    public final hk3 mo5853h() {
        return this.f19410b;
    }

    /* JADX INFO: renamed from: i */
    public final cy1 m5854i(long j) {
        if (this.f19413e == 4) {
            this.f19413e = (byte) 5;
            return new cy1(this, j);
        }
        xd2.m12664k(this.f19413e, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m5855j(uv1 uv1Var, String str) {
        if (this.f19413e != 0) {
            xd2.m12664k(this.f19413e, "state: ");
            return;
        }
        j40 j40Var = this.f19412d;
        j40Var.mo6998F(str).mo6998F("\r\n");
        int size = uv1Var.size();
        for (int i = 0; i < size; i++) {
            j40Var.mo6998F(uv1Var.m11658b(i)).mo6998F(": ").mo6998F(uv1Var.m11660d(i)).mo6998F("\r\n");
        }
        j40Var.mo6998F("\r\n");
        this.f19413e = (byte) 1;
    }
}
