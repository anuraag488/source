package p000;

import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nm0 implements vo4, gg0, g51, y73, w73, gd2, ed2, sf3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25939a;

    public /* synthetic */ nm0(byte b) {
        this.f25939a = b;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8795g(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m8796h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m8797j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m8798k(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // p000.w73
    /* JADX INFO: renamed from: a */
    public t73 mo4669a(nh3 nh3Var) throws GeneralSecurityException {
        switch (this.f25939a) {
            case 14:
                jd2 jd2Var = (jd2) nh3Var.f25811c;
                if (!jd2Var.m7076z().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    xy4.m12781j(jd2Var.m7076z(), "Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    j51 j51VarM7018z = j51.m7018z(jd2Var.m7071A(), qc1.m9861a());
                    C1283w7 c1283w7M7834b = l51.m7834b();
                    c1283w7M7834b.f33129e = r51.m10212e(j51VarM7018z.m7020x().m8530A());
                    c1283w7M7834b.f33127c = r51.m10214g(j51VarM7018z.m7020x().m8535z());
                    c1283w7M7834b.f33128d = r51.m10211d(j51VarM7018z.m7020x().m8534x());
                    c1283w7M7834b.f33126b = r51.m10215h(jd2Var.m7075y());
                    return c1283w7M7834b.m12144q();
                } catch (h72 e) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
                }
            default:
                jd2 jd2Var2 = (jd2) nh3Var.f25811c;
                if (!jd2Var2.m7076z().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    xy4.m12781j(jd2Var2.m7076z(), "Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    if (d61.m4382z(jd2Var2.m7071A(), qc1.m9861a()).m4383y() == 0) {
                        return f61.m5592b((e61) k61.f22938g.m8737D(jd2Var2.m7075y()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (h72 e2) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
                }
        }
    }

    @Override // p000.vo4
    public Object apply(Object obj) {
        switch (this.f25939a) {
            case 8:
                uu0.f32170b.getClass();
                return vq0.f32797a.m12084h((tq0) obj).getBytes(Charset.forName("UTF-8"));
            default:
                d34 d34Var = (d34) obj;
                String strM12084h = e34.f17666b.m12084h(d34Var);
                d34Var.getClass();
                Log.d("EventGDTLogger", "Session Event Type: SESSION_START");
                return strM12084h.getBytes(z80.f35863a);
        }
    }

    @Override // p000.sf3
    /* JADX INFO: renamed from: b */
    public Object mo4670b(se0 se0Var) throws GeneralSecurityException {
        switch (this.f25939a) {
            case 19:
                p51 p51Var = (p51) se0Var;
                Provider providerM13360S = z62.m13360S();
                aa1 aa1Var = (aa1) y51.f34901i.m8745L(p51Var.f27380u.f30785u.f23794c);
                nh3 nh3Var = y51.f34902j;
                t51 t51Var = p51Var.f27380u;
                nh3 nh3Var2 = y51.f34903k;
                l51 l51Var = t51Var.f30785u;
                p51Var.m11754k0().m11250c();
                l51Var.f23795d.equals(C0973o7.f26395u);
                v51 v51Var = new v51();
                if (!zi4.m13604d(2)) {
                    xy4.m12788q("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
                    return null;
                }
                kw4.m7672d(aa1Var);
                StringBuilder sb = new StringBuilder();
                sb.append(aa1Var);
                sb.append("withECDSA");
                VarHandle.storeStoreFence();
                return v51Var;
            case 20:
                t51 t51Var2 = (t51) se0Var;
                byte[] bArr = y51.f34899g;
                Provider providerM13360S2 = z62.m13360S();
                nh3 nh3Var3 = y51.f34903k;
                l51 l51Var2 = t51Var2.f30785u;
                ECPublicKey eCPublicKey = (ECPublicKey) (providerM13360S2 != null ? KeyFactory.getInstance("EC", providerM13360S2) : (KeyFactory) n81.f25517f.f25518a.mo3139g("EC")).generatePublic(new ECPublicKeySpec(t51Var2.f30786v, kx5.m7688S((h71) nh3Var3.m8745L(l51Var2.f23793b))));
                aa1 aa1Var2 = (aa1) y51.f34901i.m8745L(l51Var2.f23794c);
                i71 i71Var = (i71) y51.f34902j.m8745L(l51Var2.f23792a);
                byte[] bArrM11250c = t51Var2.f30787w.m11250c();
                byte[] bArr2 = l51Var2.f23795d.equals(C0973o7.f26395u) ? y51.f34900h : y51.f34899g;
                y51 y51Var = new y51();
                if (!zi4.m13604d(2)) {
                    xy4.m12788q("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
                    return null;
                }
                kw4.m7672d(aa1Var2);
                y51Var.f34905b = aa1Var2 + "withECDSA";
                y51Var.f34904a = eCPublicKey;
                y51Var.f34906c = i71Var;
                y51Var.f34907d = bArrM11250c;
                y51Var.f34908e = bArr2;
                y51Var.f34909f = providerM13360S2;
                VarHandle.storeStoreFence();
                return y51Var;
            case 21:
                h61 h61Var = (h61) se0Var;
                if (!zi4.m13603c(1)) {
                    xy4.m12788q("Can not use Ed25519 in FIPS-mode.");
                    return null;
                }
                try {
                    return v51.m11748a(h61Var);
                } catch (GeneralSecurityException unused) {
                    byte[] bArrM11250c2 = ((u50) h61Var.f20407v.f33259b).m11250c();
                    h61Var.m11754k0().m11250c();
                    v51 v51Var2 = new v51();
                    if (!zi4.m13603c(1)) {
                        xy4.m12788q("Can not use Ed25519 in FIPS-mode.");
                        return null;
                    }
                    if (bArrM11250c2.length != 32) {
                        C1077qn.m9987m("Given private key's length is not 32");
                        return null;
                    }
                    b61.m3467h(b61.m3463d(bArrM11250c2)).m7232V();
                    VarHandle.storeStoreFence();
                    return v51Var2;
                }
            default:
                m61 m61Var = (m61) se0Var;
                if (!zi4.m13603c(1)) {
                    xy4.m12788q("Can not use Ed25519 in FIPS-mode.");
                    return null;
                }
                try {
                    return p61.m9362b(m61Var);
                } catch (GeneralSecurityException unused2) {
                    byte[] bArrM11250c3 = m61Var.f24683v.m11250c();
                    byte[] bArrM11250c4 = m61Var.f24684w.m11250c();
                    byte b = 0;
                    byte[] bArr3 = m61Var.f24682u.f18783a != e61.f17838d ? new byte[0] : new byte[]{0};
                    o61 o61Var = new o61(b);
                    if (!zi4.m13603c(1)) {
                        throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
                    }
                    if (bArrM11250c3.length != 32) {
                        C1077qn.m9987m("Given public key's length is not 32.");
                        return null;
                    }
                    o61Var.f26370d = u50.m11249b(bArrM11250c3);
                    o61Var.f26368b = bArrM11250c4;
                    o61Var.f26369c = bArr3;
                    if (c61.f15834a != null) {
                        VarHandle.storeStoreFence();
                        return o61Var;
                    }
                    C1077qn.m9989o("Could not initialize Ed25519.");
                    return null;
                }
        }
    }

    @Override // p000.gd2
    /* JADX INFO: renamed from: d */
    public mh3 mo4672d(se0 se0Var) {
        byte b = this.f25939a;
        qc2 qc2Var = qc2.f28378e;
        qc2 qc2Var2 = qc2.f28377d;
        switch (b) {
            case 15:
                t51 t51Var = (t51) se0Var;
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", r51.m10210c(t51Var).m11693f(), qc2Var, r51.m10213f(t51Var.f30785u.f23795d), t51Var.f30788x);
            case 17:
                p51 p51Var = (p51) se0Var;
                int iM10208a = r51.m10208a(p51Var.f27380u.f30785u.f23793b);
                o51 o51VarM9733A = q51.m9733A();
                t51 t51Var2 = p51Var.f27380u;
                u51 u51VarM10210c = r51.m10210c(t51Var2);
                o51VarM9733A.m9631e();
                ((q51) o51VarM9733A.f27912b).m9737E(u51VarM10210c);
                byte[] bArrM5372v0 = ev0.m5372v0((BigInteger) p51Var.f27381v.f33090b, iM10208a);
                o50 o50VarM10980d = t50.m10980d(bArrM5372v0, 0, bArrM5372v0.length);
                o51VarM9733A.m9631e();
                ((q51) o51VarM9733A.f27912b).m9736D(o50VarM10980d);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((q51) o51VarM9733A.m9628b()).m11693f(), qc2Var2, r51.m10213f(t51Var2.f30785u.f23795d), p51Var.mo4966A());
            case 25:
                m61 m61Var = (m61) se0Var;
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", k61.m7407a(m61Var).m11693f(), qc2Var, (j63) k61.f22938g.m8745L(m61Var.f24682u.f18783a), m61Var.f24685x);
            default:
                h61 h61Var = (h61) se0Var;
                g61 g61VarM6674A = i61.m6674A();
                n61 n61VarM7407a = k61.m7407a(h61Var.f20406u);
                g61VarM6674A.m9631e();
                ((i61) g61VarM6674A.f27912b).m6678E(n61VarM7407a);
                byte[] bArrM11250c = ((u50) h61Var.f20407v.f33259b).m11250c();
                o50 o50VarM10980d2 = t50.m10980d(bArrM11250c, 0, bArrM11250c.length);
                g61VarM6674A.m9631e();
                ((i61) g61VarM6674A.f27912b).m6677D(o50VarM10980d2);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((i61) g61VarM6674A.m9628b()).m11693f(), qc2Var2, (j63) k61.f22938g.m8745L(h61Var.f20406u.f24682u.f18783a), h61Var.mo4966A());
        }
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        Set setMo4019c = c0602e8.mo4019c(ni3.m8779a(C0811ju.class));
        js1 js1Var = js1.f22552b;
        if (js1Var == null) {
            synchronized (js1.class) {
                try {
                    js1Var = js1.f22552b;
                    if (js1Var == null) {
                        js1Var = new js1();
                        js1Var.f22555a = new HashSet();
                        VarHandle.storeStoreFence();
                        js1.f22552b = js1Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        fx0 fx0Var = new fx0();
        fx0Var.f19371a = fx0.m5841a(setMo4019c);
        fx0Var.f19372b = js1Var;
        VarHandle.storeStoreFence();
        return fx0Var;
    }

    @Override // p000.ed2
    /* JADX INFO: renamed from: f */
    public se0 mo4673f(m24 m24Var) throws GeneralSecurityException {
        byte b = 17;
        boolean z = false;
        mh3 mh3Var = (mh3) m24Var;
        switch (this.f25939a) {
            case 16:
                String str = mh3Var.f24917a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    wb1.m12195o(str, "Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ");
                    return null;
                }
                try {
                    u51 u51VarM11252D = u51.m11252D(mh3Var.f24919c, qc1.m9861a());
                    if (u51VarM11252D.m11261z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1283w7 c1283w7M7834b = l51.m7834b();
                    c1283w7M7834b.f33129e = r51.m10212e(u51VarM11252D.m11260y().m8530A());
                    c1283w7M7834b.f33127c = r51.m10214g(u51VarM11252D.m11260y().m8535z());
                    c1283w7M7834b.f33128d = r51.m10211d(u51VarM11252D.m11260y().m8534x());
                    c1283w7M7834b.f33126b = r51.m10215h(mh3Var.f24921e);
                    l51 l51VarM12144q = c1283w7M7834b.m12144q();
                    jp0 jp0Var = new jp0(b, z);
                    jp0Var.f22482c = null;
                    jp0Var.f22483d = null;
                    jp0Var.f22481b = l51VarM12144q;
                    jp0Var.f22482c = new ECPoint(ev0.m5351a0(u51VarM11252D.m11255A().m10981l()), ev0.m5351a0(u51VarM11252D.m11256B().m10981l()));
                    jp0Var.f22483d = mh3Var.f24922f;
                    return jp0Var.m7242k();
                } catch (h72 | IllegalArgumentException unused) {
                    xy4.m12788q("Parsing EcdsaPublicKey failed");
                    return null;
                }
            case 18:
                String str2 = mh3Var.f24917a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    wb1.m12195o(str2, "Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ");
                    return null;
                }
                try {
                    q51 q51VarM9734B = q51.m9734B(mh3Var.f24919c, qc1.m9861a());
                    if (q51VarM9734B.m9740z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    u51 u51VarM9739y = q51VarM9734B.m9739y();
                    if (u51VarM9739y.m11261z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1283w7 c1283w7M7834b2 = l51.m7834b();
                    c1283w7M7834b2.f33129e = r51.m10212e(u51VarM9739y.m11260y().m8530A());
                    c1283w7M7834b2.f33127c = r51.m10214g(u51VarM9739y.m11260y().m8535z());
                    c1283w7M7834b2.f33128d = r51.m10211d(u51VarM9739y.m11260y().m8534x());
                    c1283w7M7834b2.f33126b = r51.m10215h(mh3Var.f24921e);
                    l51 l51VarM12144q2 = c1283w7M7834b2.m12144q();
                    jp0 jp0Var2 = new jp0(b, z);
                    jp0Var2.f22482c = null;
                    jp0Var2.f22483d = null;
                    jp0Var2.f22481b = l51VarM12144q2;
                    jp0Var2.f22482c = new ECPoint(ev0.m5351a0(u51VarM9739y.m11255A().m10981l()), ev0.m5351a0(u51VarM9739y.m11256B().m10981l()));
                    jp0Var2.f22483d = mh3Var.f24922f;
                    t51 t51VarM7242k = jp0Var2.m7242k();
                    nh3 nh3Var = new nh3((byte) 12, z);
                    nh3Var.f25811c = null;
                    nh3Var.f25810b = t51VarM7242k;
                    nh3Var.f25811c = w42.m12081j(ev0.m5351a0(q51VarM9734B.m9738x().m10981l()));
                    return nh3Var.m8750j();
                } catch (h72 | IllegalArgumentException unused2) {
                    xy4.m12788q("Parsing EcdsaPrivateKey failed");
                    return null;
                }
            case 26:
                String str3 = mh3Var.f24917a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    wb1.m12195o(str3, "Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ");
                    return null;
                }
                try {
                    n61 n61VarM8539B = n61.m8539B(mh3Var.f24919c, qc1.m9861a());
                    if (n61VarM8539B.m8544z() == 0) {
                        return m61.m8200l0((e61) k61.f22938g.m8737D(mh3Var.f24921e), u50.m11249b(n61VarM8539B.m8543y().m10981l()), mh3Var.f24922f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (h72 unused3) {
                    xy4.m12788q("Parsing Ed25519PublicKey failed");
                    return null;
                }
            default:
                String str4 = mh3Var.f24917a;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    wb1.m12195o(str4, "Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ");
                    return null;
                }
                try {
                    i61 i61VarM6675B = i61.m6675B(mh3Var.f24919c, qc1.m9861a());
                    if (i61VarM6675B.m6681z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    n61 n61VarM6680y = i61VarM6675B.m6680y();
                    if (n61VarM6680y.m8544z() == 0) {
                        return h61.m6235m0(m61.m8200l0((e61) k61.f22938g.m8737D(mh3Var.f24921e), u50.m11249b(n61VarM6680y.m8543y().m10981l()), mh3Var.f24922f), new wd3(u50.m11249b(i61VarM6675B.m6679x().m10981l()), (byte) 8));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (h72 unused4) {
                    xy4.m12788q("Parsing Ed25519PrivateKey failed");
                    return null;
                }
        }
    }

    @Override // p000.y73
    /* JADX INFO: renamed from: i */
    public nh3 mo4674i(t73 t73Var) {
        switch (this.f25939a) {
            case 13:
                l51 l51Var = (l51) t73Var;
                id2 id2VarM7068B = jd2.m7068B();
                id2VarM7068B.m6763g("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                i51 i51VarM7017y = j51.m7017y();
                n51 n51VarM10209b = r51.m10209b(l51Var);
                i51VarM7017y.m9631e();
                ((j51) i51VarM7017y.f27912b).m7019A(n51VarM10209b);
                id2VarM7068B.m6764h(((j51) i51VarM7017y.m9628b()).m11693f());
                id2VarM7068B.m6762f(r51.m10213f(l51Var.f23795d));
                return nh3.m8734l((jd2) id2VarM7068B.m9628b());
            default:
                id2 id2VarM7068B2 = jd2.m7068B();
                id2VarM7068B2.m6763g("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                id2VarM7068B2.m6764h(d61.m4381x().m11693f());
                id2VarM7068B2.m6762f((j63) k61.f22938g.m8745L(((f61) t73Var).f18783a));
                return nh3.m8734l((jd2) id2VarM7068B2.m9628b());
        }
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: c */
    public float mo3662c(float f) {
        return f;
    }
}
