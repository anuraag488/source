package p000;

import com.google.firebase.abt.component.AbtRegistrar;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: g */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0670g implements gg0, sf3, y73, w73, gd2, ed2, InterfaceC1262vn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19450a;

    public /* synthetic */ C0670g(byte b) {
        this.f19450a = b;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5864c() {
        throw new gf0();
    }

    @Override // p000.w73
    /* JADX INFO: renamed from: a */
    public t73 mo4669a(nh3 nh3Var) throws GeneralSecurityException {
        switch (this.f19450a) {
            case 6:
                jd2 jd2Var = (jd2) nh3Var.f25811c;
                if (!jd2Var.m7076z().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    xy4.m12781j(jd2Var.m7076z(), "Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    C0899m7 c0899m7M8206A = C0899m7.m8206A(jd2Var.m7071A(), qc1.m9861a());
                    jp0 jp0VarM9372b = C1024p7.m9372b();
                    jp0VarM9372b.m7228R(c0899m7M8206A.m8210x());
                    jp0VarM9372b.m7231U(c0899m7M8206A.m8211y().m10229y());
                    jp0VarM9372b.f22483d = AbstractC1209u7.m11270b(jd2Var.m7075y());
                    return jp0VarM9372b.m7237f();
                } catch (h72 e) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
                }
            case 11:
                jd2 jd2Var2 = (jd2) nh3Var.f25811c;
                if (!jd2Var2.m7076z().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    xy4.m12781j(jd2Var2.m7076z(), "Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    C0009a8 c0009a8M120A = C0009a8.m120A(jd2Var2.m7071A(), qc1.m9861a());
                    if (c0009a8M120A.m126y().m12004A() != 0) {
                        xy4.m12788q("Only version 0 keys are accepted");
                        return null;
                    }
                    C0602e8 c0602e8M5914b = C0679g8.m5914b();
                    c0602e8M5914b.m4955s(c0009a8M120A.m125x().m8591y());
                    c0602e8M5914b.m4956t(c0009a8M120A.m126y().m12007y());
                    c0602e8M5914b.m4957u(c0009a8M120A.m125x().m8592z().m9377y());
                    c0602e8M5914b.m4958v(c0009a8M120A.m126y().m12008z().m3758z());
                    c0602e8M5914b.f17871e = AbstractC0716h8.m6277b(c0009a8M120A.m126y().m12008z().m3757y());
                    c0602e8M5914b.f17872f = AbstractC0716h8.m6279d(jd2Var2.m7075y());
                    return c0602e8M5914b.m4950k();
                } catch (h72 e2) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
                }
            case 16:
                jd2 jd2Var3 = (jd2) nh3Var.f25811c;
                if (!jd2Var3.m7076z().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    xy4.m12781j(jd2Var3.m7076z(), "Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    C1247v8 c1247v8M11757A = C1247v8.m11757A(jd2Var3.m7071A(), qc1.m9861a());
                    C1283w7 c1283w7M12527b = C1322x8.m12527b();
                    c1283w7M12527b.m12128O(c1247v8M11757A.m11761x());
                    c1283w7M12527b.m12127N(c1247v8M11757A.m11762y().m13449y());
                    c1283w7M12527b.m12130Q();
                    c1283w7M12527b.f33129e = AbstractC0010a9.m144c(jd2Var3.m7075y());
                    return c1283w7M12527b.m12141m();
                } catch (h72 e3) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e3);
                }
            case 21:
                jd2 jd2Var4 = (jd2) nh3Var.f25811c;
                if (!jd2Var4.m7076z().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    xy4.m12781j(jd2Var4.m7076z(), "Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    C0680g9 c0680g9M5932A = C0680g9.m5932A(jd2Var4.m7071A(), qc1.m9861a());
                    if (c0680g9M5932A.m5936y() != 0) {
                        xy4.m12788q("Only version 0 parameters are accepted");
                        return null;
                    }
                    C1283w7 c1283w7M6697b = C0754i9.m6697b();
                    c1283w7M6697b.m12128O(c0680g9M5932A.m5935x());
                    c1283w7M6697b.m12126M();
                    c1283w7M6697b.m12130Q();
                    c1283w7M6697b.f33129e = AbstractC0790j9.m7053b(jd2Var4.m7075y());
                    return c1283w7M6697b.m12142n();
                } catch (h72 e4) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e4);
                }
            default:
                jd2 jd2Var5 = (jd2) nh3Var.f25811c;
                if (!jd2Var5.m7076z().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    xy4.m12781j(jd2Var5.m7076z(), "Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ");
                    return null;
                }
                try {
                    C1063q9 c1063q9M9799A = C1063q9.m9799A(jd2Var5.m7071A(), qc1.m9861a());
                    if (c1063q9M9799A.m9803y() != 0) {
                        xy4.m12788q("Only version 0 parameters are accepted");
                        return null;
                    }
                    nh3 nh3VarM10562b = C1137s9.m10562b();
                    nh3VarM10562b.m8744K(c1063q9M9799A.m9802x());
                    nh3VarM10562b.f25811c = AbstractC1174t9.m10993b(jd2Var5.m7075y());
                    return nh3VarM10562b.m8749g();
                } catch (h72 e5) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e5);
                }
        }
    }

    @Override // p000.sf3
    /* JADX INFO: renamed from: b */
    public Object mo4670b(se0 se0Var) throws GeneralSecurityException {
        byte[] bArrM11250c;
        nf3 nf3Var = null;
        switch (this.f19450a) {
            case 2:
                mh3 mh3Var = ((rj2) se0Var).f29353u;
                Integer num = mh3Var.f24922f;
                mh3Var.f24920d.ordinal();
                j63 j63Var = mh3Var.f24921e;
                int iOrdinal = j63Var.ordinal();
                if (iOrdinal == 1) {
                    bArrM11250c = k63.m7411b(num.intValue()).m11250c();
                } else if (iOrdinal == 2) {
                    bArrM11250c = k63.m7410a(num.intValue()).m11250c();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        xd2.m12666m(j63Var, "unknown output prefix type ");
                        return null;
                    }
                    bArrM11250c = k63.m7410a(num.intValue()).m11250c();
                } else {
                    bArrM11250c = k63.f22941a.m11250c();
                }
                C0678g7 c0678g7 = new C0678g7();
                if (bArrM11250c.length == 0 || bArrM11250c.length == 5) {
                    return c0678g7;
                }
                C1077qn.m9987m("identifier has an invalid length");
                return null;
            case 3:
                C0825k7 c0825k7 = (C0825k7) se0Var;
                if (c0825k7.f22945u.f27411a != 32) {
                    xy4.m12788q("AesCmacKey size wrong, must be 32 bytes");
                    return null;
                }
                if (!zi4.m13603c(1)) {
                    xy4.m12788q("Cannot use AES-CMAC in FIPS-mode.");
                    return null;
                }
                Provider providerM13360S = z62.m13360S();
                if (providerM13360S != null) {
                    try {
                        return k90.m7435a(c0825k7, providerM13360S);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new k90();
            case 4:
                C0825k7 c0825k8 = (C0825k7) se0Var;
                C1024p7 c1024p7 = c0825k8.f22945u;
                int i = c1024p7.f27411a;
                if (i == 32) {
                    nf3Var = new nf3();
                    qq2.m10031o(C1135s7.m10545k0(C1172t7.m10985b(i), c0825k8.f22946v));
                    c0825k8.f22947w.m11250c();
                    if (c1024p7.f27413c.equals(C0973o7.f26379e)) {
                        Arrays.copyOf(nf3.f25749a, 1);
                    }
                } else {
                    xy4.m12788q("AesCmacKey size wrong, must be 32 bytes");
                }
                return nf3Var;
            case 9:
                C1358y7 c1358y7 = (C1358y7) se0Var;
                byte[] bArrM11250c2 = ((u50) c1358y7.f34967v.f33259b).m11250c();
                C0679g8 c0679g8 = c1358y7.f34966u;
                int i2 = c0679g8.f19649c;
                if (!zi4.m13604d(2)) {
                    xy4.m12788q("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
                kw4.m7669a(bArrM11250c2.length);
                new SecretKeySpec(bArrM11250c2, "AES");
                int blockSize = ((Cipher) C0789j8.f22080a.get()).getBlockSize();
                if (i2 < 12 || i2 > blockSize) {
                    xy4.m12788q("invalid IV size");
                    return null;
                }
                mf3 mf3Var = new mf3("HMAC" + c0679g8.f19652f, new SecretKeySpec(((u50) c1358y7.f34968w.f33259b).m11250c(), "HMAC"));
                int i3 = c0679g8.f19650d;
                if (i3 < 10) {
                    throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
                }
                byte[] bArr = new byte[0];
                lf3 lf3Var = (lf3) mf3Var.f24859b;
                if (i3 > mf3Var.f24858a) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
                ((Mac) lf3Var.get()).update(bArr);
                Arrays.copyOf(((Mac) lf3Var.get()).doFinal(), i3);
                c1358y7.f34969x.m11250c();
                return new C0678g7();
            case 14:
                C1173t8 c1173t8 = (C1173t8) se0Var;
                int i4 = C1062q8.f28267a;
                if (!zi4.m13603c(1)) {
                    xy4.m12788q("Can not use AES-EAX in FIPS-mode.");
                    return null;
                }
                C1322x8 c1322x8 = c1173t8.f30980u;
                if (c1322x8.f34056c != 16) {
                    throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + c1322x8.f34056c);
                }
                byte[] bArrM11250c3 = ((u50) c1173t8.f30981v.f33259b).m11250c();
                int i5 = c1322x8.f34055b;
                c1173t8.f30982w.m11250c();
                C1062q8 c1062q8 = new C1062q8();
                if (!zi4.m13603c(1)) {
                    xy4.m12788q("Can not use AES-EAX in FIPS-mode.");
                    return null;
                }
                if (i5 != 12 && i5 != 16) {
                    C1077qn.m9987m("IV size should be either 12 or 16 bytes");
                    return null;
                }
                kw4.m7669a(bArrM11250c3.length);
                new SecretKeySpec(bArrM11250c3, "AES");
                qq2.m10031o(C1135s7.m10545k0(C1172t7.m10985b(bArrM11250c3.length), new wd3(u50.m11249b(bArrM11250c3), (byte) 8)));
                return c1062q8;
            case 19:
                C0603e9 c0603e9 = (C0603e9) se0Var;
                C0754i9 c0754i9 = c0603e9.f17900u;
                int i6 = c0754i9.f21180b;
                int i7 = c0754i9.f21181c;
                if (i6 != 12) {
                    throw new GeneralSecurityException("Expected IV Size 12, got " + c0754i9.f21180b);
                }
                if (i7 != 16) {
                    throw new GeneralSecurityException("Expected tag Size 16, got " + i7);
                }
                byte[] bArrM11250c4 = ((u50) c0603e9.f17901v.f33259b).m11250c();
                u50 u50Var = c0603e9.f17902w;
                C0678g7 c0678g8 = new C0678g7();
                if (!zi4.m13604d(2)) {
                    xy4.m12788q("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                    return null;
                }
                int i8 = AbstractC0483b9.f15166a;
                kw4.m7669a(bArrM11250c4.length);
                new SecretKeySpec(bArrM11250c4, "AES");
                u50Var.m11250c();
                return c0678g8;
            default:
                C0975o9 c0975o9 = (C0975o9) se0Var;
                C0753i8 c0753i8 = AbstractC0827k9.f23002a;
                byte[] bArr2 = C0864l9.f23861a;
                try {
                    Cipher cipher = (Cipher) AbstractC0827k9.f23002a.get();
                    if (cipher == null) {
                        throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
                    }
                    if (!C0864l9.m7873a(cipher)) {
                        C1077qn.m9989o("Cipher does not implement AES GCM SIV.");
                        return null;
                    }
                    byte[] bArrM11250c5 = ((u50) c0975o9.f26469v.f33259b).m11250c();
                    c0975o9.f26470w.m11250c();
                    C0864l9 c0864l9 = new C0864l9();
                    kw4.m7669a(bArrM11250c5.length);
                    new SecretKeySpec(bArrM11250c5, "AES");
                    return c0864l9;
                } catch (IllegalStateException e) {
                    throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e);
                }
        }
    }

    @Override // p000.gd2
    /* JADX INFO: renamed from: d */
    public mh3 mo4672d(se0 se0Var) {
        byte b = this.f19450a;
        qc2 qc2Var = qc2.f28376c;
        switch (b) {
            case 7:
                C0825k7 c0825k7 = (C0825k7) se0Var;
                C0752i7 c0752i7M7025A = C0788j7.m7025A();
                C1024p7 c1024p7 = c0825k7.f22945u;
                C1061q7 c1061q7M10227z = C1098r7.m10227z();
                int i = c1024p7.f27412b;
                c1061q7M10227z.m9631e();
                ((C1098r7) c1061q7M10227z.f27912b).m10228A(i);
                C1098r7 c1098r7 = (C1098r7) c1061q7M10227z.m9628b();
                c0752i7M7025A.m9631e();
                ((C0788j7) c0752i7M7025A.f27912b).m7029E(c1098r7);
                byte[] bArrM11250c = ((u50) c0825k7.f22946v.f33259b).m11250c();
                o50 o50VarM10980d = t50.m10980d(bArrM11250c, 0, bArrM11250c.length);
                c0752i7M7025A.m9631e();
                ((C0788j7) c0752i7M7025A.f27912b).m7028D(o50VarM10980d);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C0788j7) c0752i7M7025A.m9628b()).m11693f(), qc2Var, AbstractC1209u7.m11269a(c0825k7.f22945u.f27413c), c0825k7.f22948x);
            case 12:
                C1358y7 c1358y7 = (C1358y7) se0Var;
                C1246v7 c1246v7M12508A = C1321x7.m12508A();
                C0826k8 c0826k8M7837B = C0863l8.m7837B();
                C0974o8 c0974o8M9375z = C1025p8.m9375z();
                int i2 = c1358y7.f34966u.f19649c;
                c0974o8M9375z.m9631e();
                ((C1025p8) c0974o8M9375z.f27912b).m9376A(i2);
                C1025p8 c1025p8 = (C1025p8) c0974o8M9375z.m9628b();
                c0826k8M7837B.m9631e();
                ((C0863l8) c0826k8M7837B.f27912b).m7841D(c1025p8);
                byte[] bArrM11250c2 = ((u50) c1358y7.f34967v.f33259b).m11250c();
                o50 o50VarM10980d2 = t50.m10980d(bArrM11250c2, 0, bArrM11250c2.length);
                c0826k8M7837B.m9631e();
                ((C0863l8) c0826k8M7837B.f27912b).m7840C(o50VarM10980d2);
                C0863l8 c0863l8 = (C0863l8) c0826k8M7837B.m9628b();
                c1246v7M12508A.m9631e();
                ((C1321x7) c1246v7M12508A.f27912b).m12511D(c0863l8);
                rw1 rw1VarM10932B = sw1.m10932B();
                C0679g8 c0679g8 = c1358y7.f34966u;
                bx1 bx1VarM6276a = AbstractC0716h8.m6276a(c0679g8);
                rw1VarM10932B.m9631e();
                ((sw1) rw1VarM10932B.f27912b).m10938F(bx1VarM6276a);
                byte[] bArrM11250c3 = ((u50) c1358y7.f34968w.f33259b).m11250c();
                o50 o50VarM10980d3 = t50.m10980d(bArrM11250c3, 0, bArrM11250c3.length);
                rw1VarM10932B.m9631e();
                ((sw1) rw1VarM10932B.f27912b).m10937E(o50VarM10980d3);
                sw1 sw1Var = (sw1) rw1VarM10932B.m9628b();
                c1246v7M12508A.m9631e();
                ((C1321x7) c1246v7M12508A.f27912b).m12512E(sw1Var);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C1321x7) c1246v7M12508A.m9628b()).m11693f(), qc2Var, AbstractC0716h8.m6278c(c0679g8.f19651e), c1358y7.f34970y);
            case 17:
                C1173t8 c1173t8 = (C1173t8) se0Var;
                C1099r8 c1099r8M10547A = C1136s8.m10547A();
                C1396z8 c1396z8M142a = AbstractC0010a9.m142a(c1173t8.f30980u);
                c1099r8M10547A.m9631e();
                ((C1136s8) c1099r8M10547A.f27912b).m10551E(c1396z8M142a);
                byte[] bArrM11250c4 = ((u50) c1173t8.f30981v.f33259b).m11250c();
                o50 o50VarM10980d4 = t50.m10980d(bArrM11250c4, 0, bArrM11250c4.length);
                c1099r8M10547A.m9631e();
                ((C1136s8) c1099r8M10547A.f27912b).m10550D(o50VarM10980d4);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C1136s8) c1099r8M10547A.m9628b()).m11693f(), qc2Var, AbstractC0010a9.m143b(c1173t8.f30980u.f34057d), c1173t8.f30983x);
            case 22:
                C0603e9 c0603e9 = (C0603e9) se0Var;
                AbstractC0790j9.m7054c(c0603e9.f17900u);
                C0519c9 c0519c9M4406z = C0567d9.m4406z();
                byte[] bArrM11250c5 = ((u50) c0603e9.f17901v.f33259b).m11250c();
                o50 o50VarM10980d5 = t50.m10980d(bArrM11250c5, 0, bArrM11250c5.length);
                c0519c9M4406z.m9631e();
                ((C0567d9) c0519c9M4406z.f27912b).m4407C(o50VarM10980d5);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C0567d9) c0519c9M4406z.m9628b()).m11693f(), qc2Var, AbstractC0790j9.m7052a(c0603e9.f17900u.f21182d), c0603e9.f17903x);
            default:
                C0975o9 c0975o9 = (C0975o9) se0Var;
                C0901m9 c0901m9M8627z = C0938n9.m8627z();
                byte[] bArrM11250c6 = ((u50) c0975o9.f26469v.f33259b).m11250c();
                o50 o50VarM10980d6 = t50.m10980d(bArrM11250c6, 0, bArrM11250c6.length);
                c0901m9M8627z.m9631e();
                ((C0938n9) c0901m9M8627z.f27912b).m8628C(o50VarM10980d6);
                return mh3.m8323b("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C0938n9) c0901m9M8627z.m9628b()).m11693f(), qc2Var, AbstractC1174t9.m10992a(c0975o9.f26468u.f29997b), c0975o9.f26471x);
        }
    }

    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        return AbtRegistrar.lambda$getComponents$0(c0602e8);
    }

    @Override // p000.ed2
    /* JADX INFO: renamed from: f */
    public se0 mo4673f(m24 m24Var) throws GeneralSecurityException {
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 8;
        mh3 mh3Var = (mh3) m24Var;
        switch (this.f19450a) {
            case 8:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    C1077qn.m9987m("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C0788j7 c0788j7M7026B = C0788j7.m7026B(mh3Var.f24919c, qc1.m9861a());
                    if (c0788j7M7026B.m7032z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    jp0 jp0VarM9372b = C1024p7.m9372b();
                    jp0VarM9372b.m7228R(c0788j7M7026B.m7030x().size());
                    jp0VarM9372b.m7231U(c0788j7M7026B.m7031y().m10229y());
                    jp0VarM9372b.f22483d = AbstractC1209u7.m11270b(mh3Var.f24921e);
                    C1024p7 c1024p7M7237f = jp0VarM9372b.m7237f();
                    jp0 jp0Var = new jp0((byte) 2, (boolean) (b == true ? 1 : 0));
                    jp0Var.f22482c = null;
                    jp0Var.f22483d = null;
                    jp0Var.f22481b = c1024p7M7237f;
                    jp0Var.f22482c = new wd3(u50.m11249b(c0788j7M7026B.m7030x().m10981l()), b5);
                    jp0Var.f22483d = mh3Var.f24922f;
                    return jp0Var.m7236e();
                } catch (h72 | IllegalArgumentException unused) {
                    xy4.m12788q("Parsing AesCmacKey failed");
                    return null;
                }
            case 13:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    C1077qn.m9987m("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C1321x7 c1321x7M12509B = C1321x7.m12509B(mh3Var.f24919c, qc1.m9861a());
                    if (c1321x7M12509B.m12515z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (c1321x7M12509B.m12513x().m7839A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (c1321x7M12509B.m12514y().m10936A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C0602e8 c0602e8M5914b = C0679g8.m5914b();
                    c0602e8M5914b.m4955s(c1321x7M12509B.m12513x().m7842y().size());
                    c0602e8M5914b.m4956t(c1321x7M12509B.m12514y().m10939y().size());
                    c0602e8M5914b.m4957u(c1321x7M12509B.m12513x().m7843z().m9377y());
                    c0602e8M5914b.m4958v(c1321x7M12509B.m12514y().m10940z().m3758z());
                    c0602e8M5914b.f17871e = AbstractC0716h8.m6277b(c1321x7M12509B.m12514y().m10940z().m3757y());
                    c0602e8M5914b.f17872f = AbstractC0716h8.m6279d(mh3Var.f24921e);
                    C0679g8 c0679g8M4950k = c0602e8M5914b.m4950k();
                    C1283w7 c1283w7 = new C1283w7(b2 == true ? 1 : 0);
                    c1283w7.f33128d = null;
                    c1283w7.f33129e = null;
                    c1283w7.f33126b = null;
                    c1283w7.f33127c = c0679g8M4950k;
                    c1283w7.f33128d = new wd3(u50.m11249b(c1321x7M12509B.m12513x().m7842y().m10981l()), b5);
                    c1283w7.f33129e = new wd3(u50.m11249b(c1321x7M12509B.m12514y().m10939y().m10981l()), b5);
                    c1283w7.f33126b = mh3Var.f24922f;
                    return c1283w7.m12139i();
                } catch (h72 unused2) {
                    xy4.m12788q("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            case 18:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    C1077qn.m9987m("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C1136s8 c1136s8M10548B = C1136s8.m10548B(mh3Var.f24919c, qc1.m9861a());
                    if (c1136s8M10548B.m10554z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1283w7 c1283w7M12527b = C1322x8.m12527b();
                    c1283w7M12527b.m12128O(c1136s8M10548B.m10552x().size());
                    c1283w7M12527b.m12127N(c1136s8M10548B.m10553y().m13449y());
                    c1283w7M12527b.m12130Q();
                    c1283w7M12527b.f33129e = AbstractC0010a9.m144c(mh3Var.f24921e);
                    C1322x8 c1322x8M12141m = c1283w7M12527b.m12141m();
                    jp0 jp0Var2 = new jp0((byte) 4, (boolean) (b3 == true ? 1 : 0));
                    jp0Var2.f22482c = null;
                    jp0Var2.f22483d = null;
                    jp0Var2.f22481b = c1322x8M12141m;
                    jp0Var2.f22482c = new wd3(u50.m11249b(c1136s8M10548B.m10552x().m10981l()), b5);
                    jp0Var2.f22483d = mh3Var.f24922f;
                    return jp0Var2.m7238g();
                } catch (h72 unused3) {
                    xy4.m12788q("Parsing AesEaxcKey failed");
                    return null;
                }
            case 23:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    C1077qn.m9987m("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C0567d9 c0567d9M4404A = C0567d9.m4404A(mh3Var.f24919c, qc1.m9861a());
                    if (c0567d9M4404A.m4409y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1283w7 c1283w7M6697b = C0754i9.m6697b();
                    c1283w7M6697b.m12128O(c0567d9M4404A.m4408x().size());
                    c1283w7M6697b.m12126M();
                    c1283w7M6697b.m12130Q();
                    c1283w7M6697b.f33129e = AbstractC0790j9.m7053b(mh3Var.f24921e);
                    C0754i9 c0754i9M12142n = c1283w7M6697b.m12142n();
                    jp0 jp0Var3 = new jp0((byte) 5, (boolean) (b4 == true ? 1 : 0));
                    jp0Var3.f22482c = null;
                    jp0Var3.f22483d = null;
                    jp0Var3.f22481b = c0754i9M12142n;
                    jp0Var3.f22482c = new wd3(u50.m11249b(c0567d9M4404A.m4408x().m10981l()), b5);
                    jp0Var3.f22483d = mh3Var.f24922f;
                    return jp0Var3.m7239h();
                } catch (h72 unused4) {
                    xy4.m12788q("Parsing AesGcmKey failed");
                    return null;
                }
            default:
                if (!mh3Var.f24917a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    C1077qn.m9987m("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                    return null;
                }
                try {
                    C0938n9 c0938n9M8625A = C0938n9.m8625A(mh3Var.f24919c, qc1.m9861a());
                    if (c0938n9M8625A.m8630y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    nh3 nh3VarM10562b = C1137s9.m10562b();
                    nh3VarM10562b.m8744K(c0938n9M8625A.m8629x().size());
                    nh3VarM10562b.f25811c = AbstractC1174t9.m10993b(mh3Var.f24921e);
                    C1137s9 c1137s9M8749g = nh3VarM10562b.m8749g();
                    jp0 jp0Var4 = new jp0((byte) 6, z);
                    jp0Var4.f22482c = null;
                    jp0Var4.f22483d = null;
                    jp0Var4.f22481b = c1137s9M8749g;
                    jp0Var4.f22482c = new wd3(u50.m11249b(c0938n9M8625A.m8629x().m10981l()), b5);
                    jp0Var4.f22483d = mh3Var.f24922f;
                    return jp0Var4.m7240i();
                } catch (h72 unused5) {
                    xy4.m12788q("Parsing AesGcmSivKey failed");
                    return null;
                }
        }
    }

    @Override // p000.y73
    /* JADX INFO: renamed from: i */
    public nh3 mo4674i(t73 t73Var) {
        switch (this.f19450a) {
            case 5:
                C1024p7 c1024p7 = (C1024p7) t73Var;
                id2 id2VarM7068B = jd2.m7068B();
                id2VarM7068B.m6763g("type.googleapis.com/google.crypto.tink.AesCmacKey");
                C0862l7 c0862l7M8207z = C0899m7.m8207z();
                C1061q7 c1061q7M10227z = C1098r7.m10227z();
                int i = c1024p7.f27412b;
                c1061q7M10227z.m9631e();
                ((C1098r7) c1061q7M10227z.f27912b).m10228A(i);
                C1098r7 c1098r7 = (C1098r7) c1061q7M10227z.m9628b();
                c0862l7M8207z.m9631e();
                ((C0899m7) c0862l7M8207z.f27912b).m8209C(c1098r7);
                int i2 = c1024p7.f27411a;
                c0862l7M8207z.m9631e();
                ((C0899m7) c0862l7M8207z.f27912b).m8208B(i2);
                id2VarM7068B.m6764h(((C0899m7) c0862l7M8207z.m9628b()).m11693f());
                id2VarM7068B.m6762f(AbstractC1209u7.m11269a(c1024p7.f27413c));
                return nh3.m8734l((jd2) id2VarM7068B.m9628b());
            case 10:
                C0679g8 c0679g8 = (C0679g8) t73Var;
                id2 id2VarM7068B2 = jd2.m7068B();
                id2VarM7068B2.m6763g("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                C1395z7 c1395z7M121z = C0009a8.m121z();
                C0900m8 c0900m8M8587A = C0937n8.m8587A();
                C0974o8 c0974o8M9375z = C1025p8.m9375z();
                int i3 = c0679g8.f19649c;
                c0974o8M9375z.m9631e();
                ((C1025p8) c0974o8M9375z.f27912b).m9376A(i3);
                C1025p8 c1025p8 = (C1025p8) c0974o8M9375z.m9628b();
                c0900m8M8587A.m9631e();
                ((C0937n8) c0900m8M8587A.f27912b).m8590C(c1025p8);
                int i4 = c0679g8.f19647a;
                c0900m8M8587A.m9631e();
                ((C0937n8) c0900m8M8587A.f27912b).m8589B(i4);
                C0937n8 c0937n8 = (C0937n8) c0900m8M8587A.m9628b();
                c1395z7M121z.m9631e();
                ((C0009a8) c1395z7M121z.f27912b).m122B(c0937n8);
                uw1 uw1VarM12001B = vw1.m12001B();
                bx1 bx1VarM6276a = AbstractC0716h8.m6276a(c0679g8);
                uw1VarM12001B.m9631e();
                ((vw1) uw1VarM12001B.f27912b).m12006E(bx1VarM6276a);
                int i5 = c0679g8.f19648b;
                uw1VarM12001B.m9631e();
                ((vw1) uw1VarM12001B.f27912b).m12005D(i5);
                vw1 vw1Var = (vw1) uw1VarM12001B.m9628b();
                c1395z7M121z.m9631e();
                ((C0009a8) c1395z7M121z.f27912b).m123C(vw1Var);
                id2VarM7068B2.m6764h(((C0009a8) c1395z7M121z.m9628b()).m11693f());
                id2VarM7068B2.m6762f(AbstractC0716h8.m6278c(c0679g8.f19651e));
                return nh3.m8734l((jd2) id2VarM7068B2.m9628b());
            case 15:
                C1322x8 c1322x8 = (C1322x8) t73Var;
                id2 id2VarM7068B3 = jd2.m7068B();
                id2VarM7068B3.m6763g("type.googleapis.com/google.crypto.tink.AesEaxKey");
                C1210u8 c1210u8M11758z = C1247v8.m11758z();
                C1396z8 c1396z8M142a = AbstractC0010a9.m142a(c1322x8);
                c1210u8M11758z.m9631e();
                ((C1247v8) c1210u8M11758z.f27912b).m11760C(c1396z8M142a);
                int i6 = c1322x8.f34054a;
                c1210u8M11758z.m9631e();
                ((C1247v8) c1210u8M11758z.f27912b).m11759B(i6);
                id2VarM7068B3.m6764h(((C1247v8) c1210u8M11758z.m9628b()).m11693f());
                id2VarM7068B3.m6762f(AbstractC0010a9.m143b(c1322x8.f34057d));
                return nh3.m8734l((jd2) id2VarM7068B3.m9628b());
            case 20:
                C0754i9 c0754i9 = (C0754i9) t73Var;
                AbstractC0790j9.m7054c(c0754i9);
                id2 id2VarM7068B4 = jd2.m7068B();
                id2VarM7068B4.m6763g("type.googleapis.com/google.crypto.tink.AesGcmKey");
                C0642f9 c0642f9M5933z = C0680g9.m5933z();
                int i7 = c0754i9.f21179a;
                c0642f9M5933z.m9631e();
                ((C0680g9) c0642f9M5933z.f27912b).m5934B(i7);
                id2VarM7068B4.m6764h(((C0680g9) c0642f9M5933z.m9628b()).m11693f());
                id2VarM7068B4.m6762f(AbstractC0790j9.m7052a(c0754i9.f21182d));
                return nh3.m8734l((jd2) id2VarM7068B4.m9628b());
            default:
                C1137s9 c1137s9 = (C1137s9) t73Var;
                id2 id2VarM7068B5 = jd2.m7068B();
                id2VarM7068B5.m6763g("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                C1026p9 c1026p9M9800z = C1063q9.m9800z();
                int i8 = c1137s9.f29996a;
                c1026p9M9800z.m9631e();
                ((C1063q9) c1026p9M9800z.f27912b).m9801B(i8);
                id2VarM7068B5.m6764h(((C1063q9) c1026p9M9800z.m9628b()).m11693f());
                id2VarM7068B5.m6762f(AbstractC1174t9.m10992a(c1137s9.f29997b));
                return nh3.m8734l((jd2) id2VarM7068B5.m9628b());
        }
    }

    @Override // p000.InterfaceC1262vn
    /* JADX INFO: renamed from: j */
    public int mo5865j(int i, df2 df2Var) {
        return Math.round((1.0f + (df2Var == df2.f17011a ? -1.0f : 1.0f)) * (i / 2.0f));
    }
}
