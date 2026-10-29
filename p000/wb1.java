package p000;

import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb1 implements gg0, y33, le4, sf3, y73, w73, gd2, ed2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33212a;

    public /* synthetic */ wb1(byte b) {
        this.f33212a = b;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12189c(Object obj, Object obj2) {
        throw new ne4("Fragment " + obj + obj2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m12190h(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m12191j(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m12192k(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12193l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m12194m(Throwable th) {
        throw new gf0(th);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m12195o(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m12196p(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m12197q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // p000.w73
    /* JADX INFO: renamed from: a */
    public t73 mo4669a(nh3 nh3Var) throws GeneralSecurityException {
        jd2 jd2Var = (jd2) nh3Var.f25811c;
        if (!jd2Var.m7076z().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            xy4.m12781j(jd2Var.m7076z(), "Wrong type URL in call to HmacProtoSerialization.parseParameters: ");
            return null;
        }
        try {
            vw1 vw1VarM12002C = vw1.m12002C(jd2Var.m7071A(), qc1.m9861a());
            if (vw1VarM12002C.m12004A() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + vw1VarM12002C.m12004A());
            }
            C1283w7 c1283w7M13829b = zw1.m13829b();
            c1283w7M13829b.f33126b = Integer.valueOf(vw1VarM12002C.m12007y());
            c1283w7M13829b.f33127c = Integer.valueOf(vw1VarM12002C.m12008z().m3758z());
            c1283w7M13829b.f33128d = (xw1) cx1.f16564b.m8737D(vw1VarM12002C.m12008z().m3757y());
            c1283w7M13829b.f33129e = (yw1) cx1.f16563a.m8737D(jd2Var.m7075y());
            return c1283w7M13829b.m12145u();
        } catch (h72 e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    @Override // p000.sf3
    /* JADX INFO: renamed from: b */
    public Object mo4670b(se0 se0Var) throws GeneralSecurityException {
        switch (this.f33212a) {
            case 20:
                k90 k90Var = new k90();
                if (zi4.m13604d(2)) {
                    return k90Var;
                }
                xy4.m12788q("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
                return null;
            default:
                tw1 tw1Var = (tw1) se0Var;
                nf3 nf3Var = new nf3();
                new mf3("HMAC" + tw1Var.f31482u.f36427d, new SecretKeySpec(((u50) tw1Var.f31483v.f33259b).m11250c(), "HMAC"));
                zw1 zw1Var = tw1Var.f31482u;
                int i = zw1Var.f36425b;
                tw1Var.f31484w.m11250c();
                if (zw1Var.f36426c.equals(yw1.f35563d)) {
                    Arrays.copyOf(nf3.f25749a, 1);
                }
                return nf3Var;
        }
    }

    @Override // p000.gd2
    /* JADX INFO: renamed from: d */
    public mh3 mo4672d(se0 se0Var) {
        tw1 tw1Var = (tw1) se0Var;
        rw1 rw1VarM10932B = sw1.m10932B();
        zw1 zw1Var = tw1Var.f31482u;
        ax1 ax1VarM3753A = bx1.m3753A();
        int i = zw1Var.f36425b;
        ax1VarM3753A.m9631e();
        ((bx1) ax1VarM3753A.f27912b).m3756C(i);
        pv1 pv1Var = (pv1) cx1.f16564b.m8745L(zw1Var.f36427d);
        ax1VarM3753A.m9631e();
        ((bx1) ax1VarM3753A.f27912b).m3755B(pv1Var);
        bx1 bx1Var = (bx1) ax1VarM3753A.m9628b();
        rw1VarM10932B.m9631e();
        ((sw1) rw1VarM10932B.f27912b).m10938F(bx1Var);
        byte[] bArrM11250c = ((u50) tw1Var.f31483v.f33259b).m11250c();
        o50 o50VarM10980d = t50.m10980d(bArrM11250c, 0, bArrM11250c.length);
        rw1VarM10932B.m9631e();
        ((sw1) rw1VarM10932B.f27912b).m10937E(o50VarM10980d);
        return mh3.m8323b("type.googleapis.com/google.crypto.tink.HmacKey", ((sw1) rw1VarM10932B.m9628b()).m11693f(), qc2.f28376c, (j63) cx1.f16563a.m8745L(tw1Var.f31482u.f36426c), tw1Var.f31485x);
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        switch (this.f33212a) {
            case 0:
                return (ScheduledExecutorService) ExecutorsRegistrar.f16303a.get();
            case 1:
                return (ScheduledExecutorService) ExecutorsRegistrar.f16305c.get();
            case 2:
                return (ScheduledExecutorService) ExecutorsRegistrar.f16304b.get();
            case 3:
                qg2 qg2Var = ExecutorsRegistrar.f16303a;
                return ht4.f20850a;
            case 10:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c0602e8);
            case 14:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(c0602e8);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(c0602e8);
        }
    }

    @Override // p000.ed2
    /* JADX INFO: renamed from: f */
    public se0 mo4673f(m24 m24Var) throws GeneralSecurityException {
        mh3 mh3Var = (mh3) m24Var;
        if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            C1077qn.m9987m("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            sw1 sw1VarM10933C = sw1.m10933C(mh3Var.f24919c, qc1.m9861a());
            if (sw1VarM10933C.m10936A() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            C1283w7 c1283w7M13829b = zw1.m13829b();
            c1283w7M13829b.f33126b = Integer.valueOf(sw1VarM10933C.m10939y().size());
            c1283w7M13829b.f33127c = Integer.valueOf(sw1VarM10933C.m10940z().m3758z());
            c1283w7M13829b.f33128d = (xw1) cx1.f16564b.m8737D(sw1VarM10933C.m10940z().m3757y());
            c1283w7M13829b.f33129e = (yw1) cx1.f16563a.m8737D(mh3Var.f24921e);
            zw1 zw1VarM12145u = c1283w7M13829b.m12145u();
            jp0 jp0Var = new jp0((byte) 21, false);
            jp0Var.f22482c = null;
            jp0Var.f22483d = null;
            jp0Var.f22481b = zw1VarM12145u;
            jp0Var.f22482c = new wd3(u50.m11249b(sw1VarM10933C.m10939y().m10981l()), (byte) 8);
            jp0Var.f22483d = mh3Var.f24922f;
            return jp0Var.m7243l();
        } catch (h72 | IllegalArgumentException unused) {
            xy4.m12788q("Parsing HmacKey failed");
            return null;
        }
    }

    @Override // p000.y33
    /* JADX INFO: renamed from: g */
    public void mo141g(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // p000.y73
    /* JADX INFO: renamed from: i */
    public nh3 mo4674i(t73 t73Var) {
        zw1 zw1Var = (zw1) t73Var;
        id2 id2VarM7068B = jd2.m7068B();
        id2VarM7068B.m6763g("type.googleapis.com/google.crypto.tink.HmacKey");
        uw1 uw1VarM12001B = vw1.m12001B();
        ax1 ax1VarM3753A = bx1.m3753A();
        int i = zw1Var.f36425b;
        ax1VarM3753A.m9631e();
        ((bx1) ax1VarM3753A.f27912b).m3756C(i);
        pv1 pv1Var = (pv1) cx1.f16564b.m8745L(zw1Var.f36427d);
        ax1VarM3753A.m9631e();
        ((bx1) ax1VarM3753A.f27912b).m3755B(pv1Var);
        bx1 bx1Var = (bx1) ax1VarM3753A.m9628b();
        uw1VarM12001B.m9631e();
        ((vw1) uw1VarM12001B.f27912b).m12006E(bx1Var);
        int i2 = zw1Var.f36424a;
        uw1VarM12001B.m9631e();
        ((vw1) uw1VarM12001B.f27912b).m12005D(i2);
        id2VarM7068B.m6764h(((vw1) uw1VarM12001B.m9628b()).m11693f());
        id2VarM7068B.m6762f((j63) cx1.f16563a.m8745L(zw1Var.f36426c));
        return nh3.m8734l((jd2) id2VarM7068B.m9628b());
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) {
        switch (this.f33212a) {
            case 11:
                break;
            default:
                break;
        }
        return y62.m12936B(null);
    }
}
