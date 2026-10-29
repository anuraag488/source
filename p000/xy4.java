package p000;

import ads_mobile_sdk.C0313rh;
import ads_mobile_sdk.f01;
import ads_mobile_sdk.l01;
import android.content.Context;
import android.os.HandlerThread;
import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xy4 implements sf3, y73, w73, gd2, ed2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34726a;

    public /* synthetic */ xy4(byte b) {
        this.f34726a = b;
    }

    /* JADX INFO: renamed from: c */
    public static C0313rh m12777c(Context context, String str, String str2) {
        C0313rh c0313rh;
        f01 f01Var = new f01();
        f01Var.f3244b = str;
        f01Var.f3245c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        f01Var.f3247e = handlerThread;
        handlerThread.start();
        l01 l01Var = new l01(9200000, f01Var, f01Var, context, handlerThread.getLooper());
        f01Var.f3243a = l01Var;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        f01Var.f3246d = linkedBlockingQueue;
        l01Var.checkAvailabilityAndConnect();
        VarHandle.storeStoreFence();
        try {
            c0313rh = (C0313rh) linkedBlockingQueue.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            c0313rh = null;
        }
        if (c0313rh != null) {
            return c0313rh;
        }
        oa5 oa5VarM2115D = C0313rh.m2115D();
        oa5VarM2115D.m9012c(32768L);
        return (C0313rh) oa5VarM2115D.m2518b();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m12778e() {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m12779g(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m12780h(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m12781j(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m12782k(String str) {
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m12783l(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m12784m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m12785n(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m12786o(StringBuilder sb, Object obj, Throwable th) {
        sb.append(obj);
        throw new RuntimeException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m12787p() {
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m12788q(String str) throws GeneralSecurityException {
        throw new GeneralSecurityException(str);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m12789r(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m12790s(String str, Throwable th) {
        throw new AssertionError(str, th);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m12791t() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m12792u(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m12793v(String str, Object obj, Object obj2) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m12794w() {
        throw new gf0();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m12795x() {
        throw new NoSuchElementException();
    }

    @Override // p000.w73
    /* JADX INFO: renamed from: a */
    public t73 mo4669a(nh3 nh3Var) throws GeneralSecurityException {
        switch (this.f34726a) {
            case 7:
                jd2 jd2Var = (jd2) nh3Var.f25811c;
                if (!jd2Var.m7076z().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    m12781j(jd2Var.m7076z(), "Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    x35 x35VarM12470A = x35.m12470A(jd2Var.m7071A(), qc1.m9861a());
                    if (x35VarM12470A.m12474y() == 0) {
                        return z35.m13330b(c45.m3842b(jd2Var.m7075y()), x35VarM12470A.m12473x().m3438y());
                    }
                    m12788q("Only version 0 parameters are accepted");
                    return null;
                } catch (h72 e) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
                }
            default:
                jd2 jd2Var2 = (jd2) nh3Var.f25811c;
                if (!jd2Var2.m7076z().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    m12781j(jd2Var2.m7076z(), "Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    if (g45.m5902z(jd2Var2.m7071A(), qc1.m9861a()).m5903y() == 0) {
                        return i45.m6664b(j45.m7002b(jd2Var2.m7075y()));
                    }
                    m12788q("Only version 0 parameters are accepted");
                    return null;
                } catch (h72 e2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e2);
                }
        }
    }

    @Override // p000.sf3
    /* JADX INFO: renamed from: b */
    public Object mo4670b(se0 se0Var) throws GeneralSecurityException {
        switch (this.f34726a) {
            case 5:
                v35 v35Var = (v35) se0Var;
                int i = v35Var.f32361u.f35743b;
                byte b = 8;
                if (i < 8 || i > 12) {
                    m12788q("invalid salt size");
                    return null;
                }
                byte[] bArrM11250c = ((u50) v35Var.f32362v.f33259b).m11250c();
                u50 u50Var = v35Var.f32363w;
                C0678g7 c0678g7 = new C0678g7();
                qq2.m10031o(C1135s7.m10545k0(C1172t7.m10985b(bArrM11250c.length), new wd3(u50.m11249b(bArrM11250c), b)));
                u50Var.m11250c();
                return c0678g7;
            default:
                f45 f45Var = (f45) se0Var;
                try {
                    o70.m8976a();
                    Cipher cipherM8976a = o70.m8976a();
                    byte[] bArrM11250c2 = ((u50) f45Var.f18748v.f33259b).m11250c();
                    f45Var.f18749w.m11250c();
                    cipherM8976a.getProvider();
                    C0678g7 c0678g8 = new C0678g7();
                    if (!zi4.m13603c(1)) {
                        m12788q("Can not use ChaCha20Poly1305 in FIPS-mode.");
                        return null;
                    }
                    if (bArrM11250c2.length == 32) {
                        return c0678g8;
                    }
                    throw new InvalidKeyException("The key length in bytes must be 32.");
                } catch (GeneralSecurityException unused) {
                    byte[] bArrM11250c3 = ((u50) f45Var.f18748v.f33259b).m11250c();
                    f45Var.f18749w.m11250c();
                    C0678g7 c0678g9 = new C0678g7();
                    new f42(bArrM11250c3, (byte) 1);
                    return c0678g9;
                }
        }
    }

    @Override // p000.gd2
    /* JADX INFO: renamed from: d */
    public mh3 mo4672d(se0 se0Var) {
        byte b = this.f34726a;
        qc2 qc2Var = qc2.f28376c;
        switch (b) {
            case 8:
                v35 v35Var = (v35) se0Var;
                t35 t35VarM11230A = u35.m11230A();
                byte[] bArrM11250c = ((u50) v35Var.f32362v.f33259b).m11250c();
                o50 o50VarM10980d = t50.m10980d(bArrM11250c, 0, bArrM11250c.length);
                t35VarM11230A.m9631e();
                ((u35) t35VarM11230A.f27912b).m11232C(o50VarM10980d);
                a45 a45VarM3436z = b45.m3436z();
                z35 z35Var = v35Var.f32361u;
                int i = z35Var.f35743b;
                a45VarM3436z.m9631e();
                ((b45) a45VarM3436z.f27912b).m3437A(i);
                b45 b45Var = (b45) a45VarM3436z.m9628b();
                t35VarM11230A.m9631e();
                ((u35) t35VarM11230A.f27912b).m11233D(b45Var);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((u35) t35VarM11230A.m9628b()).m11693f(), qc2Var, c45.m3841a(z35Var.f35742a), v35Var.f32364x);
            default:
                f45 f45Var = (f45) se0Var;
                d45 d45VarM4922z = e45.m4922z();
                byte[] bArrM11250c2 = ((u50) f45Var.f18748v.f33259b).m11250c();
                o50 o50VarM10980d2 = t50.m10980d(bArrM11250c2, 0, bArrM11250c2.length);
                d45VarM4922z.m9631e();
                ((e45) d45VarM4922z.f27912b).m4923C(o50VarM10980d2);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((e45) d45VarM4922z.m9628b()).m11693f(), qc2Var, j45.m7001a(f45Var.f18747u.f21127a), f45Var.f18750x);
        }
    }

    @Override // p000.ed2
    /* JADX INFO: renamed from: f */
    public se0 mo4673f(m24 m24Var) throws GeneralSecurityException {
        byte b = 8;
        mh3 mh3Var = (mh3) m24Var;
        switch (this.f34726a) {
            case 9:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    C1077qn.m9987m("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    u35 u35VarM11231B = u35.m11231B(mh3Var.f24919c, qc1.m9861a());
                    if (u35VarM11231B.m11236z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (u35VarM11231B.m11234x().size() == 32) {
                        return v35.m11717l0(z35.m13330b(c45.m3842b(mh3Var.f24921e), u35VarM11231B.m11235y().m3438y()), new wd3(u50.m11249b(u35VarM11231B.m11234x().m10981l()), b), mh3Var.f24922f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (h72 unused) {
                    m12788q("Parsing XAesGcmKey failed");
                    return null;
                }
            default:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    C1077qn.m9987m("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                    return null;
                }
                try {
                    e45 e45VarM4920A = e45.m4920A(mh3Var.f24919c, qc1.m9861a());
                    if (e45VarM4920A.m4925y() == 0) {
                        return f45.m5506l0(j45.m7002b(mh3Var.f24921e), new wd3(u50.m11249b(e45VarM4920A.m4924x().m10981l()), b), mh3Var.f24922f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (h72 unused2) {
                    m12788q("Parsing XChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // p000.y73
    /* JADX INFO: renamed from: i */
    public nh3 mo4674i(t73 t73Var) {
        switch (this.f34726a) {
            case 6:
                z35 z35Var = (z35) t73Var;
                id2 id2VarM7068B = jd2.m7068B();
                id2VarM7068B.m6763g("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                w35 w35VarM12471z = x35.m12471z();
                a45 a45VarM3436z = b45.m3436z();
                int i = z35Var.f35743b;
                a45VarM3436z.m9631e();
                ((b45) a45VarM3436z.f27912b).m3437A(i);
                b45 b45Var = (b45) a45VarM3436z.m9628b();
                w35VarM12471z.m9631e();
                ((x35) w35VarM12471z.f27912b).m12472B(b45Var);
                id2VarM7068B.m6764h(((x35) w35VarM12471z.m9628b()).m11693f());
                id2VarM7068B.m6762f(c45.m3841a(z35Var.f35742a));
                return nh3.m8734l((jd2) id2VarM7068B.m9628b());
            default:
                id2 id2VarM7068B2 = jd2.m7068B();
                id2VarM7068B2.m6763g("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                id2VarM7068B2.m6764h(g45.m5901x().m11693f());
                id2VarM7068B2.m6762f(j45.m7001a(((i45) t73Var).f21127a));
                return nh3.m8734l((jd2) id2VarM7068B2.m9628b());
        }
    }
}
